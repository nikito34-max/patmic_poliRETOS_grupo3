package pkSecciones.Seccion5;

import java.util.Scanner;

public class ControllerSeccion5 {
    public ControllerSeccion5(Scanner entrada) {
        int opcion = -1;
        while (opcion != 6) {
            System.out.println("\n=== MENÚ SECCIÓN 5 ===");
            System.out.println("1) Mostrar nombre con barra de carga");
            System.out.println("2) Dibujar iniciales N y O");
            System.out.println("3) Plano con f(x)=2x y nombre");
            System.out.println("4) Matriz en forma de X");
            System.out.println("5) Matriz cuadrada aleatoria del nombre");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opción (1-6): ");

            while (true) {
                if (!entrada.hasNextInt()) {
                    System.out.print("Debe ingresar un número entre 1 y 6: ");
                    entrada.next();
                    continue;
                }
                opcion = entrada.nextInt();
                if (opcion < 1 || opcion > 6) {
                    System.out.print("Opción fuera de rango. Ingrese un número entre 1 y 6: ");
                    continue;
                }
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n=== A01) Mostrar nombre con barra de carga ===");
                    A01 a01 = new A01();
                    a01.g3_CargaNombreShowFor(entrada);
                    a01.g3_CargaNombreShowWhile(entrada);
                    a01.g3_CargaNombreShowDoWhile(entrada);
                    break;
                case 2:
                    System.out.println("\n=== A02) Dibujar iniciales N y O ===");
                    A02 a02 = new A02();
                    a02.g3_matrizInicialesShowFor(entrada);
                    a02.g3_matrizInicialesShowWhile(entrada);
                    a02.g3_matrizInicialesShowDoWhile(entrada);
                    break;
                case 3:
                    System.out.println("\n=== A03) Plano con f(x)=2x y nombre ===");
                    A03 a03 = new A03();
                    a03.g3_planoFuncionNombreShowFor();
                    a03.g3_planoFuncionNombreShowWhile();
                    a03.g3_planoFuncionNombreShowDoWhile();
                    break;
                case 4:
                    System.out.println("\n=== A04) Matriz en forma de X ===");
                    A04 a04 = new A04();
                    a04.g3_crearMatrizXShowFor();
                    a04.g3_crearMatrizXShowWhile();
                    a04.g3_crearMatrizXShowDoWhile();
                    break;
                case 5:
                    System.out.println("\n=== A05) Matriz cuadrada aleatoria del nombre ===");
                    A05 a05 = new A05();
                    a05.g3_matrizCuadradaNombreShowFor();
                    a05.g3_matrizCuadradaNombreShowWhile();
                    a05.g3_matrizCuadradaNombreShowDoWhile();
                    break;
                case 6:
                    System.out.println("\n=== FIN DE LA SECCIÓN 5 ===");
                    break;
            }
        }
    }
}



