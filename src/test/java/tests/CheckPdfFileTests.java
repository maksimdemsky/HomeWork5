package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getPdf;

public class CheckPdfFileTests {
    @Test
    void checkPdfFile() throws IOException {
        String pdfFilePath = "./src/test/resources/files/pdf.pdf";
        String expectedDataPdfFile = "It’s text for pdf file test.";

        PDF pdf = getPdf(pdfFilePath);
        assertThat(pdf, PDF.containsText(expectedDataPdfFile));
    }
}

