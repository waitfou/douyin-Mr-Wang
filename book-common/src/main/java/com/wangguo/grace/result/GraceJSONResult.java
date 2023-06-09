package com.wangguo.grace.result;

import java.util.Map;

public class GraceJSONResult {
    private Integer status;

    private String msg;

    private Boolean success;

    private Object data; //data的类型可以是任何数据类型，因为Object类是所有类的父类

    /**
     * 成功返回，带有数据的，直接往ok方法丢data数据即可
     */
    // 类函数/静态函数
    public static GraceJSONResult ok(Object data) {
        return new GraceJSONResult(data);
    }
    public static GraceJSONResult ok() {
        return new GraceJSONResult(ResponseStatusEnum.SUCCESS);
    }
    public GraceJSONResult(Object data){
        this.status = ResponseStatusEnum.SUCCESS.status();
        this.msg = ResponseStatusEnum.SUCCESS.msg();
        this.success = ResponseStatusEnum.SUCCESS.success();
        this.data = data;
    }

    /**
     * 错误返回，直接调用error方法即可。当然也可以在ResponseStatusEnum中自定义错误后再返回也都可以
     * @return
     */
    public static GraceJSONResult error() {
        return new GraceJSONResult(ResponseStatusEnum.FAILED);
    }

    /**
     * 错误返回，map中包含多条错误信息，可以用于表单验证，把错误统一的全部返回出去
     * @param map
     * @return
     */
    public static GraceJSONResult errorMap(Map map) {
        return new GraceJSONResult(ResponseStatusEnum.FAILED, map);
    }

    /**
     * 错误返回，直接返回错误信息
     * @param msg
     * @return
     */
    public static GraceJSONResult errorMsg(String msg) {
        return new GraceJSONResult(ResponseStatusEnum.FAILED, msg);
    }

    /**
     * 将枚举类型的错误状态信息封装成GraceJSONResult信息，便于使用
     * @param responseStatus
     * @return
     */
    public static GraceJSONResult errorCustom(ResponseStatusEnum responseStatus) {
        return new GraceJSONResult(responseStatus);
    }
    public static GraceJSONResult exception(ResponseStatusEnum responseStatus) {
        return new GraceJSONResult(responseStatus);
    }
    public GraceJSONResult(ResponseStatusEnum responseStatus) {
        this.status = responseStatus.status();
        this.msg = responseStatus.msg();
        this.success = responseStatus.success();
    }
    public GraceJSONResult(ResponseStatusEnum responseStatus, Object data) {
        this.status = responseStatus.status();
        this.msg = responseStatus.msg();
        this.success = responseStatus.success();
        this.data = data;
    }
    public GraceJSONResult(ResponseStatusEnum responseStatus, String msg){
        this.status = responseStatus.status();
        this.msg = msg;
        this.success = responseStatus.success();
    }
    public GraceJSONResult() {

    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
