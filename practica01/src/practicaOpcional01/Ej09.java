/* Maria Rabanales Gonzalez
 * 9. Lee un número por teclado que pida el precio de un producto (puede tener decimales) 
 * y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej09 {
    
    public static final double IVA = 0.21;
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el precio base del producto:");
        double precio = lector.nextDouble();
        System.out.println("El precio con IVA es " + (precio * (1 + IVA)));
    }
    
}
