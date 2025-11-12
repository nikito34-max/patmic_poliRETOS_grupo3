package pkSecciones.Seccion3;

public class Figura8 extends FigurasM {
    public Figura8() {
        this.nombre = "Figura8";
    }

    @Override
  public void dibujar_con_for(int altura) {

    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < altura-1-i; j++) {
            System.out.print(" ");
        }
        System.out.print(simbolo2);
        System.out.println(); 
        // para que no termine en barra vertical
        if (i < altura - 1) {
            for (int j = 0; j < altura -1-i ; j++) {
                 System.out.print(" ");
            }
            System.out.println(simbolo3);
        }
    }
}
    @Override
public void dibujar_con_do_while (int altura){
    int i = 0;
    if (altura > 0) {
        do {
            int j = 0;
            int numEspacios = altura - 1 - i; 
            if (numEspacios > 0) {
                do {
                    System.out.print(" ");
                    j++;
                } while (j < numEspacios);
            }
            System.out.print(simbolo2);
            System.out.println();
            if (i < altura - 1) {
                j = 0; 
                if (numEspacios > 0) {
                    do {
                        System.out.print(" ");
                        j++;
                    } while (j < numEspacios);
                }
                System.out.println(simbolo3);
            }
            i++; 
        } while (i < altura);
    }
}
  @Override
 public void dibujar_con_while(int altura) {
    int i=0;
    while (i<altura){
        int j=0;
        int numEspacios =altura - 1 - i; 
        while (j<numEspacios) {
        System.out.print("  ");
        j++;
         }  
         System.out.print(simbolo2);
         System.out.println( );
      if (i < altura - 1){
        j=0;
        while (j<numEspacios) {
        System.out.print("  ");
        j++;
    
         } 
        System.out.println(simbolo3);
        }  
       i++;
     } 
   }
}

