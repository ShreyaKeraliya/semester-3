import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(reverseBeforeVowels(s));
    }

    public static String reverseBeforeVowels(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                result.append(temp.reverse().toString());
                result.append(c);
                temp = new StringBuilder();
            } else {
                temp.append(c);
            }
        }

        result.append(temp.reverse().toString());
        return result.toString();
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}