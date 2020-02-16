package cn.edu.zjut.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import cn.edu.zjut.po.Customer;
import org.hibernate.cfg.Configuration;

public class CustomerDAO extends BaseHibernateDAO implements ICustomerDAO {
    private Log log = LogFactory.getLog(CustomerDAO.class);
    public void save(Customer transientInstance) {
        Transaction tran = null;
        Session session = null;
        try {
            session = getSession();
            tran = session.beginTransaction();
            session.save(transientInstance);
            tran.commit();
        } catch (RuntimeException re) {
            if (tran != null) tran.rollback();
            throw re;
        } finally {
            session.close();
        }
    }

//    public void save(Customer customer) {
//        log.debug("saving customer instance");
//        Transaction tran = null;
//        Session session = null;
//        try {
//
//            tran = session.beginTransaction();
//            session.save(customer);
//            session.flush();
//            tran.commit();
//            log.debug("save successful");
//        } catch (RuntimeException re) {
//            log.error("save failed", re);
//            throw re;
//        } finally {
//            session.close();
//        }
//    }
}