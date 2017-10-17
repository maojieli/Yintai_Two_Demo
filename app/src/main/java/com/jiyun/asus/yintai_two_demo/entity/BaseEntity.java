package com.jiyun.asus.yintai_two_demo.entity;

/**
 * Created by asus on 2017/10/17.
 */

public class BaseEntity<T> {
    /**
     * reason : 成功的返回
     * result : {}
     * error_code : 0
     */

    private String reason;
    private T result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }
}
