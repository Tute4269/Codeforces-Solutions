//734A
// Done

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        long antonGames = 0;
        long danikGames = 0;

        Scanner sc = new Scanner(System.in);
        int numberOfGames = Integer.parseInt(sc.nextLine());
        String games = sc.nextLine();

        for (int i = 0; i < numberOfGames; i++) {
            if (Character.toString(games.charAt(i)).equals("D")) {
                danikGames++;
            }
            if (Character.toString(games.charAt(i)).equals("A")) {
                antonGames++;
            }
        }

        if (antonGames > danikGames) {
            System.out.println("Anton");
        } else if (danikGames > antonGames) {
            System.out.println("Danik");
        } else if (danikGames == antonGames) {
            System.out.println("Friendship");
        }
    }
}
