package pl.coderslab.web.day3homework.zad1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet31")
public class Servlet31 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String priceStr = request.getParameter("price");
        String firstCurrency = request.getParameter("firstCurrency");
        String secondCurrency = request.getParameter("secondCurrency");
        if (priceStr == null || firstCurrency == null || secondCurrency == null || priceStr.length() < 1){
            response.getWriter().println("Niepoprawne dane");
            return;
        }
        try {
            double price = Double.parseDouble(priceStr);
            if (firstCurrency.equals("EUR")){
                if (secondCurrency.equals("PLN")){
                    response.getWriter().println(price + " EUR = " + (price * 4.3728) + " PLN");
                }else if (secondCurrency.equals("USD")){
                    response.getWriter().println(price + " EUR = " + (price * 1.05) + " USD");
                }else {
                    response.getWriter().println(price + " EUR = " + price + " EUR");
                }
            }else if (firstCurrency.equals("PLN")){
                if (secondCurrency.equals("EUR")){
                    response.getWriter().println(price + " PLN = " + (price * 0.21) + " EUR");
                }else if (secondCurrency.equals("USD")){
                    response.getWriter().println(price + " PLN = " + (price * 0.22) + " USD");
                }else {
                    response.getWriter().println(price + " PLN = " + price + " PLN");
                }
            }else {
                if (secondCurrency.equals("EUR")){
                    response.getWriter().println(price + " USD = " + (price * 0.95) + " EUR");
                }else if (secondCurrency.equals("PLN")){
                    response.getWriter().println(price + " USD = " + (price * 4.45) + " PLN");
                }else {
                    response.getWriter().println(price + " USD = " + price + " USD");
                }
            }

        }catch (NumberFormatException e){
            response.getWriter().println("Podana wartość nie jest liczbą");
        }
    }
}
