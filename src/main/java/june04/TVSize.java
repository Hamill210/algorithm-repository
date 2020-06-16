package main.java.june04;

import java.util.Scanner;

public class TVSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diagonal = scanner.nextInt();
        int heightRatio = scanner.nextInt();
        int widthRatio = scanner.nextInt();

        if (diagonal >= 5 && diagonal <= 1000) {
            if (heightRatio >= 1 && heightRatio <= 99) {
                if (widthRatio >= 2 && widthRatio <= 100) {
                    if (widthRatio > heightRatio) {
                        double width = Math.sqrt((Math.pow(diagonal,2)/(Math.pow(widthRatio,2) + Math.pow(heightRatio,2)))) * widthRatio;
                        double height = Math.sqrt((Math.pow(diagonal,2)/(Math.pow(widthRatio,2) + Math.pow(heightRatio,2)))) * heightRatio;
                        int widthInt = (int)width;
                        int heightInt = (int)height;
                        System.out.println(heightInt + " " + widthInt);
                    }
                }
            }
        }
    }
}
