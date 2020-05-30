package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class RestWebMVCConfigurations implements WebMvcConfigurer  {

	// Registering web Configurations

	@Autowired
	InterceptorConfiguration interceptorConfiguration;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptorConfiguration);
	}
}
