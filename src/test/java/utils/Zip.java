package utils;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class Zip {
    public static void unZipFileWithPassword(String zipFilePath, String unzipFolderFilePath, String zipPassword) throws ZipException {
        ZipFile zipFile = new ZipFile(zipFilePath);
        if (zipFile.isEncrypted()) {
            zipFile.setPassword(zipPassword);
        }
        zipFile.extractAll(unzipFolderFilePath);


    }
}
