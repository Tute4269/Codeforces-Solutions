// 770A
// DONE

// El problema pide generar un password. Solo letras lowercase (no simbolos ni numeros), no pueden haber letras consecutivas,
// y te pide dos inputs, el primero de la cantidad de characteres que quieres en el password, y letras unicas.
// Ejemplo: input: 4 3 - Output: java (4 characters, 3 letras unicas)... Input: 6 2 - Output: phphph (6 characters, 2 unicos y no se repiten consecutivamente

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NewPassword {
    public static void main(String[] args) {
        int characters, uniques;
        String newPassword = "";
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        characters = sc.nextInt();
        uniques = sc.nextInt();

        ArrayList<Integer> uniqueCheckerArray = new ArrayList<>();

        int n;
        while (characters != 0) {
            if (uniqueCheckerArray.size() >= uniques) {
                char lastCharacter = newPassword.charAt(uniqueCheckerArray.size() - 1);
                Integer dummy = uniqueCheckerArray.get(0);
                uniqueCheckerArray.add(dummy);

                n = random.nextInt(uniqueCheckerArray.size());
                int x = uniqueCheckerArray.get(n);
                char value = (char) (x + 97);

                if (lastCharacter == value) {
                    while (lastCharacter == value) {
                        n = random.nextInt(uniqueCheckerArray.size());
                        x = uniqueCheckerArray.get(n);
                        value = (char) (x + 97);
                    }
                }

                newPassword = newPassword + value;
            } else {
                n = random.nextInt(26);
                if (uniqueCheckerArray.contains(n)) {
                    characters++;
                } else {
                    uniqueCheckerArray.add(n);
                    char value = (char) (n + 97);

                    newPassword = newPassword + value;
                }
            }
            characters--;
        }

        System.out.println(newPassword);
    }
}
