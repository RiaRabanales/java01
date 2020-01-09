/**Maria Rabanales Gonzalez
 *2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de 
 * los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar 
 * que funciona.
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int primerNumero = lector.nextInt();
        System.out.println("Introduce el segundo número:");
        int segundoNumero = lector.nextInt();
        if (primerNumero != segundoNumero) {
            System.out.println("El mayor de estos números es " + Math.max(primerNumero, segundoNumero));
        } else {
            System.out.println("Los dos números son iguales");
        }
    }
}
