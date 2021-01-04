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
public class TryWithResources {
    public static void main(String[] args) {
        try {
            URI uri = TryWithResources.class.getResource("/Cleanup.java").toURI();
            try (
                    InputStream in =
                            new FileInputStream(new File(uri))) {
                int contents = in.read();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }


    }
}
