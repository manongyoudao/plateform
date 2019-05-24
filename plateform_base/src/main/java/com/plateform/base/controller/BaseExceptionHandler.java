package com.plateform.base.controller;

import entity.CommonResponse;
import entity.StatuCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 定义异常处理类
 */
@RestControllerAdvice
public class BaseExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public CommonResponse exceptionHandler() {
        return new CommonResponse(StatuCode.ERROR, true, "服务器异常");
    }
}
