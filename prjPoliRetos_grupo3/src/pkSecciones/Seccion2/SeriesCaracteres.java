package pkSecciones.seccion2;
public class SeriesCaracteres {
    private static int numTerminos;

    public SeriesCaracteres(int numTerminos) {
        this.numTerminos = numTerminos;
    }

     public static void g3_serieSignoAlterno() {
            for (int i = 1; i <= numTerminos; i++) {
                System.out.print((i % 2 != 0) ? "+ " : "- ");
            }
        }
    
        public static void g3_serieMasFibonacci() {
            int a = 0, b = 1;
            for (int i = 0; i <= numTerminos; i++) {
                for (int j = 0; j < a; j++) 
                    System.out.print("+");
            System.out.print(" ");
            int c = a + b;
            a = b;
            b = c;
            }
        }
    
        public static void g3_serieMasDos() {
            int rep = 2;
            for (int i = 1; i <= numTerminos; i++) {
                for (int j = 0; j < rep; j++) 
                    System.out.print("+");
            System.out.print(" ");
            rep = rep + i ;
        }
        }
    
        public static void g3_serieOperador() {
            char[] car = {'+', '-', '*', '/'};
            for (int i = 0; i < numTerminos; i++) {
                System.out.print(car[i % car.length] + " ");
            }
        }
    
        public static void g3_serieCaracterPalo() {
            char[] simbolos = {'\\', '|', '/', '-', '|'};
            for (int i = 0; i < numTerminos; i++) {
                System.out.print(simbolos[i % simbolos.length] + " ");
            }
        }
    
        public static void g3_serieLetra() {
            char letra = 'a';
            for (int i = 0; i < numTerminos; i++) {
                System.out.print(letra + " ");
                letra++;
            }
        }
    
        public static void g3_serieLetraSigno() {
            char letra = 'a';
            for (int i = 1; i <= numTerminos; i++) {
                if (i % 2 != 0) {
                   System.out.print(letra + " "); 
                   letra++;
                }else {
                   System.out.print((i % 4 == 0)? "- " : "+ ");
                }  
            }
        }
    
        public static void g3_serieLetraCreciente() {
            int valor = 2;
            char letra = 'a';
            for (int i = 1; i <= numTerminos; i++) {
                for (int j = 0; j < valor; j++) 
                    System.out.print(letra);
            System.out.print(" ");
            letra++;
            valor += 2;

            }
        }
    
        public static void g3_serieLetraPatron() {
            int valor = 1;
            char letra = 'a';
            for (int i = 1; i <= numTerminos; i++) {
                for (int j = 0; j < valor; j++) System.out.print(letra);
                System.out.print(" ");
                letra++;
                valor += 2;
            }
        }

        public static void g3_serieFibonacciCaracter() {
            int a = 0, b = 1;
            char letra = 'a';
            for (int i = 0; i < numTerminos; i++) {
                for (int j = 0; j < a; j++) 
                    System.out.print(letra);
                    if (a == 0) {
                        System.out.print(letra);
                    }
            System.out.print(" ");
            int c = a + b;
            a = b;
            b = c;
            letra++;
            }
        }
}





