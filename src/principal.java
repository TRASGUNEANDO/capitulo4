import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        //Se pide al usuario un número para calcular los primos que hay hasta él
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el número para la criba de Erastótenes: ");
        int dato=teclado.nextInt();

        //Creamos un vector para comprobar los numeros comprendidos entre 1 y dato
        int[] vector;

        System.out.println("\nVector inicial hasta : "+dato);
        int[] numConsecutivos = Criba.tablaConsecutivos(dato); //se genera un array
        //con los 'dato' primeros números para poder mostrarlos a continuación
        //esto solamente facilita la lectura del programa, no es más ágil

        Criba.mostrarElementosArray(numConsecutivos); //se muestra el array de los números
        //consecutivos de 10 en 10 (por fila)

        vector = Criba.generarPrimos(dato); //se genera un array conteniendo los primos
        //existentes entre 1 y 'dato'

        System.out.println("\nVector de primos hasta: "+dato);
        Criba.mostrarElementosArray(vector); //se muestran los datos contenidos en el array
    }
}
