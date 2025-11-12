package pkSecciones.Seccion5;

import java.util.Scanner;

public class A01 {
    public void g3_CargaNombreShowFor(Scanner entrada) {
        String[] palabras = {"Nikolai", "Gabriel", "Ortega", "Chugchilan"};
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
    }

    public void g3_CargaNombreShowWhile(Scanner entrada) {
        String[] palabras = {"Nikolai", "Gabriel", "Ortega", "Chugchilan"};
        int[] porcentajes = new int[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese el porcentaje para " + palabras[i] + ": ");
            porcentajes[i] = entrada.nextInt();
        }
        int tamBarra = 10;
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
    }

    public void g3_CargaNombreShowDoWhile(Scanner entrada) {
        String[] palabras = {"Nikolai", "Gabriel", "Ortega", "Chugchilan"};
        int[] porcentajes = new int[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese el porcentaje para " + palabras[i] + ": ");
            porcentajes[i] = entrada.nextInt();
        }
        int tamBarra = 10;
        System.out.println("\nResultado (do-while):");
        int i = 0;
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
}

