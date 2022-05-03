package pl.coderslab.web.day3form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/form3")
public class Form3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String numberStr = request.getParameter("number");
        if (numberStr == null) {
            response.getWriter().println("Uzupełnij dane");
            return;
        }
        try {
            int number = Integer.parseInt(numberStr);
            for (int i = 1; i <= number; i++){
                if (number % i == 0){
                    response.getWriter().println("<div>" + i + "</div><br>");
                }
            }
        } catch (NumberFormatException e) {
            response.getWriter().println("Podana wartość nie jest liczbą");
            return;
        }
    }
}
