package pkSecciones.Seccion7;

public class Recursion {
    public int g3_factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * g3_factorial(num - 1);
        }
    }

    public int g3_suma(int a, int b) {
        if (b == 0) { 
            return a;
        } else {
            return g3_suma(a + 1, b - 1);
        }
    }

    public int g3_multiplicacion(int a, int b) {
        if (b == 0) { // caso base
            return 0;
        } else {
            return a + g3_multiplicacion(a, b - 1); // suma 'a' b veces        
        }
    }
    
    public int g3_potencia(int a, int b) {
        if (a == 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        } else {
            return a * g3_potencia(a, b - 1);
        }
    }

    public int g3_conteoProgresivo(int a) {
        if (a < 0) { // caso base
            return 0;
        }
        g3_conteoProgresivo(a - 1);
        
        System.out.printf("%d ", a);
        return 0;
    }

    public int g3_conteoRegresivo(int a) {
        if (a < 0) {
            return 0;
        }
        System.out.printf("%d ", a);
        return g3_conteoRegresivo(a - 1);
    }
}
