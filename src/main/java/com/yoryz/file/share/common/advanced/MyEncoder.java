package com.yoryz.file.share.common.advanced;

import sun.misc.BASE64Encoder;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * TODO
 *
 * @author Yory
 * @version 1.0
 * @date 2019/12/24 16:43
 */
public class MyEncoder {

    /**
     * encode the str by md5
     *
     * @param str the string need to encode
     * @return encoded string
     * @throws NoSuchAlgorithmException doesn't have this encoding method
     */
    public static String encodeByMd5(String str) throws NoSuchAlgorithmException {
        return new BASE64Encoder().encode(MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8)));
    }
}
