//791A
// Done

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        long limak, bob;

        Scanner sc = new Scanner(System.in);
        limak = sc.nextInt();
        bob = sc.nextInt();

        int years = 0;

        while (limak <= bob) {
            years++;

            limak = limak * 3;
            bob = bob * 2;
        }

        System.out.println(years);
    }
}
