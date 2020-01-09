/** Maria Rabanales Gonzalez
 * 3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida 
 * por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
 * 4) Igual pero con pedir el nombre (lo he hecho directamente)
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String nombre = lector.nextLine();
        System.out.println("Bienvenido " + nombre);
    }
}
