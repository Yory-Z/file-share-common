package com.yoryz.file.share.common.advanced;

import com.yoryz.file.share.common.constants.Terms;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author Yory
 * @version 1.0
 * @date 2019/12/30 21:02
 */
public class MapFactory {
    private static final int TWO_CAPACITY = 2;
    private static final int THREE_CAPACITY = 3;

    public static Map getMap(){
        return new HashMap(TWO_CAPACITY);
    }

    public static Map<String, Object> getObjectMap2(){
        return getObjectMap(TWO_CAPACITY);
    }

    public static Map<String, Object> getObjectMap(int capacity){
        return new HashMap<>(capacity);
    }

    public static Map<String, Integer> getIntegerMap2(){
        return getIntegerMap(TWO_CAPACITY);
    }

    public static Map<String, Integer> getIntegerMap3(){
        return getIntegerMap(THREE_CAPACITY);
    }

    public static Map<String, Integer> getIntegerMap(int capacity){
        return new HashMap<>(capacity);
    }

    public static Map<String, String> getStringMap2(){
        return getStringMap(TWO_CAPACITY);
    }

    public static Map<String, String> getStringMap(int capacity){
        return new HashMap<>(capacity);
    }

    public static Map<String, Object> getPagingMap3(int page, int limit){
        Map<String, Object> paging = getObjectMap(3);
        fullPaging(paging, page, limit);
        return paging;
    }

    public static void fullPaging(Map map, int page, int limit) {
        map.put(Terms.PAGE, (page - 1) * limit);
        map.put(Terms.LIMIT, limit);
    }

    public static Map<String, Long> getLongMap3() {
        return new HashMap<>(THREE_CAPACITY);
    }

}
