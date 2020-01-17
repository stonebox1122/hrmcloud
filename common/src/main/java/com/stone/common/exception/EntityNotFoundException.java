package com.stone.common.exception;

import org.springframework.util.StringUtils;

/**
 * EntityNotFoundException: 实体找不到异常
 *
 * @author Stone
 * @version V1.0
 * @date 2020/1/17
 **/
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Class clazz, String field, String val) {
        super(EntityNotFoundException.generateMessage(clazz.getSimpleName(), field, val));
    }

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " "+ val + " does not exist";
    }
}
