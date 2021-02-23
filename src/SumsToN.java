/**
 * An object that lists all the different ways to get a collection positive integers adding up
 * to n given a positive integer
 * @version : 0.0.1
 * @author : Selamawit Abdo
 */

import java.util.Scanner;

public class SumsToN {

    private static Scanner scan = new Scanner(System.in);

    public static void main (String args[]) {
        System.out.print(" Enter a positve integer greater than 0:");
        int n = scan.nextInt();
        if (n != 0) {getList(n);}

    }

    private static void getList(int n) {
        getList(n, n, "");
    }

    private static void getList(int n, int max, String part) {
        if (n == 0) {
            System.out.println(part);
            return;
        }
        for (int i = 1; i <= Math.min(max, n); i++) {
            getList(n-i, i, i + " " + part);
        }
    }
}
