/* Maria Rabanales Gonzalez
 * 6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). 
 * Si no lo es, también debemos indicarlo.
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Vamos a ver si un número es par o no.");
        System.out.println("Introduce tu número:");
        int numero = lector.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El " + numero + " es par: es divisible entre 2.");
        } else {
            System.out.println("El " + numero + " es impar: no es divisible entre 2.");
        }
    }
}
