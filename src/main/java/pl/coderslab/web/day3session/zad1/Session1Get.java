package pl.coderslab.web.day3session.zad1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/session1Get")
public class Session1Get extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        if (session.getAttribute("counter") == null){
            response.getWriter().println("Brak aktywnej sesji :(");
        }else {
            int counter = (Integer) session.getAttribute("counter") + 1;
            session.setAttribute("counter",counter);
            response.getWriter().println("Odwiedzasz tą stronę " + counter + " raz");
        }

    }
}
