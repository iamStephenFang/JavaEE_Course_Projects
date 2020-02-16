package cn.edu.zjut.dao;

import cn.edu.zjut.po.Customer;

public interface ICustomerDAO {
     void save(Customer transientInstance);
     void delete(Customer transientInstance);
     void update(Customer transientInstance);
     void findByHQL(String hql);
}
