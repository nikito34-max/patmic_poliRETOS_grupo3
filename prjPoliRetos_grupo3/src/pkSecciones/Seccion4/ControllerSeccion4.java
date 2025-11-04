package pkSecciones.Seccion4;
import java.util.Scanner;
public class ControllerSeccion4 {
    private CadenaCaracteres cadCar;
    /**
     * Ejecución de métodos mediante constructor
     * @param frase frase ingresada por el usuario
     * @param vocal vocal ingresada por el usuario
     * @param letra letra ingresada por el usuario
     * @param entrada Scanner para adivinanza por parte del usuario
     */
    public ControllerSeccion4(String frase, Scanner entrada) {
        cadCar = new CadenaCaracteres();
        cadCar.g3_contarVocales(frase);
        cadCar.g3_contarConsonantes(frase);
        cadCar.g3_eliminarVocal(frase, entrada);
        cadCar.g3_eliminarLetra(frase, entrada);
        cadCar.g3_invertidaMayusVocales(frase);
        cadCar.g3_invertidaMayusConsonantes(frase);
        cadCar.g3_mayusSinJ(frase);
        cadCar.g3_anagrama(entrada);
        cadCar.g3_alternarMayusMinus(frase);
    }
}
