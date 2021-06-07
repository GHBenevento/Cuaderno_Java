package Actividades;

import java.util.Scanner;

public class Actividad15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = (int) (100 * Math.random() + 1);
        int tries = 1;

        while (tries < 6) {

            System.out.println("Try guessing the number(between 1 and 100)");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Correct, you guessed the right number in " + tries + " tries");

            } else if (guess > number) {
                System.out.println("Your guess of " + guess + " is bigger than our number");

            } else {
                System.out.println("Your guess of " + guess + " is smaller than our number");
            }
            System.out.println("You have " + (5 - tries) + " tries left");

            if (tries == 5) {
                System.out.println("The correct answer was " + number);
            }
            tries++;

        }

    }

}
