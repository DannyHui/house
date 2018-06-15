package com.mooc.house.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Package: com.mooc.house.filter
 * @Class: LogFilter
 * @Description: TODO
 * @Author: zhangyahui
 * @Date: 2018/3/29 19:40
 */
public class LogFilter implements Filter {
    private Logger logger= LoggerFactory.getLogger(LogFilter.class);
    /**
     * 容器初始化
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * 容器拦截
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("Request Coming");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    /**
     * 容器销毁
     */
    @Override
    public void destroy() {

    }
}
