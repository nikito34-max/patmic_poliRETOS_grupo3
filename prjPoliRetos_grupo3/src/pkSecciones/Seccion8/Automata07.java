package pkSecciones.Seccion8;

public class Automata07 extends Automata{
    public Automata07() {
        setDescription("validar el siguiente lenguaje L ={for, if, else, ifelse, foreach}");
    }
    

    @Override
    public void g3_ValidarWithFor(String str) {
        boolean valido = false;
        String palabra = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                palabra += c;
            } else if (c == '(' || c == ' ') {
                break;
            } else {
                valido = false;
                break;
            }
        }

        if (palabra.equals("for") || palabra.equals("if") ||
            palabra.equals("else") || palabra.equals("ifelse") ||
            palabra.equals("foreach")) {
            valido = true;
        }

        g3_imprimirResultado(valido, str);
    }

    @Override
public void g3_ValidarWithWhile(String str) {
    boolean valido = false;
    String palabra = "";

    int i = 0;
    while (i < str.length()) {
        char c = str.charAt(i);

        if (Character.isLetter(c)) {
            palabra += c;
        } else if (c == '(' || c == ' ') {
            break;
        } else {
            valido = false;
            break;
        }
        i++;
    }

    if (palabra.equals("for") || palabra.equals("if") ||
        palabra.equals("else") || palabra.equals("ifelse") ||
        palabra.equals("foreach")) {
        valido = true;
    }

    g3_imprimirResultado(valido, str);
}

@Override
public void g3_ValidarWithDoWhile(String str) {
    boolean valido = false;
    String palabra = "";

    int i = 0;
    if (!str.isEmpty()) {
        do {
            char c = str.charAt(i);

            if (Character.isLetter(c)) {
                palabra += c;
            } else if (c == '(' || c == ' ') {
                break;
            } else {
                valido = false;
                break;
            }

            i++;
        } while (i < str.length());
    }

    if (palabra.equals("for") || palabra.equals("if") ||
        palabra.equals("else") || palabra.equals("ifelse") ||
        palabra.equals("foreach")) {
        valido = true;
    }

    g3_imprimirResultado(valido, str);
}


}