package pkSecciones.seccion8;

public class Automata04 extends Automata {
    public Automata04() {
        setDescription("Automata para validar: 1+/0+1*");
    }
    
    @Override
    public void g3_ValidarWithFor(String str) {
        if (str.isEmpty()) {
            g3_imprimirResultado(false, str);
            return;
        }

        int estado = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);

            switch (estado) {
                case 0: 
                    if (c == '1') {
                        estado = 1;
                    } else if (c == '0') {
                        estado = 2;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 1:
                    if (c != '1') {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 2:
                    if (c == '0') {
                    } else if (c == '1') {
                        estado = 3;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 3:
                    if (c != '1') {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                default:
                    g3_imprimirResultado(false, str);
                    return;
            }
        }

        boolean result = (estado == 1 || estado == 2 || estado == 3);
        g3_imprimirResultado(result, str);
    }


    @Override
    public void g3_ValidarWithWhile(String str) {
        if (str.isEmpty()) {
            g3_imprimirResultado(false, str);
            return;
        }

        int estado = 0;
        int n = str.length();
        int i = 0;

        while (i < n) {
            char c = str.charAt(i);

            switch (estado) {
                case 0: 
                    if (c == '1') {
                        estado = 1;
                    } else if (c == '0') {
                        estado = 2;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 1:
                    if (c != '1') {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 2:
                    if (c == '0') {
                    } else if (c == '1') {
                        estado = 3;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 3:
                    if (c != '1') {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                default:
                    g3_imprimirResultado(false, str);
                    return;
            }
            i++;
        }

        boolean result = (estado == 1 || estado == 2 || estado == 3);
        g3_imprimirResultado(result, str);
    }

    @Override
    public void g3_ValidarWithDoWhile(String str) {
        if (str.isEmpty()) {
            g3_imprimirResultado(false, str);
            return;
        }

        int estado = 0;
        int n = str.length();
        int i = 0;

        
        do {
            char c = str.charAt(i);

            switch (estado) {
                case 0: 
                    if (c == '1') {
                        estado = 1;
                    } else if (c == '0') {
                        estado = 2;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 1:
                    if (c != '1') {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 2:
                    if (c == '0') {
                    } else if (c == '1') {
                        estado = 3;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 3:
                    if (c != '1') {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                default:
                    g3_imprimirResultado(false, str);
                    return;
            }
            i++;
        } while (i < n);

        boolean result = (estado == 1 || estado == 2 || estado == 3);
        g3_imprimirResultado(result, str);
    }
}
