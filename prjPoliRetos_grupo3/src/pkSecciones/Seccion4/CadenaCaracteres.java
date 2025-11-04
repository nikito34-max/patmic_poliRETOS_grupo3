package pkSecciones.Seccion4;
import java.util.Scanner;
public class CadenaCaracteres {
    /**
     * C01) Contar vocales 
     * @param frase texto de entrada
     */
    public void g3_contarVocales(String frase) {
        System.out.println("\nC01) Contar vocales de la frase ingresada");
        frase = frase.toLowerCase();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                contador++;
        }
        System.out.println("Total (for): " + contador);

        contador = 0;
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                contador++;
            i++;
        }
        System.out.println("Total (while): " + contador);

        contador = 0;
        i = 0;
        do {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                contador++;
            i++;
        } while (i < frase.length());
        System.out.println("Total (do-while): " + contador);
    }
    /**
     * C02) Contar consonantes
     * @param frase texto de entrada
     */
    public void g3_contarConsonantes(String frase) {
        System.out.println("\nC02) Contar consonantes de la frase ingresada");
        frase = frase.toLowerCase();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (!("aeiou".indexOf(Character.toLowerCase(c))>=0))
                contador++;
        }
        System.out.println("Total (for): " + contador);

        contador = 0;
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (!("aeiou".indexOf(Character.toLowerCase(c))>=0))
                contador++;
            i++;
        }
        System.out.println("Total (while): " + contador);

        contador = 0;
        i = 0;
        do {
            char c = frase.charAt(i);
            if (!("aeiou".indexOf(Character.toLowerCase(c))>=0))
                contador++;
            i++;
        } while (i < frase.length());
        System.out.println("Total (do-while): " + contador);
    }
    /**
     * C03) Eliminar una vocal
     * @param frase texto de entrada
     * @param vocal vocal a eliminar
     */
    public void g3_eliminarVocal(String frase, Scanner entrada) {
        System.out.println("\nC03) Eliminar vocal de la frase ingresada");
        frase = frase.toLowerCase();
        System.out.print("Ingresa la vocal a eliminar: ");
        char vocal = entrada.next().charAt(0);
        vocal = Character.toLowerCase(vocal);
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == vocal)
                resultado += " "; 
            else
                resultado += c;
        }
        System.out.println("Resultado (for): " + resultado);

        resultado = "";
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (c == vocal)
                resultado += " ";
            else
                resultado += c;
            i++;
        }
        System.out.println("Resultado (while): " + resultado);

        resultado = "";
        i = 0;
        do {
            char c = frase.charAt(i);
            if (c == vocal)
                resultado += " ";
            else
                resultado += c;
            i++;
        } while (i < frase.length());
        System.out.println("Resultado (do-while): " + resultado);
    }
    /**
     * C04) Eliminar una letra específica
     * @param frase texto de entrada
     * @param letra letra a eliminar
     */
    public void g3_eliminarLetra(String frase, Scanner entrada) {
        System.out.println("\nC04) Eliminar letra de la frase ingresada");
        frase = frase.toLowerCase();
        System.out.print("Ingresa la letra a eliminar: ");  
        char letra = entrada.next().charAt(0);
        letra = Character.toLowerCase(letra);

        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == letra)
                resultado += " ";
            else
                resultado += c;
        }
        System.out.println("Resultado (for): " + resultado);

        resultado = "";
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (c == letra)
                resultado += " ";
            else
                resultado += c;
            i++;
        }
        System.out.println("Resultado (while): " + resultado);

        resultado = "";
        i = 0;
        do {
            char c = frase.charAt(i);
            if (c == letra)
                resultado += " ";
            else
                resultado += c;
            i++;
        } while (i < frase.length());
        System.out.println("Resultado (do-while): " + resultado);
    }
    /**
     * C05) Invertir la frase con las vocales en mayúsculas
     * @param frase texto de entrada
     */
    public void g3_invertidaMayusVocales(String frase) {
        System.out.println("\nC05) Invertir frase con vocales en mayúsculas");
        String invertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                invertida += Character.toUpperCase(c);
            else
                invertida += c;
        }
        System.out.println("Resultado (for): " + invertida);

        invertida = "";
        int i = frase.length() - 1;
        while (i >= 0) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                invertida += Character.toUpperCase(c);
            else
                invertida += c;
            i--;
        }
        System.out.println("Resultado (while): " + invertida);

        invertida = "";
        i = frase.length() - 1;
        do {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                invertida += Character.toUpperCase(c);
            else
                invertida += c;
            i--;
        } while (i >= 0);
        System.out.println("Resultado (do-while): " + invertida);
    }
    /**
     * C06) Invertir la frase con las consonantes en mayúsculas
     * @param frase texto de entrada
     */
    public void g3_invertidaMayusConsonantes(String frase) {
        System.out.println("\nC06) Invertir frase con las consonantes en mayúsculas");
        frase = frase.toLowerCase();
        String resultado = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                resultado += c;
            else
                resultado += Character.toUpperCase(c);
        }
        System.out.println("Resultado (for): " + resultado);

        resultado = "";
        int i = frase.length() - 1;
        while (i >= 0) {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                resultado += c;
            else
                resultado += Character.toUpperCase(c);
            i--;
        }
        System.out.println("Resultado (while): " + resultado);

        resultado = "";
        i = frase.length() - 1;
        do {
            char c = frase.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0)
                resultado += c;
            else
                resultado += Character.toUpperCase(c);
            i--;
        } while (i >= 0);
        System.out.println("Resultado (do-while): " + resultado);
    }
    /**
     * C07) Presentar la frase en mayúsculas y sin la J
     * @param frase texto de entrada
     */
    public void g3_mayusSinJ(String frase) {
        System.out.println("\nC07) Presentar frase en mayúsculas y sin la J");
        frase = frase.toUpperCase();
        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != 'J')
                resultado += c;
        }
        System.out.println("Resultado (for): " + resultado);

        resultado = "";
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (c != 'J')
                resultado += c;
            i++;
        }
        System.out.println("Resultado (while): " + resultado);

        resultado = "";
        i = 0;
        do {
            char c = frase.charAt(i);
            if (c != 'J')
                resultado += c;
            i++;
        } while (i < frase.length());
        System.out.println("Resultado (do-while): " + resultado);
    }
    /**
     * C08) Juego de anagramas (selección aleatoria, tres intentos)
     * @param entrada Scanner para adivinanza por parte del usuario
     */
    public void g3_anagrama(Scanner entrada) {
        entrada.nextLine();
        System.out.println("\nC08) Juego de anagramas");
        String[][] conjunto = {
            {"ballena", "llenaba"},
            {"delira", "lidera"},
            {"enrique", "quieren"},
            {"alondra", "ladrona"},
            {"amor", "roma"}
        };

        int indice = (int)(Math.random() * conjunto.length);
        String palabra = conjunto[indice][0];
        String anagrama = conjunto[indice][1];

        String respuesta = "";
        boolean acierto = false;

        System.out.println("Adivina el anagrama de la siguiente palabra:");
        System.out.println("- " + palabra);

        for (int intentos = 3; intentos > 0 && !acierto; intentos--) {
            System.out.print("(FOR) Tu respuesta: ");
            respuesta = entrada.nextLine().toLowerCase();
            if (respuesta.equals(anagrama)) {
                System.out.println("¡Correcto!");
                acierto = true;
            } else if (intentos > 1) {
                System.out.println("Incorrecto. Te quedan " + (intentos - 1) + " intento(s).");
            }
        }
        if (!acierto) System.out.println("Perdiste con el for. El anagrama era: " + anagrama.toUpperCase());

        acierto = false;
        int intentos = 3;
        while (intentos > 0 && !acierto) {
            System.out.print("(WHILE) Tu respuesta: ");
            respuesta = entrada.nextLine().toLowerCase();
            if (respuesta.equals(anagrama)) {
                System.out.println("¡Correcto!");
                acierto = true;
            } else {
                intentos--;
                if (intentos > 0)
                    System.out.println("Incorrecto. Te quedan " + intentos + " intento(s).");
            }
        }
        if (!acierto) System.out.println("Perdiste con el while. El anagrama era: " + anagrama.toUpperCase());


        acierto = false;
        intentos = 3;
        do {
            System.out.print("(DO-WHILE) Tu respuesta: ");
            respuesta = entrada.nextLine().toLowerCase();
            if (respuesta.equals(anagrama)) {
                System.out.println("¡Correcto!");
                acierto = true;
            } else {
                intentos--;
                if (intentos > 0)
                    System.out.println("Incorrecto. Te quedan " + intentos + " intento(s).");
            }
        } while (!acierto && intentos > 0);
        if (!acierto) System.out.println("Perdiste con el do-while. El anagrama era: " + anagrama.toUpperCase());
    }
    /**
     * C09) Alternar mayúsculas y minúsculas en la frase
     * @param frase texto de entrada
     */
    public void g3_alternarMayusMinus(String frase) {
        System.out.println("\nC09) Alternar mayúsculas y minúsculas");
        frase = frase.toLowerCase();
        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (i % 2 == 0)
                resultado += Character.toUpperCase(c);
            else
                resultado += c;
        }
        System.out.println("Resultado (for): " + resultado);

        resultado = "";
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (i % 2 == 0)
                resultado += Character.toUpperCase(c);
            else
                resultado += c;
            i++;
        }
        System.out.println("Resultado (while): " + resultado);

        resultado = "";
        i = 0;
        do {
            char c = frase.charAt(i);
            if (i % 2 == 0)
                resultado += Character.toUpperCase(c);
            else
                resultado += c;
            i++;
        } while (i < frase.length());
        System.out.println("Resultado (do-while): " + resultado);
    }
}
