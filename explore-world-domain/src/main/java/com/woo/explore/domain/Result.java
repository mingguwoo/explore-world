package com.woo.explore.domain;

/**
 * @author wujunyu
 * @version 2017��8��7��
 */
public class Result {
    /**
     * �Ƿ�ɹ�
     */
    private boolean success;
    /**
     * service���صĶ���
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
