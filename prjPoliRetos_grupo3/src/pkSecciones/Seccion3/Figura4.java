package pkSecciones.Seccion3;
public class Figura4 extends FigurasM {

    public Figura4() {
        super();
        this.nombre = "Figura4";
    }
    @Override
    public void dibujar_con_for (int tamanolado) {
        for (int i = 0; i < tamanolado; i++) {
            for (int j = 0; j < tamanolado; j++) {
                if (j+i >= tamanolado -1) {
                    System.out.print(simbolo1 + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }       
   
   @Override
public void dibujar_con_do_while(int tamanolado) {
    int i = 0;
    do {
        int j = 0;
        int numEspacios = tamanolado - i - 1;
        while (j < numEspacios) { 
            System.out.print("  ");
            j++;
        }

        int k = 0;
        int numSimbolos = i + 1;
        do {
            System.out.print(simbolo1+" ");
            k++;
        } while (k < numSimbolos);

        System.out.println();
        i++;
    } while (i < tamanolado);
}

 @Override
 public void dibujar_con_while(int tamanolado) {
    int i=0;
    while (i<tamanolado){
        int j=0;
        int numEspacios = tamanolado - i - 1;
        while (j<numEspacios) {
             System.out.print("  ");
              j++;
            } 
        int k=0;
         int numSimbolos = i + 1;
         while (k<numSimbolos){
            System.out.print(simbolo1+" ");
            k++;
         }
       System.out.println();
       i++;    
     }
   }
}