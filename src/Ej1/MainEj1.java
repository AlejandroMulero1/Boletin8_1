package Ej1;

import java.util.Scanner;

import static Ej1.ArrayEj1.*;


public class MainEj1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array = new int[20];
        int opcion;

        menu();
        opcion= sc.nextInt();
        switch (opcion){
            case 1:
                llenarArray(array);
                ensenarArray(generarArrayDePares(array));
                break;

            case 2:
                generarArraySinRepetidos(array);
                ensenarArray(array);
                break;

            case 3:
                llenarArray(array);
                ensenarArray(generarArrayDePrimos(array));
                break;

            case 4:
                llenarArray(array);
                invertirArray(array);
                ensenarArray(array);
                break;

            case 5:
                llenarArray(array);
                System.out.println("Introduzca un número");
                int num= sc.nextInt();
                System.out.println(encontrarNum(array, num));
                break;
        }


    }

    public static void menu(){
        System.out.println("Elija el apartado a realizar:");
        System.out.println("1.Generar un array con los numeros pares de otro array generado aleatoriamente");
        System.out.println("2.Generar otro array aleatoriamente sin numeros repetidos");
        System.out.println("3.Generar un array aleatoriamente de numeros primos");
        System.out.println("4.Invertir un array generado aleatoriamente");
        System.out.println("5.Intentar al adivinar un numero de un array generado aleatoriamente");
    }
}