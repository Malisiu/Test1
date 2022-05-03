package pl.coderslab.web.day3homework.zad5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet35")
public class Servlet35 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String num3Str = request.getParameter("num3");
        String num4Str = request.getParameter("num4");
        if (num1Str.length() < 1 || num2Str.length() < 1  || num3Str.length() < 1 || num4Str.length() < 1 ){
            response.getWriter().println("Niepoprawne dane");
            return;
        }
        try {
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            double num3 = Double.parseDouble(num3Str);
            double num4 = Double.parseDouble(num4Str);
            double sum =num1 + num2 + num3 + num4;
            double avg = sum / 4.0;
            response.getWriter().println("<div>Liczby:</div>");
            response.getWriter().println("- " + num1 + "<br>- " + num2 + "<br>- " + num3 + "<br>- " + num4);
            response.getWriter().println("<br>Średnia:<br>" + "- " + avg);
            response.getWriter().println("<br>Suma:<br>- " + sum);

        }catch (NumberFormatException e){
            response.getWriter().println("Niepoprawne dane");
            return;
        }
    }
}
