package cn.edu.zjut.po;

import java.util.HashSet;
import java.util.Set;

public class Address {
    private int addressId;
    private String detail;
    private String zipcode;
    private String phone;
    private String type;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getAddressId() {
        return addressId;
    }

    public String getDetail() {
        return detail;
    }

    public String getPhone() { return phone; }

    public String getType() {
        return type;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
