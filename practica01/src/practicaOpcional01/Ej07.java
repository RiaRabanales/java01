/* Maria Rabanales Gonzalez
 * 7) Lee un número por teclado y muestra por consola, el carácter al que pertenece 
 * en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean valido = false;
        while (valido == false) {
            System.out.println("Introduce un número (97 o superior) para convertir:");
            int numero = lector.nextInt();
            if (numero < 97) {
                System.out.println("Número incorrecto.");
            } else {
                char ascii = (char) numero;
                System.out.println("Su ASCII es '" + ascii + "'.");
                valido = true;
            }
        }
    }
}
