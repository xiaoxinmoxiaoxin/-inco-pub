package com.inco.pub.entity;

public enum StatusEnum   {
    // 数据操作错误定义
    SUCCESS("200", "操作成功!"),

    NOT_FOUND("404", "未找到该资源!"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误，空指针异常!"),
    SERVER_BUSY("503","服务器正忙，请稍后再试!"),

    OTHER_ERROR("-1","操作失败!")
            ;

    /** 错误码 */
    private String code;

    /** 错误描述 */
    private String msg;

    StatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
