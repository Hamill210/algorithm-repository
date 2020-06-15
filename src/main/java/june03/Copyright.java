package main.java.june03;

import java.util.Scanner;

public class Copyright {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = scanner.nextInt();

        System.out.println(a * (i - 1) + 1);
    }
}
