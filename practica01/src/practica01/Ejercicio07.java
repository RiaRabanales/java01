/** María Rabanales González - P01Ej7
 *  Incluye los 6 ejercicios anteriores.
 */
package practica01;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el numero del ejercicio al que quieres acceder.");
        int miEjercicio = lector.nextInt();
        switch (miEjercicio) {
            case 1: primerEjercicio(lector);
            break;
            case 2: segundoEjercicio(lector);
            break;
            case 3: tercerEjercicio(lector);
            break;
            case 4: cuartoEjercicio(lector);
            break;
            case 5: quintoEjercicio(lector);
            break;
            case 6: sextoEjercicio();
            break;
            default: System.out.println("Opcion imposible.");
        }
    }
    
    public static void primerEjercicio(Scanner lector) {
        int[] primerArray = new int [5];
        //aquí abajo me he planteado usar i < primerArray.length pero:
        //tras investigar, si el array es nulo esto me podría petar
        //(¿a menos que hiciera una comprobación de primerArray != null?)
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Introduce un numero:");
            int numero = lector.nextInt();
            primerArray[i] = numero;
        }
        //uso el método de Arrays.toString() para imprimir valores y no coidificado
        System.out.println("Impresión al derecho:");
        System.out.println(Arrays.toString(primerArray));
    }
    
    public static void segundoEjercicio(Scanner lector) {
        int[] segundoArray = new int [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un numero:");
            int numero = lector.nextInt();
            segundoArray[4 - i] = numero;
        }
        System.out.println("Impresión al revés:");
        System.out.println(Arrays.toString(segundoArray));
    }
    
    public static void tercerEjercicio(Scanner lector) {
        //declaro las variables que necesitaré, pero fuera del for
        int totalPositivo = 0;
        int numPositivo = 0;
        int totalNegativo = 0;
        int numNegativo = 0;
        int numCeros = 0;
        //podría meter los números en un array pero no quiero ocupar ese espacio
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un numero:");
            int numero = lector.nextInt();
            if (numero == 0) {
                numCeros += 1;
            } else if (numero > 0) {
                totalPositivo += numero;
                numPositivo += 1;
            } else {
                totalNegativo += numero;
                numNegativo += 1;
            }
        }
        if (numCeros == 0) {
            System.out.println("No has introducido ningún 0");
        } else {
            System.out.println("Has introducido el 0: " + numCeros + " veces");
        }
        if (numPositivo == 0) {
            System.out.println("No has introducido ningún número positivo");
        } else {
            System.out.println("La media de los números positivos es " + (totalPositivo / numPositivo));
        }
        if (numNegativo == 0) {
            System.out.println("No has introducido ningún número negativo");
        } else {
            System.out.println("La media de los números negativos es " + (totalNegativo / numNegativo));
        }
    }
    
    public static void cuartoEjercicio(Scanner lector) {
        int[] cuartoArray = new int [10];
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Introduce un numero:");
            int numero = lector.nextInt();
            cuartoArray[i] = numero;
        }
        System.out.println("Impresión números:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Índice " + i + ": " + cuartoArray[i]);
            System.out.println("Índice " + (10 - 1 - i) + ": " + cuartoArray[10 - 1 - i]);
        }
    }
    
    public static void quintoEjercicio(Scanner lector) {
        int[] quintoArrayA = new int [10];
        System.out.println("Creación de la tabla A:");
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Introduce un numero:");
            int numero = lector.nextInt();
            quintoArrayA[i] = numero;
        }
        int[] quintoArrayB = new int [10];
        System.out.println("Creación de la tabla B:");
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Introduce un numero:");
            int numero = lector.nextInt();
            quintoArrayB[i] = numero;
        }
        //ahora creo la tabla final y le asigno valores:
        int[] quintoArrayC = new int [20];
        for (int i = 0; i < 20; i += 2) {
            quintoArrayC[i] = quintoArrayA[i/2];
            quintoArrayC[i + 1] = quintoArrayB[i/2];
        }
        System.out.println("Unión de tablas realizada.");
        System.out.println(Arrays.toString(quintoArrayC));
    }
    
    //pedirlos por teclado es repetitivo.
    //voy a investigar cómo generar los valores de las tablas aleatoriamente.
    //ver: https://dzone.com/articles/random-number-generation-in-java
    // https://javarevisited.blogspot.com/2013/05/how-to-generate-random-numbers-in-java-between-range.html
    public static void sextoEjercicio() {
        int[] sextoArrayA = new int [12];
        for (int i = 0; i < 12; i++) {
            sextoArrayA[i] = generarValores();
        }
        int[] sextoArrayB = new int [12];
        for (int i = 0; i < 12; i++) {
            sextoArrayB[i] = generarValores();
        }
        //ahora creo la tabla final y le asigno valores:
        int[] sextoArrayC = new int [24];
        for (int i = 0; i < 24; i += 6) {
            sextoArrayC[i] = sextoArrayA[i/6];
            sextoArrayC[i + 1] = sextoArrayA[i/6 + 1];
            sextoArrayC[i + 2] = sextoArrayA[i/6 + 2];
            sextoArrayC[i + 3] = sextoArrayB[i/6];
            sextoArrayC[i + 4] = sextoArrayB[i/6 + 1];
            sextoArrayC[i + 5] = sextoArrayB[i/6 + 2];
        }
        System.out.println("Unión de tablas realizada.");
        System.out.println("Tabla A: " + Arrays.toString(sextoArrayA));
        System.out.println("Tabla B:" + Arrays.toString(sextoArrayB));
        System.out.println("Unión: " + Arrays.toString(sextoArrayC));
    }
    
    public static int generarValores() {
        Random random = new Random();
        int valor = random.nextInt();
        return valor;
    }
}
