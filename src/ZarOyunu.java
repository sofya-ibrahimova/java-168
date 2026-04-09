import java.util.Random;

public class ZarOyunu {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
//        String firstPlayer = "player1";
//        int points1 = 0;
//        String secondPlayer = "player2";
//        int points2 = 0;
//
//        while (points1 !=30 && points2 !=30){    //!!!
//            int turn1 = rand.nextInt(7);
//            System.out.println("ход: " + firstPlayer + " " + turn1);
//            if (points1 + turn1 <=30) {
//                points1 += turn1;
//            }
//            int turn2 = rand.nextInt(7);
//            System.out.println("ход: " + secondPlayer + " " + turn2);
//            if (points2 + turn2 <= 30){
//                points2 +=turn2;
//            }
//            System.out.println("----результат----");
//            System.out.println(firstPlayer + ": " + points1 + "   " + secondPlayer + " :" + points2);
//            System.out.println();
//            Thread.sleep(3000);
//        }
//        if (points1 == 30){
//            System.out.println("winner is " + firstPlayer);
//        }else System.out.println("winner is " + secondPlayer);


Game zarOyunu = new Game(new Player("seva"), new Player("sofa"));
zarOyunu.game();




    }
}

