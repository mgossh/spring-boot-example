package com.mgo.example.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author: shish@kltb.com.cn
 * @date: 2020-11-01 14:54
 * @desc:
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = {BankCardNumberValidator.class})
public @interface BankCardNumber {

    String message() default "银行卡信息有误,请核对后提交";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
