package pkSecciones.Seccion8;

public class Automata05 extends Automata {
    public Automata05() {
        setDescription("Validar si un numero es decimal");
    }

    @Override
    public void g3_ValidarWithFor(String str) {
        if (str.isEmpty()) {
            g3_imprimirResultado(false, str);
            return;
        }

        int estado = 0;
        boolean valido = true;
        boolean digitoAntes = false;
        boolean digitoDespues = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            switch (estado) {
                case 0:
                    if (Character.isDigit(c)) {
                        digitoAntes = true;
                        estado = 1;
                    } else if (c == '.') {
                        estado = 2;
                    } else {
                        valido = false;
                        estado = 4;
                    }
                    break;

                case 1:
                    if (Character.isDigit(c)) {
                        digitoAntes = true;
                    } else if (c == '.') {
                        estado = 2;
                    } else {
                        valido = false;
                        estado = 4;
                    }
                    break;

                case 2:
                    if (Character.isDigit(c)) {
                        digitoDespues = true;
                        estado = 3;
                    } else {
                        valido = false;
                        estado = 4;
                    }
                    break;

                case 3:
                    if (Character.isDigit(c)) {
                        digitoDespues = true;
                    } else {
                        valido = false;
                        estado = 4;
                    }
                    break;

                case 4:
                    valido = false;
                    break;

                default:
                    valido = false;
            }

            if (!valido) break;
        }

        valido = (estado == 2 && digitoAntes) || (estado == 3 && (digitoAntes || digitoDespues));

        g3_imprimirResultado(valido, str);
    }


    @Override
    public void g3_ValidarWithWhile(String str) {
        if (str.isEmpty()) {
            g3_imprimirResultado(false, str);
            return;
        }

        int estado = 0;
        boolean valido = true;
        boolean digitoAntes = false;
        boolean digitoDespues = false;
        int i = 0;

        while (i < str.length()) {
            char c = str.charAt(i);

            switch (estado) {
                case 0:
                    if (Character.isDigit(c)) {
                        digitoAntes = true;
                        estado = 1;
                    } else if (c == '.') {
                        estado = 2;
                    } else {
                        valido = false;
                        estado = 4;
                    }
                    break;

                case 1:
                    if (Character.isDigit(c)) {
                        digitoAntes = true;
                    } else if (c == '.') {
                        estado = 2;
                    } else {
                        valido = false;
                        estado = 4;
                    }
                    break;

                case 2:
                    if (Character.isDigit(c)) {
                        digitoDespues = true;
                        estado = 3;
                    } else {
                        valido = false;
                        estado = 4;
                    }
                    break;

                case 3:
                    if (Character.isDigit(c)) {
                        digitoDespues = true;
                    } else {
                        valido = false;
                        estado = 4;
                    }
                    break;

                case 4:
                    valido = false;
                    break;

                default:
                    valido = false;
            }

            if (!valido) break;
            i++;
        }

        valido = (estado == 2 && digitoAntes) || (estado == 3 && (digitoAntes || digitoDespues));

        g3_imprimirResultado(valido, str);
    }

    @Override
    public void g3_ValidarWithDoWhile(String str) {
        if (str.isEmpty()) {
            g3_imprimirResultado(false, str);
            return;
        }

        int estado = 0;
        boolean valido = true;
        boolean digitoAntes = false;
        boolean digitoDespues = false;
        int i = 0;

        do {
            char c = str.charAt(i);

            switch (estado) {
                case 0:
                    if (Character.isDigit(c)) {
                        digitoAntes = true;
                        estado = 1;
                    } else if (c == '.') {
                        estado = 2;
                    } else {
                        valido = false;
                        estado = 4;
                    }
                    break;

                case 1:
                    if (Character.isDigit(c)) {
                        digitoAntes = true;
                    } else if (c == '.') {
                        estado = 2;
                    } else {
                        valido = false;
                        estado = 4;
                    }
                    break;

                case 2:
                    if (Character.isDigit(c)) {
                        digitoDespues = true;
                        estado = 3;
                    } else {
                        valido = false;
                        estado = 4;
                    }
                    break;

                case 3:
                    if (Character.isDigit(c)) {
                        digitoDespues = true;
                    } else {
                        valido = false;
                        estado = 4;
                    }
                    break;

                case 4:
                    valido = false;
                    break;

                default:
                    valido = false;
            }

            if (!valido) break;
            i++;
        } while (i < str.length());

        valido = (estado == 2 && digitoAntes) || (estado == 3 && (digitoAntes || digitoDespues));

        g3_imprimirResultado(valido, str);
    }
}
