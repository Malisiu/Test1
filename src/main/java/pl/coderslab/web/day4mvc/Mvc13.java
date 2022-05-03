package pl.coderslab.web.day4mvc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/mvc13")
public class Mvc13 extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    String title = request.getParameter("title");
    String author = request.getParameter("author");
    String isbn = request.getParameter("isbn");
    if (title == null || author == null || isbn == null){
        response.getWriter().println("Niepoprawne dane");
    }
    Book book = new Book(title,author,isbn);
    request.setAttribute("book",book);
    getServletContext().getRequestDispatcher("/result.jsp").forward(request,response);
}
}
