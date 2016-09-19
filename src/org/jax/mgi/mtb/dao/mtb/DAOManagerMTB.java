/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/mtb/DAOManagerMTB.java,v 1.1 2007/04/30 15:47:52 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.mtb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.DAOManager;

/**
 * The Manager provides connections and manages transactions transparently.
 * <br>
 * It is a singleton, you get its instance with the getInstance() method.
 * All of the XxxxManager classes use the Manager to get database connections.
 * Before doing any operation, you must pass either a
 * datasource or a jdbc driver/url/username/password.
 * You may extend it and use setInstance() method to make sure your
 * implementation is used as a singleton.
 *
 * @author mjv
 * @date 2007/04/30 15:47:52
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/mtb/DAOManagerMTB.java,v 1.1 2007/04/30 15:47:52 mjv Exp
 */
public class DAOManagerMTB extends DAOManager {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private static DAOManagerMTB managerInstance = new DAOManagerMTB();
    //private static InheritableThreadLocal localThread = new InheritableThreadLocal();
    private static InheritableThreadLocal<Connection> localThread = new InheritableThreadLocal<Connection>();
    final static Logger logger = Logger.getLogger(DAOManagerMTB.class.getName());

    // ----------------------------------------------------------- Constructors

    /**
     * Ensure singleton pattern.
     */
    private DAOManagerMTB() {

    }

    // --------------------------------------------------------- Public Methods

    
    /**
     * Returns the manager singleton instance.
     */
    public static DAOManagerMTB getInstance() {
        return managerInstance;
    }
    
    /**
     * Gets an auto commit connection.
     * <br>
     * Normally you do not need this method that much ;-)
     *
     * @return an auto commit connection
     */
    public synchronized Connection getConnection() throws SQLException {
        Connection tc = localThread.get();
        if (tc != null) {
            return tc;
        }

        if (ds!=null) {
            return ds.getConnection();
        } else if (jdbc_driver != null && jdbc_url != null && jdbc_username != null && jdbc_password != null) {
            return DriverManager.getConnection(jdbc_url, jdbc_username, jdbc_password);
        } else {
            throw new IllegalStateException("Please set a datasource or a jdbc driver/url/username/password");
        }
    }

    /**
     * Releases the database connection.
     * <br>
     * Normally you should not need this method ;-)
     */
    public synchronized void releaseConnection(Connection c) {
        Connection tc = localThread.get();
        if (tc != null) {
            return;
        }

        try {
            if (c != null) {
                c.close();
            }
        } catch (SQLException x) {
            logger.error("Could not release the connection: "+x.toString());
        }
    }

    /**
     * Initiates a database transaction.
     * <br>
     * When working within a transaction, you should invoke this method first.
     * The connection is returned just in case you need to set the isolation level.
     *
     * @return a non-auto commit connection with the default transaction isolation level
     */
    public Connection beginTransaction() throws SQLException {
        if (logger.isDebugEnabled()) {
            logger.debug("Start Transaction");
        }
        
        Connection c = getConnection();
        c.setAutoCommit(false);
        localThread.set(c);
        return c;
    }

    /**
     * Releases connection used for the transaction and performs a commit or rollback.
     *
     * @param commit tells whether this connection should be committed
     *        true for commit(), false for rollback()
     */
    public void endTransaction(boolean commit) throws SQLException {
        if (logger.isDebugEnabled()) {
            logger.debug("End Transaction - " + (commit ? "COMMIT" : "ROLLBACK"));
        }

        Connection c = localThread.get();
        if (c == null) {
            return;
        }

        try {
            if (commit) {
                c.commit();
            } else {
                c.rollback();
            }
        } finally {
            c.setAutoCommit(true);
            localThread.set(null);
            releaseConnection(c);
        }
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}
