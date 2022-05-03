package pl.coderslab.web.day3homework.zad4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet34")
public class Servlet34 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        Cookie[] cookies = request.getCookies();
        String cookieName = "visits";
        String  cookieValue = "";
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(cookieName)){
                cookieValue = cookie.getValue();
            }
        }
        if (cookieValue == ""){
            Cookie cookie = new Cookie("visits","1");
            cookie.setPath("/");
            response.addCookie(cookie);
        }else {
            int cookieVal = Integer.parseInt(cookieValue);
            cookieVal += 1;
            cookieValue = cookieVal + "";
            Cookie cookie = new Cookie("visits",cookieValue);
            cookie.setPath("/");
            response.addCookie(cookie);
        }

        if (cookieValue == ""){
            response.getWriter().println("<div>Witaj pierwszy raz na naszej stronie</div>");
        }else {
            response.getWriter().println("<div>Witaj odwiedziłeś nas juz " + cookieValue + " razy</div>");
        }

    }
}
