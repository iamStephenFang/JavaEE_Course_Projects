package cn.edu.zjut.dao;

import java.util.List;

import org.hibernate.Query;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ItemDAO extends BaseHibernateDAO {
    private static final Log log = LogFactory.getLog(ItemDAO.class);

    public List findByHql(String hql) {
        log.debug("finding Item instance by hql");
        try {
            String queryString = hql;
            Query queryObject = getSession().createQuery(queryString);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by hql failed", re);
            throw re;
        }
    }
}

