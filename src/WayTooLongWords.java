//71A
// Done

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        int cases;
        String word;

        Scanner sc = new Scanner(System.in);
        cases = sc.nextInt();

        while (cases > -1) {
            word = sc.nextLine();
            if (word.length() > 10) {
                word = Character.toString(word.charAt(0)) + (word.length() - 2) + Character.toString(word.charAt(word.length() - 1));
            }

            System.out.println(word);
            cases --;
        }
    }
}
