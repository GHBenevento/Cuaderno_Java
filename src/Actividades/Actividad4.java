package Actividades;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu peso en kg");
        double weight = sc.nextDouble();
        System.out.println("Escribe tu altura en m");
        double height = sc.nextDouble();
        System.out.println("Tu IMS es: " + weight / (height * 2));
    }
}
