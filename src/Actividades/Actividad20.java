package Actividades;

import java.util.Scanner;

public class Actividad20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write the first number");
        int num1 = sc.nextInt();
        System.out.println("Write the second number");
        int num2 = sc.nextInt();
        System.out.println("Write the third number");
        int num3 = sc.nextInt();

        System.out.println("The highest number was: ");
        System.out.println(higherThree(num1, num2, num3));
    }

    static int higherNumb(int num1, int num2) {
        return Math.max(num1, num2);
    }

    static int higherThree(int num1, int num2, int num3) {
        return higherNumb(num1, higherNumb(num2, num3));
    }
}
