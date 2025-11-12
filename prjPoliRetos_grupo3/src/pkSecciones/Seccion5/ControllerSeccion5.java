package pkSecciones.Seccion5;

import java.util.Scanner;

public class ControllerSeccion5 {
    public ControllerSeccion5(Scanner entrada) {
        System.out.println("\n=== A01) Mostrar nombre con barra de carga ===");
        A01 a01 = new A01();
        a01.g3_CargaNombreShowFor(entrada);
        a01.g3_CargaNombreShowWhile(entrada);
        a01.g3_CargaNombreShowDoWhile(entrada);

        System.out.println("\n=== A02) Dibujar iniciales N y O ===");
        A02 a02 = new A02();
        a02.g3_matrizInicialesShowFor(entrada);
        a02.g3_matrizInicialesShowWhile(entrada);
        a02.g3_matrizInicialesShowDoWhile(entrada);

        System.out.println("\n=== A03) Plano con f(x)=2x y nombre ===");
        A03 a03 = new A03();
        a03.g3_planoFuncionNombreShowFor();
        a03.g3_planoFuncionNombreShowWhile();
        a03.g3_planoFuncionNombreShowDoWhile();

        System.out.println("\n=== A04) Matriz en forma de X ===");
        A04 a04 = new A04();
        a04.g3_crearMatrizXShowFor();
        a04.g3_crearMatrizXShowWhile();
        a04.g3_crearMatrizXShowDoWhile();

        System.out.println("\n=== A05) Matriz cuadrada aleatoria del nombre ===");
        A05 a05 = new A05();
        a05.g3_matrizCuadradaNombreShowFor();
        a05.g3_matrizCuadradaNombreShowWhile();
        a05.g3_matrizCuadradaNombreShowDoWhile();

        System.out.println("\n=== FIN DE LA SECCIÓN 5 ===");
    }
}


