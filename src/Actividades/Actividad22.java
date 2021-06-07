package Actividades;

import java.util.ArrayList;
import java.util.Scanner;

public class Actividad22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number");
        int num = sc.nextInt();
        if (num < 2) {
            System.out.println("No tiene divisores primos");
        } else if (primeNumber(num)) {
            System.out.println("No tiene divisores primos ya que es un numero primo.");
        } else {
            System.out.println((primeArray(num)));
        }

    }

    static boolean primeNumber(int num) {
        int cont = 2;
        boolean primo = num >= 2;
        while ((primo) && (cont != num)) {
            if (num % cont == 0)
                primo = false;
            cont++;
        }
        return primo;
    }

    static ArrayList<Integer> primeArray(int num) {
        ArrayList<Integer> ourArr = new ArrayList<>();
        int count = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                if (primeNumber(i)) {
                    ourArr.add(i);
                    count++;
                }
            }
        }
        return ourArr;
    }
}
