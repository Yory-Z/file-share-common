package com.yoryz.file.share.common.exception;

/**
 * FastDFS 上传下载时可能出现的一些异常信息
 *
 * @author Yory
 * @version 1.0
 * @date 2019/12/25 22:56
 */
public class FastDFSException extends Exception {

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误消息
     */
    private String message;

    public FastDFSException(){}

    public FastDFSException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
