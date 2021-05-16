package com.inco.pub.entity;


public class ResultT {
    /**
     * 响应代码
     */
    private String code;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 响应结果
     */
    private Object data;

    public ResultT() {
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    /**
     * 成功
     * @param data
     * @return
     */
    public static ResultT success(Object data) {
        ResultT rt = new ResultT();
        rt.setCode(StatusEnum.SUCCESS.getCode());
        rt.setMsg(StatusEnum.SUCCESS.getMsg());
        rt.setData(data);
        return rt;
    }


    /**
     * 失败
     */
    public static ResultT error(StatusEnum e,Object data) {
        ResultT rt = new ResultT();
        rt.setCode(e.getCode());
        rt.setMsg(e.getMsg());
        rt.setData(null);
        return rt;
    }



}