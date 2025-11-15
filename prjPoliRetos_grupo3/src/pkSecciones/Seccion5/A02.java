package pkSecciones.seccion5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A02 {
    private int solicitarTamaño(Scanner entrada) {
        int n = 0;
        while (true) {
            try {
                System.out.print("Ingrese el tamaño: ");
                n = entrada.nextInt();
                if (n <= 0) {
                    System.out.println("Error: El tamaño debe ser mayor que 0.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número entero válido.");
                entrada.nextLine();
            }
        }
        return n;
    }

    private char solicitarCaracter(Scanner entrada) {
        char c;
        while (true) {
            System.out.print("Ingrese el carácter: ");
            String input = entrada.next();
            if (input.length() == 1) {
                c = input.charAt(0);
                break;
            } else {
                System.out.println("Error: Ingresa solo un carácter.");
            }
        }
        entrada.nextLine();
        return c;
    }

    public void g3_matrizInicialesShowFor(Scanner entrada) {
        int n = solicitarTamaño(entrada);
        char c = solicitarCaracter(entrada);
        System.out.println("\nResultado (for):\n");
        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < n; col++) {
                if (col == 0 || col == n - 1 || fila == col)
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
            System.out.print("   ");
            for (int col = 0; col < n; col++) {
                if (fila == 0 || fila == n - 1 || col == 0 || col == n - 1)
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void g3_matrizInicialesShowWhile(Scanner entrada) {
        int n = solicitarTamaño(entrada);
        char c = solicitarCaracter(entrada);
        System.out.println("\nResultado (while):\n");
        int fila = 0;
        while (fila < n) {
            int col = 0;
            while (col < n) {
                if (col == 0 || col == n - 1 || fila == col)
                    System.out.print(c);
                else
                    System.out.print(" ");
                col++;
            }
            System.out.print("   ");
            col = 0;
            while (col < n) {
                if (fila == 0 || fila == n - 1 || col == 0 || col == n - 1)
                    System.out.print(c);
                else
                    System.out.print(" ");
                col++;
            }
            System.out.println();
            fila++;
        }
    }

    public void g3_matrizInicialesShowDoWhile(Scanner entrada) {
        int n = solicitarTamaño(entrada);
        char c = solicitarCaracter(entrada);
        System.out.println("\nResultado (do-while):\n");
        int fila = 0;
        do {
            int col = 0;
            do {
                if (col == 0 || col == n - 1 || fila == col)
                    System.out.print(c);
                else
                    System.out.print(" ");
                col++;
            } while (col < n);
            System.out.print("   ");
            col = 0;
            do {
                if (fila == 0 || fila == n - 1 || col == 0 || col == n - 1)
                    System.out.print(c);
                else
                    System.out.print(" ");
                col++;
            } while (col < n);
            System.out.println();
            fila++;
        } while (fila < n);
    }
}


