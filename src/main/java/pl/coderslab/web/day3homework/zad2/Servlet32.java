package pl.coderslab.web.day3homework.zad2;

import org.apache.commons.lang3.ArrayUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/servlet32")
public class Servlet32 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String numStr = request.getParameter("num");
        if (numStr == null || numStr.length() < 1){
            response.getWriter().println("Niepoprawne dane");
            return;
        }
        String[] charArr = numStr.split("");
        int sum = 0;
        int j = 0;
        for (String c : charArr) {
             if (!c.equals("0") && !c.equals("1")){
                 response.getWriter().println("Podana liczba nie składa się tylko z 0 i 1");
                 return;
             }
        }
        for (int i = charArr.length -1 ;i >= 0;i--){
            int num = Integer.parseInt(charArr[i]);
            sum += num * Math.pow(2,j);
            j++;
        }
        response.getWriter().println(numStr + " to liczba " + sum);
    }
}
