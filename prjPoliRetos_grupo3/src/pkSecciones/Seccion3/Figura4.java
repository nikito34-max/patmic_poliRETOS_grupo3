package pkSecciones.Seccion3 ;

public class Figura4 extends FigurasM {

    public Figura4() {
        super();
        this.nombre = "Figura4";
    }
    @Override
    public void dibujar (int tamanolado) {
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
}
