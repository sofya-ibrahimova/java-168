package mentor.lesson2.consoleApplication;

import java.io.*;
import java.util.Scanner;

public class FileService {


    public String[] loadUsersFromFile() {
        int count = 0;
        String[] strUsers = new String[10];
        try (FileReader fr = new FileReader("users.csv");
             BufferedReader br = new BufferedReader(fr)) {  //BUFFERED READER
            String line;
            while ((line = br.readLine()) != null) {
                strUsers[count] = line;
                count++;
            }
        } catch (IOException e) {
            System.err.println("ERROR");
        }
        return strUsers;
    }

    public void saveUsersToFile(String[] users) {
        try (FileWriter fw = new FileWriter("users.csv", true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    break;
                }
               else{
                   bw.write(users[i].toString());
                   bw.newLine();
                   bw.flush();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveUsersToFileRe(String[] users) {
        try (FileWriter fw = new FileWriter("users.csv", false);
       BufferedWriter bw = new BufferedWriter(fw)){
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    bw.write("");
                    bw.newLine();
                    bw.flush();
                    break;
                }
                else{
                    bw.write(users[i].toString());
                    bw.newLine();
                    bw.flush();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}



