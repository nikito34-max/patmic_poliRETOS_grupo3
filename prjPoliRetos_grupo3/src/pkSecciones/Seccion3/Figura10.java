package pkSecciones.Seccion3;

public class Figura10 extends FigurasM {
    public Figura10() {
        super();
        this.nombre = "Figura10";
    }
    @Override 
    public void dibujar_con_for(int altura) {
        int PASO=4;
    for (int i=0; i<altura; i++){
        String simboloCentral;
        if (i % 2 == 0) {
            simboloCentral = simbolo4; 
        } else {
            simboloCentral = simbolo5; 
        }
        String linea = "_ " + simboloCentral + " _"; 
        
        int desplazamiento = i * PASO;
     for (int k=0;k< desplazamiento;k++){
             System.out.print(" ");
     } 
       System.out.println(linea); 
        int desplazamientoPalo = desplazamiento + PASO ;
        for (int t=0;t< desplazamientoPalo;t++){
             System.out.print(" ");
     } 
       System.out.println(simbolo3); 
    }
    }

    @Override
  public void dibujar_con_do_while(int altura){
    if (altura < 1) return;
    int PASO = 4; 
    int i = 0; 
    do {
        String simboloCentral;
        if (i % 2 == 0) {
            simboloCentral = simbolo4; 
        } else {
            simboloCentral = simbolo5; 
        }
        String linea = "_ " + simboloCentral + " _"; 
        
        int desplazamiento = i * PASO;
          int k=0;
          do {
        System.out.print(" ");
            k++;
          } while (k< desplazamiento);
       
        System.out.println(linea); 

            if (i < altura - 1) {
         
        int desplazamientoPalo = desplazamiento + PASO ;

         int t=0;
          do {
        System.out.print(" ");
            t++;
          } while (t< desplazamientoPalo);
         System.out.println(simbolo3); 
      }
     i++;
    }while (i < altura);
  }

  @Override
public void dibujar_con_while(int altura){
    if (altura < 1) return;
    int PASO = 4; 
      int i = 0; 
      while (i < altura) { 
        String simboloCentral;
          if (i % 2 == 0) {
            simboloCentral = simbolo4; 
        } else {
            simboloCentral = simbolo5; 
        }
        String linea = "_ " + simboloCentral + " _"; 
        
        int desplazamiento = i * PASO;
        
         int k = 0;
        while (k < desplazamiento) {
            System.out.print(" ");
            k++;
        }
        
         System.out.println(linea); 

          if (i < altura - 1) {
            
        int desplazamientoPalo = desplazamiento + PASO;
            
            int t = 0;
            while (t < desplazamientoPalo) {
                System.out.print(" ");
                t++;
            }
            System.out.println(simbolo3); 
        }
        
        i++; 
    }
  }
}
    
