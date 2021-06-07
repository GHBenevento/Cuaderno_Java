package Actividades;

import java.util.Scanner;

public class Actividad16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many number would youlike to put ithe Array?");
        int size = sc.nextInt();
        int[] array = new int[size];
        int min = 0;
        int max = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter a number to input");
            int num = sc.nextInt();
            array[i] = num;
            if (i == 0) {
                min = num;
                max = num;
            } else {
                if (num >= max) {
                    max = num;
                } else {
                    min = num;
                }

            }
        }

        System.out.println("The biggest number is " + max);
        System.out.println("The smallest number is " + min);

    }
}

