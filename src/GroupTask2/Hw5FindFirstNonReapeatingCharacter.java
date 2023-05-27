package GroupTask2;
/*
Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.

 */

public class Hw5FindFirstNonReapeatingCharacter {

    public static char firstNonRepeatChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char b = str.charAt(i);
            boolean repeat = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && b == str.charAt(j)) {
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {
                return b;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        char c=firstNonRepeatChar("abracadabra");
        System.out.println(c);
    }
}



