package pkSecciones.seccion3;;

public class figura12 extends FigurasM {

    public figura12() {
        super();
        this.nombre = "Figura12";
    }
    @Override
    public void dibujar_con_for (int altura){
        for (int i = altura; i >= 1; i--) { 
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    @Override
    public void dibujar_con_do_while(int altura) {
    int i = altura;
    do {
        int j = 1; 
        
        do {
            System.out.print(j);
            j++;
        } while (j <= i);
        System.out.println();
        i--;
        
    } while (i >= 1); 
  } 
  @Override
  public void dibujar_con_while (int altura){
    int i=altura;
      while (i>=1){
    int j=1;
    while (j <= i){
         System.out.print(j);
            j++;
         }
        System.out.println();
        i--;
   }

  }
} 
    


