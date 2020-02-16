package cn.edu.zjut.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Customer {
    private int customerId;
    private String account;
    private String password;
    private String repassword;
    private String name;
    private Boolean sex;
    private String sexStr;
    private Date birthday;
    private String email;
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public Boolean getSex() {
        return sex;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getAccount() {
        return account;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRepassword() {
        return repassword;
    }

    public String getSexStr() {
        return sexStr;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public void setSexStr(String sexStr) {
        this.sexStr = sexStr;
    }
}
