package pkSecciones.seccion3;

public class Figura6 extends FigurasM {
    public Figura6() {
        this.nombre = "Figura6";
    }
@Override
public void dibujar_con_for (int altura){
    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < (altura -i-1); j++) {
         System.out.print("  ");
        }
        int anchocaracteres = (2 * i)+1;
        for (int j = 0; j < anchocaracteres; j++) {
            System.out.print(simbolo1+" ");
        }

        System.out.println(" ");
    }
}
@Override
    public void dibujar_con_do_while(int altura) {
    int i = 0;
    do {
         int j = 0;
         while (j <(altura -i-1) ) { 
            System.out.print("  ");
            j++;
        }
         int k=0;
         int anchocaracteres = (2 * i)+1;
            do {
                  System.out.print(simbolo1+" ");
                   k++;
            } while (k<anchocaracteres);
           
        System.out.println(" "); 
        i++; 
    } while (i < altura);

}
 
 @Override
 public void dibujar_con_while(int altura) {
    int i=0;
    while (i<altura){
        int j=0;
        int numEspacios = (altura-i-1); 
        while (j<numEspacios) {
        System.out.print("  ");
        j++;
            }     
     int k=0;
     int anchocaracteres = (2 * i)+1;
     while (k<anchocaracteres) {
        System.out.print(simbolo1+" ");
        k++;
       }     
       System.out.println(" ");
       i++;
     } 
   }
}
