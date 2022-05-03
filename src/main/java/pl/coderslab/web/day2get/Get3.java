package pl.coderslab.web.day2get;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/get3")
public class Get3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String widthStr = request.getParameter("width");
        String heightStr = request.getParameter("height");
        if (widthStr == null || heightStr == null) {
            widthStr = "5";
            heightStr = "10";
        }
        try {
            int width = Integer.parseInt(widthStr);
            int height = Integer.parseInt(heightStr);
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= width; j++) {
                    response.getWriter().println(" " + (i*j) +" ");
                }
                response.getWriter().println("<br>");
            }


        } catch (NumberFormatException e) {
            response.getWriter().println("Niepoprawne dane");
            return;
        }

    }
}
