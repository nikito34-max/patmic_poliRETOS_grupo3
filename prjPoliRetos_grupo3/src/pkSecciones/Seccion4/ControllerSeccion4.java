package pkSecciones.Seccion4;

import java.util.Scanner;

public class ControllerSeccion4 {
    public ControllerSeccion4(String frase, Scanner entrada) {
        C01 c01 = new C01();
        c01.g3_contarVocalesShowFor(frase);
        c01.g3_contarVocalesShowWhile(frase);
        c01.g3_contarVocalesShowDoWhile(frase);

        C02 c02 = new C02();
        c02.g3_contarConsonantesShowFor(frase);
        c02.g3_contarConsonantesShowWhile(frase);
        c02.g3_contarConsonantesShowDoWhile(frase);

        C03 c03 = new C03();
        c03.g3_eliminarVocalShowFor(frase, entrada);
        c03.g3_eliminarVocalShowWhile(frase, entrada);
        c03.g3_eliminarVocalShowDoWhile(frase, entrada);

        C04 c04 = new C04();
        c04.g3_eliminarLetraShowFor(frase, entrada);
        c04.g3_eliminarLetraShowWhile(frase, entrada);
        c04.g3_eliminarLetraShowDoWhile(frase, entrada);

        C05 c05 = new C05();
        c05.g3_invertidaMayusVocalesShowFor(frase);
        c05.g3_invertidaMayusVocalesShowWhile(frase);
        c05.g3_invertidaMayusVocalesShowDoWhile(frase);

        C06 c06 = new C06();
        c06.g3_invertidaMayusConsonantesShowFor(frase);
        c06.g3_invertidaMayusConsonantesShowWhile(frase);
        c06.g3_invertidaMayusConsonantesShowDoWhile(frase);

        C07 c07 = new C07();
        c07.g3_mayusSinJShowFor(frase);
        c07.g3_mayusSinJShowWhile(frase);
        c07.g3_mayusSinJShowDoWhile(frase);

        C08 c08 = new C08();
        c08.g3_anagramaShowFor(entrada);
        c08.g3_anagramaShowWhile(entrada);
        c08.g3_anagramaShowDoWhile(entrada);

        C09 c09 = new C09();
        c09.g3_alternarMayusMinusShowFor(frase);
        c09.g3_alternarMayusMinusShowWhile(frase);
        c09.g3_alternarMayusMinusShowDoWhile(frase);
    }
}
