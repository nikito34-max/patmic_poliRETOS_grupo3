package pkSecciones.seccion3;

public class figura3 extends FigurasM {

    public figura3() {
        super();
        this.nombre = "Figura3";
    }
    @Override
    public void dibujar_con_for (int tamanolado) {
        for (int i = 0; i < tamanolado; i++) {
            for (int j = 0; j < tamanolado; j++) {
                if (j==i || j<i) {
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
        int numSimbolos = i + 1;
        do {
            System.out.print(simbolo1 + " "); 
            j++;
        } while (j < numSimbolos);

        System.out.println(); 
        i++; 
    } while (i < tamanolado);
}
 

 @Override
 public void dibujar_con_while(int tamanolado) {
    int i=0;
    while (i<tamanolado){
        int j=0;
         int numSimbolos = i + 1;
        while (j<numSimbolos) {
                    System.out.print(simbolo1 + " ");
        j++;
            }     
           System.out.println();
       i++;
     }
   }
 }
