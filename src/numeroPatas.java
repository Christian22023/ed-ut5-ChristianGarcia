import java.util.Scanner;

public class numeroPatas {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int hormigas, aranas, cochinillas, patas; // Declaramos variables.

        // Pedimos que introduzcan por teclado los datos y los guardamos.
        System.out.print("\n¿Hormigas capturadas?: ");
        hormigas = sc.nextInt();

        System.out.print("¿Arañas capturadas?: ");
        aranas = sc.nextInt();

        System.out.print("¿Cochinillas capturadas?: ");
        cochinillas = sc.nextInt();

        // Multiplicamos  el insecto por el su número de patas y guardamos el resultado.
        patas = hormigas * 6 + aranas * 8 + cochinillas * 14;

        // Imprimimos el resultado por pantalla.
        System.out.print("-----------------------------------------");
        System.out.print("\nEntre todos los insectos suman: " + patas + " patas");
        System.out.print("\n-----------------------------------------Sy");
        System.out.print("\n");
    }
}
