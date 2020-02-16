package cn.edu.zjut.bean;

public class ItemOrderFactory {
    public ItemOrder createItemOrder() {
        System.out.println("调用实例工厂方法创建 bean...");
        return new ItemOrder();
    }
}
