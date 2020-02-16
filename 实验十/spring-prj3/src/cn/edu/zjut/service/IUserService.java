package cn.edu.zjut.service;

import cn.edu.zjut.po.Customer;

public interface IUserService {
     void addUser(Customer cust);
     void delUser(Customer cust);
     void updateUser(Customer cust);
     void findUser(String account);
}
