package com.oxygen.pay.weixin.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.oxygen.pay.weixin.util.JsonMapper;

/**
 * Created by yangxy on 2017/10/16.
 */
public class WxError {
    @JsonProperty("errcode")
    private int errorCode;

    @JsonProperty("errmsg")
    private String errorMsg;
    private String json;

    public static WxError fromJson(String json) {
        WxError wxError = JsonMapper.defaultMapper().fromJson(json, WxError.class);
        wxError.setJson(json);
        return wxError;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
