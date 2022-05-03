package pl.coderslab.web.day3Cookie.zad2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/cookie2")
public class Cookie2 extends HttpServlet {
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String key = request.getParameter("key");
       String value = request.getParameter("value");
       if (key == null || value == null){
           response.getWriter().println("Niepoprawne dane");
           return;
       }
       Cookie cookie = new Cookie(key,value);
       cookie.setPath("/");
       cookie.setMaxAge(3600);
       response.addCookie(cookie);
       response.getWriter().println("Dodano ciasteczko :)");
   }
}
