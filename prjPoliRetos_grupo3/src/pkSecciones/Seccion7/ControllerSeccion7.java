package pkSecciones.Seccion7;

import java.util.InputMismatchException;
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
        int opcion = leerEntero();

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

    private int leerEntero() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next();
            System.out.print("Entrada inválida. Ingrese un número entero: ");
            return leerEntero();
        }
    }

    private void g3_ejecutarFactorial() {
        System.out.print("Ingrese un número (>=0): ");
        int n = leerEntero();
        if (n < 0) {
            System.out.print("Número inválido. Ingrese un valor >= 0: ");
            n = leerEntero();
        }
        int resultado = recursion.g3_factorial(n);
        System.out.printf("Factorial de %d = %d%n", n, resultado);
    }

    private void g3_ejecutarSuma() {
        System.out.print("Ingrese el primer número: ");
        int a = leerEntero();
        System.out.print("Ingrese el segundo número: ");
        int b = leerEntero();
        int resultado = recursion.g3_suma(a, b);
        System.out.printf("Suma de %d + %d = %d%n", a, b, resultado);
    }

    private void g3_ejecutarMultiplicacion() {
        System.out.print("Ingrese el primer número: ");
        int a = leerEntero();
        System.out.print("Ingrese el segundo número: ");
        int b = leerEntero();
        int resultado = recursion.g3_multiplicacion(a, b);
        System.out.printf("Multiplicación de %d * %d = %d%n", a, b, resultado);
    }

    private void g3_ejecutarPotencia() {
        System.out.print("Ingrese la base: ");
        int a = leerEntero();
        System.out.print("Ingrese el exponente (>=0): ");
        int b = leerEntero();
        if (b < 0) {
            System.out.print("Exponente inválido. Ingrese un valor >= 0: ");
            b = leerEntero();
        }
        int resultado = recursion.g3_potencia(a, b);
        System.out.printf("Resultado de %d^%d = %d%n", a, b, resultado);
    }

    private void g3_ejecutarConteoProgresivo() {
        System.out.print("Ingrese hasta qué número desea contar (>=1): ");
        int n = leerEntero();
        if (n < 1) {
            System.out.print("Número inválido. Ingrese un valor >= 1: ");
            n = leerEntero();
        }
        System.out.print("Conteo progresivo: ");
        recursion.g3_conteoProgresivo(n);
        System.out.println();
    }

    private void g3_ejecutarConteoRegresivo() {
        System.out.print("Ingrese desde qué número desea contar (>=1): ");
        int n = leerEntero();
        if (n < 1) {
            System.out.print("Número inválido. Ingrese un valor >= 1: ");
            n = leerEntero();
        }
        System.out.print("Conteo regresivo: ");
        recursion.g3_conteoRegresivo(n);
        System.out.println();
    }
}
