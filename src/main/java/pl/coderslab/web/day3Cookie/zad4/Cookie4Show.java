package pl.coderslab.web.day3Cookie.zad4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/cookie4Show")
public class Cookie4Show extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        Cookie[] cookies = request.getCookies();
        if (cookies == null){
            response.getWriter().println("Brak ciasteczek");
            return;
        }
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName());
            response.getWriter().println("<div>");
            response.getWriter().println("Nazwa ciasteczka: " + cookie.getName() + " wartość: " + cookie.getValue());
            response.getWriter().println(String.format("<a href=\"cookie4Del?key=%s\">Usuń</a>",cookie.getName()));
            response.getWriter().println("</div>");
        }
    }
}
