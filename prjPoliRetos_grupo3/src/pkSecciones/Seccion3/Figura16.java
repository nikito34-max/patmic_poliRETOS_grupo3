package  pkSecciones.seccion3;

public class Figura16 extends FigurasM {
        public String crucecita= "+";
        public String negativo="-";
    public Figura16() {
        super();
        this.nombre = "Figura16";
}
 @Override
 public void dibujar_con_for (int altura) {
      int elementodiagonalsecundaria = altura - 1;

    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < altura; j++) {
            if (i==j|| i+j==elementodiagonalsecundaria) { 
                if (j%2==0) {
                System.out.print(crucecita+" ");
            }  else {
                System.out.print(negativo+" ");
            }
         } else 
        System.out.print(" ");
      }
      System.out.println();
    }
  }
@Override
public void dibujar_con_do_while(int altura) {
    int elementodiagonalsecundaria = altura - 1;
    int i = 0;
    if (altura > 0) {
        do {
            int j = 0;
            
            if (altura > 0) {
                do {
                    if (i == j || i + j == elementodiagonalsecundaria) { 
                        if (j % 2 == 0) {
                            System.out.print(crucecita + " ");
                        } else {
                            System.out.print(negativo + " ");
                        }
                    } else { 
                        System.out.print("  "); 
                    }
                    j++;
                } while (j < altura);
            }
            
            System.out.println();
            i++;
        } while (i < altura);
    }
  }
  @Override 
  public void dibujar_con_while (int altura){
 if (altura>0){ 
  int i=0;
  int elementodiagonalsecundaria = altura - 1;
  while ( i<altura){
    int j=0;
    while (j<altura){
       if (i==j|| i+j==elementodiagonalsecundaria) { 
                if (j%2==0) {
                System.out.print(crucecita+" ");
            }  else {
                System.out.print(negativo+" ");
            }
         } else 
        System.out.print("  ");
        j++;
    }
    System.out.println();
   i++;
   }
  }
 }
}







