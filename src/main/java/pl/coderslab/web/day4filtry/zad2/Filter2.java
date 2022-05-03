package pl.coderslab.web.day4filtry.zad2;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class Filter2 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        String userAgent = ((HttpServletRequest) request).getHeader("User-agent");
        System.out.println(userAgent);
        long startTime = System.currentTimeMillis();
        chain.doFilter(request, response);
        long stopTime = System.currentTimeMillis();
        System.out.println("żądanie zostało wywołane w " + (stopTime - startTime) + " ms");



    }
}
