package pl.coderslab.web.day3Cookie.zad4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/cookie4Del")
public class Cookie4Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String key = request.getParameter("key");
        Cookie cookie = new Cookie(key,"");
        cookie.setPath("/");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        response.getWriter().println("Ciasteczko usunięte :)");

    }
}
