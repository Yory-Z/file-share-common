package com.yoryz.file.share.common.advanced;

import com.yoryz.file.share.common.constants.FileConstraints;
import com.yoryz.file.share.common.constants.FileTerms;
import com.yoryz.file.share.common.exception.CreateDirectoryFailedException;
import net.coobird.thumbnailator.Thumbnails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * TODO
 *
 * @author Yory
 * @version 1.0
 * @date 2019/12/25 22:43
 */
public class ImageUtils {
    private static final Logger logger = LogManager.getLogger(ImageUtils.class);

    /**
     * compress MultipartFile image
     *
     * @param image the image want to compress
     * @return compressed MultipartFile image
     * @throws CreateDirectoryFailedException create the directory(s) failed when save the temporary image
     *                                         which used to compress the image
     */
    public static MultipartFile compress(MultipartFile image) throws CreateDirectoryFailedException {
        String originalName = image.getOriginalFilename();
        String suffix = originalName.subSequence(originalName.lastIndexOf("."), originalName.length()).toString();
        String tempFileName = FileTerms.FILE_ROOT_PATH + RandomString.generateRandomString(10) +
                System.currentTimeMillis() + suffix;
        File fileDest = new File(tempFileName);

        if (!fileDest.getParentFile().exists()) {
            if (!fileDest.getParentFile().mkdirs()) {
                throw new CreateDirectoryFailedException("Can not create file: " + fileDest.getParentFile());
            }
        }

        try {
            Thumbnails.of(image.getInputStream()).scale(1f).outputQuality(0.6f).toFile(fileDest);
            MultipartFile multipartFile = new MockMultipartFile(image.getName(), image.getOriginalFilename(), image.getContentType(), new FileInputStream(fileDest));

            if (!fileDest.delete()) {
                logger.error("delete temporary image [{}] failed.", fileDest);
            }

            return multipartFile;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * check if the file is a image
     *
     * @param descImage the file need to check
     * @return return true if the file is an image
     */
    public static boolean checkMultipartFileImage(MultipartFile descImage) {
        return descImage.getContentType().contains("image");
    }

    /**
     * limit the multipart file's size
     *
     * @param file the file need to check
     * @return true if the file's size isn't at the limitation range
     */
    public static boolean checkMultipartFileSize(MultipartFile file) {
        return file == null || file.isEmpty() ||
                file.getSize() < FileConstraints.FILE_MIN_SIZE ||
                file.getSize() > FileConstraints.FILE_MAX_SIZE;
    }
}
