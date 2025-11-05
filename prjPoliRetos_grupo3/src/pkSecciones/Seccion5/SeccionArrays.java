package pkSecciones.Seccion5;
import java.util.Random;
import java.util.Scanner;
public class SeccionArrays {
    /**
     * A01) Mostrar nombre con barra de carga según porcentaje
     * @param entrada scanner recibido desde App
     */
    public void g3_CargaNombre(Scanner entrada) {
        System.out.println("\nA01) Mostrar nombre con letras visibles y barra de carga según porcentaje");

        String[] palabras = {
            "Nikolai",
            "Gabriel",
            "Ortega",
            "Chugchilan"
        };

        int[] porcentajes = new int[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese el porcentaje para " + palabras[i] + ": ");
            porcentajes[i] = entrada.nextInt();
        }

        int tamBarra = 10;

        System.out.println("\nResultado (for):");
        for (int i = 0; i < palabras.length; i++) {
            int visible = palabras[i].length() * porcentajes[i] / 100;
            String parcial = palabras[i].substring(0, visible);
            int llenos = porcentajes[i] * tamBarra / 100;
            String barra = "[";
            for (int j = 0; j < llenos; j++) barra += "=";
            if (llenos < tamBarra) barra += ">";
            for (int j = llenos + 1; j < tamBarra; j++) barra += " ";
            barra += "]";
            System.out.printf("%-12s %-10s %s (%3d%%)\n", palabras[i], parcial, barra, porcentajes[i]);
        }

        System.out.println("\nResultado (while):");
        int i = 0;
        while (i < palabras.length) {
            int visible = palabras[i].length() * porcentajes[i] / 100;
            String parcial = palabras[i].substring(0, visible);
            int llenos = porcentajes[i] * tamBarra / 100;
            String barra = "[";
            int j = 0;
            while (j < llenos) {
                barra += "=";
                j++;
            }
            if (llenos < tamBarra) barra += ">";
            j = llenos + 1;
            while (j < tamBarra) {
                barra += " ";
                j++;
            }
            barra += "]";
            System.out.printf("%-12s %-10s %s (%3d%%)\n", palabras[i], parcial, barra, porcentajes[i]);
            i++;
        }

        System.out.println("\nResultado (do-while):");
        i = 0;
        do {
            int visible = palabras[i].length() * porcentajes[i] / 100;
            String parcial = palabras[i].substring(0, visible);
            int llenos = porcentajes[i] * tamBarra / 100;
            String barra = "[";
            int j = 0;
            do {
                if (j < llenos) barra += "=";
                j++;
            } while (j < llenos);
            if (llenos < tamBarra) barra += ">";
            j = llenos + 1;
            do {
                if (j < tamBarra) barra += " ";
                j++;
            } while (j < tamBarra);
            barra += "]";
            System.out.printf("%-12s %-10s %s (%3d%%)\n", palabras[i], parcial, barra, porcentajes[i]);
            i++;
        } while (i < palabras.length);
    }
    /**
     * A02) Dibujar las iniciales del nombre y apellido con tamaño y carácter definidos
     * @param entrada scanner recibido desde App
     */
    public void g3_matrizIniciales(Scanner entrada) {
    System.out.println("\nA02) Dibujar las iniciales N y O");

    System.out.print("Ingrese el tamaño: ");
    int n = entrada.nextInt();

    System.out.print("Ingrese el carácter: ");
    char c = entrada.next().charAt(0);
    entrada.nextLine(); 
    System.out.println("\nResultado:\n");

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
    /**
     * A03) Dibujar un plano y graficar f(x)=2x usando letras del nombre
     */
    public void g3_planoFuncionNombre() {
        System.out.println("\nA03) Plano de coordenadas con f(x)=2x usando el nombre");

        String nombre = "NIKOLAI";
        char[] puntos = nombre.toCharArray();
        int n = puntos.length;
        int maxY = 2 * (n - 1);

        System.out.println("\nResultado:");
        for (int y = maxY; y >= 0; y--) {
            System.out.printf("%2d |", y);
            for (int x = 0; x < n; x++) {
                if (2 * x == y)
                    System.out.print(" " + puntos[x]);
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.print("   +");
        for (int i = 0; i < n * 2; i++)
            System.out.print("-");
        System.out.println();
    }
    /**
     * A04) Crear una matriz en forma de X con nombre y apellido
     */ 
    public void g3_crearMatrizX() {
        String nombre = "Nikolai";
        String apellido = "Ortega";

        int n = Math.max(nombre.length(), apellido.length());
        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }

        for (int i = 0; i < nombre.length(); i++) {
            matriz[i][i] = nombre.charAt(i);
        }

        for (int i = 0; i < apellido.length(); i++) {
            matriz[i][n - 1 - i] = apellido.charAt(i);
        }

        System.out.println("\nA04) Matriz con forma de X para: " + nombre + " " + apellido + "\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
    /**
     * A05) Llenar una matriz cuadrada con las letras del nombre en posiciones aleatorias
     *       y reemplazar colisiones con '*', mostrando el proceso
     * @throws InterruptedException  por el uso de Thread.sleep
     */
    public void g3_matrizCuadradaNombre() {
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

            if (matriz[fila][col] != ' ') {
                matriz[fila][col] = '*';
            } else {
                matriz[fila][col] = letra;
            }
        }

        System.out.println("\nA05) Matriz caudrada aleatoria del nombre: " + nombreCompleto + "\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
