// 59A
// Pending

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        int upperCount = 0;
        int lowerCount = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int x = 0; x < upper.length(); x++) {
                if (word.charAt(i) == upper.charAt(x)) {
                    upperCount++;
                } else if (word.charAt(i) == lower.charAt(x)) {
                    lowerCount++;
                }
            }
        }

        if (upperCount > lowerCount) {
            System.out.println(word.toUpperCase());
        } else if (upperCount <= lowerCount) {
            System.out.println(word.toLowerCase());
        }
    }
}
