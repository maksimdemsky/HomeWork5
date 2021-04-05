package tests;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.*;

public class CheckDocDocxFileTests {

    @Test
    void docTest() {
        String txtFilePath = "./src/test/resources/files/doc.doc";
        String expectedData = "It’s text for doc file test.";

        String actualData = readTextFromDocFile(txtFilePath);
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void docxTest() {
        String txtFilePath = "./src/test/resources/files/docx.docx";
        String expectedData = "It’s text for docx file test.";

        String actualData = readTextFromDocxFile(txtFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
