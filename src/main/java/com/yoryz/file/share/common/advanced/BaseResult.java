package com.yoryz.file.share.common.advanced;

import java.io.Serializable;

/**
 * TODO
 *
 * @author Yory
 * @version 1.0
 * @date 2019/12/24 16:57
 */
public class BaseResult implements Serializable {

    private static final long serialVersionUID = -3974922526934424210L;

    private Integer code;

    private String message;

    private Object data;

    private Integer insertId;

    public BaseResult(){}

    public BaseResult(Integer code, String message) {
        this(code, message, null, null);
    }

    public BaseResult(Integer code, String message, Integer insertId) {
        this(code, message, insertId, null);
    }

    public BaseResult(Integer code, String message, Object date) {
        this(code, message, null, date);
    }

    public BaseResult(Integer code, String message, Integer insertId, Object date) {
        this.code = code;
        this.message = message;
        this.insertId = insertId;
        this.data = date;
    }

    public static BaseResult success(String message){
        return new BaseResult(BaseResultCode.SUCCESS.getCode(), message);
    }

    public static BaseResult successNoData(String message){
        return new BaseResult(BaseResultCode.SUCCESS_NO_DATE.getCode(), message);
    }

    public static BaseResult successData(String message, Object data){
        return new BaseResult(BaseResultCode.SUCCESS.getCode(), message, data);
    }

    public static BaseResult successInsertId(String message, Integer insertId) {
        return new BaseResult(BaseResultCode.SUCCESS.getCode(), message, insertId);
    }

    public static BaseResult error(String message){
        return new BaseResult(BaseResultCode.ERROR.getCode(), message);
    }

    public static BaseResult errorDataFormat(String invalidKey){
        return new BaseResult(BaseResultCode.ERROR_DATE_FORMAT.getCode(), "Invalid data. (" + invalidKey + ")");
    }

    public static BaseResult errorExist(String key, String value){
        return new BaseResult(BaseResultCode.ERROR_EXIST.getCode(), "This " + key + "(" + value + ")"  + " is already exist.");
    }

    public static BaseResult errorNotExist(String invalidKey){
        return new BaseResult(BaseResultCode.ERROR_NOT_EXIST.getCode(), "This " + invalidKey + " doesn't exist.");
    }

    public static BaseResult errorIllegal(String message){
        return new BaseResult(BaseResultCode.ERROR_ILLEGAL.getCode(), message);
    }

    public static BaseResult errorFileOutOfSize(String keyName){
        return new BaseResult(BaseResultCode.ERROR_FILE_OUT_OF_SIZE.getCode(), "The " + keyName + " is out of size.");
    }

    public static BaseResult errorException(String message){
        return new BaseResult(BaseResultCode.ERROR.getCode(), message);
    }


    public static BaseResult errorServiceBreak(String message){
        return new BaseResult(BaseResultCode.ERROR_SERVICE_BREAK.getCode(), message);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getInsertId() {
        return insertId;
    }

    public void setInsertId(Integer insertId) {
        this.insertId = insertId;
    }
}
