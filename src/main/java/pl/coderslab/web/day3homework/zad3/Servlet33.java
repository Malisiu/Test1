package pl.coderslab.web.day3homework.zad3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet33")
public class Servlet33 extends HttpServlet {
    private final String FORM_HTML = "<form action=\"servlet33\" method=\"post\">\n" +
            "    <div>\n" +
            "        <label for=\"str1\"></label>\n" +
            "        <input id=\"str1\" name=\"str1\" value=\"%s\">\n" +
            "    </div>\n" +
            "    <div>\n" +
            "        <label for=\"str2\"></label>\n" +
            "        <input id=\"str2\" name=\"str2\" value=\"%s\">\n" +
            "    </div>\n" +
            "    <div>\n" +
            "        <label for=\"str3\"></label>\n" +
            "        <input id=\"str3\" name=\"str3\" value=\"%s\">\n" +
            "    </div>\n" +
            "    <div>\n" +
            "        <label for=\"str4\"></label>\n" +
            "        <input id=\"str4\" name=\"str4\" value=\"%s\">\n" +
            "    </div>\n" +
            "    <div>\n" +
            "        <label for=\"str5\"></label>\n" +
            "        <input id=\"str5\" name=\"str5\" value=\"%s\">\n" +
            "    </div>\n" +
            "    <div>\n" +
            "        <input type=\"submit\" value=\"Submit\">\n" +
            "    </div>\n" +
            "</form>\n";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println(String.format(FORM_HTML,"","","","",""));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

    }
}
