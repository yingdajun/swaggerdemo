package com.swaggerdemo.controller;

import com.swaggerdemo.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class HelloController {
//
//
//    @GetMapping("/hello")
//    public String hello(){
//        return "hello";
//    }
//
//    //只要返回值中存在实体类，他就会被扫描到Swagger中
//    @PostMapping("/user")
//    public User user(){
//        return new User("zs","123");
//    }
//
//}


//给文档加注释
@Api(tags = "控制器-hello")
@RestController
public class HelloController {

    @GetMapping("/")
    public String HelloWord(){
        return "Hello World";
    }

    //只要我们的接口中，返回值中存在实体类，他就会被扫描到Swagger中
    @PostMapping("/user")
    public User user(){
        return new User("zs","123");
    }

    @ApiOperation("hello请求")
    @GetMapping("hello")
    public String hello(@ApiParam("hello请求中的name") String username){
        return "hello"+username;
    }


}


