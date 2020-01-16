/* Maria Rabanales González
 * 21) Muestra los números primos entre 1 y 100.
 */
package practicaOpcional01;

public class Ej21 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean esPrimo = true;
            int contador = 2;
            while (esPrimo == true && contador < i) {
                if (i % contador == 0) {
                    esPrimo = false;
                } else {
                    contador += 1;
                }
            }
            System.out.println("Son primos: ");
            if (esPrimo == true) {
                System.out.print(i + " ");
            }
        }
    }
}
