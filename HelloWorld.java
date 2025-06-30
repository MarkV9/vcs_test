import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Scanner zum Einlesen von Benutzereingaben
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie heißt du?");
        System.out.print("Bitte gib deinen Namen ein: ");
        String name = scanner.nextLine();

        System.out.println("Hallo, " + name + "! Schön, dich kennenzulernen.");

        // Bonus: einfache Interaktion mit Zahlen
        System.out.print("Gib bitte eine Zahl ein: ");
        int zahl = scanner.nextInt();

        System.out.println("Die Zahl " + zahl + " mal 2 ergibt: " + (zahl * 2));

        // Scanner schließen (optional, aber gute Praxis)
        scanner.close();
    }
}
