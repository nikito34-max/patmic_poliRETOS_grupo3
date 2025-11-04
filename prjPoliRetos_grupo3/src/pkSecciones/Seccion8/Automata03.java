package pkSecciones.Seccion8;

public class Automata03 extends Automata {    
    public Automata03() {
        setDescription("Automata para validar: a+/b+/c+");
    }

    @Override
    public void g3_ValidarWithFor(String str) {
        if (str.isEmpty()) {
            g3_imprimirResultado(false, str);
            return;
        }

        char primerChar = str.charAt(0);
        boolean valido = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            switch (primerChar) {
                case 'a':
                    if (ch != 'a') valido = false;
                    break;
                case 'b':
                    if (ch != 'b') valido = false;
                    break;
                case 'c':
                    if (ch != 'c') valido = false;
                    break;
                default:
                    valido = false;
            }

            if (!valido) break;
        }

        g3_imprimirResultado(valido, str);
    }



    @Override
    public void g3_ValidarWithWhile(String str) {
        if (str.isEmpty()) {
            g3_imprimirResultado(false, str);
            return;
        }

        char primerChar = str.charAt(0);
        boolean valido = true;
        int i = 0;

        while (i < str.length()) {
            char ch = str.charAt(i);

            switch (primerChar) {
                case 'a':
                    if (ch != 'a') valido = false;
                    break;
                case 'b':
                    if (ch != 'b') valido = false;
                    break;
                case 'c':
                    if (ch != 'c') valido = false;
                    break;
                default:
                    valido = false;
            }

            if (!valido) break;
            i++;
        }

        g3_imprimirResultado(valido, str);
    }


    @Override
    public void g3_ValidarWithDoWhile(String str) {
        if (str.isEmpty()) {
            g3_imprimirResultado(false, str);
            return;
        }

        char primerChar = str.charAt(0);
        boolean valido = true;
        int i = 0;

        do  {
            char ch = str.charAt(i);

            switch (primerChar) {
                case 'a':
                    if (ch != 'a') valido = false;
                    break;
                case 'b':
                    if (ch != 'b') valido = false;
                    break;
                case 'c':
                    if (ch != 'c') valido = false;
                    break;
                default:
                    valido = false;
            }

            if (!valido) break;
            i++;
        } while (i < str.length());

        g3_imprimirResultado(valido, str);
    }
}
