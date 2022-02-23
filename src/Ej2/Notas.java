package Ej2;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
    //Metodo que llena el array con valores aleatorios entre 1 y 10
    private static void llenarArray(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.round(Math.random() * 9 + 1);
        }
    }

    //Metodo que muestra las calificaciones con un for each
    private static void ensenarNotas(int[] array1) {
        System.out.println("Las calificaciones son: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("El alumno " + (i+1) + " tiene una calificacion de: " + array1[i]);
        }
    }

    //Metodo que almacena en un contador el total de las notas y en un acumulador el numero de notas a traves de un for each
    private static int notaMedia(int[] array){
        int media=0;
        int numNotas=0;
        for (int x:array){
            media=media+x;
            numNotas++;
        }
        media=media/numNotas;
        return media;
    }

    //Metodo que encuentra la nota mas alta recorriendo el array con un for each y almacenandola en una variable
    private static int notaMasAlta(int[] array){
        int notaMasAlta=0;
        for (int x:array){
            if (x>notaMasAlta){
                notaMasAlta=x;
            }
        }
        return notaMasAlta;
    }

    //Metodo que encuentra la nota mas baja recorriendo el array con un for each y almacenandola en una variable
    private static int notaMasBaja(int[] array){
        int notaMasBaja=10;
        for (int x:array){
            if (x<notaMasBaja){
                notaMasBaja=x;
            }
        }
        return notaMasBaja;
    }

    //Metodo que almacena el numero de notas mayores que la media
    private static int notasMayorQueMedia(int[] array){
        int numNotas=0;
        int media= notaMedia(array);
        for(int x:array){
            if(x>media){
                numNotas++;
            }
        }

        return numNotas;
    }

    //Metodo que almacena el numero de notas mayores que la media
    private static int notasMenorQueMedia(int[] array){
        int numNotas=0;
        int media= notaMedia(array);
        for(int x:array){
            if(x<media){
                numNotas++;
            }
        }

        return numNotas;
    }

    //Metodo que muestra todo el programa
    public static void menu(int[] array) {
        Scanner sc = new Scanner(System.in);

        llenarArray(array);
        ensenarNotas(array);
        char respuesta;

        do {
            int opcion;
            System.out.println("Elija el apartado a realizar:");
            System.out.println("1.Nota media");
            System.out.println("2.Nota mas alta");
            System.out.println("3.Nota mas baja");
            System.out.println("4.Número de notas mas altas que la media");
            System.out.println("5.Número de notas mas bajas que la media");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("La nota media es "+notaMedia(array));
                    break;

                case 2:
                    System.out.println("La nota mas alta es "+ notaMasAlta(array));
                    break;

                case 3:
                    System.out.println("La nota mas baja es "+ notaMasBaja(array));
                    break;

                case 4:
                    System.out.println("Hay " + notasMayorQueMedia(array) + " mayores que la media");
                    break;

                case 5:
                    System.out.println("Hay " + notasMenorQueMedia(array) + " menores que la media");
                    break;
            }

            System.out.println("Desea continuar? (Responda s)");
            respuesta = sc.next().charAt(0);
        }while(respuesta == 's');

}
}


