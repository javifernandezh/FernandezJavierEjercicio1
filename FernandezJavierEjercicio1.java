import java.util.Random;

public class FernandezJavierEjercicio1 {
    public static void main(String[] args) {
        Random r = new Random();

        int primerPremio = r.nextInt(99999) + 1;
        int segundoPremio = r.nextInt(99999) + 1;
        int tercerPremio = r.nextInt(99999) + 1;

        System.out.println("Sorteo Lotería de Navidad:");
        System.out.println("Primer premio: " + String.format("%05d", primerPremio) + " -> 20.000€ por € jugado");
        System.out.println("Segundo premio: " + String.format("%05d", segundoPremio) + " -> 6.250€ por € jugado");
        System.out.println("Tercer premio: " + String.format("%05d", tercerPremio) + " -> 2.500€ por € jugado");
    }
}
