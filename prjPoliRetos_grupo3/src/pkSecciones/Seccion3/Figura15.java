package pkSecciones.Seccion3;

public class Figura15 extends FigurasM {
 public Figura15() {
        super();
        this.nombre = "Figura15";
}

    @Override
public void dibujar(int altura) {
    int valor; 
    
    for (int i = 0; i < altura; i++) {
        
        valor = 1; 
    
        for (int j = 0; j <= i; j++) {
            
            System.out.print(valor); 
            
            System.out.print("     "); 
            if (j < i) {
                valor = valor * (i - j) / (j + 1); 
            }
        }
        
        System.out.println();
    }
}
    

 }

