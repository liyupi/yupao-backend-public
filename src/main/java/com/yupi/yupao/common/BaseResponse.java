package com.yupi.yupao.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 *
 * @param <T>
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    private String description;

    public BaseResponse(int code, T data, String message, String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    // [鱼皮的学习圈](https://yupi.icu) 从 0 到 1 求职指导，斩获 offer！1 对 1 简历优化服务、2000+ 求职面试经验分享、200+ 真实简历和建议参考、25w 字前后端精选面试题

    public BaseResponse(int code, T data, String message) {
        this(code, data, message, "");
    }

    public BaseResponse(int code, T data) {
        this(code, data, "", "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage(), errorCode.getDescription());
    }
}
