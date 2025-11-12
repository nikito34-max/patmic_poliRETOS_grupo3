package pkSecciones.Seccion4;

public class C06 {
    public void g3_invertidaMayusConsonantesShowFor(String frase) {
        frase = frase.toLowerCase();
        String resultado = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                resultado += c;
            else
                resultado += Character.toUpperCase(c);
        }
        System.out.println("Resultado (for): " + resultado);
    }

    public void g3_invertidaMayusConsonantesShowWhile(String frase) {
        frase = frase.toLowerCase();
        String resultado = "";
        int i = frase.length() - 1;
        while (i >= 0) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                resultado += c;
            else
                resultado += Character.toUpperCase(c);
            i--;
        }
        System.out.println("Resultado (while): " + resultado);
    }

    public void g3_invertidaMayusConsonantesShowDoWhile(String frase) {
        frase = frase.toLowerCase();
        String resultado = "";
        int i = frase.length() - 1;
        do {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                resultado += c;
            else
                resultado += Character.toUpperCase(c);
            i--;
        } while (i >= 0);
        System.out.println("Resultado (do-while): " + resultado);
    }
}
