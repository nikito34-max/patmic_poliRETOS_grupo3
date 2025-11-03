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

        System.out.println("Iniciando Proyecto PoliRETOS Grupo 3 \n");
        System.out.println("patmic_poliRETOS por parte del Grupo 3\nIntegrantes:\nmuñoz.angelo\nortega.stefanie\nortega.nikolai\npaguay.fernando\npineda.danny\nAntes de iniciar, ingresa los siguientes datos:");
     
        Scanner entrada = new Scanner(System.in);
        System.out.println("patmic_poliRETOS por parte del Grupo 3\nIntegrantes:\nmuñoz.angelo\nortega.stefanie\nortega.nikolai\npaguay.fernando\npineda.danny\nAntes de iniciar, ingresa los siguientes datos:");
        System.out.print("Numero de términos: ");
        int num_terminos = entrada.nextInt();
        System.out.print("Numero de niveles: ");
        int niveles = entrada.nextInt();
        System.out.print("ancho: ");
        int ancho = entrada.nextInt();
        System.out.print("largo: ");
        int largo = entrada.nextInt();
        System.out.print("Ingresa un caracter: ");
        char caracter = entrada.next().charAt(0);
        System.out.print("Ingresa una frase: ");
        String frase = entrada.nextLine();
        entrada.nextLine();
        System.out.print("Tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Tu apellido: ");
        String apellido = entrada.nextLine();
        //Agregar mas de ser necesario















        new ControllerSeccion1(num_terminos); //por ejemplo
        new ControllerSeccion2();
        new ControllerSeccion3();
        new ControllerSeccion4();     //Agregar los parametros necesarios, tanto aqui como en el constructor del Controller, donde estaran sus metodos.
        new ControllerSeccion5();
        new ControllerSeccion6();
        new ControllerSeccion7();
        new ControllerSeccion8();

        System.out.println("\nProyecto Finalizado");
    }
}
