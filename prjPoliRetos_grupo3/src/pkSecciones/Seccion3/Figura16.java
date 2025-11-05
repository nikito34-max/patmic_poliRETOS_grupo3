package pkSecciones.Seccion3;

public class Figura16 extends FigurasM {
        public String crucecita= "+";
        public String negativo="-";
    public Figura16() {
        super();
        this.nombre = "Figura16";
}
 @Override
 public void dibujar (int altura) {
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
}