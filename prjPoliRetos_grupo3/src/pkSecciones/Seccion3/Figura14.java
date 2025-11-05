package pkSecciones.Seccion3;

public class Figura14 extends FigurasM {
    public Figura14() {
        super();
        this.nombre = "Figura14";
    }

    @Override
public void dibujar(int altura) {
    int valor; 
    
    for (int i = 0; i < altura; i++) {
        
        for (int k = 0; k < altura - i; k++) { 
            System.out.print("   "); 
        }
        
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
        
    