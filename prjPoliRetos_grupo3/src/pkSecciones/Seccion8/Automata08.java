package pkSecciones.Seccion8;

public class Automata08 extends Automata {
    public Automata08() {
        setDescription("Validador de clave");
    }

    private void g3_imprimirResultadoClave(
        boolean valido, String str,
        boolean tieneMayuscula, boolean tieneMinuscula,
        boolean tieneNumero, boolean tieneEspecial) {
        if (!valido) {
            System.out.printf("%s no es válido porque:%n", str);
            if (!tieneMayuscula) System.out.println("- Le falta al menos una letra mayúscula");
            if (!tieneMinuscula) System.out.println("- Le falta al menos una letra minúscula");
            if (!tieneNumero) System.out.println("- Le falta al menos un número");
            if (!tieneEspecial) System.out.println("- Le falta al menos un carácter especial (@, #, $, %, !, etc.)");
        } else {
            System.out.printf("%s es válido%n", str);
        }
    }


    @Override
    public void g3_ValidarWithFor(String str) {
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean digito = false;
        boolean especial = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                mayuscula = true;
            }
            if (Character.isLowerCase(c)) {
                minuscula = true;
            }
            if (Character.isDigit(c)) {
                digito = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                especial = true;
            }
        }

        boolean valido = mayuscula && minuscula && digito && especial;
        g3_imprimirResultadoClave(valido, str, mayuscula, minuscula, digito, especial);    
    }

    @Override
    public void g3_ValidarWithWhile(String str) {
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean digito = false;
        boolean especial = false;

        String especialesPermitidos = "@#$%&/*-_+=!?.;,:()[]{}<>|\\^";

        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                mayuscula = true;
            }
            if (Character.isLowerCase(c)) {
                minuscula = true;
            }
            if (Character.isDigit(c)) {
                digito = true;
            }
            if (especialesPermitidos.indexOf(c) >= 0) {
                especial = true;
            }

            i++;
        }

        boolean valido = mayuscula && minuscula && digito && especial;
        g3_imprimirResultadoClave(valido, str, mayuscula, minuscula, digito, especial);    

    }

    @Override
    public void g3_ValidarWithDoWhile(String str) {
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean digito = false;
        boolean especial = false;

        int i = 0;
        if (!str.isEmpty()) {
            do {
                char c = str.charAt(i);

                if (Character.isUpperCase(c)) {
                    mayuscula = true;
                }
                if (Character.isLowerCase(c)) {
                    minuscula = true;
                }
                if (Character.isDigit(c)) {
                    digito = true;
                }
                if (!Character.isLetterOrDigit(c)) {
                    especial = true;
                }

                i++;
            } while (i < str.length());
        }

        boolean valido = mayuscula && minuscula && digito && especial;
        g3_imprimirResultadoClave(valido, str, mayuscula, minuscula, digito, especial);    

    }
}
