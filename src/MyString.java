public class MyString {


     String reverseString(String string) {
        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            reverse.append(string.charAt(string.length()-1-i));
        } return reverse.toString();

    }
}
