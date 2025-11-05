package pkSecciones.Seccion3;

public class Figura6 extends FigurasM {
    public Figura6() {
        this.nombre = "Figura6";
    }
@Override
public void dibujar (int altura){
    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < (altura -i-1); j++) {
         System.out.print(" ");
        }
        int anchocaracteres = (2 * i)+1;
        for (int j = 0; j < anchocaracteres; j++) {
            System.out.print(simbolo1);
        }

        System.out.println();
    }
}

}
