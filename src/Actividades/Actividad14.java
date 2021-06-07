package Actividades;

import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + number + " is: " + fact);
        } else {
            System.out.println("We need a positive number");
        }

    }
}
