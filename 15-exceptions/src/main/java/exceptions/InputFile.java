package exceptions;

import java.io.*;
import java.net.URL;

/**
 * V1.0 created by wujf  on  2021-01-04
 */
public class InputFile {
    private BufferedReader in ;

    public InputFile(String fname)throws Exception{
        try {
            URL url = InputFile.class.getResource(fname);
            in = new BufferedReader(new FileReader(new File(url.toURI())));
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            throw  e;
        }catch (Exception e){
            try {
                in.close();
            } catch (IOException e1) {
                System.out.println("in.close() unsuccessful");
                throw e;
            }
        }finally {
            System.out.println("finally");
        }
    }
    public String getLine(){
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }
    public void dispose(){
        try {
            in.close();

            System.out.println("dispose() successful");
        } catch (IOException e) {
            throw new RuntimeException("in.close() failed");
        }
    }
}
