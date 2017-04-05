//776A
// Done

import java.util.ArrayList;
import java.util.Scanner;

public class ASerialKiller {
    public static void main(String[] args) {
        String victimA, victimB, toBeKilled, substitute;
        int days;
        Scanner sc = new Scanner(System.in);

        // get the first victims and number of days
        victimA = sc.next();
        victimB = sc.next();
        days = sc.nextInt();

        // arraylists that will hold the suspects
        ArrayList<String> suspectsA = new ArrayList<>();
        ArrayList<String> suspectsB = new ArrayList<>();

        // add the first and next suspects to the lists
        suspectsA.add(victimA);
        suspectsB.add(victimB);

        while (days != 0) {
            // get the person to be killed and the substitue
            toBeKilled = sc.next();
            substitute = sc.next();


            if (toBeKilled.equals(victimA)) {
                victimA = substitute;
            } else if (toBeKilled.equals(victimB)) {
                victimB = substitute;
            }

            // add the next suspects to the lists
            suspectsA.add(victimA);
            suspectsB.add(victimB);

            days--;
        }

        for (int i = 0; i < suspectsA.size(); i++) {
            System.out.println(suspectsA.get(i) + " " + suspectsB.get(i));
        }
    }
}
