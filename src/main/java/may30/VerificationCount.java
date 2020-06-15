package main.java.may30;

import java.util.Scanner;

public class VerificationCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int result =
                (int)(Math.pow(a,2) +
                Math.pow(b,2) +
                Math.pow(c,2) +
                Math.pow(d,2) +
                Math.pow(e,2)) % 10;
        System.out.println(result);
    }


}
