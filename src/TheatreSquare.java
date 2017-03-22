//1A
// Done

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        long m, n, a, p, q;

        m = c.nextInt();
        n = c.nextInt();
        a = c.nextInt();

        p = m / a;
        if (m % a != 0) {
            p++;
        }

        q = n / a;
        if (n % a != 0) {
            q++;
        }

        System.out.println(p * q);
    }
}
