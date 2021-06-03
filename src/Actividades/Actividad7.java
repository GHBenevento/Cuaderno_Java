package Actividades;

import java.util.Scanner;

public class Actividad7 {

    static Scanner input = new Scanner(System.in);

    static String input() {
        System.out.println("||      Enter 'S' to summ two numbers             ||");
        System.out.println("||      Enter 'R' to subtract two numbers         ||");
        System.out.println("||      Enter 'M' to multiply two numbers         ||");
        System.out.println("||      Enter 'D' to divide two numbers           ||");

        String symbol = input.nextLine();
        System.out.println("||           Now write the first number:          ||");
        int num1 = input.nextInt();
        System.out.println("||           Now write the second number:         ||");
        int num2 = input.nextInt();
        return operation(symbol, num1, num2);
    }

    static String operation(String op, double num1, double num2) { //Method that calculates the operation and returns it in a String.
        return switch (op.toUpperCase()) {
            case "S" -> "     The summ of " + num1 + " and " + num2 + " is " + (num1 + num2);
            case "R" -> "     The subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2);
            case "M" -> "     The multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2);
            case "D" -> "     The division of " + num1 + " and " + num2 + " is " + (num1 / num2);
            default -> "                  Invalid option";
        };
    }

    public static void main(String[] args) {
        String answer = Actividad7.input();
        System.out.println(answer);

    }
}
