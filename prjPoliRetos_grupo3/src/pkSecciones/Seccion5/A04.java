package pkSecciones.seccion5;

public class A04 {
    public void g3_crearMatrizXShowFor() {
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
        System.out.println("\nA04) Matriz con forma de X (for): " + nombre + " " + apellido + "\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void g3_crearMatrizXShowWhile() {
        String nombre = "Nikolai";
        String apellido = "Ortega";
        int n = Math.max(nombre.length(), apellido.length());
        char[][] matriz = new char[n][n];
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                matriz[i][j] = ' ';
                j++;
            }
            i++;
        }
        i = 0;
        while (i < nombre.length()) {
            matriz[i][i] = nombre.charAt(i);
            i++;
        }
        i = 0;
        while (i < apellido.length()) {
            matriz[i][n - 1 - i] = apellido.charAt(i);
            i++;
        }
        System.out.println("\nA04) Matriz con forma de X (while): " + nombre + " " + apellido + "\n");
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

    public void g3_crearMatrizXShowDoWhile() {
        String nombre = "Nikolai";
        String apellido = "Ortega";
        int n = Math.max(nombre.length(), apellido.length());
        char[][] matriz = new char[n][n];
        int i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < n);
            i++;
        } while (i < n);
        i = 0;
        do {
            if (i < nombre.length()) matriz[i][i] = nombre.charAt(i);
            i++;
        } while (i < nombre.length());
        i = 0;
        do {
            if (i < apellido.length()) matriz[i][n - 1 - i] = apellido.charAt(i);
            i++;
        } while (i < apellido.length());
        System.out.println("\nA04) Matriz con forma de X (do-while): " + nombre + " " + apellido + "\n");
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

