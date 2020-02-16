package cn.edu.zjut.app;

import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringEnvTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("file:/Users/stephenfang/OneDrive/课程/JavaEE/实验十/Spring-prj3/web/WEB-INF/applicationContext.xml");
        IUserService userService = (IUserService) ctx.getBean("logProxy");
        Customer cust = new Customer();
        cust.setAccount("SPRING");
        cust.setPassword("SPRING");
        userService.addUser(cust);
    }
}
