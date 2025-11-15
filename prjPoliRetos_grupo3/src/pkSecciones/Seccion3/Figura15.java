package  pkSecciones.seccion3;

public class Figura15 extends FigurasM {
 public Figura15() {
        super();
        this.nombre = "Figura15";
}

    @Override
public void dibujar_con_for(int altura) {
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
@Override
    public void dibujar_con_do_while(int altura) {
    int i = 0;
    int valor=1;
    do {
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

    

















 

