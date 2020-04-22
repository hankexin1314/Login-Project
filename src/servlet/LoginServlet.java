package servlet;

import bean.User;
import service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求的用户名和密码
        response.setHeader("content-type", "text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("用户名：" + username + " 密码：" + password);
        // 创建LoginService
        LoginService ls = new LoginService();
        // 调用Service中的方法
        try {
            User user = ls.getUserByUsernameAndPwd(username, password);
            if(user == null) {
                response.getWriter().println("error");
            } else {
                response.getWriter().println(user.getUsername() + ": come on");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
