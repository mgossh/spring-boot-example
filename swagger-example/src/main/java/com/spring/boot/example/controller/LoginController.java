package com.spring.boot.example.controller;

import com.spring.boot.example.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * 登录控制器
 *
 * @author huaijin
 */
@Api(tags = "注册登录", description = "登录鉴权")
@RestController
public class LoginController {

    @ApiOperation(value = "用户登录", notes = "登录接口")
    @PostMapping(value = "/login")
    public String login(@RequestBody UserVo userVo) {
        return "ok";
    }

}
