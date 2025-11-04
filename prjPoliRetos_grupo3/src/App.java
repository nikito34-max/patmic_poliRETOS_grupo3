import java.util.Scanner;

import pkSecciones.Seccion1.ControllerSeccion1;
import pkSecciones.Seccion2.ControllerSeccion2;
import pkSecciones.Seccion3.ControllerSeccion3;
import pkSecciones.Seccion4.ControllerSeccion4;
import pkSecciones.Seccion5.ControllerSeccion5;
import pkSecciones.Seccion6.ControllerSeccion6;
import pkSecciones.Seccion7.ControllerSeccion7;
import pkSecciones.Seccion8.ControllerSeccion8;

public class App {
    public static void main(String[] args) {

        System.out.println("Iniciando Proyecto PoliRETOS Grupo 3");
        System.out.println("\nIntegrantes:\nmuñoz.angelo\nortega.stefanie\nortega.nikolai\npaguay.fernando\npineda.danny\nAntes de iniciar, ingresa los siguientes datos generales:");
     
        //Solo parametros generales, que se usen para dos o mas ejercicios, para las demas usen el parametro Scanner entrada definido a continuación
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero de términos: "); //series numericas y caracteres
        int num_terminos = entrada.nextInt();
        System.out.print("Tamaño: ");       //figuras 
        int tamanio = entrada.nextInt();
        System.out.print("Niveles: ");      //figuras(triangulares, creo)
        int niveles = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingresa una frase: ");  //cadena de caracteres
        String frase = entrada.nextLine();
        
        //Agregar mas de ser necesario
        System.out.println();
        System.out.println("Seleccione el módulo:");
        System.out.println("\t1 - Series Numericas");
        System.out.println("\t2 - Series de Caracteres");
        System.out.println("\t3 - Figuras");
        System.out.println("\t4 - Cadena de Caracteres");
        System.out.println("\t5 - Arrays");
        System.out.println("\t6 - Loading");
        System.out.println("\t7 - Recursion");
        System.out.println("\t8 - Automatas");
        System.out.print("> ");
        int opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("=== SERIES NUMERICAS ===");
                 new ControllerSeccion1(num_terminos).iniciarSeccion1();
                break;
            case 2:
                System.out.println("=== SERIES DE CARACTERES ===");
                new ControllerSeccion2(num_terminos).iniciarSeccion2();
                break;
            case 3:
                new ControllerSeccion3();
                break;
            case 4:
            new ControllerSeccion4(frase, entrada);
                break;
            case 5:
                new ControllerSeccion5();
                break;
            case 6:
                new ControllerSeccion6();
                break;
            case 7:
                new ControllerSeccion7().g3_ejecutar();
                break;
            case 8:
                new ControllerSeccion8().g3_ejecutar();
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        System.out.println("\nProyecto Finalizado");
        entrada.close();
    }
}

