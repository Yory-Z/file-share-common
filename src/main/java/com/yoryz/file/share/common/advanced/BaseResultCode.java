package com.yoryz.file.share.common.advanced;

/**
 * TODO
 *
 * @author Yory
 * @version 1.0
 * @date 2019/12/24 16:58
 */
public enum BaseResultCode {
    /**
     * as the name implies
     * success code
     */
    SUCCESS(2000), SUCCESS_NO_DATE(2001),

    /**
     * client error code
     */
    ERROR(4000), ERROR_EXIST(4001), ERROR_NOT_EXIST(4002), ERROR_FILE_OUT_OF_SIZE(4003),
    ERROR_DATE_FORMAT(4004),

    /**
     * server error code
     */
    ERROR_EXCEPTION(5000), ERROR_NO_LOGIN(5001), ERROR_ILLEGAL(5002), ERROR_SERVICE_BREAK(5003);

    private int code;

    BaseResultCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
