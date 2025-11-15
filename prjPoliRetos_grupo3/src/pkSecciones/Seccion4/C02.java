package pkSecciones.seccion4;

public class C02 {
    public void g3_contarConsonantesShowFor(String frase) {
        frase = frase.toLowerCase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (!("aeiou".indexOf(Character.toLowerCase(c)) >= 0))
                contador++;
        }
        System.out.println("Total (for): " + contador);
    }

    public void g3_contarConsonantesShowWhile(String frase) {
        frase = frase.toLowerCase();
        int contador = 0;
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (!("aeiou".indexOf(Character.toLowerCase(c)) >= 0))
                contador++;
            i++;
        }
        System.out.println("Total (while): " + contador);
    }

    public void g3_contarConsonantesShowDoWhile(String frase) {
        frase = frase.toLowerCase();
        int contador = 0;
        int i = 0;
        do {
            char c = frase.charAt(i);
            if (!("aeiou".indexOf(Character.toLowerCase(c)) >= 0))
                contador++;
            i++;
        } while (i < frase.length());
        System.out.println("Total (do-while): " + contador);
    }
}

