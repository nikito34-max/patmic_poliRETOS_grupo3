package pkSecciones.Seccion3;

public class figura12 extends FigurasM {

    public figura12() {
        super();
        this.nombre = "Figura12";
    }
    @Override
    
    public void dibujar (int altura){
        for (int i = altura; i >= 1; i--) { 
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public void dibujarDoWhile(int altura) {
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
} 
    


