package pl.coderslab.web.day4filtry.zad3;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/admin/*")
public class AuthFilter implements Filter {
 @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpSession session = ((HttpServletRequest) request).getSession();
        if (session.getAttribute("username") == null){
            ((HttpServletRequest)request).getServletContext().getRequestDispatcher("/login").forward(request,response);
        }
        chain.doFilter(request, response);
    }
}
