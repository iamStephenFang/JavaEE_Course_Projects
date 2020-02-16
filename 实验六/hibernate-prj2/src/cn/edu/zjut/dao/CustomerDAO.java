package cn.edu.zjut.dao;

import java.util.List;

import org.hibernate.Query;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import cn.edu.zjut.po.Customer;

public class CustomerDAO extends BaseHibernateDAO {
    private Log log = LogFactory.getLog(CustomerDAO.class);

    public List findByHql(String hql) {
        log.debug("finding Customer instance by hql");
        try {
            String queryString = hql;
            Query queryObject = getSession().createQuery(queryString);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by hql failed", re);
            throw re;
        }
    }

    public void save(Customer instance) {
        log.debug("saving Customer instance");
        try {
            getSession().save(instance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }

    public void update(Customer instance) {
        log.debug("updating Customer instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("update successful");
        }catch (RuntimeException re){
            log.error("update failed",re);
            throw re;
        }
    }
    public void delete(Customer instance) {
        log.debug("deleting Customer item");
        try{
            getSession().delete(instance);
            log.debug("delete successful");
        }catch (RuntimeException re){
            log.error("delete failed",re);
        }
    }
}