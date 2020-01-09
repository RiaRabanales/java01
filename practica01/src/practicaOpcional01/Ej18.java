/* Maria Rabanales Gonzalez
 * 18) Pide por teclado dos número y genera 10 números aleatorios entre esos números. 
 * Usa el método Math.random para generar un número entero aleatorio (recuerda el 
 * casting de double a int).
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero1 = lector.nextInt();
        System.out.println("Introduce otro número mayor que " + numero1 + ":");
        int numero2 = lector.nextInt();
        //acabar
    }
    
}
