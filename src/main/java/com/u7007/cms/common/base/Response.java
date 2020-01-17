package com.u7007.cms.common.base;

import com.u7007.cms.common.constants.ApiConstants;

import lombok.Getter;
import lombok.Setter;

/**
 * @desc 响应实体
 * @author yxs
 * @date 2019/3/21 14:56
 */
@Getter
@Setter
public class Response<T> {
    /**
     *  响应编码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String message;
    /**
     * 具体数据
     */
    private T data;

    public static <T> Response<T> success(String message) {
        return new Response(ApiConstants.HTTP_CODE_200,message);
    }

    public static <T> Response<T> success(String message,T data) {
        return new Response(ApiConstants.HTTP_CODE_200,message,data);
    }

    public static <T> Response<T> error(String message) {
        return new Response<T>(ApiConstants.HTTP_CODE_500, message);
    }

    private Response(Integer code , String message) {
        this.code=code;
        this.message=message;
    }

    private Response(Integer code , String message,T data) {
        this.code=code;
        this.message=message;
        this.data=data;
    }

    private Response() {}
}
