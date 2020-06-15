package main.java.june01;

import java.util.Scanner;

public class ASCIICode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String character = scanner.next();


        int result = character.charAt(0); // char 형을 int 형으로 받을 때 ASCII 코드로 출력
        char result2 = character.charAt(0);
        System.out.println(character.chars().iterator().nextInt());
        System.out.println((char)result);
        System.out.println((int)result2);
    }
}
