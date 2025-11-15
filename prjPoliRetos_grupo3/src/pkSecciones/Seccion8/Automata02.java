package pkSecciones.seccion8;

public class Automata02 extends Automata {
    public Automata02() {
        setDescription("Automata para validar: ab+ca");
    }

    @Override
    public void g3_ValidarWithFor(String str) {
        if (str.isEmpty()) {
            g3_imprimirResultado(false, str);
            return;
        }

        int estado = 0;
        int n = str.length();
        int countB = 0;

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);

            switch (estado) {
                case 0: 
                    if (c == 'a') {
                        estado = 1;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 1: 
                    if (c == 'b') {
                        countB++;
                    } else if (c == 'c') {
                        if (countB == 0) { 
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
                    if (c == 'a') {
                        estado = 3;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 3:
                    g3_imprimirResultado(false, str);
                    return;

                default:
                    g3_imprimirResultado(false, str);
                    return;
            }
        }

        boolean result = estado == 3;
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
        int countB = 0;
        int i = 0;

        while (i < n) {
            char c = str.charAt(i);

            switch (estado) {
                case 0: 
                    if (c == 'a') {
                        estado = 1;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 1: 
                    if (c == 'b') {
                        countB++;
                    } else if (c == 'c') {
                        if (countB == 0) { 
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
                    if (c == 'a') {
                        estado = 3; 
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 3: 
                    g3_imprimirResultado(false, str);
                    return;

                default:
                    g3_imprimirResultado(false, str);
                    return;
            }
            i++;
        }

        boolean result = estado == 3;
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
        int countB = 0;
        int i = 0;

        do {
            char c = str.charAt(i);

            switch (estado) {
                case 0: 
                    if (c == 'a') {
                        estado = 1;
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 1: 
                    if (c == 'b') {
                        countB++;
                    } else if (c == 'c') {
                        if (countB == 0) { 
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
                    if (c == 'a') {
                        estado = 3; 
                    } else {
                        g3_imprimirResultado(false, str);
                        return;
                    }
                    break;

                case 3: 
                    g3_imprimirResultado(false, str);
                    return;

                default:
                    g3_imprimirResultado(false, str);
                    return;
            }
            i++;
        } while (i < n);

        boolean result = estado == 3;
        g3_imprimirResultado(result, str);
    }

}
