package Actividades;

import java.util.Scanner;

public class Actividad23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a temperature in Fahrenheit and I will put it in Celsius");
        int num = sc.nextInt();
        System.out.println(farCel(num));
    }

    static double farCel(int num) {
        return (5.0 / 9.0) * (num - 32);
    }
}
