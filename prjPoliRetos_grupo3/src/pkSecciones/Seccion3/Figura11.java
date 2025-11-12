package pkSecciones.Seccion3;

public class Figura11 extends FigurasM {

    public Figura11() {
        super();
        this.nombre = "Figura11";
    }
    @Override
public void dibujar_con_for(int numerodepalitos) {
    if (numerodepalitos < 1) return;
    final int longitudLineaHorizontalBase = 1;
    
    for (int i = 0; i < numerodepalitos; i++) {
        
        int desplazamiento = i * (longitudLineaHorizontalBase + 1);
        int longitudActual = longitudLineaHorizontalBase + (i * 1); // Simplifica a i + 1

        for (int contadorEspacios = 0; contadorEspacios < desplazamiento; contadorEspacios++) {
            System.out.print(" ");
        }
        
        System.out.println(simbolo3);
        
       
        if (i == numerodepalitos - 1) {
            continue; 
        }
        
        for (int contadorEspacios = 0; contadorEspacios < desplazamiento; contadorEspacios++) {
            System.out.print(" ");
        }
        
        for (int contadorGuiones = 0; contadorGuiones < longitudActual; contadorGuiones++) {
            System.out.print("-");
        }
        
        System.out.println(); 
    }
}
    
    @Override
  public void dibujar_con_do_while(int numerodepalitos) {
    if (numerodepalitos < 1) return;
    int longitudLineaHorizontalBase = 1;
    
    int i = 0; 
    do {
        int desplazamiento = i * (longitudLineaHorizontalBase + 1);
        int longitudActual = longitudLineaHorizontalBase + (i * 1);

        int contadorEspacios = 0;
        while (contadorEspacios < desplazamiento) {
            System.out.print(" ");
            contadorEspacios++;
        }
        System.out.println(simbolo3);
        
        if (i == numerodepalitos - 1) {
            break; 
        }
        contadorEspacios = 0; 
        while (contadorEspacios < desplazamiento) {
            System.out.print(" ");
            contadorEspacios++;
        }
        
        int contadorGuiones = 0;
        while (contadorGuiones < longitudActual) {
            System.out.print("-");
            contadorGuiones++;
        }
        
        System.out.println(); 
        i++;
        
    } while (i < numerodepalitos);
  }

    @Override
public void dibujar_con_while(int numerodepalitos) {
    if (numerodepalitos < 1) return;
    final int longitudLineaHorizontalBase = 1;

    int i = 0;
    
    while (i < numerodepalitos) {
        
        int desplazamiento = i * (longitudLineaHorizontalBase + 1);
        int longitudActual = longitudLineaHorizontalBase + (i * 1); // Simplifica a i + 1

        int contadorEspacios = 0;
        while (contadorEspacios < desplazamiento) {
            System.out.print(" ");
            contadorEspacios++;
        }
        
        System.out.println(simbolo3);
        
        if (i == numerodepalitos - 1) {
            i++; 
            continue; 
        }
        
        contadorEspacios = 0; 
        while (contadorEspacios < desplazamiento) {
            System.out.print(" ");
            contadorEspacios++;
        }
        
        int contadorGuiones = 0;
        while (contadorGuiones < longitudActual) {
            System.out.print("-");
            contadorGuiones++;
        }
        
        System.out.println(); 
        i++; 
    }
}

}
  
