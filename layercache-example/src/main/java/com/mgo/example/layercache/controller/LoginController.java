package com.mgo.example.layercache.controller;

import com.mgo.example.layercache.service.LoginService;
import com.mgo.example.layercache.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 登录控制器
 *
 * @author huaijin
 */

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/login")
    public String login(@RequestBody UserVo userVo) {
        return "ok";
    }

    @GetMapping(value = "/get")
    public UserVo get(String id) {
        return loginService.getUser(id);
    }
}
