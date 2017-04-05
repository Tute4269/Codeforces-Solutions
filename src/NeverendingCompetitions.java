// 765A
// DONE
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tute4269 on 4/4/17.
 */
public class NeverendingCompetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int flights = sc.nextInt();
        String home = sc.nextLine();

        ArrayList<String> flightRoutes = new ArrayList<>();

        int counter = flights;
        while (counter >= 0) {
            String route = sc.nextLine();
            flightRoutes.add(route);

            counter--;
        }

        if (flights % 2 == 0) {
            System.out.println("home");
        } else {
            System.out.println("contest");
        }
    }
}
