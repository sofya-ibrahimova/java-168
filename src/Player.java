public class Player {
    String name;
    int score;


    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getScore() {
        return score;
    }

    boolean addScore(int turn) {
        if (turn + score <= 30) {
            score += turn;
            return true;
        }
        return false;
    }

    boolean hasWon() {
        return score == 30;
    }

}
