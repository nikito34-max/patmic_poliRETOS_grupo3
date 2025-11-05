package pkSecciones.Seccion3;

public class Figura17 extends FigurasM {
        public String simbolo= "1";
        public String simbolo2="0";
    public Figura17() {
        super();
        this.nombre = "Figura17";
}
 @Override
 public void dibujar (int altura) {
      int elementodiagonalsecundaria = altura - 1;

    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < altura; j++) {
            if (i==j|| i+j==elementodiagonalsecundaria) { 
                if (j%2==0) {
                System.out.print(simbolo+" ");
            }  else {
                System.out.print(simbolo2+" ");
            }
         } else 
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}

