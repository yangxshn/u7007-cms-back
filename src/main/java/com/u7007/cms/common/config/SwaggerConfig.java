package com.u7007.cms.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @desc 接口文档配置
 * @author yxs
 * @date 2019/3/21 15:50
 */
@Configuration
public class SwaggerConfig {
    @Value("${swagger.base-package:default}")
    private String basePackage;

    @Value("${swagger.title:default}")
    private String title;

    @Value("${swagger.description:default}")
    private String description;

    @Value("${swagger.terms-of-service-url:default}")
    private String termsOfServiceUrl;

    @Value("${swagger.contact.name:default}")
    private String contactName;

    @Value("${swagger.contact.email:default}")
    private String contactEmail;

    @Value("${swagger.version:default}")
    private String version;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                // 生成api扫包范围
                .apis(RequestHandlerSelectors.basePackage(basePackage)).paths(PathSelectors.any()).build();
    }

    // 创建api文档信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //title文档标题
                .title(title)
                //description 文档描述
                .description(description)
                // 官方网站
                .termsOfServiceUrl(termsOfServiceUrl)
                .contact(new Contact(contactName, termsOfServiceUrl, contactEmail))
                // 版本号
                .version(version)
                .build();
    }
}
