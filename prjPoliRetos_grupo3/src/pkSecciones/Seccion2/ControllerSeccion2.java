package pkSecciones.Seccion2;
public class ControllerSeccion2 {
    private static SeriesCaracteres serCar;

    public ControllerSeccion2(int numTerminos) {
        serCar = new SeriesCaracteres(numTerminos);
    }

    public void iniciarSeccion2() {
        System.out.print("[+]S1: ");
        serCar.g3_serieSignoAlterno();
        System.out.println();

        System.out.print("[+]S2:");
        serCar.g3_serieMasFibonacci();
        System.out.println();

        System.out.print("[+]S3: ");
        serCar.g3_serieMasDos();
        System.out.println();

        System.out.print("[+]S4: ");
        serCar.g3_serieOperador();
        System.out.println();

        System.out.print("[+]S5: ");
        serCar.g3_serieCaracterPalo();
        System.out.println();

        System.out.print("[+]S6: ");
        serCar.g3_serieLetra();
        System.out.println();

        System.out.print("[+]S7: ");
        serCar.g3_serieLetraSigno();
        System.out.println();

        System.out.print("[+]S8: ");
        serCar.g3_serieLetraCreciente();
        System.out.println();

        System.out.print("[+]S9: ");
        serCar.g3_serieLetraPatron();
        System.out.println();

        System.out.print("[+]S10: ");
        serCar.g3_serieFibonacciCaracter();
        System.out.println();
    }
}

