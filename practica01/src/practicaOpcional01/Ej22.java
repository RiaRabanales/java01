/* Maria Rabanales Gonzalez
 * 22) Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas vocales hay en total (recorre el String con charAt).
 * 23) Reemplaza todas las a del String anterior por una e.
 * 24) Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII. Muestralos en linea recta, separados por un espacio entre cada carácter.
 */
package practicaOpcional01;

import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        String miString = "La lluvia en Sevilla es una maravilla";
        System.out.println("La lluvia en Sevilla es una maravilla");
        System.out.println("1- contar vocales");
        System.out.println("2- reemplazar vocales por e");
        System.out.println("3- reemplazar por su ASCII");
        Scanner lector = new Scanner(System.in);
        System.out.println("Elige número:");
        int seleccion = lector.nextInt();
        switch (seleccion) {
            case 1: contarVocales(miString);
            break;
            case 2: ponerEs(miString);
            break;
            case 3: ponerAscii(miString);
            break;
            default:
                System.out.println("Opción imposible.");
        }
    }
    
    public static void contarVocales(String contarString) {
        int contador = 0;
        for (int i = 0; i < contarString.length(); i++) {
            if (contarString.charAt(i) == 'a' || contarString.charAt(i) == 'e' ||
                    contarString.charAt(i) == 'i' || contarString.charAt(i) == 'o' ||
                    contarString.charAt(i) == 'u') {
                contador += 1;
            }
        }
        System.out.println(contador + " vocales");
    }
    
    //ver https://www.javatpoint.com/java-string-replace
    public static void ponerEs(String eString) {
        eString = eString.replace('a', 'e');
        eString = eString.replace('i', 'e');
        eString = eString.replace('o', 'e');
        eString = eString.replace('u', 'e');        
        System.out.println(eString);
    }
    
    public static void ponerAscii(String ascString) {
        for (int i = 0; i < ascString.length(); i++) {
            if (ascString.charAt(i) != ' ') {
                System.out.print((int)ascString.charAt(i) + " ");
            }
        }
    }
}
