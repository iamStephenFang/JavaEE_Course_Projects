package cn.edu.zjut.ejb;

import java.util.ArrayList;
import javax.ejb.Remote;
import javax.ejb.Stateful;

@Stateful
@Remote(ProductCartRemote.class)
public class ProductCartBean implements ProductCartRemote {

    public ProductCartBean() {
        // TODO Auto-generated constructor stub
    }

    private ArrayList<String> cartList = new ArrayList<String>();
    private int totalPrice = 0;

    public ArrayList listProducts() {
        return this.cartList;
    }

    public void addProduct(String name, int price) {
        this.cartList.add(name);
        totalPrice += price;
    }

    public int totalPrice() {
        return totalPrice;
    }

}