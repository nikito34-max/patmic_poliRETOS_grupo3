package pkSecciones.seccion8;

public class Automata01 extends Automata {
    public Automata01() {
        setDescription("Automata para validar: a*b+c");
    }

    @Override
    public void g3_ValidarWithFor(String str) {
        boolean result = false;
        if (str.isEmpty()) {
            g3_imprimirResultado(result, str);
            return;
        }

        int estado = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);

            switch (estado) {
                case 0:
                    if (c == 'a') {
                    } else if (c == 'b') {
                        estado = 1;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 1:
                    if (c == 'b') {
                    } else if (c == 'c') {
                        if (i != n - 1) {
                            g3_imprimirResultado(false, str);
                            return;
                        }
                        estado = 2;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 2:
                    g3_imprimirResultado(false, str);
                    return;

                default:
                    g3_imprimirResultado(false, str);
                    return;
            }
        }

        result = estado == 2;
        g3_imprimirResultado(result, str);
    }

    @Override
    public void g3_ValidarWithWhile(String str) {
        boolean result = false;
        if (str.isEmpty()) {
            g3_imprimirResultado(result, str);
            return;
        }

        int estado = 0;
        int n = str.length();
        int i = 0;

        while (i < n) {
            char c = str.charAt(i);

            switch (estado) {
                case 0:
                    if (c == 'a') {
                    } else if (c == 'b') {
                        estado = 1;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 1:
                    if (c == 'b') {
                    } else if (c == 'c') {
                        if (i != n - 1) {
                            g3_imprimirResultado(false, str);
                            return;
                        }
                        estado = 2;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 2:
                    g3_imprimirResultado(false, str);
                    return;

                default:
                    g3_imprimirResultado(false, str);
                    return;
            }
            i++;
        }

        result = estado == 2;
        g3_imprimirResultado(result, str);
    }

    @Override
    public void g3_ValidarWithDoWhile(String str) {
        boolean result = false;
        if (str.isEmpty()) {
            g3_imprimirResultado(result, str);
            return;
        }

        int estado = 0;
        int n = str.length();
        int i = 0;

        do {
            char c = str.charAt(i);

            switch (estado) {
                case 0:
                    if (c == 'a') {
                    } else if (c == 'b') {
                        estado = 1;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 1:
                    if (c == 'b') {
                    } else if (c == 'c') {
                        if (i != n - 1) {
                            g3_imprimirResultado(false, str);
                            return;
                        }
                        estado = 2;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 2:
                    g3_imprimirResultado(false, str);
                    return;

                default:
                    g3_imprimirResultado(false, str);
                    return;
            }
            i++;
        } while (i < n);

        result = estado == 2;
        g3_imprimirResultado(result, str);
    }
}