package Actividades;

import java.util.Scanner;

public class Actividad21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number");
        int num = sc.nextInt();

        if (primeNumber(num)) {
            System.out.println("Your number is a prime number");
        } else {
            System.out.println("It wasn't a prime number");
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
}
