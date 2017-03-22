// 50A
// Done

import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        int m, n;

        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        int area = m * n;

        int dominoes = 0;

        while (area != 0) {
            if (area % 2 == 0) {
                dominoes++;
            }
            area--;
        }

        System.out.println(dominoes);
    }
}
