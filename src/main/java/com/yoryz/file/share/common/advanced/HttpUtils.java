package com.yoryz.file.share.common.advanced;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * TODO
 *
 * @author Yory
 * @version 1.0
 * @date 2019/12/25 13:54
 */
public class HttpUtils {
    /**
     * save Json data in HttpServletBaseResult
     *
     * @param httpServletBaseResult the response data need to save into
     * @param code response code of self defined
     * @param message the response message of self defined
     */
    public static void returnJson(HttpServletResponse httpServletBaseResult, int code, String message) {
        BaseResult response = new BaseResult();
        response.setCode(code);
        response.setMessage(message);
        Object jsonObject = JSONObject.toJSON(response);
        httpServletBaseResult.setCharacterEncoding("UTF-8");
        httpServletBaseResult.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            out = httpServletBaseResult.getWriter();
            out.append(jsonObject.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    /**
     * return the errorDataFormat type response
     *
     * @param httpServletBaseResult the response data need to save into
     * @param invalidKey the invalid key name
     */
    public static void returnErrorDataFormatJson(HttpServletResponse httpServletBaseResult, String invalidKey) {
        returnJson(httpServletBaseResult, BaseResultCode.ERROR_DATE_FORMAT.getCode(), "Invalid data. (" + invalidKey + ")");
    }

    /**
     * return the error type response
     *
     * @param httpServletBaseResult the response data need to save into
     * @param message the self defined message
     */
    public static void returnErrorJson(HttpServletResponse httpServletBaseResult, String message) {
        returnJson(httpServletBaseResult, BaseResultCode.ERROR.getCode(), message);
    }
}
