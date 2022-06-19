package com.swaggerdemo.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2 //开启Swagger2
public class SwaggerConfig {

    //配置了Swagger的Docket的bean实例
//    @Bean
//    public Docket docket(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo());
//    }


    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
    }
    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("B");
    }
    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("C");
    }


    @Bean
    public Docket docket(){

        //配置了Swagger的Docket的Bean实例
//        DocumentationType documentationType = new DocumentationType();
        return new Docket(DocumentationType.SWAGGER_2).groupName("希望")
                .apiInfo(apiInfo())
                .select()
                //RequestHandlerSelectors,配置要扫描接口的方式
                //basePackage指定扫描的包
                //any扫描全部的包
                //none()都不扫描
                //withClassAnnotation()扫描类上的注解，参数是注解的反射对象
                //withMethodAnnotation()扫描方法上的注解
                .apis(RequestHandlerSelectors.basePackage("com.swaggerdemo.controller"))
                //paths()，过滤路径，只让/kuang开头的请求通过
//                .paths(PathSelectors.ant("/com.swaggerdemo/**"))
                .build();
    }


    //配置Swagger信息=apiInfo
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("张三","https://blog.csdn.net/weixin_40928238?assign_skin_id=77","837371744@qq.com");

        return new ApiInfo("英俊的SwaggerAPI文档",
                "少年不惧岁月长，彼岸尚有荣光长",
                "V1.0",
                "https://blog.csdn.net/yingdajun?type=blog",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }

}


