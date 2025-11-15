package pkSecciones.seccion8;

public class Automata06 extends Automata {
    public Automata06() {
        setDescription("Validar la declaracion de variables en java");
    }
    
    @Override
    public void g3_ValidarWithFor(String str) {
        boolean valido = false;
        if (str.isEmpty()) {
            g3_imprimirResultado(false, str);
            return;
        }

        char c0 = str.charAt(0);
        if (!Character.isLetter(c0) && c0 != '_' && c0 != '$') {
            g3_imprimirResultado(false, str);
            return;
        }

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetterOrDigit(c) || c == '_' || c == '$') {
                valido = true;
            } else if (c == ';' || c == ',' || c == '=') {
                valido = true;
                break;
            } else {
                valido = false;
                break;
            }
        }

        g3_imprimirResultado(valido, str);
    }

    @Override
    public void g3_ValidarWithWhile(String str) {
        boolean valido = false;

        if (str.isEmpty()) {
            g3_imprimirResultado(false, str);
            return;
        }

        char c0 = str.charAt(0);
        if (!Character.isLetter(c0) && c0 != '_' && c0 != '$') {
            g3_imprimirResultado(false, str);
            return;
        }

        int i = 1;
        while (i < str.length()) {
            char c = str.charAt(i);

            if (Character.isLetterOrDigit(c) || c == '_' || c == '$') {
                valido = true;
            } else if (c == ';' || c == ',' || c == '=') {
                valido = true;
                break;
            } else {
                valido = false;
                break;
            }

            i++;
        }

        g3_imprimirResultado(valido, str);
    }

    @Override
    public void g3_ValidarWithDoWhile(String str) {
        boolean valido = false;

        if (str.isEmpty()) {
            g3_imprimirResultado(false, str);
            return;
        }

        char c0 = str.charAt(0);
        if (!Character.isLetter(c0) && c0 != '_' && c0 != '$') {
            g3_imprimirResultado(false, str);
            return;
        }

        int i = 1;
        if (str.length() > 1) {
            do {
                char c = str.charAt(i);

                if (Character.isLetterOrDigit(c) || c == '_' || c == '$') {
                    valido = true;
                } else if (c == ';' || c == ',' || c == '=') {
                    valido = true;
                    break;
                } else {
                    valido = false;
                    break;
                }

                i++;
            } while (i < str.length());
        } else {
            valido = true;
        }

        g3_imprimirResultado(valido, str);
    }
}
