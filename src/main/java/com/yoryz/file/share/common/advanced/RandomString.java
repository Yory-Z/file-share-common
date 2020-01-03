package com.yoryz.file.share.common.advanced;

import java.util.Random;

/**
 * TODO
 *
 * @author Yory
 * @version 1.0
 * @date 2019/12/24 16:43
 */
public class RandomString {
    private static final Random RANDOM = new Random();

    private static final String SOURCE = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    private static final int PASSWORD_SALT_LEN = 10;


    /**
     * Generate the specified length random string
     *
     * @param length the length of random string want to generate
     * @return random string of specified length
     */
    public static String generateRandomString(int length){
        char[] text = new char[length];
        for(int i = 0; i < length; i++){
            text[i] = SOURCE.charAt(RANDOM.nextInt(SOURCE.length()));
        }
        return new String(text);
    }

    /**
     * Generate random string for the security of the user's password
     *
     * @return random string
     */
    public static String generatePasswordSalt() {
        return generateRandomString(PASSWORD_SALT_LEN);
    }

}
