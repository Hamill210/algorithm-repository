package main.java.june02;

import java.math.BigInteger;
import java.util.Scanner;

public class ExorbitantRich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger money = scanner.nextBigInteger();
        BigInteger count = scanner.nextBigInteger();
        BigInteger divide = money.divide(count);
        BigInteger rest = money.mod(count);

        System.out.println(divide);
        System.out.println(rest);

        scanner.close();
    }
}
