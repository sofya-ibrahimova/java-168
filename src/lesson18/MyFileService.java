package lesson18;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileService {

    public void fileWrite(String fileName, String content, boolean append) throws MyCompileException {
        if (fileName == null) {
            throw new MyCompileException("file name cannot be null!");
        }
        try (FileWriter fw = new FileWriter(fileName, append)) {
            fw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileRead (String fileName){

    }



}
