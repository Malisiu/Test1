package pl.coderslab.web.day3session.zad4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/session4")
public class Session4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String quantityStr = request.getParameter("quantity");
        String priceStr = request.getParameter("price");
        HttpSession session = request.getSession();
        List<CartItem> list = (List<CartItem>) session.getAttribute("list");
        if (name == null || quantityStr == null || priceStr == null) {
            response.getWriter().println("Niepoprawne dane");
        }
        try {
            double quantity = Double.parseDouble(quantityStr);
            double price = Double.parseDouble(priceStr);
            CartItem cartItem = new CartItem(name, quantity, price);
            if (list == null) {
                list = new ArrayList<>();
            }
            if (name.length() > 0) {
                list.add(cartItem);
                session.setAttribute("list", list);
            } else {
                response.getWriter().println("Podaj nazwę produktu");
            }
        } catch (NumberFormatException e) {
            response.getWriter().println("Niepoprawne dane");
        }
        double sum = 0;
        for (CartItem cartItem : list) {
            sum += (cartItem.getQuantity() * cartItem.getPrice());
            response.getWriter().println("<div>" + cartItem + "<br></div>");
        }
        response.getWriter().println("<div>Suma: " + sum + "</div>");
    }
}
