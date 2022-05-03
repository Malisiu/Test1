package pl.coderslab.web.day2get;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/get1")
public class Get1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String startStr = request.getParameter("start");
        String endStr = request.getParameter("end");
        if (startStr == null || endStr == null){
            response.getWriter().println("Brak danych");
            return;
        }
        try {
            int start = Integer.parseInt(startStr);
            int end = Integer.parseInt(endStr);
            String html_form = "<div> %s </div>";
            for (int i = start; i <= end; i++){
                response.getWriter().println(String.format(html_form,i));
            }
        }catch (NumberFormatException e){
            response.getWriter().println("Niepoprawne dane");
            return;
        }



    }
}
