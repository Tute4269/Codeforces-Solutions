// 777A
// Done


import java.util.Scanner;

public class ShellGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moves = Integer.parseInt(sc.nextLine());
        short position = sc.nextShort();

        if (moves == 0) {
            System.out.println(position);
        } else if (moves > 6) {

            int k = moves % 6;

            if (k == 0) {
                System.out.println(position);
            } else {
                if (position == 0) {
                    if (k == 1) {
                        System.out.println("1");
                    } else if (k == 2) {
                        System.out.println("1");
                    } else if (k == 3) {
                        System.out.println("2");
                    } else if (k == 4) {
                        System.out.println("2");
                    } else if (k == 5) {
                        System.out.println("0");
                    } else if (k == 6) {
                        System.out.println("0");
                    }
                } else if (position == 1) {
                    if (k == 1) {
                        System.out.println("0");
                    } else if (k == 2) {
                        System.out.println("2");
                    } else if (k == 3) {
                        System.out.println("1");
                    } else if (k == 4) {
                        System.out.println("0");
                    } else if (k == 5) {
                        System.out.println("2");
                    } else if (k == 6) {
                        System.out.println("1");
                    }
                } else if (position == 2) {
                    if (k == 1) {
                        System.out.println("2");
                    } else if (k == 2) {
                        System.out.println("0");
                    } else if (k == 3) {
                        System.out.println("0");
                    } else if (k == 4) {
                        System.out.println("1");
                    } else if (k == 5) {
                        System.out.println("1");
                    } else if (k == 6) {
                        System.out.println("2");
                    }
                }
            }
        } else {
            if (position == 0) {
                if (moves == 1) {
                    System.out.println("1");
                } else if (moves == 2) {
                    System.out.println("1");
                } else if (moves == 3) {
                    System.out.println("2");
                } else if (moves == 4) {
                    System.out.println("2");
                } else if (moves == 5) {
                    System.out.println("0");
                } else if (moves == 6) {
                    System.out.println("0");
                }
            } else if (position == 1) {
                if (moves == 1) {
                    System.out.println("0");
                } else if (moves == 2) {
                    System.out.println("2");
                } else if (moves == 3) {
                    System.out.println("1");
                } else if (moves == 4) {
                    System.out.println("0");
                } else if (moves == 5) {
                    System.out.println("2");
                } else if (moves == 6) {
                    System.out.println("1");
                }
            } else if (position == 2) {
                if (moves == 1) {
                    System.out.println("2");
                } else if (moves == 2) {
                    System.out.println("0");
                } else if (moves == 3) {
                    System.out.println("0");
                } else if (moves == 4) {
                    System.out.println("1");
                } else if (moves == 5) {
                    System.out.println("1");
                } else if (moves == 6) {
                    System.out.println("2");
                }
            }
        }

    }
}
