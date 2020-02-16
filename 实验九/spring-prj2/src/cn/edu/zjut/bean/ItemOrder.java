package cn.edu.zjut.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ItemOrder implements IItemOrder, InitializingBean, DisposableBean {
    private IItem item;
    private int numItems;

    public void init() { System.out.println("正在执行初始化方法 init..."); }
    public void destroy() { System.out.println("正在执行销毁方法 destroy..."); }

    public ItemOrder() {
        System.out.println("Spring 实例化 ItemOrder...");
    }

    public void incrementNumItems() {
        setNumItems(getNumItems() + 1);
    }

    public void cancelOrder() {
        setNumItems(0);
    }

    public double getTotalCost() {
        return (getNumItems() * item.getCost());
    }

    public IItem getItem() {
        return item;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setItem(IItem item) {
        System.out.println("Spring 注入 item...");
        this.item = item;
    }

    public void setNumItems(int numItems) {
        System.out.println("Spring 注入 numItems...");
        this.numItems = numItems;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("正在执行初始化方法 afterPropertiesSet...");
    }

//    public void destroy() throws Exception {
//        System.out.println("正在执行初始化方法 destroy...");
//    }
}
