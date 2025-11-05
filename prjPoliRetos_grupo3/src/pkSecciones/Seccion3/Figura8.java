package pkSecciones.Seccion3;

public class Figura8 extends FigurasM {
    public Figura8() {
        this.nombre = "Figura8";
    }

    @Override
    public void dibujar (int altura) {
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura-1-i; j++) {
                System.out.print(" ");
            }

            System.out.println(simbolo2);
           if (i<altura-1){
            for (int j=0; j<altura-1-i; j++) {
                System.out.print(" ");
            }
             System.out.println(simbolo3);
           }    
                  System.out.println();
           
        }
    }
}

