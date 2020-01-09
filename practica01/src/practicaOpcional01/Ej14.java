/* Maria Rabanales Gonzalez
 * 14) Realiza una aplicación que nos calcule una ecuación de segundo grado. 
 * Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante 
 * (operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math. 
 * Te recomiendo que uses mensajes de traza.
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ecuación de segundo grado:");
        int variableA = numInput(lector);
        int variableB = numInput(lector);
        int variableC = numInput(lector);
        double discriminante = Math.pow(variableB, 2) - (4 * variableA * variableC);
        if (discriminante > 0){
            double raiz = Math.sqrt(discriminante);
            double solucion1 = (-variableB + raiz) / (2 * variableA);
            double solucion2 = (-variableB - raiz) / (2 * variableA);
            System.out.println("Las soluciones son " + solucion1 + " y " + solucion2);
        } else {
            System.out.println("Es imposible hacer la raiz cuadrada de este discriminante.");
        }
    }
    
    public static int numInput(Scanner lector) {
        System.out.println("Introduce un número:");
        int numero = lector.nextInt();
        return numero;
    }
}
