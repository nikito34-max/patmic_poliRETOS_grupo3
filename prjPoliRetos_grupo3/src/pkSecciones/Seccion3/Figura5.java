package pkSecciones.seccion3;
public class Figura5 extends FigurasM {

    public Figura5() {
        super();
        this.nombre = "Figura5";
    }

  @Override
public void dibujar_con_for(int tamanolado) {

    int numFilas = (tamanolado + 1) / 2; 
    
    for (int i = 0; i < numFilas; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("  ");
        }
        int anchoSimbolos = tamanolado - (2 * i);
        for (int k = 0; k < anchoSimbolos; k++) {
            System.out.print(simbolo1+" ");
        }
        
        System.out.println();
    }
}

 @Override
    public void dibujar_con_do_while(int tamanolado) {
    int numFilas = (tamanolado + 1) / 2; 
    int i = 0;
    do {
        int j = 0;
        while (j < i) { 
            System.out.print("  ");
            j++;
        }
            int k=0;
          int anchoSimbolos = tamanolado - (2 * i);
          do { 
                  System.out.print(simbolo1+" ");
            k++; 
            } while (k<anchoSimbolos);
        System.out.println(); 
        i++; 
    }  while (i < numFilas);
}
 

 @Override
 public void dibujar_con_while(int tamanolado) {
    int numFilas = (tamanolado + 1) / 2; 
    int i=0;
    while (i<numFilas){
        int j=0;
        while (j<i) {
                    System.out.print("  ");
        j++;
            }     
     int k=0;
     int anchoSimbolos = tamanolado - (2 * i);
     while (k<anchoSimbolos) {
                    System.out.print(simbolo1+" ");
      k++;
     }     
     System.out.println();
       i++;
     } 
   }
}


