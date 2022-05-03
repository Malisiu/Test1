package pl.coderslab.web.day3Cookie.zad1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/cookie1Get")
public class Cookie1Get extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = "User";
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(key)){
                response.getWriter().println("Wartość ciasteczka User: " + cookie.getValue());
                break;
            }
        }
    }
}
