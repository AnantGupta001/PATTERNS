public class Stars {
    public static void main(String[] args) {
        // 1st Design Start

        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 1st Design End

        System.out.println("          ");

        // 2nd Design Start

        for (int c = 1; c <= 3; c++) {
            for (int d = 1; d <= 3; d++) {
                if (c == 1 || d == 1 || c == 3 || d == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 2nd Design End

        System.out.println("          ");

        // 3rd Design Start

        for (int e = 1; e <= 3; e++) {
            for (int f = 1; f <= e; f++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // 3rd Design End

        System.out.println("          ");

        // 4th Design Start

        for (int g = 3; g >= 1; g--) {
            for (int h = 1; h <= g; h++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // 4th Design End

        System.out.println("          ");

        // 5th Design Start

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // 5th Design End

        System.out.println("          ");

    }
}