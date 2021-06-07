package Actividades;

public class Actividad10 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 301) {
            double celcius = (5.0 / 9.0) * (i - 32);
            System.out.println(celcius);
            i = i + 20;
        }

    }
}
