package com.zzw.mymall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 张志伟
 * @version v1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /*swagger会帮助我们生成接口文档
     * 1：配置生成的文档信息
     * 2: 配置生成规则*/

    /**
     * Docket封装接口文档信息
     *
     * @return
     */
    @Bean
    public Docket getDocket() {
        //指定文档风格
        //创建封⾯信息对象
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("《商城》后端接口说明")
                .description("此⽂档详细说明了商城项目后端接口规范....")
                .version("v 2.0.1")
                .contact(new Contact("张志伟", "www.zzw.com", "1586314897@qq.com"));
        ApiInfo apiInfo = apiInfoBuilder.build();
        //指定生成的文档中的封⾯信息：⽂档标题、版本、作者
        Docket docket = new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zzw.mymall.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
