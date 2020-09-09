package com.zzb.config.exception;


import com.zzb.common.bean.ResultCodeEnum;

/**
 * 统一异常，自定义返回
 * @author zengzhibin
 * @date 2020-5-29 16:19
 */
public class BaseBusinessException extends RuntimeException {

    private Integer code;

    public BaseBusinessException(ResultCodeEnum resultCodeEnum) {
        this(resultCodeEnum.getCode(),resultCodeEnum.getMessage());
    }

    private BaseBusinessException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
