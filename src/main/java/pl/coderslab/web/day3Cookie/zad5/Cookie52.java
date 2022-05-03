package pl.coderslab.web.day3Cookie.zad5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Arrays;

@WebServlet("/cookie52")
public class Cookie52 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String key = request.getParameter("key");
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(key)){
                Cookie cookie1 = new Cookie(key,"");
                cookie1.setPath("/");
                cookie1.setMaxAge(0);
                response.addCookie(cookie1);
                response.getWriter().println("Witamy na stronie Cookie52");
                return;
            }
        }
        String message = "Nie odwiedziles jeszcze tej strony";
        response.sendRedirect("cookie51?msg=" + URLEncoder.encode(message, "UTF-8"));


    }
}
