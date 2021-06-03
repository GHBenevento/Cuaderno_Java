package Actividades;

public class Actividad5 {

    public static void main(String[] args) {
        double num1, num2;
        num1 = Math.floor(Math.random()*7);
        num2 = Math.floor(Math.random()*7);

        if(num1>num2){
            System.out.println(num1 + " is bigger than " + num2);
        }else if(num2 > num1){
            System.out.println(num2 + " is bigger than " + num1);
        }else{
            System.out.println("They are the same value: " + num1);
        }

    }
}
