package com.mgo.example.boot;

import com.mgo.example.common.ApiResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ValidationException;

/**
 * @author: shish@kltb.com.cn
 * @date: 2020-10-29 17:38
 * @desc:
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    public ApiResponse handleValidationException(ValidationException e) {
        return ApiResponse.errInstance(e.getCause().getMessage());
    }

    /**
     * 方法参数校验
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return ApiResponse.errInstance(e.getBindingResult().getFieldError().getDefaultMessage());
    }
}
