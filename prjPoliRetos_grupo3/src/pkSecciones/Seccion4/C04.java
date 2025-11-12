package pkSecciones.Seccion4;

import java.util.Scanner;

public class C04 {
    private char solicitarLetra(Scanner entrada) {
        char letra;
        while (true) {
            System.out.print("Ingresa la letra a eliminar: ");
            String input = entrada.next().toLowerCase();
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                letra = input.charAt(0);
                break;
            } else {
                System.out.println("Error: Debes ingresar una sola letra.");
            }
        }
        return letra;
    }

    public void g3_eliminarLetraShowFor(String frase, Scanner entrada) {
        frase = frase.toLowerCase();
        char letra = solicitarLetra(entrada);
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
        char letra = solicitarLetra(entrada);
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
        char letra = solicitarLetra(entrada);
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

