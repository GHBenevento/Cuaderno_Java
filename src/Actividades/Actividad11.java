package Actividades;

import java.util.Arrays;

public class Actividad11 {
    public static void main(String[] args) {
        String[][] planner = new String[7][24];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                if (i % 2 == 0) {
                    planner[i][j] = "No tengo planes";
                    System.out.println("Dia " + (i+1) + " hora " + j + " " + planner[i][j]);
                } else {
                    planner[i][j] = "Tengo planes";
                    System.out.println("Dia " + (i+1) + " hora " + j + " " + planner[i][j]);
                }

            }
        }

    }
}
