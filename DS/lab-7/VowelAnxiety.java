import java.util.Scanner;

public class VowelAnxiety {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // input string
        char[] chars = s.toCharArray();
        int n = chars.length;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (isVowel(chars[i])) {
                result.insert(0, chars[i]);
                int j = i - 1;
                while (j >= 0 && !isVowel(chars[j])) {
                    result.insert(0, chars[j]);
                    j--;
                    System.out.println("Final string: " + result.toString());
                }
                i = j;
            } else {
                result.append(chars[i]);
            }
        }

        System.out.println("Final string: " + result.toString());
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // convert to lowercase
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
  
}