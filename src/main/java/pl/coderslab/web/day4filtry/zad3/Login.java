package pl.coderslab.web.day4filtry.zad3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    private final static String USER = "admin";
    private final static String PASSWORD = "coderslab";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals(USER) && password.equals(PASSWORD)){
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
            response.sendRedirect("admin");
            return;
        }else {
            response.getWriter().println("Login lub hasło jest nieprawidłowe :(");
            return;
        }
    }
}
