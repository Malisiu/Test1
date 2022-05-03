package pl.coderslab.web.day4mvc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Locale;

@WebServlet("/mvc11")
public class Mvc11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String role = request.getParameter("role");
        String useRole;
        if (role != null ){
             useRole ="ROLE_" + role.toUpperCase();
        }else {
            useRole = "guest";
        }
        request.setAttribute("role",useRole);
        getServletContext().getRequestDispatcher("/jsp1.jsp").forward(request,response);

    }

}
