package Actividades;

public class Actividad12 {

    public static void main(String[] args) {
        int cont = 0;
        long fn1 = 0;
        long fn2 = 1;
        while (cont < 51) {
            long suma = fn1 + fn2;
            if (cont < 1) {
                System.out.println(fn1);
                cont++;
                System.out.println(fn2);
                cont++;
            }
            if (cont > 1 && cont < 4) {
                System.out.println(suma);
                fn1 = suma;
                cont++;
            } else {
                System.out.println(suma);
                fn2 = fn1;
                fn1 = suma;
                cont++;
            }

        }
    }
}
