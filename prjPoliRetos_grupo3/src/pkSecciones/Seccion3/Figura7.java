package pkSecciones.Seccion3;

public class Figura7 extends FigurasM {
   
    public Figura7() {
        this.nombre = "Figura7";
    }
    @Override
    public void dibujar_con_for(int numerodepalitos) {
        for (int i = 0; i < numerodepalitos; i++) {
            for (int j = 0; j < numerodepalitos; j++) {
                if (j == i && j % 2 == 0) {
                    System.out.print(simbolo2 + " ");
                } else if (j == i && j % 2 != 0) {
                    System.out.print(simbolo3 + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
 @Override
  public void dibujar_con_do_while (int totaldibujo){
     int i=0;
     if (totaldibujo>0){
    do {
       int j=0;
       int numEspacios=i;

       while (j <(numEspacios) ) { 
            System.out.print("  ");
            j++; }
            
        if (j == i && j % 2 == 0)
        System.out.print( simbolo2 + " ");
        else System.out.print( simbolo3);
       System.out.println();
       i++;
     } while (i < totaldibujo);
    }
   }
  @Override
 public void dibujar_con_while(int totaldibujo) {
    int i=0;
    while (i<totaldibujo){
        int j=0;
        int numEspacios =i; 
        while (j<numEspacios) {
        System.out.print("  ");
        j++;
         }     
      if (j == i && j % 2 == 0)
        System.out.print( simbolo2 + " ");
        else System.out.print( simbolo3);
    
       System.out.println();
       i++;
     } 
   }
}






