package cn.edu.zjut.ejb;

import javax.ejb.Remote;
import java.util.ArrayList;

@Remote
public interface ProductCartRemote {
    public void addProduct(String productName, int price);
    public ArrayList<String> listProducts();
    public int totalPrice();
}