package pkSecciones.Seccion1;
public class SeriesNumericas {
    private static int numTerminos;

    public SeriesNumericas(int numTerminos) {
        this.numTerminos = numTerminos;
    }

    public static void g3_serieFibonacci() {
        int a = 0, b = 1;
        for (int i = 0; i < numTerminos; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void g3_serieAlternaConCeros() {
        for (int i = 1; i <= numTerminos; i++) {
            System.out.print((i % 2 != 0) ? (i + " ") : "0 ");
        }
    }

    public static void g3_serieFraccionesS3() {
        int a = 0, b = 1;
        for (int i = 1; i <= numTerminos; i++) {
            int fib = a;
            int denom = 2*i-1;
            System.out.print(fib + "/" + denom + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void g3_serieFraccionesS4() {
        int a = 0, b = 1;
        for (int i = 0; i < numTerminos; i++) {
            int fib = a;
            int denom = 2 * (i + 1);
            System.out.print(fib + "/" + denom + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void g3_seriePrimos() {
        int count = 0, num = 2;
        while (count < numTerminos) {
            if (g3_esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }


    public static void g3_serieCuadrados() {
        for (int i = 1; i <= numTerminos; i++) {
            System.out.print((i * i) + " ");
        }
    }

    public static void g3_serieAritmeticaS7() {
        int valor = 1;
        for (int i = 1; i <= numTerminos; i++) {
            System.out.print(valor + " ");
            valor += 3;
        }
    }

    public static void g3_serieAritmeticaS8() {
        int valor = 3 ;
        for (int i = 0; i < numTerminos; i++) {
            System.out.print(valor + " ");
            valor += 5;
        }
    }

    public static void g3_seriePotenciasDos() {
        int valor = 2;
        for (int i = 0; i < numTerminos; i++) {
            System.out.print(valor + " ");
            valor *= 2;
        }
    }

    public static void g3_seriePotenciasTres() {
        int valor = 3;
        for (int i = 0; i < numTerminos; i++) {
            System.out.print(valor + " ");
            valor *= 3;
        }
    }

    public static void g3_seriePoligonal() {
        for (int i = 1; i <= numTerminos; i++) {
            System.out.print((i * (i + 1)) + " ");
        }
    }
    public static boolean g3_esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
