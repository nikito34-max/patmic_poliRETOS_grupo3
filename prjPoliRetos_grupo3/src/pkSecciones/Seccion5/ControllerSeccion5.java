package pkSecciones.Seccion5;
import java.util.Scanner;
public class ControllerSeccion5 {
    private SeccionArrays secArr;
    public ControllerSeccion5(Scanner entrada) {
        secArr = new SeccionArrays();
        secArr.g3_CargaNombre(entrada);
    }
}

