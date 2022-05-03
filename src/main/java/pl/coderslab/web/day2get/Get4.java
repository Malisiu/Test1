package pl.coderslab.web.day2get;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@WebServlet("/get4")
public class Get4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        Map<String,String[]> map = request.getParameterMap();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            response.getWriter().println(key + "<br>");
            String[] values = map.get(key);
            for (String value : values) {
                response.getWriter().println("- " + value + "<br>");
            }
        }

    }
}
