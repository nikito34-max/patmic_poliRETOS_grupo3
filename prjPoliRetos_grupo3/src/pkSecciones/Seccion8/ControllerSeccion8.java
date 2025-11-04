package pkSecciones.Seccion8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerSeccion8 {
    private List<Automata> automatas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public ControllerSeccion8() {
        automatas = List.of(
            new Automata01(),
            new Automata02(),
            new Automata03(),
            new Automata04(),
            new Automata05(),
            new Automata06(),
            new Automata07(),
            new Automata08()
        );
    }

    public void g3_init() {
        System.out.println("Automatas disponibles:");
        for (int i = 0; i < automatas.size(); i++) {
            System.out.println("\t" + i + " - " + automatas.get(i).getDescription());
        }
    }

    public Automata seleccionarAutomata() {
        System.out.print("Ingrese el índice del automata (8 -> para salir): ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        if (indice == 8) {
            System.exit(0);
        } else if (indice < 0 || indice >= automatas.size()) {
            System.out.println("Índice inválido, se selecciona el primero.");
            indice = 0;
        } 
        return automatas.get(indice);
    }

    public void g3_runAutomata(Automata automata) {
        System.out.println("Ingrese cadena para validar (vacío para salir, r -> regresar atras):");
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            if (input.equals("r")) {
                g3_init();
                Automata seleccionado = seleccionarAutomata();
                g3_runAutomata(seleccionado);            
            };
            System.out.print("Con for: ");
            automata.g3_ValidarWithFor(input);
            System.out.print("Con while: ");
            automata.g3_ValidarWithWhile(input);
            System.out.print("Con dow-while: ");
            automata.g3_ValidarWithDoWhile(input);
        }
    }

    public void g3_ejecutar() {
        g3_init();
        Automata seleccionado = seleccionarAutomata();
        g3_runAutomata(seleccionado);
        System.out.println("Fin del programa.");
    }
}
