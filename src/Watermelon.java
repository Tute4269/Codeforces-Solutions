//4A
// Done

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        int watermelon;
        String answer = "NO";

        Scanner sc = new Scanner(System.in);
        watermelon = sc.nextInt();

        if (watermelon != 2) {
            if (watermelon % 2 == 0) {
                answer = "YES";
            }
        }


        System.out.println(answer);
    }
}
