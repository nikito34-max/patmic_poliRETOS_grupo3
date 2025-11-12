package pkSecciones.Seccion4;

public class C09 {
    public void g3_alternarMayusMinusShowFor(String frase) {
        frase = frase.toLowerCase();
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (i % 2 == 0)
                resultado += Character.toUpperCase(c);
            else
                resultado += c;
        }
        System.out.println("Resultado (for): " + resultado);
    }

    public void g3_alternarMayusMinusShowWhile(String frase) {
        frase = frase.toLowerCase();
        String resultado = "";
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (i % 2 == 0)
                resultado += Character.toUpperCase(c);
            else
                resultado += c;
            i++;
        }
        System.out.println("Resultado (while): " + resultado);
    }

    public void g3_alternarMayusMinusShowDoWhile(String frase) {
        frase = frase.toLowerCase();
        String resultado = "";
        int i = 0;
        do {
            char c = frase.charAt(i);
            if (i % 2 == 0)
                resultado += Character.toUpperCase(c);
            else
                resultado += c;
            i++;
        } while (i < frase.length());
        System.out.println("Resultado (do-while): " + resultado);
    }
}

