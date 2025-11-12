package pkSecciones.Seccion1;

public class ControllerSeccion1 {
    private SeriesNumericas serNum;

    public ControllerSeccion1(int numTerminos) { 
        serNum = new SeriesNumericas(numTerminos);
    }

    public void iniciarSeccion1() {
        System.out.print("[+] S1: ");
        serNum.g3_serieFibonacci();
        System.out.println();

        System.out.print("[+] S2: ");
        serNum.g3_serieAlternaConCeros();
        System.out.println();

        System.out.print("[+] S3: ");
        serNum.g3_serieFraccionesS3();
        System.out.println();

        System.out.print("[+] S4: ");
        serNum.g3_serieFraccionesS4();
        System.out.println();

        System.out.print("[+] S5: ");
        serNum.g3_seriePrimos();
        System.out.println();

        System.out.print("[+] S6: ");
        serNum.g3_serieCuadrados();
        System.out.println();

        System.out.print("[+] S7: ");
        serNum.g3_serieAritmeticaS7();
        System.out.println();

        System.out.print("[+] S8: ");
        serNum.g3_serieAritmeticaS8();
        System.out.println();

        System.out.print("[+] S9: ");
        serNum.g3_seriePotenciasDos();
        System.out.println();

        System.out.print("[+] S10: ");
        serNum.g3_seriePotenciasTres();
        System.out.println();

        System.out.print("[+] S11: ");
        serNum.g3_seriePoligonal();
        System.out.println();
    }
}


