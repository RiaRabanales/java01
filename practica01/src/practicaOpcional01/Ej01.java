/**Maria Rabanales Gonzalez
 * 1) Declara dos variables numéricas (con el valor que desees), 
 * muestra por consola la suma, resta, multiplicación, división y módulo 
 * (resto de la división).
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int primerNumero = lector.nextInt();
        System.out.println("Introduce el segundo número:");
        int segundoNumero = lector.nextInt();
        System.out.println("Resultado de las operaciones:");
        System.out.println("Suma: " + (primerNumero + segundoNumero));
        System.out.println("Resta: " + (primerNumero - segundoNumero));
        System.out.println("Multiplicacion: " + (primerNumero * segundoNumero));
        System.out.println("Division: " + (primerNumero / segundoNumero));
        System.out.println("Modulo: " + (primerNumero % segundoNumero));
    }
}
