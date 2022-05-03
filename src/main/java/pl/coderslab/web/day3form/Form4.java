package pl.coderslab.web.day3form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/form4")
public class Form4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String firstNumStr = request.getParameter("firstNum");
        String secondNumStr = request.getParameter("secondNum");
        String thirdNumStr = request.getParameter("thirdNum");
        if (firstNumStr == null || secondNumStr == null || thirdNumStr == null){
            response.getWriter().println("Niepoprawne dane");
            return;
        }
        try {
            double firstNum = Double.parseDouble(firstNumStr);
            double secondNum = Double.parseDouble(secondNumStr);
            double thirdNum = Double.parseDouble(thirdNumStr);
            double delta = (secondNum * secondNum) - (4 * firstNum * thirdNum);
            double firstPlace , secondPlace;
            if (delta > 0){
                firstPlace = (0 - secondNum - delta) / (2 * firstNum);
                secondPlace = (0 - secondNum + delta) / (2 * firstNum);
                response.getWriter().println("<div>" + "pierwsze miejsce zerowe: " + firstPlace + "</div>");
                response.getWriter().println("<div>" + "drugie miejsce zerowe: " + secondPlace + "</div>");
            }else if (delta == 0){
                firstPlace = secondPlace = (- secondNum) / (2 * firstNum);
                response.getWriter().println("<div>" + "pierwsze miejsce zerowe: " + firstPlace + "</div>");
                response.getWriter().println("<div>" + "drugie miejsce zerowe: " + secondPlace + "</div>");
            }else {
                response.getWriter().println("Brak miejsc zerowych");
                return;
            }
        }catch (NumberFormatException e){
            response.getWriter().println("Podane dane są niepoprawne");
            return;
        }
    }
}
