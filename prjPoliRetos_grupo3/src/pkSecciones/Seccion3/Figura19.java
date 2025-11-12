package pkSecciones.Seccion3;


public class Figura19 extends FigurasM {
    public Figura19() {
        super();
        this.nombre = "Figura19";
    }


     @Override
public void dibujar_con_for(int altura) {
    if (altura <= 0) return;
    int[] filaAnterior = null;

    for (int i = 0; i < altura; i++) {
        int[] filaActual = new int[i + 1];


        for (int j = 0; j <= i; j++) {
            String valorAImprimir;

            if (i == 0) {
                filaActual[j] = 2;
                valorAImprimir = "* ";
            } else if (j == 0) {
                filaActual[j] = 1;
                valorAImprimir = "+ ";
            } else if (j == i) {
                filaActual[j] = 2;
                valorAImprimir = "* ";
            } else {
                // Cálculo del valor interno (suma de los dos elementos de la fila anterior)
                int suma = filaAnterior[j - 1] + filaAnterior[j];
                filaActual[j] = suma;
                valorAImprimir = String.valueOf(suma) + " ";
            }

            System.out.print(valorAImprimir);
        }

        System.out.println();
        filaAnterior = filaActual;
    }
}
    @Override
public void dibujar_con_do_while(int altura) {
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

@Override
public void dibujar_con_while(int altura) {
    if (altura <= 0) return;
    int[] filaAnterior = null;
    int i = 0;
    
    while (i < altura) { 
        int[] filaActual = new int[i + 1];
        int j = 0; 
        
        while (j <= i) { 
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
                valorAImprimir = String.valueOf(suma) + " ";
            }
            
            System.out.print(valorAImprimir);
            
            j++; 
        }
        
        System.out.println();
        filaAnterior = filaActual; 
        
        i++; 
    }
}

 }


