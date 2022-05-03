package pl.coderslab.web.day3form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/form2")
public class Form2 extends HttpServlet {
  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      response.setCharacterEncoding("UTF-8");
      String[] forbiddenWords = {"java","cholera","kurwa"};
      String message = request.getParameter("message");
      String checkbox = request.getParameter("checkbox");
      String[] messageArr = message.split(" ");
      if (checkbox == null){
        message = "";
        for (String word : messageArr) {
          if (Arrays.asList(forbiddenWords).contains(word.toLowerCase())){
            word = "*".repeat(word.length());
          }
          message = message + word + " ";
        }
      }
      response.getWriter().println("<div>" + message + "</div><br>");
  }
}
