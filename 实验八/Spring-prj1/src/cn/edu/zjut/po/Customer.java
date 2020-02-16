package cn.edu.zjut.po;

import java.util.Date;

public class Customer implements java.io.Serializable {
    private int customerId;
    private String account;
    private String password;
    private String name;
    private Boolean sex;
    private Date birthday;
    private String phone;
    private String email;
    private String address;
    private String zipcode;
    private String fax;

    public Customer() {
    }

    public Customer(int customerId) {
        this.customerId = customerId;
    }

    public Customer(int customerId, String account, String password, String name, Boolean sex, Date birthday, String address, String zipcode, String fax,String phone,String email) {
        this.customerId = customerId;
        this.account = account;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.fax = fax;
        this.zipcode = zipcode;
        this.email = email;
        this.phone = phone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() { return address; }

    public String getZipcode() { return zipcode; }

    public String getFax() {return fax; }

    public void setAddress(String address) {this.address = address; }

    public void setFax(String fax) { this.fax = fax; }

    public void setZipcode(String zipcode) { this.zipcode = zipcode; }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


