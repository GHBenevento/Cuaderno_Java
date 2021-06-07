package Actividades;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class Actividad24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a NIF");
        String NIF = sc.nextLine();
        if (authnticateNIF(NIF)) {
            System.out.println("This is a valid NIF");
        } else {
            System.out.println("This is not a valid NIF");
        }
    }

    static boolean authnticateNIF(String NIF) {
        boolean isNIF = true;
        if (NIF.length() != 9) {
            isNIF = false;
        } else if (!isLetter(NIF.charAt(8))) {
            isNIF = false;
        } else {
            String numb = NIF.substring(0, 8);
            for (int i = 0; i < 8; i++) {
                if (!isDigit(numb.charAt(i))) {
                    isNIF = false;
                }
            }
        }
        return isNIF;
    }
}
