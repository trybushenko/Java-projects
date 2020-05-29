import java.util.Scanner;
import java.lang.Math;

public class Lab2_OOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings of the arrays");
        int m = scanner.nextInt();
        System.out.println("Enter the number of columns of the arrays");
        int n = scanner.nextInt();
        byte[][] first_array = new byte[m][n];
        byte[][] second_array = new byte[m][n];
        byte[][] result_array = new byte[m][n];
        byte the_biggest_sum = 0;
        byte the_lowest_sum = 0;
        for (byte i = 0; i < m; i++) {
            for (byte j = 0; j < first_array[i].length; j++) {
                first_array[i][j] = (byte) ((byte) (Math.random() * 31) - 15);
                second_array[i][j] = (byte) ((byte) (Math.random() * 31) - 15);
            }
        }
        System.out.println("Our first matrix is: ");
        for (byte[] item : first_array) {
            for (byte b : item) {
                System.out.print(b + "\t");
            }
            System.out.println();
        }
        System.out.println("\n" + "Our second matrix is: ");
        for (byte[] value : second_array) {
            for (byte b : value) {
                System.out.print(b + "\t");
            }
            System.out.println();
        }
        for (byte i = 0; i < first_array.length; i++) {
            for (byte j = 0; j < first_array[i].length; j++) {
                result_array[i][j] = (byte) ((byte) first_array[i][j] + second_array[i][j]);
            }
        }
        System.out.println("\n" + "Our result matrix is: ");
        for (byte[] bytes : result_array) {
            for (byte aByte : bytes) {
                System.out.print(aByte + "\t");
            }
            System.out.println();
        }
        byte maximum = result_array[0][0];
        byte minimum = result_array[1][0];
        for (byte i = 0; i < result_array.length; i += 2) {
            for (byte j = 0; j < result_array[i].length; j++) {
                if (result_array[i][j] > maximum) {
                    maximum = result_array[i][j];
                }
            }
            the_biggest_sum += maximum;
            maximum = result_array[i][0];
        }
        System.out.println("\n" + "The sum of the biggest elements in string of matrix with even numbers: " + the_biggest_sum);
        for (byte i = 1; i < result_array.length; i += 2) {
            for (byte j = 0; j < result_array[i].length; j++) {
                if (result_array[i][j] < minimum) {
                    minimum = result_array[i][j];
                }
            }
            the_lowest_sum += minimum;
            minimum = result_array[i][0];
        }
        System.out.println("\n" + "The sum if the lowest elements in string of matrix with off numbers: " + the_lowest_sum);
    }
}