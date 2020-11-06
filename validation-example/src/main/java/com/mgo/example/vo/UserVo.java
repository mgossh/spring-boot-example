package com.mgo.example.vo;

import com.mgo.example.validation.BankCardNumber;
import com.mgo.example.validation.IdentityCardNumber;
import com.mgo.example.validation.PhoneNumber;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author: shish@kltb.com.cn
 * @date: 2020-10-29 16:36
 * @desc:
 */
@Data
public class UserVo {

    @NotBlank
    private String userName;

    @NotBlank
    private String userPassword;

    @PhoneNumber
    private String phone;

    private Integer sex;

    @IdentityCardNumber(message = "身份证信息有误")
    private String idCardNo;

    @BankCardNumber
    private String bankCardNo;
}
