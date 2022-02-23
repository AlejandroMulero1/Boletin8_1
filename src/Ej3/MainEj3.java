package Ej3;

import java.util.Scanner;

import static Ej3.ReservaVuelos.*;

public class MainEj3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final int capacidadAsientos=20;
        int[] asientos=new int[capacidadAsientos];
        int continuarReservando;

        do{
            asientosLibres(asientos);
            mostrarAsientos(asientos);
            ocuparAsiento(asientos);
            System.out.println("Desea seguir reservando asientos? (Responda con el numero de la opcion)");
            System.out.println("1. Si");
            System.out.println("2. No");
            continuarReservando=sc.nextInt();
        }while (continuarReservando==1);
    }
}
