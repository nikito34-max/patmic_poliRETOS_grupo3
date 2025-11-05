package pkSecciones.Seccion3;

public class Figura9 extends FigurasM {
    public Figura9() {
        this.nombre = "Figura9";
    }
    @Override
   public void dibujar(int altura) {
    if (altura < 1) return;

    int i = 0; 
    do {
        int numEspaciosIniciales = altura - i - 1; 
        int anchoFila = (2 * i) + 1; 

        String simboloBorde;
        if (i % 2 == 0) {
            simboloBorde = simbolo5; 
        } else {
            simboloBorde = simbolo3; 
        }
        for (int k = 0; k < numEspaciosIniciales; k++) {
            System.out.print(" ");
        }
        for (int k = 0; k < anchoFila; k++) {
    
            if (k == 0 || k == anchoFila - 1) {
                System.out.print(simboloBorde);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        i++;
        
    } while (i < altura);
}
}
    
      

