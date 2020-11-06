package com.mgo.example.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author: shish@kltb.com.cn
 * @date: 2020-10-29 18:51
 * @desc:
 */
@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneNumberValidator.class)
public @interface PhoneNumber {

    String message() default "手机号码有误,请核对后提交";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
