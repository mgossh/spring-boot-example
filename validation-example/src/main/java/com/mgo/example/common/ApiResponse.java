package com.mgo.example.common;


import com.alibaba.fastjson.JSONObject;

/**
 * @author: shish@kltb.com.cn
 * @date: 2019-08-03 14:28
 * @desc: API接口返回封装类
 */
public class ApiResponse<T> {
    public static final String CODE_SUCCESS = "200";
    public static final String CODE_ERR = "500";

    public static final String MSG_SUCCESS = "success";
    public static final String MSG_ERROR = "error";

    private String code;
    private String msg;
    private T data;
    private Long timestamp;

    public static ApiResponse buildSuccess() {
        return new ApiResponse(CODE_SUCCESS, MSG_SUCCESS, new JSONObject());
    }

    public static <T> ApiResponse<T> buildSuccess(T data) {
        return new ApiResponse<>(CODE_SUCCESS, MSG_SUCCESS, data);
    }

    public static <T> ApiResponse<T> buildSuccess(String msg, T data) {
        return new ApiResponse<>(CODE_SUCCESS, msg, data);
    }

    public static <T> ApiResponse<T> buildSuccess(String code, String msg, T data) {
        return new ApiResponse<>(code, msg, data);
    }

    public static <T> ApiResponse<T> errInstance() {
        return new ApiResponse(CODE_ERR, MSG_ERROR, new JSONObject());
    }

    public static <T> ApiResponse<T> errInstance(String msg) {
        return new ApiResponse(CODE_ERR, msg, new JSONObject());
    }

    public static <T> ApiResponse<T> errInstance(String errCode, String msg) {
        return new ApiResponse(errCode, msg, new JSONObject());
    }

    public static <T> ApiResponse<T> errInstance(String errCode, String msg, T data) {
        return new ApiResponse<>(errCode, msg, data);
    }

    public ApiResponse(T data) {
        this.code = CODE_SUCCESS;
        this.msg = MSG_SUCCESS;
        this.data = data;
    }

    public ApiResponse(String msg) {
        this.msg = msg;
    }

    public ApiResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ApiResponse(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}

