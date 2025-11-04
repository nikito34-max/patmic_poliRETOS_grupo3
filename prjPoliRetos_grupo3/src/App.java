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
        System.out.println("\nIntegrantes:\nmuñoz.angelo\nortega.stefanie\nortega.nikolai\npaguay.fernando\npineda.danny\nAntes de iniciar, ingresa los siguientes datos:");
     
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero de términos: ");
        int num_terminos = entrada.nextInt();
        System.out.print("Numero de niveles: ");
        int niveles = entrada.nextInt();
        System.out.print("ancho: ");
        int ancho = entrada.nextInt();
        System.out.print("largo: ");
        int largo = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingresa un caracter: ");
        char caracter = entrada.next().charAt(0);
        entrada.nextLine();
        System.out.print("Ingresa una frase: ");
        String frase = entrada.nextLine();
        System.out.print("Ingresa una vocal (A eliminar en la frase): ");
        char vocal = entrada.next().charAt(0);
        System.out.print("Ingresa una letra (A eliminar en la frase): ");
        char letra = entrada.next().charAt(0);
        entrada.nextLine();
        System.out.print("Tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Tu apellido: ");
        String apellido = entrada.nextLine();
        //Agregar mas de ser necesario








        
        // new ControllerSeccion1();
        // new ControllerSeccion2();
        // new ControllerSeccion3();
        new ControllerSeccion4(frase, vocal, letra, entrada);
        // new ControllerSeccion5();
        // new ControllerSeccion6();
        // new ControllerSeccion7();
        // new ControllerSeccion8();
        






        
        System.out.println("\nProyecto Finalizado");
        entrada.close();
    }
}
