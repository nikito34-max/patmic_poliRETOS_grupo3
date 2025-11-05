package pkSecciones.Seccion3;

public class figura3 extends FigurasM {

    public figura3() {
        super();
        this.nombre = "Figura3";
    }
    @Override
    public void dibujar (int tamanolado) {
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

}
