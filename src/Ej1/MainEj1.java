package Ej1;

import java.util.Scanner;

import static Ej1.ArrayEj1.*;


public class MainEj1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array = new int[20];
        int opcion=1;

        switch (opcion){
            case 1:
                llenarArray(array);
                generarArrayDePares(array);
                ensenarArray(array);
                break;

            case 2:
                generarArraySinRepetidos(array);
                ensenarArray(array);
                break;

            case 3:
                llenarArray(array);
                generarArrayDePrimos(array);
                ensenarArray(array);
                break;

            case 4:
                llenarArray(array);
                invertirArray(array);
                ensenarArray(array);
                break;

            case 5:
                llenarArray(array);
                int num= sc.nextInt();
                encontrarNum(array, num);
                break;
        }


    }

}