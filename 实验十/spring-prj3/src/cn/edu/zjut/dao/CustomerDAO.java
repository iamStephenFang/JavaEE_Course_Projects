package cn.edu.zjut.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import cn.edu.zjut.po.Customer;

public class CustomerDAO extends BaseHibernateDAO implements ICustomerDAO {
    public void save(Customer transientInstance) {
        System.out.println("execute --save()-- method.");
        try {
            getSession().save(transientInstance);
        } catch (RuntimeException re) {
            throw re;
        }
    }

    public void delete(Customer transientInstance) {
        System.out.println("execute --delete()-- method.");
    }

    public void update(Customer transientInstance) {
        System.out.println("execute --update()-- method.");
    }

    public void findByHQL(String hql) {
        System.out.println("execute --findByHQL()-- method.");
    }
}
