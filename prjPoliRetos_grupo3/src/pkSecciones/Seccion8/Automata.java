package pkSecciones.seccion8;

public abstract class Automata {
    private String description;

    public abstract void g3_ValidarWithFor(String str);
    public abstract void g3_ValidarWithWhile(String str);
    public abstract void g3_ValidarWithDoWhile(String str);

    public void setDescription(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return this.description;
    }

    public void g3_imprimirResultado(boolean valido, String str) {
        if (valido) {
            System.out.printf("%s es válido%n", str);
        } else {
            System.out.printf("%s no es válido%n", str);
        }
    }
}
