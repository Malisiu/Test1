package pl.coderslab.web.day3Cookie.zad3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/cookie3")
public class Cookie3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        String timeStr = request.getParameter("time");
        int time = Integer.parseInt(timeStr);
        if (key == null || value == null){
            response.getWriter().println("Niepoprawne dane");
            return;
        }
        Cookie cookie = new Cookie(key,value);
        cookie.setPath("/");
        cookie.setMaxAge(time * 60 * 60);
        response.addCookie(cookie);
        response.getWriter().println("Dodano ciasteczko :)");
    }
}
