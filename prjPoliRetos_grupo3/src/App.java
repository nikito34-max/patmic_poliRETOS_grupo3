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
        //Agregar mas(o modificar) de ser necesario








        
        // new ControllerSeccion1();
        // new ControllerSeccion2();
        // new ControllerSeccion3();
        new ControllerSeccion4(frase, entrada);
        // new ControllerSeccion5();
        // new ControllerSeccion6();
        // new ControllerSeccion7();
        // new ControllerSeccion8();
        






        
        System.out.println("\nProyecto Finalizado");
        entrada.close();
    }
}
