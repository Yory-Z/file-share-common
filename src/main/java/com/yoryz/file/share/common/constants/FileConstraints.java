package com.yoryz.file.share.common.constants;

/**
 * TODO
 *
 * @author Yory
 * @version 1.0
 * @date 2019/12/26 20:04
 */
public class FileConstraints {

    public static final int FILE_CATALOG_NAME_MIN_LEN = 2;
    public static final int FILE_CATALOG_NAME_MAX_LEN = 32;

    public static final int FILE_DESCRIPTION_MIN_LEN = 10;
    public static final int FILE_DESCRIPTION_MAX_LEN = 200;

    public static final int FILE_COMMENT_CONTENT_MIN_LEN = 5;
    public static final int FILE_COMMENT_CONTENT_MAX_LEN = 500;
    public static final int USER_COMMENT_FILE_TIMES_LIMIT_A_DAY = 20;

    public static final int FILE_NAME_MIN_LEN = 1;
    public static final int FILE_NAME_MAX_LEN = 100;

    public static final int FILE_MIN_SIZE = 1;
    public static final int FILE_MAX_SIZE = 20 * 1024 * 1024;

    public static final int USER_UPLOAD_FILE_LIMIT_A_DAY = 5;
}
