package pkSecciones.Seccion5;

public class A03 {
    public void g3_planoFuncionNombreShowFor() {
        String nombre = "NIKOLAI";
        char[] puntos = nombre.toCharArray();
        int n = puntos.length;
        int maxY = 2 * (n - 1);
        System.out.println("\nResultado (for):");
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

    public void g3_planoFuncionNombreShowWhile() {
        String nombre = "NIKOLAI";
        char[] puntos = nombre.toCharArray();
        int n = puntos.length;
        int maxY = 2 * (n - 1);
        System.out.println("\nResultado (while):");
        int y = maxY;
        while (y >= 0) {
            System.out.printf("%2d |", y);
            int x = 0;
            while (x < n) {
                if (2 * x == y)
                    System.out.print(" " + puntos[x]);
                else
                    System.out.print("  ");
                x++;
            }
            System.out.println();
            y--;
        }
        System.out.print("   +");
        int i = 0;
        while (i < n * 2) {
            System.out.print("-");
            i++;
        }
        System.out.println();
    }

    public void g3_planoFuncionNombreShowDoWhile() {
        String nombre = "NIKOLAI";
        char[] puntos = nombre.toCharArray();
        int n = puntos.length;
        int maxY = 2 * (n - 1);
        System.out.println("\nResultado (do-while):");
        int y = maxY;
        do {
            System.out.printf("%2d |", y);
            int x = 0;
            do {
                if (2 * x == y)
                    System.out.print(" " + puntos[x]);
                else
                    System.out.print("  ");
                x++;
            } while (x < n);
            System.out.println();
            y--;
        } while (y >= 0);
        System.out.print("   +");
        int i = 0;
        do {
            System.out.print("-");
            i++;
        } while (i < n * 2);
        System.out.println();
    }
}
