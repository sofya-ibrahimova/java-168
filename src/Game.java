import java.util.Random;
import java.util.Scanner;

public class Game {
    Player player1;
    Player player2;
    Random random;
    Scanner scanner;

    Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        random = new Random();
        scanner = new Scanner(System.in);
    }

    void game() {
        Player current = player1;
        while (true) {
            System.out.println("\n" + current.getName() + " zer atmaq ucun enter");
            scanner.nextLine();  //

            int turn = random.nextInt(7);
            System.out.println(current.getName() + " zer atdi " + turn);

            boolean added = current.addScore(turn);

            if (added) {
                System.out.println("umumi xal " + current.getScore());
            } else {
                System.out.println("xal sayilmadi " + current.getScore() + "+" + turn + "> 30");
            }
            if (current.hasWon()) {
                System.out.println("\n" + "qalib " + current.getName() + " " + current.getScore());
                break;
            } else {
                current = (current == player1) ? player2 : player1;
            }

        }
    }


}

