package pkSecciones.Seccion3;

public class Figura14 extends FigurasM {
    public Figura14() {
        super();
        this.nombre = "Figura14";
    }

    @Override
public void dibujar_con_for(int altura) {
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
 @Override
    public void dibujar_con_do_while(int altura) {
    int i = 0;
    int valor=1;
    do {  int k=0;
          while (k<altura-i){
             System.out.print("   "); 
             k++;
          }
         int j =0;
         while (j<=i) { 
             System.out.print(valor); 
            System.out.print("     "); 
            if (j < i) {
                valor = valor * (i - j) / (j + 1); 
            }
            j++;
        }
        System.out.println(); 
        i++; 
    } while (i < altura);

}
 @Override
 public void dibujar_con_while(int altura) {
    int i=0;
    int valor=1;
    while (i<altura){
        int k=0;
          while (k<altura-i){
             System.out.print("   "); 
             k++;
            }
        int j=0;
        while (j<=i) { 
             System.out.print(valor); 
            System.out.print("     "); 
            if (j < i) {
                valor = valor * (i - j) / (j + 1); 
            }
        j++;
            }         
       System.out.println();
       i++;
     } 
   }
}
        
    