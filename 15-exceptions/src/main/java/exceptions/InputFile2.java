package exceptions;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-04
 */
public class InputFile2 {
    private String fname;

    public InputFile2(String fname){
        this.fname = fname;
    }
    public Stream<String>getLines() throws IOException, URISyntaxException {
        URI uri = this.getClass().getResource(fname).toURI();
        return Files.lines(Paths.get(uri));
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        new InputFile2("/Cleanup.java").getLines()
                .skip(1)
                .limit(1)
                .forEach(System.out::println);
    }
}
