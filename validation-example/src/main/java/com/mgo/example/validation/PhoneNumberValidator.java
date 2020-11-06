package com.mgo.example.validation;

import cn.hutool.core.lang.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * @author: shish@kltb.com.cn
 * @date: 2020-10-29 18:53
 * @desc:
 */
public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, Object> {
    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        if (Objects.isNull(o)) {
            return false;
        }
        return Validator.isMobile(o.toString());
    }

    @Override
    public void initialize(PhoneNumber constraintAnnotation) {

    }
}
