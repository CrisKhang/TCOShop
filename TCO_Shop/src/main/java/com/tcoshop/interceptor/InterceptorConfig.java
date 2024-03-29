package com.tcoshop.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer{
	@Autowired
	CategoryInterceptor categoryInterceptor;
	@Autowired
	RoleInterceptor roleInterceptor;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(categoryInterceptor).addPathPatterns("/**");
		registry.addInterceptor(roleInterceptor).addPathPatterns("/**");
	}
}
