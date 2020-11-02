package com.spring.boot.example.controller;

import com.spring.boot.example.vo.UserVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author: shish@kltb.com.cn
 * @date: 2020-10-29 16:34
 * @desc:
 */
@RestController
public class LoginController {

    @PostMapping(value = "/login")
    public String login(@RequestBody @Valid UserVo userVo) {
        return "ok";
    }
}
