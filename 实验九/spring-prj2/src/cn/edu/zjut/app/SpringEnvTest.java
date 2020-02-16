package cn.edu.zjut.app;

import cn.edu.zjut.bean.*;
import cn.edu.zjut.event.EmailEvent;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


import java.util.*;

//public class SpringEnvTest {
//    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        IItemOrder itemorder1 = (IItemOrder) ctx.getBean("itemorder1");
//        System.out.println("书名：" + itemorder1.getItem().getTitle());
//        System.out.println("数量：" + itemorder1.getNumItems());
//        IItemOrder itemorder2 = (IItemOrder) ctx.getBean("itemorder2");
//        System.out.println("书名：" + itemorder2.getItem().getTitle());
//        System.out.println("数量：" + itemorder2.getNumItems());
//    }

//    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingcart");
//        List <ItemOrder> cartItems= shoppingCart.getItemsOrdered();
//        for (ItemOrder item:cartItems) {
//            System.out.println("总金额：" + item.getTotalCost());
//            System.out.println("总数：" + item.getNumItems());
//        }
//    }

//    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingcart");
//        Set<ItemOrder> cartItems= shoppingCart.getItemsOrdered();
//        for (ItemOrder item:cartItems) {
//            System.out.println("总金额：" + item.getTotalCost());
//            System.out.println("总数：" + item.getNumItems());
//        }
//    }

//    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingcart");
//        Properties cartItems = shoppingCart.getItemsOrdered();
//        for(Map.Entry<Object,Object> entry:cartItems.entrySet()){
//            System.out.println(entry.getKey().toString()+" "+entry.getValue().toString());
//        }
//    }

//    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        System.out.println("getBean(item1)---1");
//        IItem item11 = (IItem) ctx.getBean("item1");
//        System.out.println("getBean(item1)---2");
//        IItem item12 = (IItem) ctx.getBean("item1");
//        System.out.println("getBean(item2)---1");
//        IItem item21 = (IItem) ctx.getBean("item2");
//        System.out.println("getBean(item2)---2");
//        IItem item22 = (IItem) ctx.getBean("item2");
//    }

//    public static void main(String[] args) {
////        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        IItemOrder itemorder1 = (IItemOrder)ctx.getBean("itemorder1");
//        ctx.close();
//    }
//public static void main(String[] args) {
//    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//    IItemOrder itemorder2 = (IItemOrder)ctx.getBean("itemorder2");
//}
//}

//public class SpringEnvTest {
//    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext( "applicationContext.xml");
//        IItemOrder itemorder2 = (IItemOrder)ctx.getBean("itemorder2");
//    }
//}

//public class SpringEnvTest {
//    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Object[] objects = new Object[]{"HelloWorld", new Date()};
//        //String message = ctx.getMessage("HelloWorld", objects, Locale.CHINA);
//        String message = ctx.getMessage("HelloWorld", objects, Locale.US);
//        System.out.println(message);
//    }
//}

public class SpringEnvTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmailEvent ele = new EmailEvent("hello", "spring_test@zjut.edu.cn", "this is a test");
        ctx.publishEvent(ele);
    }
}