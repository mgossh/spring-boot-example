package com.mgo.example.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户Vo
 *
 * @author huaijin
 */
@Setter
@Getter
@ApiModel(value = "用户信息")
public class UserVo {

    @ApiModelProperty(value = "用户名", required = true)
    private String userName;

    @ApiModelProperty(value = "用户密码", required = true)
    private String userPassword;

    @ApiModelProperty(value = "手机号码", hidden = true)
    private String phone;

    @ApiModelProperty(value = "性别", allowableValues = "1=男；2=女", example = "1")
    private Integer sex;
}
