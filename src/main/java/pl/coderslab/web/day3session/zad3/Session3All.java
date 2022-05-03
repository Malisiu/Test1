package pl.coderslab.web.day3session.zad3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/session3All")
public class Session3All extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        String[] keys = (String[])session.getAttribute("keys");
        for (String key : keys) {
            response.getWriter().println("<div> Klucz: " + key + " ,wartość: " + session.getAttribute(key) + "</div>" );
        }
    }
}
