package pl.coderslab.web.day3session.zad2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String ratingStr = request.getParameter("rating");
        String form_html = "<div>\n" +
                "        <form action=\"session2?rating=%s\">\n" +
                "            <label for=\"rating\">Ocena:</label>\n" +
                "            <br><br>\n" +
                "            <input id=\"rating\" name=\"rating\" type=\"text\">\n" +
                "            <br><br>\n" +
                "            <input type=\"submit\" value=\"Submit\">\n" +
                "        </form>\n" +
                "    </div>";
        HttpSession session = request.getSession();
        List<Double> ratings = (List<Double>) session.getAttribute("rating");
        response.getWriter().println(String.format(form_html,"rating"));
        if (ratings == null){
            ratings = new ArrayList<>();
        }
        try {
            if (ratingStr != null && ratingStr.length()>0){
                double rating = Double.parseDouble(ratingStr);
                System.out.println(rating);
                ratings.add(rating);
                session.setAttribute("rating",ratings);
            }
        }catch (NumberFormatException e){
            response.getWriter().println("Podana wartość nie jest liczbą ");
        }
        if (ratings.size() > 0){
            double sum = 0;
            for (Double rating : ratings) {
                response.getWriter().println("<div>" + rating + "</div>");
                sum += rating;
            }
            response.getWriter().println("<div> Średnia: " + (sum/ratings.size()) + "</div>" );
        }
    }

}
