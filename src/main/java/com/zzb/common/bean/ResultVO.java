package com.zzb.common.bean;

/**
 * HTTP返回结果封装
 * @return
 * @author zengzhibin
 * @date 2020-5-29 16:34
 */
public class  ResultVO<T> {

	private Integer code;

    private String message;

    private T data;

    public T getData() {
        return data;
    }

    public ResultVO() {

    }

    public ResultVO(Integer code,String message) {
        this.code = code;
        this.message = message;
    }

    public ResultVO(Integer code,String message,T data) {
        this.code = code;
        this.message = message;
        this.data=data;
    }

    public ResultVO(ResultCodeEnum resultCodeEnum, T data) {
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
        this.data=data;
    }

    public void setData(T code) {
        this.data = code;
    }

    public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private void setResultCode(ResultCodeEnum code) {
        this.code = code.getCode();
        this.message = code.getMessage();
    }

	public static ResultVO success() {
        ResultVO<String> result = new ResultVO();
        result.setResultCode(ResultCodeEnum.SUCCESS);
        return result;
    }


    public static ResultVO error() {
        ResultVO result = new ResultVO();
        result.setResultCode(ResultCodeEnum.ERROR);
        return result;
    }

    public static ResultVO failure(ResultCodeEnum resultCode) {
        ResultVO result = new ResultVO();
        result.setResultCode(resultCode);
        return result;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
