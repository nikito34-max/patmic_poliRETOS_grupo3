package pkSecciones.Seccion4;

import java.util.Scanner;

public class C08 {
    private String solicitarRespuesta(Scanner entrada) {
        String respuesta;
        while (true) {
            respuesta = entrada.nextLine().trim().toLowerCase();
            if (!respuesta.isEmpty() && respuesta.matches("[a-záéíóúñ]+")) {
                break;
            } else {
                System.out.print("Error: Ingresa solo letras. Intenta nuevamente: ");
            }
        }
        return respuesta;
    }

    public void g3_anagramaShowFor(Scanner entrada) {
        entrada.nextLine();
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
            respuesta = solicitarRespuesta(entrada);
            if (respuesta.equals(anagrama)) {
                System.out.println("Correcto");
                acierto = true;
            } else if (intentos > 1) {
                System.out.println("Incorrecto. Te quedan " + (intentos - 1) + " intento(s).");
            }
        }
        if (!acierto) System.out.println("Perdiste con el for. El anagrama era: " + anagrama.toUpperCase());
    }

    public void g3_anagramaShowWhile(Scanner entrada) {
        entrada.nextLine();
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
        int intentos = 3;
        System.out.println("Adivina el anagrama de la siguiente palabra:");
        System.out.println("- " + palabra);
        while (intentos > 0 && !acierto) {
            System.out.print("(WHILE) Tu respuesta: ");
            respuesta = solicitarRespuesta(entrada);
            if (respuesta.equals(anagrama)) {
                System.out.println("Correcto");
                acierto = true;
            } else {
                intentos--;
                if (intentos > 0)
                    System.out.println("Incorrecto. Te quedan " + intentos + " intento(s).");
            }
        }
        if (!acierto) System.out.println("Perdiste con el while. El anagrama era: " + anagrama.toUpperCase());
    }

    public void g3_anagramaShowDoWhile(Scanner entrada) {
        entrada.nextLine();
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
        int intentos = 3;
        System.out.println("Adivina el anagrama de la siguiente palabra:");
        System.out.println("- " + palabra);
        do {
            System.out.print("(DO-WHILE) Tu respuesta: ");
            respuesta = solicitarRespuesta(entrada);
            if (respuesta.equals(anagrama)) {
                System.out.println("Correcto");
                acierto = true;
            } else {
                intentos--;
                if (intentos > 0)
                    System.out.println("Incorrecto. Te quedan " + intentos + " intento(s).");
            }
        } while (!acierto && intentos > 0);
        if (!acierto) System.out.println("Perdiste con el do-while. El anagrama era: " + anagrama.toUpperCase());
    }
}

