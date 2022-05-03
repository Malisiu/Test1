package pl.coderslab.web.day3session.zad3;

import org.apache.commons.lang3.ArrayUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/session3Add")
public class Session3Add extends HttpServlet {
    private static final String FORM_HTML = "<form action=\"\" method=\"POST\">\n" +
            "    <label>\n" +
            "        Klucz:\n" +
            "        <input type=\"text\" name=\"key\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Wartość:\n" +
            "        <input type=\"text\" name=\"value\">\n" +
            "    </label>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println(String.format(FORM_HTML));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println(String.format(FORM_HTML));
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        HttpSession session = request.getSession();
        String[] keys =(String[])session.getAttribute("keys");
        if (keys == null){
            keys = new String[0];
        }
        if (key.length() < 1 || value.length() < 1){
            response.getWriter().println("Niepoprawne dane");
            return;
        }
        keys = ArrayUtils.add(keys,key);
        System.out.println(Arrays.toString(keys));
        session.setAttribute(key,value);
        session.setAttribute("keys",keys);
    }
}
