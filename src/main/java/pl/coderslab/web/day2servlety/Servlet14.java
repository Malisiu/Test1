package pl.coderslab.web.day2servlety;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet14")
public class Servlet14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userAgent = request.getHeader("User-agent");
        String addressIp = request.getRemoteAddr();
        response.getWriter().println(userAgent);
        response.getWriter().println(addressIp);

    }
}
