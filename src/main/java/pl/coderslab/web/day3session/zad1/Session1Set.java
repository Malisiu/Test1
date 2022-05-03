package pl.coderslab.web.day3session.zad1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/session1Set")
public class Session1Set extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        if (session.getAttribute("counter") == null){
            session.setAttribute("counter",1);
            response.getWriter().println("Sesja utworzona :)");
        }else {
            response.getWriter().println("Sesja już trwa :)");
        }
    }

}
