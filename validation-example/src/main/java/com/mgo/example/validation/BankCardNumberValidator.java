package com.mgo.example.validation;

import com.mgo.example.common.BankCardUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Optional;

/**
 * @author: shish@kltb.com.cn
 * @date: 2020-11-01 14:59
 * @desc: 银行卡校验类
 */
public class BankCardNumberValidator implements ConstraintValidator<BankCardNumber, Object> {
    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        return BankCardUtil.isVailidBankCard(Optional.ofNullable(o).orElse("").toString());
    }

    @Override
    public void initialize(BankCardNumber constraintAnnotation) {

    }
}
