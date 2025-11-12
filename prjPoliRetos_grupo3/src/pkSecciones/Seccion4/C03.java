package pkSecciones.Seccion4;

import java.util.Scanner;

public class C03 {
    private char solicitarVocal(Scanner entrada) {
        char vocal;
        while (true) {
            System.out.print("Ingresa la vocal a eliminar: ");
            String input = entrada.next().toLowerCase();
            if (input.length() == 1 && "aeiou".indexOf(input.charAt(0)) != -1) {
                vocal = input.charAt(0);
                break;
            } else {
                System.out.println("Error: Debes ingresar una sola vocal (a, e, i, o, u).");
            }
        }
        return vocal;
    }

    public void g3_eliminarVocalShowFor(String frase, Scanner entrada) {
        frase = frase.toLowerCase();
        char vocal = solicitarVocal(entrada);
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
        char vocal = solicitarVocal(entrada);
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
        char vocal = solicitarVocal(entrada);
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


