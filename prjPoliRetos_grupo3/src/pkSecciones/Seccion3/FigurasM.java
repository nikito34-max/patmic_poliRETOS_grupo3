package pkSecciones.Seccion3;
public abstract class FigurasM {
public String nombre = "Cuadrado";
    public String simbolo1 = "*";
    public String simbolo2 = "--";
    public String simbolo3 = "|"; 
    public String simbolo4= "+";
    public String simbolo5="-";
    

    public FigurasM () {
        this.nombre = "Cuadrado";
        this.simbolo1 = "*";
    }   

    public abstract void dibujar ( int tamanolado) ;
}
