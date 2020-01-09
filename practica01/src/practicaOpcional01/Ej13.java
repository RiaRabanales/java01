/* Maria Rabanales Gonzalez
 * 13) Realiza una aplicación que nos pida un número de ventas a introducir, después 
 * nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al 
 * final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cuántas ventas has hecho?");
        int ventas = lector.nextInt();
        double totalVentas = 0;
        for (int i = 0; i < ventas; i++) {
            System.out.println("Introduce el valor de la venta número " + (i+1) + ":");
            double unicaVenta = lector.nextDouble();
            totalVentas += unicaVenta;
        }
        System.out.println("El total de todas las ventas es " + totalVentas);
    }
}
