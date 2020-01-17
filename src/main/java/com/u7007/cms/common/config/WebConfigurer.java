package com.u7007.cms.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfigurer extends WebMvcConfigurationSupport {
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/images/focus/**").
		addResourceLocations("file:./file/images/focus/");
		
		registry.addResourceHandler("/images/news/**").
		addResourceLocations("file:./file/images/news/");
		
		registry.addResourceHandler("/images/images/**").
		addResourceLocations("file:./file/images/images/");
		
		registry.addResourceHandler("/images/goods/**").
		addResourceLocations("file:./file/images/goods/");
		
		registry.addResourceHandler("/**").
        addResourceLocations("classpath:/static/");
	}
}
