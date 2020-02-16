package cn.edu.zjut.dao;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;

import cn.edu.zjut.model.UserBean;

public class UserDAO {

    private static final String GET_ONE_SQL = "SELECT * FROM usertable WHERE username=? and password=? and type=?";

    public UserDAO() {
    }

    public Connection getConnection() {
        Connection conn = null;
        String driver = "org.mariadb.jdbc.Driver";
        String dburl = "jdbc:mariadb://localhost:3306/myDB";
        String username = "root"; //数据库登录用户名
        String password = "64076407Fxm"; //数据库登录密码
        try {
            Class.forName(driver); //加载数据库驱动程序
            conn = DriverManager.getConnection(dburl, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public boolean searchUser(UserBean user) {
    // 按用户名和密码校验用户是否合法
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rst = null;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(GET_ONE_SQL);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setInt(3,user.getType());
            rst = pstmt.executeQuery();
            if (rst.next()) {
                return true;
            }
        } catch (SQLException se) {
            se.printStackTrace();
            return false;
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return false;
    }

    public boolean insert(UserBean user){
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql= "INSERT INTO myDB.usertable" +
                "(username,password,type)VALUES(?,?,?)";
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setInt(3,user.getType());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException se) {
            se.printStackTrace();
            return false;
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}