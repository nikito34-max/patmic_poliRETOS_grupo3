package pkSecciones.Seccion4;

import java.util.Scanner;

public class C03 {
    public void g3_eliminarVocalShowFor(String frase, Scanner entrada) {
        frase = frase.toLowerCase();
        System.out.print("Ingresa la vocal a eliminar: ");
        char vocal = entrada.next().charAt(0);
        vocal = Character.toLowerCase(vocal);
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == vocal)
                resultado += " ";
            else
                resultado += c;
        }
        System.out.println("Resultado (for): " + resultado);
    }

    public void g3_eliminarVocalShowWhile(String frase, Scanner entrada) {
        frase = frase.toLowerCase();
        System.out.print("Ingresa la vocal a eliminar: ");
        char vocal = entrada.next().charAt(0);
        vocal = Character.toLowerCase(vocal);
        String resultado = "";
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (c == vocal)
                resultado += " ";
            else
                resultado += c;
            i++;
        }
        System.out.println("Resultado (while): " + resultado);
    }

    public void g3_eliminarVocalShowDoWhile(String frase, Scanner entrada) {
        frase = frase.toLowerCase();
        System.out.print("Ingresa la vocal a eliminar: ");
        char vocal = entrada.next().charAt(0);
        vocal = Character.toLowerCase(vocal);
        String resultado = "";
        int i = 0;
        do {
            char c = frase.charAt(i);
            if (c == vocal)
                resultado += " ";
            else
                resultado += c;
            i++;
        } while (i < frase.length());
        System.out.println("Resultado (do-while): " + resultado);
    }
}

