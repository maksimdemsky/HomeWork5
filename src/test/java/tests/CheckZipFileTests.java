package tests;

import com.codeborne.xlstest.XLS;
import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getXls;
import static utils.Zip.unZipFileWithPassword;

public class CheckZipFileTests {
    @Test
    void checkZipFileWithPassword() throws ZipException {
        String zipFilePath = "./src/test/resources/files/pug.zip";
        String unZipFile = "./src/test/resources/files/unzip";
        String unzipFolderFilePath = "./src/test/resources/files/unzip/xls.xls";
        String expectedDataZipFile = "It’s text for xls file test.";
        String zipPassword = "qwe123";

        unZipFileWithPassword(zipFilePath, unZipFile, zipPassword);
        XLS xls = getXls(unzipFolderFilePath);
        assertThat(xls, XLS.containsText(expectedDataZipFile));
    }
}
