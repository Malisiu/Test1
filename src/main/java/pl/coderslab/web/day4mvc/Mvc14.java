package pl.coderslab.web.day4mvc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mvc14")
public class Mvc14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter","J.K.Rowling","1"));
        books.add(new Book("Slepnac od swiatel","Jakub Zulczyk","2"));
        books.add(new Book("Wiedzmin","Andrzej Sapkowski","3"));
        request.setAttribute("books",books);
        getServletContext().getRequestDispatcher("/resultList.jsp").forward(request,response);
    }
}
