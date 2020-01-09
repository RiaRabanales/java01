/* Maria Rabanales Gonzalez
 * 5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se 
pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). 
Usa la constante PI y el método pow de Math.
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej05 {
    // en la solucion usa Math.PI, pero he entendido que tenía que crearlo yo...
    public static final double PI = 3.1415926536;
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Vamos a calcular el área de un circulo.");
        System.out.println("Introduce el radio:");
        double radio = lector.nextDouble();
        // podría calcular el área directamente en el sout
        double area = PI * Math.pow(radio, 2);
        System.out.println("El área es de " + area);
    }
}
