/* Maria Rabanales Gonzalez
 * 19) Pide por teclado un número entero positivo (debemos controlarlo) y muestra el número
 * de cifras que tiene. Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int miNumero = 0;
        while (miNumero <= 0) {
            System.out.println("Introduce un número entero positivo:");
            miNumero = lector.nextInt();
            if (miNumero <= 0) {
                System.out.println("Error.");
            } 
        }
        int cifras = 0;
        int controlador = miNumero;
        while (controlador > 0) {
            controlador /= 10;
            cifras += 1;
        }
        System.out.println("El número " + miNumero + " tiene " + cifras + " cifras.");
        
    }
}
