package pkSecciones.Seccion7;

import java.util.Scanner;

public class ControllerSeccion7 {
    private Recursion recursion = new Recursion();
    private Scanner scanner = new Scanner(System.in);

    public void g3_init() {
        System.out.println("Operaciones disponibles de Recursión:");
        System.out.println("\t1 - Factorial");
        System.out.println("\t2 - Suma (a + b)");
        System.out.println("\t3 - Multiplicación (a * b)");
        System.out.println("\t4 - Potencia (a^b)");
        System.out.println("\t5 - Conteo progresivo");
        System.out.println("\t6 - Conteo regresivo");
        System.out.println("\t7 - Salir");
    }

    public void g3_ejecutar() {
        g3_init();
        System.out.print("Seleccione una operación: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> g3_ejecutarFactorial();
            case 2 -> g3_ejecutarSuma();
            case 3 -> g3_ejecutarMultiplicacion();
            case 4 -> g3_ejecutarPotencia();
            case 5 -> g3_ejecutarConteoProgresivo();
            case 6 -> g3_ejecutarConteoRegresivo();
            case 7 -> System.exit(0);
            default -> System.out.println("Opción inválida.");
        }
        System.out.println("\nFin del programa.");
    }

    private void g3_ejecutarFactorial() {
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        int resultado = recursion.g3_factorial(n);
        System.out.printf("Factorial de %d = %d%n", n, resultado);
    }

    private void g3_ejecutarSuma() {
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        int resultado = recursion.g3_suma(a, b);
        System.out.printf("Suma de %d + %d = %d%n", a, b, resultado);
    }

    private void g3_ejecutarMultiplicacion() {
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        int resultado = recursion.g3_multiplicacion(a, b);
        System.out.printf("Multiplicación de %d * %d = %d%n", a, b, resultado);
    }

    private void g3_ejecutarPotencia() {
        System.out.print("Ingrese la base: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el exponente: ");
        int b = scanner.nextInt();
        int resultado = recursion.g3_potencia(a, b);
        System.out.printf("resultado de %d^%d = %d%n", a, b, resultado);
    }

    private void g3_ejecutarConteoProgresivo() {
        System.out.print("Ingrese hasta qué número desea contar: ");
        int n = scanner.nextInt();
        System.out.print("Conteo progresivo: ");
        recursion.g3_conteoProgresivo(n);
        System.out.println();
    }

    private void g3_ejecutarConteoRegresivo() {
        System.out.print("Ingrese desde qué número desea contar: ");
        int n = scanner.nextInt();
        System.out.print("Conteo regresivo: ");
        recursion.g3_conteoRegresivo(n);
        System.out.println();
    }
}
