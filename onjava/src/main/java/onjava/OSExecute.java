package onjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public class OSExecute {
    public static void command(String command){
        boolean err = false;
        try {
            Process process = new ProcessBuilder(
                    command.split(" ")).start();
            try(
                    BufferedReader result = new BufferedReader(
                            new InputStreamReader(
                                    process.getInputStream()));
                    BufferedReader errors = new BufferedReader(
                            new InputStreamReader(
                                    process.getErrorStream()))
                    ){
                result.lines()
                        .forEach(System.out::println);
                err = errors.lines()
                        .peek(System.err::println)
                        .count()>0;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (err) {
            throw new OSExecuteException("Errors executing "+command);
        }
    }
}
