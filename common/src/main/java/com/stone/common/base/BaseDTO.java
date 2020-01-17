package com.stone.common.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * BaseDTO : 公共DTO
 *
 * @author Stone
 * @date 2020/1/17
 * @version V1.0
 **/
@Getter
@Setter
public class BaseDTO implements Serializable {
    private static final long serialVersionUID = -1103102230478876052L;
    private Boolean isDelete;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Override
    public String toString() {
        return "BaseDTO{" +
                "isDelete=" + isDelete +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
