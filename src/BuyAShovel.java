// 732A
// Done

import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        int shovelPrice, spareBurle, shovelTotalPrice;
        int shovelsBought = 0;
        Scanner sc = new Scanner(System.in);

        shovelPrice = sc.nextInt();
        spareBurle = sc.nextInt();

        shovelTotalPrice = shovelPrice;
        while (true) {
            shovelsBought++;

            if (spareBurle == shovelTotalPrice % 10 || shovelTotalPrice % 10 == 0) {
                break;
            } else {
                shovelTotalPrice = shovelTotalPrice + shovelPrice;
            }
        }

        System.out.println(shovelsBought);
    }
}
