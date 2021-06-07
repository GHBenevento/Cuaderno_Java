package Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of the first vector");
        int v1size = sc.nextInt();
        int[] v1 = new int[v1size];
        for (int i = 0; i < v1size; i++) {
            System.out.println("Input v1 value, one by one");
            v1[i] = sc.nextInt();
        }
        System.out.println("Input the size of the second vector");
        int v2size = sc.nextInt();
        int[] v2 = new int[v2size];
        for (int i = 0; i < v2size; i++) {
            System.out.println("Input v2 value, one by one");
            v2[i] = sc.nextInt();
        }
        int[] v3;
        if (v1size > v2size) {
            v3 = new int[v1size];
            for (int i = 0; i < v2size; i++) {
                v3[i] = v1[i] + v2[i];
            }
            for (int i = v2size; i < v3.length; i++) {
                v3[i] = v1[i];
            }
        } else {
            v3 = new int[v2size];
            for (int i = 0; i < v2size; i++) {
                v3[i] = v1[i] + v2[i];
            }
            for (int i = v2size; i < v3.length; i++) {
                v3[i] = v1[i];
            }
        }
        System.out.println(Arrays.toString(v3));
    }
}
