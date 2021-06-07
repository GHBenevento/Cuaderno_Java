package Actividades;

import java.util.Scanner;

public class Actividad17 {

    static int cont = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number would youlike to put ithe Array?");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter a number to input");
            int num = sc.nextInt();
            array[i] = num;
        }
        if (size % 2 == 0) {
            for (int i = 0; i < size / 2; i++) {
                if (array[i] != array[size - (i + 1)]) {
                    cont = 1;
                    break;
                }
            }
        } else {
            for (int i = 0; i < (size / 2) - 1; i++) {
                if (array[i] != array[size - (i + 1)]) {
                    cont = 1;
                    break;
                }
            }
        }
        if (cont == 0) {
            System.out.println("Es capicuo");
        } else {
            System.out.println("No es capicuo");
        }
    }


}
//Construir un programa que pida al usuario una serie de números enteros, los
//almacene en un array, e indique en pantalla si dicho array es capicúa, es decir, si
//la secuencia de sus elementos es igual vista de delante hacia atrás y de detrás
//hacia delante.