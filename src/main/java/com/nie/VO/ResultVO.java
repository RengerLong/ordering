package com.nie.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * Created by prue on 2018/9/10.
 */
@Data
public class ResultVO <T>{
    /**错误码 */
    private Integer code;
    /**提示信息*/
    private String msg;
    /**返回对象*/
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
