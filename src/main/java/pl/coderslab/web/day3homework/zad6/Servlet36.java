package pl.coderslab.web.day3homework.zad6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet36")
public class Servlet36 extends HttpServlet {
    private final String FORM_HTML = "<form method=\"post\" action=\"servlet36\">\n" +
            "    <div>\n" +
            "        <label for=\"firstName\">Imię:</label>\n" +
            "        <br>\n" +
            "        <input id=\"firstName\" name=\"firstName\" type=\"text\">\n" +
            "    </div>\n" +
            "    <div>\n" +
            "        <input type=\"submit\" value=\"Submit\">\n" +
            "    </div>\n" +
            "</form>";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println(FORM_HTML);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String firstName = request.getParameter("firstName");
        if (firstName.length() < 1 || firstName == null){
            response.getWriter().println("Niepoprawne dane");
        }
    }
}
