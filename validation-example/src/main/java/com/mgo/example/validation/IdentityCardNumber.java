package com.mgo.example.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author: shish@kltb.com.cn
 * @date: 2020-10-29 16:41
 * @desc:
 */
@Documented
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IdentityCardNumberValidator.class)
public @interface IdentityCardNumber {

    String message() default "身份证信息有误,请核对后提交";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
