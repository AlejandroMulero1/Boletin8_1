package Ej1;

public class ArrayEj1 {

    //Metodos apartado 1

    /*
    Metodo que llena un array con numeros aleatorios a traves de un for que recorre
    todo el array.
    La precondicion es que se le pase al metodo un array, y no devuelve nada porque
    solo genera los valores del array
     */
    public static void llenarArray(int[] array1) {
        for(int i = 0; i < array1.length; ++i) {
            array1[i] = (int)Math.round(Math.random() * 19 + 1);
        }

    }

    /*
    Metodo que utiliza un array ya creado para crear otro que contenga solo los pares.
    La precondicion es que el array que se le de al metodo sea del tipo de datos int,
    el método devolvera un array ya generado que guarde todos los números pares del
    primer array
     */
    public static int[] generarArrayDePares(int[] array1) {
        int numPares = 0;
        int[] arrayDePares;

        //Bucle for que cuenta el numero de pares que tiene el array para establecer el tamaño del segundo
        for(int i=0; i<array1.length; i++){
            if (array1[i] % 2 == 0) {
                numPares++;
            }
        }

        arrayDePares = new int[numPares];

        for(int i = 0; i < arrayDePares.length; i++) {
            if (array1[i] % 2 == 0) {
                arrayDePares[i] = array1[i];
            }
        }

        return arrayDePares;
    }

    /*
    Metodo que enseña por pantalla el array obtenido con un for each, no devuelve nada ya que solo
    imprime por pantalla el array que se le haya pasado
     */
    public static void ensenarArray(int[] array) {
        for(int x:array){
            System.out.println(x);
        }

    }


    //Metodos apartado 2

    /*
    Metodo que llena un array con numeros aleatorios a traves de un for que recorre
    todo el array.
    La precondicion es que se le pase al metodo un array, y no devuelve nada porque
    solo genera los valores del array
    */
    public static void generarArraySinRepetidos(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int numAleatorio = (int)Math.round(Math.random() * 300 + 100);

            /*If y else a partir del método encontrarRepetido, si encuentra un repetido
            hace que el array retroceda una posicion para generar otro valor que no sea
            repetido
             */
            if (encontrarRepetido(array, numAleatorio) == false) {
                array[i] = numAleatorio;
            } else {
                i--;
            }
        }

    }

    /*
    Metodo booleano que revisa si el numero a introducir ya esta contenido en el array
    para que no se repita, no tiene precondicion y es privado debido a que es parte del metodo
    generarArraySinRepetidos
     */
    private static boolean encontrarRepetido(int[] array, int numAleatorio) {
        boolean repetido = false;
        for(int i = 0; i < array.length; ++i) {
            if (array[i] == numAleatorio) {
                repetido = true;
            }
        }

        return repetido;
    }

    //Metodos apartado 3
    /*
    Metodo similar al del apartado 2 pero con primos
     */
    public static int[] generarArrayDePrimos(int[] array) {
        llenarArray(array);
        int puesto = 0;
        int numPrimos = 0;
        int contador=0;

        for (int i = 0; i < array.length; i++) {

            for(int j=1; j<=array[i]; j++){

                if(array[i]%j==0){
                    contador++;
                }

            }
            if(contador==2){
                numPrimos++;

            }
            contador=0;
        }

        int[] arrayPrimos = new int[numPrimos];

        for (int i = 0; i < array.length; i++) {

            for(int j=1; j<=array[i];j++){

                if(array[i]%j==0){
                    contador++;
                }

            }
            if(contador==2){
                arrayPrimos[puesto] = array[i];
                puesto++;
            }
            contador=0;
        }

        return arrayPrimos;
    }

    //Metodos apartado 4
    /*
    Metodo que invierte un array generado aleatoriamente a traves de un for que recorre y introduce valores
    en el segundo array y una variable que recorre el primer array por el final
     */
    public static int[] invertirArray(int [] array){
        int [] arrayInverso=array;
        int j= array.length-1;
        for(int i = 0; i < array.length; i++) {
                arrayInverso[i] = array[j];
                j--;
            }

        return arrayInverso;
        }


        //Metodos apartado 5

        /*
        Metodo con la misma estructura que el metodo encontrarRepetido pero si el numero introducido es igual a uno
        del array no lo modificaremos, devolveremos la posicion
         */
        public static void encontrarNum(int[] array,int num){
            boolean repetido = false;
            int resultado=-1;
            for(int i = 0; i < array.length; ++i) {
                if (array[i] == num) {
                    repetido = true;
                    resultado=i;
                }
            }

        if(repetido=false){
            resultado=-1;
        }

            System.out.println(resultado);
    }
    }



