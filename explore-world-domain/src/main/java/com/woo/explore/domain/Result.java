package com.woo.explore.domain;

/**
 * @author wujunyu
 * @version 2017年8月7日
 */
public class Result {
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * service返回的对象
     */
    private Object data;
    private int code;
    private String errorMsg;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
