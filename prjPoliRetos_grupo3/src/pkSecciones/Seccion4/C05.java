package pkSecciones.Seccion4;

public class C05 {
    public void g3_invertidaMayusVocalesShowFor(String frase) {
        String invertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                invertida += Character.toUpperCase(c);
            else
                invertida += c;
        }
        System.out.println("Resultado (for): " + invertida);
    }

    public void g3_invertidaMayusVocalesShowWhile(String frase) {
        String invertida = "";
        int i = frase.length() - 1;
        while (i >= 0) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                invertida += Character.toUpperCase(c);
            else
                invertida += c;
            i--;
        }
        System.out.println("Resultado (while): " + invertida);
    }

    public void g3_invertidaMayusVocalesShowDoWhile(String frase) {
        String invertida = "";
        int i = frase.length() - 1;
        do {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                invertida += Character.toUpperCase(c);
            else
                invertida += c;
            i--;
        } while (i >= 0);
        System.out.println("Resultado (do-while): " + invertida);
    }
}

