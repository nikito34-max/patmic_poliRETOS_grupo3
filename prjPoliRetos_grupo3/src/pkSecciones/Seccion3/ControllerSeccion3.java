package pkSecciones.seccion3;
import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.List;

 public class ControllerSeccion3 { 

     public void inicializarfiguras () {
        Scanner sas = new Scanner(System.in);
        
     List<FigurasM> figuras = new ArrayList<FigurasM>();
        
        figuras.add(new Figura1());
        figuras.add(new Figura2());
        figuras.add (new figura3());
        figuras.add(new Figura4());
        figuras.add(new Figura5());
        figuras.add (new Figura6());
        figuras.add(new Figura7());
        figuras.add(new Figura8());
        figuras.add (new Figura9());
        figuras.add(new Figura10());
        figuras.add(new Figura11());
        figuras.add (new figura12());
        figuras.add(new Figura13());
        figuras.add(new Figura14());
        figuras.add (new Figura15());
        figuras.add(new Figura16());
        figuras.add(new Figura17());
        figuras.add (new Figura18());
        figuras.add(new Figura19 ());
        
      List<Integer> tamanos = new ArrayList<>();
  
        for (int i = 0; i < figuras.size(); i++) {
            String nombreFigura = figuras.get(i).getClass().getSimpleName();
            int tamanoladoValido = 0; 
            do {
                System.out.print("Ingrese el tamaño del lado de la " + nombreFigura + " (Mínimo 2): ");
                
                if (sas.hasNextInt()) {
                    int entradaActual = sas.nextInt();
                    
                    if (entradaActual >= 2) {
                        tamanoladoValido = entradaActual;
                        tamanos.add(tamanoladoValido);
                        break; 
                    } else {
                        System.out.println("ERROR: El tamaño debe ser al menos 2 para dibujar.");
                    }
                } else {
                    System.out.println("ERROR: Entrada no válida. Por favor, ingrese un número entero.");
                    sas.next(); 
            }
           }while (true); 
            
           
            System.out.println("...........................");
            System.out.println("Dibujando " + nombreFigura + ":"); 
            
            System.out.println("  Dibujada con for:");
            figuras.get(i).dibujar_con_for(tamanoladoValido);
            
            System.out.println("............................."); 
            System.out.println("  Dibujada con do-while:");
            figuras.get(i).dibujar_con_do_while(tamanoladoValido); 
            
            System.out.println(".............................");
            System.out.println("  Dibujada con while:");
            figuras.get(i).dibujar_con_while(tamanoladoValido);   
    }
   }
}
 







 



   


