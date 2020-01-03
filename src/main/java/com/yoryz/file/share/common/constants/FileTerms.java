package com.yoryz.file.share.common.constants;

import java.io.File;

/**
 * TODO
 *
 * @author Yory
 * @version 1.0
 * @date 2019/12/25 22:48
 */
public class FileTerms {
    public static final String FILE_ID = "fileId";
    public static final String FILE_FORBIDDEN = "fileForbidden";
    public static final String FILE_CATALOG = "fileCatalog";
    public static final String FILE_CATALOG_ID = "fileCatalogId";
    public static final String FILE_CATALOG_NAME = "fileCatalogName";

    public static final String FILE_NAME = "fileName";
    public static final String FILE_DESCRIPTION = "fileDescription";
    public static final String FILE_DESC_IMAGE = "fileDescImage";
    public static final String FILE_DATABASE_SUM = "fileDatabaseSum";

    public static final String FILE_COMMENT_ID = "fileCommentId";
    public static final String FILE_COMMENT_CONTENT = "fileCommentContent";

    public static final String FILE_LIKE_ID = "fileLikeId";

    public static final String FILE_ROOT_PATH = System.getProperty("user.dir") + "WEB-INF" + File.separator + "files" + File.separator;

    public static final String FILE_COLLECTION_ID = "fileCollectionId";
}
