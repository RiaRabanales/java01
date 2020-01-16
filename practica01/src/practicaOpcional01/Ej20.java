/* Maria Rabanales Gonzalez
 * Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo.
 * NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe un número entero:");
        int miNumero = lector.nextInt();
        boolean esPrimo = true;
        if (miNumero <= 1) {
            System.out.println("El " + miNumero + " no es primo.");
        } else {
            int contador = 2;
            while (esPrimo == true && contador < miNumero) {
                if (miNumero % contador == 0) {
                    esPrimo = false;
                } else {
                    contador += 1;
                }
            }
        }
        if (esPrimo == true) {
            System.out.println("Este número es primo.");
        } else {
            System.out.println("Este número no es primo.");
        }
    }
    
}
