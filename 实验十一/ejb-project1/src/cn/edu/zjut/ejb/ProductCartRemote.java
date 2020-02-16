package cn.edu.zjut.ejb;

import java.util.ArrayList;
import javax.ejb.Remote;

@Remote
public interface ProductCartRemote {
    public void addProduct(String productName, int price);
    public ArrayList<String> listProducts();
    public int totalPrice();
}