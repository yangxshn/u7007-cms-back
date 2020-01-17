package com.u7007.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.u7007.cms.mapper")
public class CmsApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CmsApplication.class, args);
	}
	
}
