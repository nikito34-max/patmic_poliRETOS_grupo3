package pkSecciones.Seccion3;
public abstract class FigurasM {
public String nombre = "Cuadrado";
    public String simbolo1 = "*";
    public String simbolo2 = "--";
    public String simbolo3 = "|"; 
    public String simbolo4= "+";
    public String simbolo5="-";
    

    public FigurasM () {
        
    }   

    public abstract void dibujar_con_for ( int tamanolado) ;
    public abstract void dibujar_con_do_while (int tamanolado);
    public abstract void dibujar_con_while (int tamanolado);
}
