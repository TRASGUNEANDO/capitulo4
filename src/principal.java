import java.util.Scanner;
/**Calcula los n primeros números primos, determinado n por el usuario*/
public class principal {


    public static void main(String[] args) {

        /**
         * Se pide al usuario un número por teclado para calcular los primos que hay entre 1
         * y el número indicado
         * @param dato será el número facilitado por el usuario
         */
       Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el número para la criba de Erastótenes: ");
        int dato=teclado.nextInt();

        /**
         * Creamos un vector para comprobar los numeros comprendidos entre 1 y dato
         * no le damos dimensiones, se la dará el método correspondiente
         */
        int[] vector;

        /**
         * A continuación se calcula y muestran los números naturales entre 1 y el número
         * facilitado por el usuario ("dato").
         * Se obtiene un array "numConsecutivos" conteniéndolos
         */
        System.out.println("\nVector inicial hasta : "+dato);
        int[] numConsecutivos = Criba.tablaConsecutivos(dato);

        /**
         * Se muestran los números del array "numConsecutivos" en filas de 10 elementos
         */
        Criba.mostrarElementosArray(numConsecutivos);

        /**
         * Se genera un array con los números primos obtenidos del primer array
         * (de los n primeros números naturales indicados en "dato")
         */
        vector = Criba.generarPrimos(dato);

        /**
         * Se muestran los números del array "vector" en filas de 10 elementos
         */

        System.out.println("\nVector de primos hasta: "+dato);
        Criba.mostrarElementosArray(vector); 
    }
}
