import java.util.Arrays;

public class Criba {

// Generar números primos de 1 a max
    public static int[] generarPrimos(int max)
    {
        int[] primos; //array que contendrá los números primos obtenidos y que devolveremos

        if (max >= 2) { //Si max < 2 no se pueden calcular los primos (no hay)

            boolean[] esPrimo = new boolean[max+1]; //max+1 es el tamaño del array porque
            //hay que añadir el 0

            calcularEsPrimo(esPrimo); //se verifica para cada números si es o no primo
            primos = numerosPrimosHay(esPrimo); //se crea un array solo con los núm primos
        } else { // max < 2
            primos = null; //no hay primos no tiene que haber array
            //así evitamos dos return
        }
        return primos;
    }

//Devuelve un array con los números primos que hay en los primeros n números naturales
    private static int[] numerosPrimosHay(boolean[] esPrimo) {
        int j;
        int i;
        // ¿Cuántos primos hay?
        final int cuenta = cuentaPrimos(esPrimo);

        // Rellenar el vector de números primos
        int[] primos = new int[cuenta];
        for (i=0, j=0; i< esPrimo.length ; i++) {
            if (esPrimo[i])
                primos[j++] = i;
        }
        return primos;
    }

//Calcula en el array de números si son primos o no los números de los índices
    //del array
    private static void calcularEsPrimo(boolean[] esPrimo) {
        int i;
        int j;

        Arrays.fill(esPrimo,true); //se inicia el array con "true" en todos casos
        esPrimo[0] = esPrimo[1] = false; // Eliminar el 0 y el 1, que no son primos

        for (i=2; i<Math.sqrt(esPrimo.length)+1; i++) {
            for (j=2*i; j< esPrimo.length; j+=i)  {
                esPrimo[j] = false;
            }
        }
    }

// devuelve la cantidad de números primos que hay en el array
    private static int cuentaPrimos(boolean[] esPrimo) {
        int i;
        int cuenta = 0;
        for (i=0; i< esPrimo.length; i++) {
            if (esPrimo[i])
                cuenta++;
        }
        return cuenta;
    }

// muestra los elementos int que hay en un array, en filas de 10 elementos
    public static void mostrarElementosArray(int[] vector) {
        if (vector!=null) {
            for (int i = 0; i < vector.length; i++) {
                if (i % 10 == 0) System.out.println();
                System.out.print(vector[i] + "\t");
            }
        }
    }

//Se obtiene un array conteniendo los 'dato' primeros números para después mostrarlos con
//el método correspondiente

    public static int[] tablaConsecutivos(int dato) {
        int[] numeros = new int [dato];

        if (dato>0) {
            for (int i = 0; i < dato; i++) {
                numeros[i] = i + 1;
            }
        } else numeros = null;
        return numeros;
    }
}

