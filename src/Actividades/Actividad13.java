package Actividades;

import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Escribe el segundo numero");
        int num2 = sc.nextInt();
        System.out.println(Math.pow(num1, num2));
    }
}
