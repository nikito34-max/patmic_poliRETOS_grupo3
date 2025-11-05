package pkSecciones.Seccion3;

public class Figura18 extends FigurasM {
    public Figura18() {
        super();
        this.nombre = "Figura18";
    }
    @Override
public void dibujar (int altura) {
    if (altura <= 0) return;

    int[][] triangulo = new int[altura][altura];

    for (int i = 0; i < altura; i++) { 
        for (int j = 0; j <= i; j++) {
            
            if (i == 0) {
                triangulo[i][j] = 2;
            } 
            else if (j == 0) {
                triangulo[i][j] = 1;
            }
            else if (j == i) {
                triangulo[i][j] = 2;
            } else {
             triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
               
            

            System.out.print( triangulo[i][j]);
        
           }
            System.out.println(); 
      }
    } 
 }
