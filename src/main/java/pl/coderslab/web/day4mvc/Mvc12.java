package pl.coderslab.web.day4mvc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/mvc12")
public class Mvc12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String startStr = request.getParameter("start");
        String endStr = request.getParameter("end");
        if (startStr == null || endStr == null){
            response.getWriter().println("Niepoprawne dane");
            return;
        }
        try {
            int start = Integer.parseInt(startStr) + 10;
            int end = Integer.parseInt(endStr) + 10;
            request.setAttribute("start",start);
            request.setAttribute("end",end);
            getServletContext().getRequestDispatcher("/jsp2.jsp").forward(request,response);
        }catch (NumberFormatException e){
            response.getWriter().println("Niepoprawne dane");
            return;
        }
    }
}
