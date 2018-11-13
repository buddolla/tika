import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class TesseractExample {

    public static void main(String[] args) {
        File imageFile = new File("C:/Apps/telugu.jpg");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping
        instance.setDatapath("C:\\Apps\\tess_data\\"); // path to tessdata directory
        instance.setLanguage("tel");
        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

//https://github.com/tesseract-ocr/tesseract/wiki/Data-Files