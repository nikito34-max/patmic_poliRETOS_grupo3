package pkSecciones.Seccion3;

public class Figura11 extends FigurasM {

    public Figura11() {
        super();
        this.nombre = "Figura11";
    }
    
    @Override
  public void dibujar(int numerodepalitos) {
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
}
    

  
