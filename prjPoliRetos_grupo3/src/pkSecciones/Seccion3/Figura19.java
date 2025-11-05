package pkSecciones.Seccion3;


public class Figura19 extends FigurasM {
    public Figura19() {
        super();
        this.nombre = "Figura18";
    }
    @Override
public void dibujar (int altura) {
    if (altura <= 0) return;
    int[] filaAnterior = null;
    int i = 0;
    do { 
        int [] filaActual = new int[i + 1];

        int j = 0; 
        do { 
            String valorAImprimir;
            
            if (i == 0) {
                filaActual[j] = 2;
                valorAImprimir = "* ";
            } 
            else if (j == 0) {
                filaActual[j] = 1;
                valorAImprimir = "+ ";
            }
            else if (j == i) {
                filaActual[j] = 2;
                valorAImprimir = "* ";
            }
            else {
                int suma = filaAnterior[j - 1] + filaAnterior[j];
                filaActual[j] = suma;
                valorAImprimir = String.valueOf(suma + " ");
            }
            
            System.out.print(valorAImprimir);
            
            j++; 
        } while (j <= i); 
        
        System.out.println();
        filaAnterior = filaActual; 
        
        i++; 
    } while (i < altura); 
  }
 }


