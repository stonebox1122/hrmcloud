package com.stone.common.exception;

import org.springframework.util.StringUtils;

/**
 * EntityExistException: 实体不存在异常
 *
 * @author Stone
 * @version V1.0
 * @date 2020/1/17
 **/
public class EntityExistException extends RuntimeException {

    public EntityExistException(Class clazz, String field, String val) {
        super(EntityExistException.generateMessage(clazz.getSimpleName(), field, val));
    }

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " "+ val + " existed";
    }
}
