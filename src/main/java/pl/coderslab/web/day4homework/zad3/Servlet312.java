package pl.coderslab.web.day4homework.zad3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet312")
public class Servlet312 extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Map<String,String> mapLang = new HashMap<>();
    String language = request.getParameter("language");
    String lang = "";
    if (language != null){
        switch (language){
            case "en":
                lang = "Hello";
                break;
            case "pl":
                lang = "Cześć";
                break;
            case "de":
                lang = "Hallo";
                break;
            case "es":
                lang = "Hola";
                break;
            case "fr":
                lang = "Salut";
                break;
        }
    }
    HttpSession session = request.getSession();
    Cookie cookie = new Cookie("language",lang);
    cookie.setPath("/");
    cookie.setMaxAge(24 * 3600);
    response.addCookie(cookie);

}
}
