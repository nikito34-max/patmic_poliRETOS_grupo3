package pkSecciones.Seccion3;

public class Figura10 extends FigurasM {
    public Figura10() {
        super();
        this.nombre = "Figura10";

    }
    @Override
  public void dibujar (int altura){
    if (altura < 1) return;
    
    final int PASO = 4; 
    int i = 0; 
    
    do {
        String simboloCentral;
        if (i % 2 == 0) {
            simboloCentral = simbolo4; 
        } else {
            simboloCentral = simbolo5; 
        }
        String linea = "_ " + simboloCentral + " _"; 
        
        int desplazamiento = i * PASO;

        for (int k = 0; k < desplazamiento; k++) {
            System.out.print(" ");
        }
        System.out.println(linea); 

            if (i == altura - 1) {
            break; 
        }
        int desplazamientoPalo = desplazamiento + PASO ;
        for (int k = 0;k < desplazamientoPalo;k++) {
            System.out.print(" ");
        }
        System.out.println(simbolo3);
        i++;
        
    } while (i < altura);
  }
}
    
