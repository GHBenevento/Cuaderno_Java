package Actividades;

import java.util.Scanner;

public class Actividad9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
