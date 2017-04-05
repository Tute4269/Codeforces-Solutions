//785A
// Done

import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        int figures;
        int faces = 0;
        String currentFigure;
        Scanner sc = new Scanner(System.in);

        figures = sc.nextInt();

        while (figures != 0) {
            currentFigure = sc.next();

            switch(currentFigure) {
                case "Tetrahedron" :
                    faces = faces + 4;
                    break;
                case "Cube" :
                    faces = faces + 6;
                    break;
                case "Octahedron" :
                    faces = faces + 8;
                    break;
                case "Dodecahedron" :
                    faces = faces + 12;
                    break;
                case "Icosahedron" :
                    faces = faces + 20;
                    break;
            }

            figures--;
        }

        System.out.println(faces);
    }
}
