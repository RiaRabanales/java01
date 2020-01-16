/* Maria Rabanales Gonzalez
 * 18) Pide por teclado dos número y genera 10 números aleatorios entre esos números. 
 * Usa el método Math.random para generar un número entero aleatorio (recuerda el 
 * casting de double a int).
 */
package practicaOpcional01;

import java.util.Arrays;
import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero1 = lector.nextInt();
        System.out.println("Introduce otro número mayor que " + numero1 + ":");
        int numero2 = lector.nextInt();
        //decido meter los números en una lista
        int[] listaNumeros = new int[10];
        for (int i = 0; i < 10; i++) {
            listaNumeros[i] = generarNumeros(numero1, numero2);
        }
        System.out.println("Impresión de los números: " + Arrays.toString(listaNumeros));
    }
    
    public static int generarNumeros (int min, int max) {
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
    
}
