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

import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Collectors;
        import java.util.stream.IntStream;

public class NumeroPrimos {
    public static void main(String[] args) {
        List<Integer> numerosPrimos = crearNumerosPrimos(100);
        System.out.println("Números primos hasta 100: " + numerosPrimos);
    }

    public static List<Integer> crearNumerosPrimos(int limite) {
        return IntStream.rangeClosed(2, limite)
                .filter(n -> {
                    long sqrt = Math.sqrt(n);
                    return n % sqrt == 0 || n % (sqrt - 1) == 0 ? false : true;
                })
                .collect(Collectors.toCollection(ArrayList::new));
    }
}