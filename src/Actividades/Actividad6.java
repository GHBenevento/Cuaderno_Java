package Actividades;

import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu peso en kg");
        double weight = sc.nextDouble();
        System.out.println("Escribe tu altura en m");
        double height = sc.nextDouble();
        double IMS = weight / (height * 2);
        if (IMS < 16) {
            System.out.println("Criterio de ingreso en hospital");
        } else if (IMS >= 16 && IMS < 17) {
            System.out.println("Infrapeso");

        } else if (IMS >= 17 && IMS < 18) {
            System.out.println("Bajo peso");

        } else if (IMS >= 18 && IMS < 25) {
            System.out.println("Peso normal (saludable)");

        } else if (IMS >= 25 && IMS < 30) {
            System.out.println("Sobrepeso");

        } else if (IMS >= 30 && IMS < 35) {
            System.out.println("Sobrepeso crónico");

        } else if (IMS >= 35 && IMS <= 40) {
            System.out.println("Obesidad premórbida");

        } else {
            System.out.println("Obesidad mórbida");
        }
        System.out.println(IMS);
    }
}
