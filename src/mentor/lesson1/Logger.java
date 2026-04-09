package mentor.lesson1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Logger {


    public static void info (String message){
        System.out.println("[" + LocalDateTime.now() + "]" + " [INFO] " + message );
    }
    public static void error (String message){
        System.out.println("[" + LocalDateTime.now() + "]" + " [ERROR] " + message);
    }
    public static void success (){

    }

}
