package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * V1.0 created by wujf  on  2021-01-04
 */
public class MessExceptions {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            URI uri = MessExceptions.class.getClassLoader().getResource("/Cleanup.java").toURI();
            File file = new File(uri);

            in = new FileInputStream(file);
            int coutents = in.read();
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
