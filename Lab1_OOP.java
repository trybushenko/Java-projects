import java.util.Scanner;

public class Lab1_OOP {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("enter a low limit of the first zeta: ");
        short a = sk.nextShort();
        System.out.println("enter a high limit of the first zeta");
        short n = sk.nextShort();
        System.out.println("enter a low limit of the second zeta");
        short b = sk.nextShort();
        System.out.println("enter a high limit of the second zeta");
        short m = sk.nextShort();
        double res = 0;
        final short C = 2;
        if (a < -2 && n > -2) {
            System.out.println("Error: division by zero");
            System.exit(1);
        }
        for (short i = a; i <= n; i++) {
            for (short j = b; j <= m; j++) {
                if (i == -C) {
                    System.out.println("Error: division by zero");
                    System.exit(1);
                }
                res += (double) (i % j) / (i + C);
            }
        }
        System.out.println("The result is " + res);
    }

}
