package com.stone.common.entity;

import java.util.HashMap;

/**
 * StoneResponse: 封装返回结果
 *
 * @author Stone
 * @version V1.0
 * @date 2020/1/17
 **/
public class StoneResponse extends HashMap<String, Object> {

    private static final long serialVersionUID = 7468093461622489086L;

    public StoneResponse message(String message) {
        this.put("message", message);
        return this;
    }

    public StoneResponse data(Object data) {
        this.put("data", data);
        return this;
    }

    @Override
    public StoneResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public String getMessage() {
        return String.valueOf(get("message"));
    }

    public Object getData() {
        return get("data");
    }
}
