package Actividades;

import java.util.Scanner;

public class Actividad3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        double rad = sc.nextDouble();
        System.out.println("La superficie es es: " + 4 * Math.PI * Math.pow(rad, 2));
        System.out.println("EL volumen es: " + (4 / 3) * Math.PI * Math.pow(rad, 3));
    }
}

