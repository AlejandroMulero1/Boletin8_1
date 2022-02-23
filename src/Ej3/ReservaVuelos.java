package Ej3;

import java.util.Scanner;

public class ReservaVuelos {
    public static boolean esFumador() {
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        boolean fumador;
        while (respuesta != 1 && respuesta != 2) {
            System.out.println("Usted fuma? (Responda con el número de la opción)");
            System.out.println("1. Si");
            System.out.println("2. No");
            respuesta = sc.nextInt();
        }
        if (respuesta == 1) {
            fumador = true;
        }
        else {
            fumador=false;
        }
        return fumador;
    }
    public static void asientosLibres(int[] array){
        int numAsientosLibres=0;
        //(int i=15; i < array.lenght; i++)
        for(int x:array){
            //if (array[i]==0)
            if(x == 0){
                numAsientosLibres++;
            }
        }
        if(numAsientosLibres==0){
            System.out.println("El vuelo esta lleno");
        }else {
            System.out.println("Hay "+ numAsientosLibres + " asientos libres");
        }
    }

    public static void mostrarAsientos(int[] array){
        final int capacidadAsientos=20;
        final int capacidadFila=5;
        final int numFilas=capacidadAsientos/capacidadFila;
        int a=0;
        for(int i=0; i < numFilas; i++){
            for(int j=0; j < capacidadFila; j++){
                System.out.print(a+": ["+ array[a]+"]");
                System.out.print("   ");

                //Este if es puramente estetico para que no haya tanto desfase al mostrar a con dos cifras
                if(a<10){
                    System.out.print(" ");
                }
                a++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Los asientos representados con 0 son asientos libres");
        System.out.println("Los asientos representados con 1 son asientos ocupados");
        System.out.println("La ultima fila es la fila de fumadores");
    }

    //Precondicion:Que pase un numero entre 1 y 20
    public static int[] ocuparAsiento(int[] array){
        Scanner sc=new Scanner(System.in);
        int asientoElegido;
        boolean fumador=esFumador();

        System.out.println("Elija el asiento deseado: ");
        asientoElegido=sc.nextInt();

        while(asientoOcupado(asientoElegido, array)){
            System.out.println("El asiento "+ asientoElegido+ " esta ocupado, pruebe con otro");
            asientoElegido=sc.nextInt();
        }
        if(fumador && asientoElegido<15){
            System.out.println("Usted es fumador, no puede elegir ese sitio, pruebe con otro");
            asientoElegido=sc.nextInt();
        }
        else if(fumador==false && asientoElegido>15){
            System.out.println("Usted no fuma, asi que debe ir a las filas de no fumadores, pruebe otra vez");
            asientoElegido= sc.nextInt();
        }
        array[asientoElegido]=1;
        return array;
    }


    private static boolean asientoOcupado(int asientoelegido, int [] array){
        boolean estaOcupado= false;
        if(array[asientoelegido]==1){
            estaOcupado=true;
        }
        return estaOcupado;
    }
}