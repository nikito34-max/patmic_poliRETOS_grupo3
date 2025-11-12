package pkSecciones.Seccion4;

import java.util.Scanner;

public class C04 {
    public void g3_eliminarLetraShowFor(String frase, Scanner entrada) {
        frase = frase.toLowerCase();
        System.out.print("Ingresa la letra a eliminar: ");
        char letra = entrada.next().charAt(0);
        letra = Character.toLowerCase(letra);
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == letra)
                resultado += " ";
            else
                resultado += c;
        }
        System.out.println("Resultado (for): " + resultado);
    }

    public void g3_eliminarLetraShowWhile(String frase, Scanner entrada) {
        frase = frase.toLowerCase();
        System.out.print("Ingresa la letra a eliminar: ");
        char letra = entrada.next().charAt(0);
        letra = Character.toLowerCase(letra);
        String resultado = "";
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (c == letra)
                resultado += " ";
            else
                resultado += c;
            i++;
        }
        System.out.println("Resultado (while): " + resultado);
    }

    public void g3_eliminarLetraShowDoWhile(String frase, Scanner entrada) {
        frase = frase.toLowerCase();
        System.out.print("Ingresa la letra a eliminar: ");
        char letra = entrada.next().charAt(0);
        letra = Character.toLowerCase(letra);
        String resultado = "";
        int i = 0;
        do {
            char c = frase.charAt(i);
            if (c == letra)
                resultado += " ";
            else
                resultado += c;
            i++;
        } while (i < frase.length());
        System.out.println("Resultado (do-while): " + resultado);
    }
}

