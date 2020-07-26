//package com.zengxy.wj.config;
//
//
//import com.zengxy.wj.interceptor.LoginInterceptor;
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.config.annotation.*;
//
////将拦截器配置到项目中
//@SpringBootConfiguration
//public class MyWebConfigurer implements WebMvcConfigurer {
//
//    @Bean
//    public LoginInterceptor getLoginIntercepter() {
//        return new LoginInterceptor();
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//        //除了/index.html，其他全部拦截
//        registry.addInterceptor(getLoginIntercepter()).addPathPatterns("/**").excludePathPatterns("/index.html");
//
//    }
//}
//
//
