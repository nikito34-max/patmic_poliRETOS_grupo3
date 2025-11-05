package pkSecciones.Seccion3;

public class Figura2 extends FigurasM {
    public Figura2() {
        super();
        this.nombre = "Figura2";  
    }

    @Override
    public void dibujar(int tamanolado) {
        for (int i = 0; i < tamanolado; i++) {
            for (int j = 0; j < tamanolado; j++) {
            if (i == 0 || i == tamanolado - 1 || j == 0 || j == tamanolado - 1) {
                if (j % 2 == 0 && i % 2 == 0) {
                    System.out.print(simbolo1 + " ");
                } else {
                    System.out.print(simbolo4 + " ");
                }
            } else {
                System.out.print("  "); 
            }
        }
        System.out.println(); 
    } 
  }
 public void dibujar_con_do_while(int tamanolado) {
    int i = 0;
    do {
        int j = 0;
        do {
            if (i == 0 || i == tamanolado - 1 || j == 0 || j == tamanolado - 1) {
                
                if (j % 2 == 0 && i % 2 == 0) {
                    System.out.print(simbolo1 + " ");
                } else {
                    System.out.print(simbolo4 + " ");
                }
            } else {
                System.out.print("  "); 
            }
            j++; 
        } while (j < tamanolado);

        System.out.println(); 
        i++; 
    } while (i < tamanolado);
 }

}
           
 

