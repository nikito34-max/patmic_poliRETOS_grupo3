package pkSecciones.seccion3;

public class Figura9 extends FigurasM {
    public Figura9() {
        this.nombre = "Figura9";
    }

      @Override
  public void dibujar_con_for(int altura) {
    for (int i = 0; i < altura; i++) {
     int espaciosVacios=(altura-1-i);
    int anchoFila=(2 * i) + 1;
     String simboloBorde;

        for (int j = 0; j < espaciosVacios; j++) {
            System.out.print(" ");
        }
         if (i % 2 == 0) {
            simboloBorde = simbolo5; 
        } else {
            simboloBorde = simbolo3; 
        }
        for (int k = 0; k < anchoFila; k++) {
            if (k == 0 || k == anchoFila - 1) {
                System.out.print(simboloBorde);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
    
    @Override
   public void dibujar_con_do_while(int altura) {
    if (altura < 1) return;
    int i = 0; 
    if (altura>0){
    do {
        int numEspaciosIniciales = altura - i - 1; 
        int anchoFila = (2 * i) + 1; 

        String simboloBorde;
        if (i % 2 == 0) {
            simboloBorde = simbolo5; 
        } else {
            simboloBorde = simbolo3; 
        }
            int j = 0;
        do { 
         System.out.print(" ");
         j++;
            }while (j < numEspaciosIniciales);

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
    @Override
   public void dibujar_con_while (int altura){
    if (altura > 0) {
        int i = 0;
        while (i < altura) {
            
            int espaciosVacios = (altura - 1 - i);
            int anchoFila = (2 * i) + 1;
            String simboloBorde;
            
            if (i % 2 == 0) {
                simboloBorde = simbolo5; 
            } else {
                simboloBorde = simbolo3; 
            }
            
            int j = 0; 
            while (j < espaciosVacios) {
                System.out.print(" ");
                j++;
            } 
            
            int k = 0; 
            while (k < anchoFila) {
                if (k == 0 || k == anchoFila - 1) {
                    System.out.print(simboloBorde);
                } else {
                    System.out.print(" "); 
                }
                k++;
            } 
            
            System.out.println(); 
            i++; 
        }
    }
}

}
 
    
      

