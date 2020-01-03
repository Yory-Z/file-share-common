package com.yoryz.file.share.common.advanced;

import com.yoryz.file.share.common.constants.FileConstraints;
import com.yoryz.file.share.common.constants.Msg;
import com.yoryz.file.share.common.constants.Terms;
import org.springframework.web.multipart.MultipartFile;

/**
 * TODO
 *
 * @author Yory
 * @version 1.0
 * @date 2019/12/26 20:04
 */
public class BaseController {

    protected static String checkPaging(int page, int limit) {
        if (page < 0) {
            return Terms.PAGE;
        }

        if (limit < 0) {
            return Terms.LIMIT;
        }
        return Msg.CHECK_SUCCESS;
    }

    protected static boolean checkFileName(String fileName) {
        return fileName == null ||
                fileName.length() < FileConstraints.FILE_NAME_MIN_LEN ||
                fileName.length() > FileConstraints.FILE_NAME_MAX_LEN;
    }
}
