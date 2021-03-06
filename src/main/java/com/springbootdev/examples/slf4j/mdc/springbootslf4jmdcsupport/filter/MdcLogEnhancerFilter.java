package com.springbootdev.examples.slf4j.mdc.springbootslf4jmdcsupport.filter;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class MdcLogEnhancerFilter implements Filter {

    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        MDC.put("userId", "www.SpringBootDev.com");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
