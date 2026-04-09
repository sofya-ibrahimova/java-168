public class MentorLesson8 {
    public static void main(String[] args) {
        System.out.println(MentorLesson8.getXO1("xxo"));
    }

    public static String getMiddle(String word) {
        if (word.length() % 2 == 0) {
            return "" + word.charAt(word.length() / 2 - 1) + word.charAt(word.length() / 2);
        }
        return "" + word.charAt(word.length() / 2);
    }

    public static boolean getXO(String str) {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < str.length(); i++) {
            String letter = String.valueOf(str.charAt(i));
            if (letter.equalsIgnoreCase("x")) {
                countX++;
            } else if (letter.equalsIgnoreCase("O")) {
                countO++;
            }
        }
        return countO == countX;
    }
    public static boolean getXO1(String str) {
        str = str.toLowerCase();
        return str.replace("o" , "").length() == str.replace("x", "").length();
    }
}
