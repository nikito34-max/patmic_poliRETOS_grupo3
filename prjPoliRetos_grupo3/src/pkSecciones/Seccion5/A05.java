package pkSecciones.Seccion5;

import java.util.Random;

public class A05 {
    public void g3_matrizCuadradaNombreShowFor() {
        String nombreCompleto = "Nikolai Ortega";
        String letras = nombreCompleto.replace(" ", "");
        int n = 7;
        char[][] matriz = new char[n][n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }
        for (char letra : letras.toCharArray()) {
            int fila = rnd.nextInt(n);
            int col = rnd.nextInt(n);
            if (matriz[fila][col] != ' ')
                matriz[fila][col] = '*';
            else
                matriz[fila][col] = letra;
        }
        System.out.println("\nA05) Matriz cuadrada aleatoria (for): " + nombreCompleto + "\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void g3_matrizCuadradaNombreShowWhile() {
        String nombreCompleto = "Nikolai Ortega";
        String letras = nombreCompleto.replace(" ", "");
        int n = 7;
        char[][] matriz = new char[n][n];
        Random rnd = new Random();
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                matriz[i][j] = ' ';
                j++;
            }
            i++;
        }
        int k = 0;
        while (k < letras.length()) {
            int fila = rnd.nextInt(n);
            int col = rnd.nextInt(n);
            char letra = letras.charAt(k);
            if (matriz[fila][col] != ' ')
                matriz[fila][col] = '*';
            else
                matriz[fila][col] = letra;
            k++;
        }
        System.out.println("\nA05) Matriz cuadrada aleatoria (while): " + nombreCompleto + "\n");
        i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print(matriz[i][j] + "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public void g3_matrizCuadradaNombreShowDoWhile() {
        String nombreCompleto = "Nikolai Ortega";
        String letras = nombreCompleto.replace(" ", "");
        int n = 7;
        char[][] matriz = new char[n][n];
        Random rnd = new Random();
        int i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < n);
            i++;
        } while (i < n);
        int k = 0;
        do {
            int fila = rnd.nextInt(n);
            int col = rnd.nextInt(n);
            char letra = letras.charAt(k);
            if (matriz[fila][col] != ' ')
                matriz[fila][col] = '*';
            else
                matriz[fila][col] = letra;
            k++;
        } while (k < letras.length());
        System.out.println("\nA05) Matriz cuadrada aleatoria (do-while): " + nombreCompleto + "\n");
        i = 0;
        do {
            int j = 0;
            do {
                System.out.print(matriz[i][j] + "  ");
                j++;
            } while (j < n);
            System.out.println();
            i++;
        } while (i < n);
    }
}

