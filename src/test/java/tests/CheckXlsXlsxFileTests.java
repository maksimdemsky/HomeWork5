package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.getXls;

public class CheckXlsXlsxFileTests {
    @Test
    void checkXlsFile() {
        String xlsFilePath = "./src/test/resources/files/xls.xls";
        String expectedDataXlsFile = "It’s text for xls file test.";
        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedDataXlsFile));

    }

    @Test
    void checkXlsCellFile() {
        String xlsFilePath = "./src/test/resources/files/xls.xls";
        String expectedSecondDataXlsFile = "xls";
        XLS xls = getXls(xlsFilePath);
        String actualData = xls.excel.getSheetAt(0).getRow(1).getCell(0).toString();
        assertThat(actualData, containsString(expectedSecondDataXlsFile));

    }

    @Test
    void checkXlsxFile() {
        String xlsFilePath = "./src/test/resources/files/xlsx.xlsx";
        String expectedDataXlsFile = "It’s text for xlsx file test.";
        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedDataXlsFile));

    }

    @Test
    void checkXlsxCellFile() {
        String xlsFilePath = "./src/test/resources/files/xlsx.xlsx";
        String expectedSecondDataXlsFile = "xlsx";
        XLS xls = getXls(xlsFilePath);
        String actualData = xls.excel.getSheetAt(0).getRow(1).getCell(0).toString();
        assertThat(actualData, containsString(expectedSecondDataXlsFile));

    }
}
