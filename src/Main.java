public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + "!");
    }
}