package com.stone.common.exception;

import org.springframework.http.HttpStatus;

/**
 * BadRequestException: 统一异常处理
 *
 * @author Stone
 * @version V1.0
 * @date 2020/1/17
 **/
public class BadRequestException extends RuntimeException {

    private Integer status = HttpStatus.BAD_REQUEST.value();

    public BadRequestException(String msg){
        super(msg);
    }

    public BadRequestException(HttpStatus status, String msg){
        super(msg);
        this.status = status.value();
    }
}
