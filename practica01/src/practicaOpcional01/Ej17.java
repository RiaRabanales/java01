/* Maria Rabanales Gonzalez
 * 17) Crea una aplicación que nos pida un día de la semana y que nos diga si es 
 * un dia laboral o no. Usa un switch para ello.
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        System.out.println("Introduce uno de los siguientes días de la semana:");
        System.out.println("  L - lunes");
        System.out.println("  M - martes");
        System.out.println("  X - miércoles");
        System.out.println("  J - jueves");
        System.out.println("  V - viernes");
        System.out.println("  S - sábado");
        System.out.println("  D - domingo");
        Scanner lector = new Scanner(System.in);
        char dia = lector.nextLine().charAt(0);
        switch (dia) {
            case 'S':
            case 'D':
                System.out.println("No es laboral");
                break;
            default:
                System.out.println("Es laboral.");
        }
    }
}
