package pkSecciones.Seccion4;

public class C07 {
    public void g3_mayusSinJShowFor(String frase) {
        frase = frase.toUpperCase();
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != 'J')
                resultado += c;
        }
        System.out.println("Resultado (for): " + resultado);
    }

    public void g3_mayusSinJShowWhile(String frase) {
        frase = frase.toUpperCase();
        String resultado = "";
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (c != 'J')
                resultado += c;
            i++;
        }
        System.out.println("Resultado (while): " + resultado);
    }

    public void g3_mayusSinJShowDoWhile(String frase) {
        frase = frase.toUpperCase();
        String resultado = "";
        int i = 0;
        do {
            char c = frase.charAt(i);
            if (c != 'J')
                resultado += c;
            i++;
        } while (i < frase.length());
        System.out.println("Resultado (do-while): " + resultado);
    }
}
