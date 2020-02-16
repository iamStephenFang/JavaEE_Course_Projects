package cn.edu.zjut.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class BaseHibernateDAO{
    private SessionFactory sessionFactory;
    public Session getSession(){
        return sessionFactory.getCurrentSession();
//        return sessionFactory.openSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
