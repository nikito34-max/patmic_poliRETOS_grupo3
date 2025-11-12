package pkSecciones.Seccion3;

public class Figura13 extends FigurasM {
    public Figura13() {
        super();
        this.nombre = "Figura13";
    }

    @Override
    public void dibujar_con_for(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
     @Override
    public void dibujar_con_do_while(int altura) {
    int i =1;
    do {
        int j = 1; 
        do {
            System.out.print(j);
            j++;
        } while (j <= i);
        System.out.println();
        i++;
        
    } while (i <= altura); 
  } 

  @Override
  public void dibujar_con_while (int altura){
    int i=1;
   while (i<=altura){
    int j=1;
    while (j <= i){
         System.out.print(j);
            j++;
    }
    System.out.println();
     i++;
   }

  }




}
