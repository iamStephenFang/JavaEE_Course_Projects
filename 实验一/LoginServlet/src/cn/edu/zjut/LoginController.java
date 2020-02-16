package cn.edu.zjut;

import cn.edu.zjut.dao.UserDAO;
import cn.edu.zjut.model.UserBean;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        UserBean user = new UserBean();
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setType(Integer.parseInt(request.getParameter("type")));

        if (checkUser(user)) {
            request.setAttribute("USER", user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("loginSuccess.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("loginFailed.jsp");
        }
    }

    boolean checkUser(UserBean user) {
        UserDAO ud = new UserDAO();
        if (ud.searchUser(user)) {
            return true;
        }
        return false;
    }
}