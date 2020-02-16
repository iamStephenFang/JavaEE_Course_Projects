package cn.edu.zjut.service;

import cn.edu.zjut.dao.ICustomerDAO;
import cn.edu.zjut.po.Customer;
import org.springframework.transaction.annotation.Transactional;

public class UserService implements IUserService {
    private ICustomerDAO customerDAO = null;

    public void setCustomerDAO(ICustomerDAO customerDAO) {
        System.out.println("call setCustomerDAO in UserService.");
        this.customerDAO = customerDAO;
    }

    @Transactional
    public void addUser(Customer cust) {
        System.out.println("execute --addUser()-- method.");
        customerDAO.save(cust);
    }

    public void delUser(Customer cust) {
        System.out.println("execute --delUser()-- method.");
        customerDAO.delete(cust);
    }

    public void updateUser(Customer cust) {
        System.out.println("execute --updateUser()-- method.");
        customerDAO.update(cust);
    }

    public void findUser(String account) {
        System.out.println("execute --findUser()-- method.");
        customerDAO.findByHQL(account);
    }
}
