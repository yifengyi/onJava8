package exceptions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-04
 */
public class StreamsAreAutoCloseable {
    public static void main(String[] args) {
        try {
            URI uri = StreamsAreAutoCloseable.class.getResource("/Cleanup.java").toURI();
            String path =uri.toString();
            path = path.substring(6,path.lastIndexOf("/")+1)+"Out.txt";
            System.out.println(path);
            File out = new File(path);
            try (Stream<String> in =
                         Files.lines(Paths.get(uri));

                 PrintWriter outWrite=new PrintWriter(out)
            ){
                in.skip(1)
                        .limit(1)
                        .map(String::toUpperCase)
                        .forEach(outWrite::println);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
