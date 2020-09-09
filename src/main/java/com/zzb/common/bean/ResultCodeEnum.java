package com.zzb.common.bean;

/**
 * 定义HTTP状态码
 * @author zengzhibin
 * @date 2020-5-29 16:05
 */
public enum ResultCodeEnum {
    /* 成功状态码 */
    SUCCESS(0, "成功"),
    ERROR(1,"失败"),

    /* 参数错误：10001-19999 */
    PARAM_IS_ERROR(10001, "参数验证失败"),

    API_WECHAT_ERROR(20001, "微信接口请求失败"),
    API_ALI_ERROR(20002, "支付宝接口请求失败"),
    API_ALI_URL_ERROR(20002, "支付宝账单地址下载文件失败"),
    API_ALI_FLIE_ERROR(20002, "支付宝账单文件解析失败"),
    /* 权限错误：70001-79999 */
    PERMISSION_NO_ACCESS(70001, "无访问权限");

    private Integer code;

    private String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static String getMessage(String name) {
        for (ResultCodeEnum item : ResultCodeEnum.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }
    public static Integer getCode(String name) {
        for (ResultCodeEnum item : ResultCodeEnum.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }
    public final Integer getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

}

