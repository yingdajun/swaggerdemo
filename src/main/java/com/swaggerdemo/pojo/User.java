package com.swaggerdemo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class User {
//
//
//    public String username;
//    public String password;
//}

//@Api("注释")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户实体类")
public class User {


    @ApiModelProperty("用户名")
    public String username;
    @ApiModelProperty("密码")
    public String password;
}


