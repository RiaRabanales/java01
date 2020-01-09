/* Maria Rabanales Gonzalez
 * 10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
 * 11) Haz el mismo ejercicio anterior con un bucle for.
 */
package practicaOpcional01;

public class Ej10 {
    public static void main(String[] args) {
        System.out.println("Números del 1 al 100: ");
        for (int i = 1; i <= 100; i++) {
            //quiero probar para imprimir en línea
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Números del 100 al 1: ");
        for (int i = 100; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}
