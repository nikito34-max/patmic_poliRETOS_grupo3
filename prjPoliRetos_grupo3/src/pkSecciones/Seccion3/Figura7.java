package pkSecciones.Seccion3;

public class Figura7 extends FigurasM {
   
    public Figura7() {
        this.nombre = "Figura7";
    }
    @Override
    public void dibujar(int numerodepalitos) {
        for (int i = 0; i < numerodepalitos; i++) {
            for (int j = 0; j < numerodepalitos; j++) {
                if (j == i && j % 2 == 0) {
                    System.out.print(simbolo2 + " ");
                } else if (j == i && j % 2 != 0) {
                    System.out.print(simbolo3 + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

  public void dibujar_con_do_while (int totaldibujo){
    int contadorfila = 1;

    do {
        for (int i = 0; i < contadorfila - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("__");

        System.out.println(); 

        if (contadorfila < totaldibujo) {
            for (int i = 0; i < contadorfila; i++) { 
                System.out.print(" ");
            }
            
            System.out.print("|");

            System.out.println(); 
        }
        contadorfila++;
        
    } while (contadorfila <= totaldibujo);
  }
}






