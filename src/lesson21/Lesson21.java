package lesson21;

import java.io.FileWriter;
import java.io.IOException;

public class Lesson21 {
    public static void main(String[] args) {

       try(FileWriter fw = new FileWriter("file.txt", true)){
       }
       catch (IOException e){
           e.printStackTrace();
       }

    }
}
