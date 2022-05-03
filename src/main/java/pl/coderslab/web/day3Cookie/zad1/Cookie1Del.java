package pl.coderslab.web.day3Cookie.zad1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/cookie1Del")
public class Cookie1Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = "User";
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        Cookie cookie = new Cookie(key,"");
        cookie.setPath("/");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        response.getWriter().println("Usunięto ciasteczko");
    }
}
