package net.cfrost.security.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig paramFilterConfig) throws ServletException {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest paramServletRequest,
            ServletResponse paramServletResponse, FilterChain paramFilterChain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        System.out.println("Longin Filter - disabled");
        paramFilterChain.doFilter(paramServletRequest, paramServletResponse);
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

}