/* Maria Rabanales Gonzalez
 * 16) Escribe una aplicación con un String que contenga una contraseña cualquiera. 
 * Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes 
 * ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”. 
 * Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        String password = "alualualu";
        Scanner lector = new Scanner(System.in);
        boolean salida = false;
        int contador = 0;
        while (salida == false){
            System.out.println("Introduce la contraseña:");
            String intento = lector.nextLine();
            if (intento.equals(password)) {
                salida = true;
            } else {
                contador++;
                if (contador == 3) {
                    salida = true;
                }
            }
        }
        if (contador == 3) {
            System.out.println("Has realizado el número máximo de intentos.");
        } else {
            System.out.println("Enhorabuena.");
        }
                
    }
    
}
