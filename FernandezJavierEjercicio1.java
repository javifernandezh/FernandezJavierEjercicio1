import java.util.Random;
import java.util.Scanner;

public class FernandezJavierEjercicio1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        // Tarea 1
        int primerPremio = r.nextInt(99999) + 1;
        int segundoPremio = r.nextInt(99999) + 1;
        int tercerPremio = r.nextInt(99999) + 1;

        System.out.println("Sorteo Lotería de Navidad:");
        System.out.println("Primer premio: " + String.format("%05d", primerPremio));
        System.out.println("Segundo premio: " + String.format("%05d", segundoPremio));
        System.out.println("Tercer premio: " + String.format("%05d", tercerPremio));

        // Tarea 2
        int decimo;
        while (true) {
            System.out.print("Introduce el número de tu décimo (1-99999): ");
            if (sc.hasNextInt()) {
                decimo = sc.nextInt();
                if (decimo >= 1 && decimo <= 99999) break;
                else System.out.println("Error: el número debe estar entre 1 y 99999.");
            } else {
                System.out.println("Error: debes introducir un número entero.");
                sc.next();
            }
        }

        // Tarea 2
        int importe;
        while (true) {
            System.out.print("Introduce el importe jugado (mínimo 1€): ");
            if (sc.hasNextInt()) {
                importe = sc.nextInt();
                if (importe >= 1) break;
                else System.out.println("Error: el importe mínimo es 1€.");
            } else {
                System.out.println("Error: debes introducir un número entero.");
                sc.next();
            }
        }

        // Tarea 2
        System.out.println("\nTu décimo: " + String.format("%05d", decimo));
        System.out.println("Importe jugado: " + importe + "€");

        if (decimo == primerPremio) {
            System.out.println("¡Primer premio! Has ganado " + (20000 * importe) + "€");
        } else if (decimo == segundoPremio) {
            System.out.println("¡Segundo premio! Has ganado " + (6250 * importe) + "€");
        } else if (decimo == tercerPremio) {
            System.out.println("¡Tercer premio! Has ganado " + (2500 * importe) + "€");
        } else {
            System.out.println("Lo siento, no has tenido suerte");
        }

        sc.close();
    }
}
