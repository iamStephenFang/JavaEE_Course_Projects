package cn.edu.zjut.dao;

import java.util.List;

import cn.edu.zjut.po.Address;
import org.hibernate.query.Query;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AddressDAO extends BaseHibernateDAO {
    private Log log = LogFactory.getLog(CustomerDAO.class);

    public Address findById(int Id) {
        log.debug("finding Customer instance by Id");
        try {
            return (Address) getSession().get(Address.class,Id);
        } catch (RuntimeException re) {
            log.error("find by Id failed", re);
            throw re;
        }
    }

    public void save(Address instance) {
        log.debug("saving Address instance");
        try {
            getSession().save(instance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }

    public void update(Address instance) {
        log.debug("updating Address instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("update successful");
        }catch (RuntimeException re){
            log.error("update failed",re);
            throw re;
        }
    }
    public void delete(Address instance) {
        log.debug("deleting Address item");
        try{
            getSession().delete(instance);
            log.debug("delete successful");
        }catch (RuntimeException re){
            log.error("delete failed",re);
        }
    }
}
