package utils;

import com.codeborne.pdftest.PDF;
import com.codeborne.xlstest.XLS;

import java.io.IOException;
import static org.apache.commons.io.FileUtils.getFile;

public class Files {


    public static PDF getPdf(String path) throws IOException {
        return new PDF(getFile(path));
    }

    public static XLS getXls(String path) {
        return new XLS(getFile(path));
    }
}
