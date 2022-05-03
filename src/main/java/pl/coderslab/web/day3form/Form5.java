package pl.coderslab.web.day3form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/form5")
public class Form5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String numToConvStr = request.getParameter("numToConv");
        String conversionType = request.getParameter("conversionType");
        System.out.println(conversionType);
        if (numToConvStr.length() < 1 || numToConvStr == null) {
            response.getWriter().println("Niepoprawne dane");
            return;
        }
        double result;
        try {
            double numToConvert = Double.parseDouble(numToConvStr);
            System.out.println(conversionType.equals("celcToFahr"));
            if (conversionType.equals("celcToFahr")) {
                result = (numToConvert - 32) * ((double) 5 / 9);
                response.getWriter().println(numToConvert + "°C to " + result + "°F");
            }else {
                result = ((9 * numToConvert) / 5) + 32;
                response.getWriter().println(numToConvert + "°F to " + result + "°C");
            }
        } catch (NumberFormatException e) {
            response.getWriter().println("Niepoprawne dane");
            return;
        }
    }
}
