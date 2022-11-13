public class Numeric {
    public static void main(String args[]) {
        // 6th Design Start

        for (int l = 1; l <= 3; l++) {
            for (int m = 1; m <= l; m++) {
                System.out.print(m);
            }
            System.out.println();
        }
        // 6th Design End

        System.out.println("           ");

        // 7th Design Start

        for (int n = 3; n >= 1; n--) {
            for (int o = 1; o <= n; o++) {
                System.out.print(o);
            }
            System.out.println(" ");
        }

        // 7th Design End

        System.out.println("         ");

        // 8th Design Start

        int p = 1;
        for (int q = 1; q <= 3; q++) {
            for (int r = 1; r <= q; r++) {
                System.out.print(p);
                p++;
            }
            System.out.println();
        }

        // 8th Design End

        System.out.println("         ");

        // 9th Design Start

        for (int s = 1; s <= 3; s++) {
            for (int t = 1; t <= s; t++) {
                if ((s + t) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        // 9th Design End
    }
}
