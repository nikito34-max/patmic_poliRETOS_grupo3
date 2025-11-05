package pkSecciones.Seccion3;

public class Figura5 extends FigurasM {

    public Figura5() {
        super();
        this.nombre = "Figura5";
    }

  @Override
public void dibujar(int tamanolado) {

    int numFilas = (tamanolado + 1) / 2; 
    
    for (int i = 0; i < numFilas; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        int anchoSimbolos = tamanolado - (2 * i);
        for (int k = 0; k < anchoSimbolos; k++) {
            System.out.print(simbolo1);
        }
        
        System.out.println();
    }
}









}

