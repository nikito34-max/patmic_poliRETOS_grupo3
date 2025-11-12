package pkSecciones.Seccion5;

import java.util.Scanner;

public class A02 {
    public void g3_matrizInicialesShowFor(Scanner entrada) {
        System.out.print("Ingrese el tamaño: ");
        int n = entrada.nextInt();
        System.out.print("Ingrese el carácter: ");
        char c = entrada.next().charAt(0);
        entrada.nextLine();
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
        System.out.print("Ingrese el tamaño: ");
        int n = entrada.nextInt();
        System.out.print("Ingrese el carácter: ");
        char c = entrada.next().charAt(0);
        entrada.nextLine();
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
        System.out.print("Ingrese el tamaño: ");
        int n = entrada.nextInt();
        System.out.print("Ingrese el carácter: ");
        char c = entrada.next().charAt(0);
        entrada.nextLine();
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

