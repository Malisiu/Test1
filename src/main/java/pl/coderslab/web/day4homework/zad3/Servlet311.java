package pl.coderslab.web.day4homework.zad3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet311")
public class Servlet311 extends HttpServlet {
    private final String FORM_HTML = "<form action=\"servlet312\" method=\"post\">\n" +
            "    <p>Choose your language:</p>\n" +
            "    <select name=\"language\">\n" +
            "        <option value=\"en\">English</option>\n" +
            "        <option value=\"pl\">Polish</option>\n" +
            "        <option value=\"de\">Germany</option>\n" +
            "        <option value=\"es\">Spanish</option>\n" +
            "        <option value=\"fr\">French</option>\n" +
            "    </select>\n" +
            "    <div>\n" +
            "        <input type=\"submit\" value=\"Submit\">\n" +
            "    </div>\n" +
            "</form>";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        int i = 0;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("language")){
                response.getWriter().println("<div>" + cookie.getValue() + "</div>");
                i = 1;
            }
        }
        if (i == 0){
            response.getWriter().println("<div>Cześć</div>");
        }
        response.getWriter().println(FORM_HTML);
    }
}
