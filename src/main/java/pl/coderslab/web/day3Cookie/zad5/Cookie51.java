package pl.coderslab.web.day3Cookie.zad5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/cookie51")
public class Cookie51 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        Cookie cookie = new Cookie("cookie51","cookie51");
        cookie.setPath("/");
        cookie.setMaxAge(3600);
        response.addCookie(cookie);
        String html_form = "<a href=\"cookie52?key=%s\">Cookie52</a>";
        response.getWriter().println(String.format(html_form,cookie.getName()));
    }
}
