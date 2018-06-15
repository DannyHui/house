package com.mooc.house.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: com.mooc.house.filter
 * @Class: FilterBeanConfig
 * @Description: TODO
 * @Author: zhangyahui
 * @Date: 2018/3/29 19:59
 */
@Configuration
public class FilterBeanConfig {
    /**
     * 1.构造filter
     * 2.配置拦截urlPattern
     * 3.利用FilterRegistrationBean进行包装
     * @return
     */
    @Bean
    public FilterRegistrationBean Filter()
    {
        //构造filter
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogFilter());
        //配置拦截urlPattern
        List<String> urlList=new ArrayList<String>();
        urlList.add("*");
        filterRegistrationBean.setUrlPatterns(urlList);
        return filterRegistrationBean;
    }
}
