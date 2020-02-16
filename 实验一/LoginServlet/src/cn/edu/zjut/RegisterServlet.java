package cn.edu.zjut;

import cn.edu.zjut.dao.UserDAO;
import cn.edu.zjut.model.UserBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDAO dao = new UserDAO();
        UserBean user = new UserBean();
        String message =null;
        try{
            user.setUsername(request.getParameter("username"));
            user.setPassword(request.getParameter("password1"));
            user.setType(Integer.parseInt(request.getParameter("type")));
            boolean success = dao.insert(user);
            if(success){
                message = "<li>成功注册！</li>";
                request.setAttribute("result", message);
                RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
                dispatcher.forward(request, response);
            }else{
                message = "<li>注册错误！</li>";
                response.sendRedirect("register.jsp");
            }
        }catch(Exception e){
            message = "<li>注册错误！</li>";
            response.sendRedirect("register.jsp");
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
