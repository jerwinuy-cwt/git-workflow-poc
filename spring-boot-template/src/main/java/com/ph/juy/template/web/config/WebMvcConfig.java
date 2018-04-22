package com.ph.juy.template.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.ph.juy.template.web.interceptor.LoggingInterceptor;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter
{

    @Autowired
    private LoggingInterceptor loggingInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(loggingInterceptor).addPathPatterns("/*");
    }
    
}
