package com.zzb.config.exception;

import com.zzb.common.bean.ResultCodeEnum;
import com.zzb.common.bean.ResultVO;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 配置异常统一处理
 * @author zengzhibin
 * @date 2020-5-29 16:33
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseBusinessException.class)
    public ResultVO APIExceptionHandler(BaseBusinessException e) {
        return new ResultVO(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(BindException.class)
    public ResultVO<String> BindException(BindException e) {
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return new ResultVO<String>(ResultCodeEnum.PARAM_IS_ERROR,objectError.getDefaultMessage());
    }

}
