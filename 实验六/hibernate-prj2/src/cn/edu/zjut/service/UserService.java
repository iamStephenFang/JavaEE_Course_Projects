package cn.edu.zjut.service;

import cn.edu.zjut.dao.CustomerDAO;
import cn.edu.zjut.po.Customer;
import com.opensymphony.xwork2.ActionContext;
import org.hibernate.Transaction;

import java.util.Map;
import java.util.List;

public class UserService {
    private Map<String, Object> request, session;

    public boolean login(Customer loginUser) {
        ActionContext ctx = ActionContext.getContext();
        session = (Map) ctx.getSession();
        request = (Map) ctx.get("request");
        String account = loginUser.getAccount();
        String password = loginUser.getPassword();
        String hql = "from Customer as user where account='" + account
                + "' and password='" + password + "'";
        CustomerDAO dao = new CustomerDAO();
        List list = dao.findByHql(hql);
        dao.getSession().close();
        if (list.isEmpty())
            return false;
        else {
            session.put("user", account);
            request.put("tip", "登录成功！");
            loginUser = (Customer) list.get(0);
            request.put("loginUser", loginUser);
            return true;
        }
    }

    public boolean register(Customer loginUser) {
        ActionContext ctx = ActionContext.getContext();
        session = (Map) ctx.getSession();
        request = (Map) ctx.get("request");
        CustomerDAO dao = new CustomerDAO();
        Transaction tran = null;
        try {
            tran = dao.getSession().beginTransaction();
            dao.save(loginUser);
            tran.commit();
            request.put("tip", "注册成功，请重新登录！");
            return true;
        } catch (Exception e) {
            if (tran != null) tran.rollback();
            return false;
        } finally {
            dao.getSession().close();
        }
    }

    public boolean update(Customer loginUser) {
        ActionContext ctx = ActionContext.getContext();
        session = (Map) ctx.getSession();
        request = (Map) ctx.get("request");
        CustomerDAO dao = new CustomerDAO();
        Transaction tran = null;
        try {
            tran = dao.getSession().beginTransaction();
            dao.update(loginUser);
            tran.commit();
            request.put("tip", "修改信息成功！");
            return true;
        } catch (Exception e) {
            if (tran != null) tran.rollback();
            return false;
        } finally {
            dao.getSession().close();
        }
    }

    public boolean delete(Customer loginUser) {
        ActionContext ctx = ActionContext.getContext();
        session = (Map) ctx.getSession();
        request = (Map) ctx.get("request");
        CustomerDAO dao = new CustomerDAO();
        Transaction tran = null;
        try {
            tran = dao.getSession().beginTransaction();
            dao.delete(loginUser);
            tran.commit();
            session.remove("user");
            request.put("tip", "删除个人信息成功，请重新登录！");
            return true;
        } catch (Exception e) {
            if (tran != null) tran.rollback();
            return false;
        } finally {
            dao.getSession().close();
        }
    }
}
