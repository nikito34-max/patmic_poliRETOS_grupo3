package pkSecciones.Seccion3;
import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.List;

 public class ControllerSeccion3 { 

     public void inicializarfiguras () {
        Scanner scanner = new Scanner(System.in);
        
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
            System.out.print("Ingrese el tamaño del lado de la " +  nombreFigura +" " );
            tamanos.add(scanner.nextInt());
           System.out.println("...........................");
            System.out.println( nombreFigura); 
           figuras.get(i).dibujar_con_for(tamanos.get(i));
           System.out.println("............................."); 
           figuras.get(i).dibujar_con_do_while(tamanos.get(i)); 
           System.out.println(".............................");
           figuras.get(i).dibujar_con_while(tamanos.get(i));
        }
        
        scanner.close();
    }
  }


   


