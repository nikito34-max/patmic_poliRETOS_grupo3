package pkSecciones;

import java.util.InputMismatchException;
import java.util.Scanner;

import pkSecciones.Seccion1.ControllerSeccion1;
import pkSecciones.Seccion2.ControllerSeccion2;
import pkSecciones.Seccion3.ControllerSeccion3;
import pkSecciones.Seccion4.ControllerSeccion4;
import pkSecciones.Seccion5.ControllerSeccion5;
import pkSecciones.Seccion6.ControllerSeccion6;
import pkSecciones.Seccion7.ControllerSeccion7;
import pkSecciones.Seccion8.ControllerSeccion8;

public class ControllerSecciones {
    public void ejecutar() {

        System.out.println("Iniciando Proyecto PoliRETOS Grupo 3");
        System.out.println("\nIntegrantes:");
        System.out.println("muñoz.angelo\nortega.stefanie\nortega.nikolai\npaguay.fernando\npineda.danny");
        System.out.println("Antes de iniciar, ingresa los siguientes datos generales:");

        Scanner entrada = new Scanner(System.in);

        int num_terminos = 0;
        String frase = "";

        while (true) {
            try {
                System.out.print("Número de términos: ");
                num_terminos = entrada.nextInt();
                entrada.nextLine();
                if (num_terminos <= 0) {
                    System.out.println("El número debe ser mayor que 0. Intenta nuevamente.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero válido.");
                entrada.nextLine();
            }
        }

        System.out.print("Ingresa una frase: ");
        frase = entrada.nextLine();

        boolean salir = false;
        while (!salir) {
            System.out.println();
            System.out.println("Seleccione el módulo:");
            System.out.println("\t1 - Series Numéricas");
            System.out.println("\t2 - Series de Caracteres");
            System.out.println("\t3 - Figuras");
            System.out.println("\t4 - Cadena de Caracteres");
            System.out.println("\t5 - Arrays");
            System.out.println("\t6 - Loading");
            System.out.println("\t7 - Recursión");
            System.out.println("\t8 - Autómatas");
            System.out.println("\t9 - SALIR DEL PROGRAMA");
            System.out.print("> ");

            int opcion = -1;
            try {
                opcion = entrada.nextInt();
                entrada.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número entre 1 y 9.");
                entrada.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("=== SERIES NUMÉRICAS ===");
                    new ControllerSeccion1(num_terminos).iniciarSeccion1();
                    break;
                case 2:
                    System.out.println("=== SERIES DE CARACTERES ===");
                    new ControllerSeccion2(num_terminos).iniciarSeccion2();
                    break;
                case 3:
                    System.out.println("=== FIGURAS ===");
                    ControllerSeccion3 controller = new ControllerSeccion3();
                    controller.inicializarfiguras();
                    break;
                case 4:
                    System.out.println("=== CADENAS DE CARACTERES ===");
                    new ControllerSeccion4(frase, entrada);
                    break;
                case 5:
                    System.out.println("=== ARRAYS ===");
                    new ControllerSeccion5(entrada);
                    break;
                case 6:
                    new ControllerSeccion6();
                    break;
                case 7:
                    System.out.println("=== RECURSIÓN ===");
                    new ControllerSeccion7().g3_ejecutar();
                    break;
                case 8:
                    System.out.println("=== AUTÓMATAS ===");
                    new ControllerSeccion8().g3_ejecutar();
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Elige un número entre 1 y 9.");
                    break;
            }
        }

        System.out.println("\nProyecto Finalizado");
        entrada.close();
    }
}


