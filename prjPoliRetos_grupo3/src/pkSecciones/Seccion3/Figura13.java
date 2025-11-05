package pkSecciones.Seccion3;

public class Figura13 extends FigurasM {
    public Figura13() {
        super();
        this.nombre = "Figura13";
    }

    @Override
    public void dibujar(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }




}
