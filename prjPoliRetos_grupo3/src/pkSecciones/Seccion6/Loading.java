package pkSecciones.seccion6;

import java.util.Scanner;
import java.util.Random;

/**
 * Este programa une 13 animaciones de carga diferentes en un solo menú interactivo.
 * El menú principal usa un bucle do-while para permitir múltiples ejecuciones.
 */
public class Loading {

    // --- Definiciones de Códigos de Color ANSI ---
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m"; // Verde
    public static final String ANSI_RED = "\u001B[31m"; // Rojo
    public static final String ANSI_CYAN = "\u001B[36m"; // Cian
    
    // El método main principal que actúa como un menú, usando do-while.
    public void run() {
        
        Scanner scanner = new Scanner(System.in);
        boolean ejecutarOtra;

        // EL BUCLE DO-WHILE: Repite el menú hasta que el usuario elija salir.
        do {
            System.out.println("******************************************");
            System.out.println("*** COLECCIÓN DE ANIMACIONES DE CARGA ***");
            System.out.println("******************************************");
            System.out.println("1. Spinner Simple (\\|/-)");
            System.out.println("2. Barra de Progreso (###)");
            System.out.println("3. Carácter Móvil (---)");
            System.out.println("4. 'Waiting' (oOo)");
            System.out.println("5. Barra con Punta (=>)");
            System.out.println("6. Barra Deslizante (<=>)");
            System.out.println("7. Barra con Punta Rotatoria (=\\)");
            System.out.println("8. Carga de Nombre (John...)");
            System.out.println("9. Carga en Escalera (J... o... h... n...)");
            System.out.println("10. Simulación de Descarga con Color (L10)");
            System.out.println("11. Señal Simétrica Dinámica (L11)"); // Limpio
            System.out.println("12. Barras De Sonido Vectorial (L12)");  // Limpio
            System.out.println("13. Desplazar Figura (L13)"); // Limpio
            System.out.println("0. Salir del programa.");
            System.out.println("******************************************");
            System.out.print("\nPor favor, elija una animación (1-13): ");

            int choice = 0;
            try {
                String line = scanner.nextLine();
                if (line.isEmpty()) { choice = -1; } 
                else { choice = Integer.parseInt(line); }
            } catch (NumberFormatException e) {
                choice = -1;
            }

            System.out.println(); // Separador

            switch (choice) {
                case 1: runL01_Spinner(); break;
                case 2: runL02_BarraConChar(scanner); break;
                case 3: runL03_CaracterMovil(scanner); break;
                case 4: runL04_Waiting(); break;
                case 5: runL05_BarraConPunta(); break;
                case 6: runL06_BarraDeslizante(); break;
                case 7: runL07_BarraPuntaRotatoria(); break;
                case 8: runL08_CargaDeNombre(scanner); break;
                case 9: runL09_CargaEnEscalera(scanner); break;
                case 10: runL10_SimulacionDescarga(); break;
                case 11: runL11_SenalSimetrica(); break;
                case 12: runL12_BarrasDeSonido(); break;
                case 13: runL13_Desplazamiento(); break;
                case 0: 
                    ejecutarOtra = false; 
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
            
            // Lógica para repetir el menú
            if (choice != 0) {
                System.out.print("\n¿Desea ejecutar otra animación? (s/n): ");
                String respuesta = scanner.nextLine().trim().toLowerCase();
                ejecutarOtra = respuesta.startsWith("s");
                System.out.println();
            } else {
                ejecutarOtra = false;
            }

        } while (ejecutarOtra);
        
        scanner.close();
    }

    // ===========================================
    // === MÉTODOS DE ANIMACIÓN (L01 a L13) ===
    // ===========================================
    
    // --- ANIMACIÓN 1 (Original L01) ---
    public static void runL01_Spinner() {
        char[] spinner = {'\\', '|', '/', '-'};
        System.out.println("Iniciando carga...");
        try {
            for (int i = 0; i <= 100; i++) {
                char s = spinner[i % 4];
                System.out.print("\r" + s + " " + i + "%");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("\n¡Carga completa!");
    }

    // --- ANIMACIÓN 2 (Original L02) ---
    public static void runL02_BarraConChar(Scanner scanner) {
        System.out.print("Ingrese el carácter para la barra de carga: ");
        String input = scanner.nextLine();
        char fillChar = (input.isEmpty()) ? '#' : input.charAt(0);
        
        final int LONGITUD_BARRA = 20;
        System.out.println("Iniciando carga...");

        try {
            for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
                int caracteresRellenos = (int) (porcentaje / 100.0 * LONGITUD_BARRA);
                String parteRellena = String.valueOf(fillChar).repeat(caracteresRellenos);
                int caracteresVacios = LONGITUD_BARRA - caracteresRellenos;
                String parteVacia = " ".repeat(caracteresVacios);
                
                System.out.printf("\r[%s%s] %3d%%", parteRellena, parteVacia, porcentaje);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("\n¡Carga completada!");
    }

    // --- ANIMACIÓN 3 (Original L03) ---
    public static void runL03_CaracterMovil(Scanner scanner) {
        System.out.print("Ingrese el carácter que se desplazará: ");
        String input = scanner.nextLine();
        char movingChar = (input.isEmpty()) ? '-' : input.charAt(0);

        final int LONGITUD_BARRA = 20;
        System.out.println("Iniciando animación...");

        try {
            for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
                int posicion = (int) (porcentaje / 100.0 * (LONGITUD_BARRA - 1));
                String parteAntes = " ".repeat(posicion);
                String parteDespues = " ".repeat((LONGITUD_BARRA - 1) - posicion);
                
                System.out.printf("\r[%s%c%s] %3d%%", parteAntes, movingChar, parteDespues, porcentaje);
                Thread.sleep(60);
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("\nAnimación completada!");
    }

    // --- ANIMACIÓN 4 (Original L04) ---
    public static void runL04_Waiting() {
        char[] spinner = {'o', 'O', 'o', 'o'};
        System.out.println("Iniciando 'Waiting'...");

        try {
            for (int i = 0; i <= 100; i++) {
                int index = i % 4;
                String pattern;
                
                if (index == 0) { pattern = spinner[0] + "" + spinner[1] + "" + spinner[2]; } 
                else if (index == 1) { pattern = spinner[0] + "" + spinner[2] + "" + spinner[1]; }
                else if (index == 2) { pattern = spinner[1] + "" + spinner[2] + "" + spinner[0]; }
                else { pattern = spinner[0] + "" + spinner[1] + "" + spinner[2]; }
                
                System.out.print("\r" + pattern + " " + i + "%");
                Thread.sleep(70); 
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("\n¡Proceso finalizado (100%)!");
    }

    // --- ANIMACIÓN 5 (Original L05) ---
    public static void runL05_BarraConPunta() {
        final int LONGITUD_BARRA = 20;
        char[] puntaSpinner = {'>', '-'}; 
        final char FILL_CHAR = '='; 

        System.out.println("Iniciando carga avanzada...");

        try {
            for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
                int caracteresRellenos = (int) (porcentaje / 100.0 * (LONGITUD_BARRA - 1));
                char punta = puntaSpinner[porcentaje % 2]; 
                String parteRellena = String.valueOf(FILL_CHAR).repeat(caracteresRellenos);
                int caracteresVacios = LONGITUD_BARRA - caracteresRellenos - 1; 
                String parteVacia = " ".repeat(caracteresVacios);
                
                String barra;
                if (porcentaje == 100) { barra = String.valueOf(FILL_CHAR).repeat(LONGITUD_BARRA); } 
                else { barra = parteRellena + punta + parteVacia; }
                
                System.out.printf("\r[%s] %3d%%", barra, porcentaje);
                Thread.sleep(50); 
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("\n¡Carga avanzada completada!");
    }

    // --- ANIMACIÓN 6 (Original L06) ---
    public static void runL06_BarraDeslizante() {
        final int LONGITUD_BARRA = 20;
        final String SECUENCIA_MOVIMIENTO = "<=>"; 
        final int LONGITUD_SECUENCIA = SECUENCIA_MOVIMIENTO.length();

        System.out.println("Iniciando animación de barra deslizante...");

        try {
            for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
                final int ESPACIO_MOVIMIENTO = LONGITUD_BARRA - LONGITUD_SECUENCIA; 
                int posicionInicial = (int) (porcentaje / 100.0 * ESPACIO_MOVIMIENTO);
                
                String parteAntes = " ".repeat(posicionInicial);
                int caracteresVaciosDespues = LONGITUD_BARRA - posicionInicial - LONGITUD_SECUENCIA;
                String parteDespues = " ".repeat(caracteresVaciosDespues);

                String barra = parteAntes + SECUENCIA_MOVIMIENTO + parteDespues;
                System.out.printf("\r[%s] %3d%%", barra, porcentaje);
                Thread.sleep(50); 
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("\n¡Desplazamiento completado (100%)!");
    }

    // --- ANIMACIÓN 7 (Original L07) ---
    public static void runL07_BarraPuntaRotatoria() {
        final int LONGITUD_BARRA = 20;
        char[] spinner = {'\\', '|', '/', '-'}; 
        final char FILL_CHAR = '='; 

        System.out.println("Iniciando barra de carga con punta rotatoria...");

        try {
            for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
                int caracteresRellenos = (int) (porcentaje / 100.0 * (LONGITUD_BARRA - 1));
                char punta = spinner[porcentaje % 4]; 
                String parteRellena = String.valueOf(FILL_CHAR).repeat(caracteresRellenos);
                int caracteresVacios = LONGITUD_BARRA - caracteresRellenos - 1; 
                String parteVacia = " ".repeat(caracteresVacios);
                
                String barra;
                if (porcentaje == 100) { barra = String.valueOf(FILL_CHAR).repeat(LONGITUD_BARRA); } 
                else { barra = parteRellena + punta + parteVacia; }
                
                System.out.printf("\r[%s] %3d%%", barra, porcentaje);
                Thread.sleep(50); 
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("\n¡Carga con punta rotatoria completada!");
    }

    // --- ANIMACIÓN 8 (Original L08) ---
    public static void runL08_CargaDeNombre(Scanner scanner) {
        System.out.print("Ingrese su nombre y apellido: ");
        String nombreCompleto = scanner.nextLine();

        String textoCarga = nombreCompleto.trim(); 
        final int LONGITUD_TOTAL = textoCarga.length();
        
        if (LONGITUD_TOTAL == 0) {
            System.out.println("No se ingresó ningún texto. Terminando la animación.");
            return;
        }

        System.out.println("Iniciando carga del nombre...");

        try {
            for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
                int letrasAMostrar = (int) (porcentaje / 100.0 * LONGITUD_TOTAL);
                
                if (porcentaje == 100) { letrasAMostrar = LONGITUD_TOTAL; }
                
                String parteVisible = textoCarga.substring(0, letrasAMostrar);
                int espaciosVacios = LONGITUD_TOTAL - letrasAMostrar;
                String parteVacia = " ".repeat(espaciosVacios);

                String barra = parteVisible + parteVacia;
                System.out.printf("\r[%s] %3d%%", barra, porcentaje);
                Thread.sleep(70); 
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("\n¡Carga de nombre completada!");
    }

    // --- ANIMACIÓN 9 (Original L09) ---
    public static void runL09_CargaEnEscalera(Scanner scanner) {
        System.out.print("Ingrese su nombre y apellido: ");
        String nombreCompleto = scanner.nextLine();

        String textoCarga = nombreCompleto.trim(); 
        final int LONGITUD_TOTAL = textoCarga.length();
        
        if (LONGITUD_TOTAL == 0) {
            System.out.println("No se ingresó ningún texto. Terminando la animación.");
            return;
        }
        
        final int INCREMENTO_PORCENTAJE = 100 / Math.max(1, LONGITUD_TOTAL);
        System.out.println("Iniciando carga en formato de escalera...\n");

        try {
            for (int i = 0; i < LONGITUD_TOTAL; i++) {
                char letraActual = textoCarga.charAt(i);
                int porcentajeActual = (i + 1) * INCREMENTO_PORCENTAJE;
                
                if (i == LONGITUD_TOTAL - 1) { porcentajeActual = 100; }
                
                String indentacion = " ".repeat(i);
                System.out.printf("%s%c %3d%%\n", indentacion, letraActual, porcentajeActual);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("\n¡Carga en escalera completada!");
    }

    // --- ANIMACIÓN 10 (Original L10) ---
    public static void runL10_SimulacionDescarga() {
        
        Random random = new Random();
        double tamanoTotalKB = 10.0 + (100.0 - 10.0) * random.nextDouble();
        tamanoTotalKB = Math.round(tamanoTotalKB * 10.0) / 10.0; 
        
        final int LONGITUD_BARRA = 25;
        final char FILL_CHAR = '=';
        final String NOMBRE_ARCHIVO = "ArchivoYar1-win_amd64.whl";
        
        System.out.println("Downloading " + ANSI_RED + NOMBRE_ARCHIVO + ANSI_RESET + " (" + tamanoTotalKB + " kB)");

        try {
            for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
                
                double descargadoKB = tamanoTotalKB * (porcentaje / 100.0);
                descargadoKB = Math.round(descargadoKB * 10.0) / 10.0;
                
                int caracteresRellenos = (int) (porcentaje / 100.0 * LONGITUD_BARRA);
                String parteRellena = String.valueOf(FILL_CHAR).repeat(caracteresRellenos);
                int caracteresVacios = LONGITUD_BARRA - caracteresRellenos;
                String parteVacia = " ".repeat(caracteresVacios);
                
                System.out.printf("\r" + ANSI_GREEN + "%s" + ANSI_RESET + "%s  %.1f / %.1f kB", 
                    parteRellena, parteVacia, descargadoKB, tamanoTotalKB);

                Thread.sleep(50); 
            }
            
        } catch (InterruptedException e) { e.printStackTrace(); }
        
        System.out.println("\nDescarga completada!");
    }

    // --- ANIMACIÓN 11 (Original L11 - Señal Simétrica) ---
    public static void runL11_SenalSimetrica() {
        
        Random random = new Random();
        final int NIVEL_FIJO = 50; 
        final int DELAY_MS = 200; 
        final int MAX_CICLOS = 50;
        
        System.out.println("Iniciando simulación de señal simétrica...");

        try {
            for (int ciclo = 0; ciclo < MAX_CICLOS; ciclo++) {
                
                int longitudSenal = random.nextInt(11); // 0 a 10
                String lado = "-".repeat(longitudSenal); 
                
                String senal = ANSI_CYAN + lado + "|" + lado + ANSI_RESET;
                
                System.out.printf("\rSeñal [%s] | Nivel: %d", 
                                  senal, NIVEL_FIJO);

                Thread.sleep(DELAY_MS); 
            }
            
        } catch (InterruptedException e) { e.printStackTrace(); }
        
        System.out.println("\nSimulación de señal finalizada.");
    }

    // --- NUEVA ANIMACIÓN 12 (Barras De Sonido Vectorial) ---
    public static void runL12_BarrasDeSonido() {
        Random random = new Random();
        final char FILL_CHAR = '=';
        final int ANCHO_BARRA = 3; 
        final int NUM_BARRAS = 8; 
        final int MAX_HEIGHT = 8; 
        final int DELAY_MS = 100;
        final String COLOR = ANSI_GREEN;
        final int MAX_CICLOS = 50; 
        
        System.out.println("Iniciando Barras de Sonido Vectorial...");

        try {
            for (int ciclo = 0; ciclo < MAX_CICLOS; ciclo++) {
                
                // Mover cursor hacia arriba (MAX_HEIGHT + 1 línea de estado) para sobrescribir
                System.out.print("\u001b[" + (MAX_HEIGHT + 1) + "A");

                // Dibujar la figura fila por fila, desde la cima (h=0) hasta la base (h=MAX_HEIGHT-1)
                for (int h = 0; h < MAX_HEIGHT; h++) {
                    
                    int nivelVertical = MAX_HEIGHT - 1 - h; // Nivel actual, 7 (abajo) a 0 (arriba)
                    StringBuilder linea = new StringBuilder();
                    
                    // Generar alturas aleatorias para todas las barras en este ciclo
                    int[] alturas = new int[NUM_BARRAS];
                    for(int b = 0; b < NUM_BARRAS; b++) {
                        alturas[b] = random.nextInt(MAX_HEIGHT + 1); // 0 a 8
                    }
                    
                    // Dibujar barra por barra horizontalmente
                    for (int b = 0; b < NUM_BARRAS; b++) {
                        
                        // Si el nivel vertical actual es menor que la altura aleatoria de la barra, 
                        // la barra debe estar 'encendida' en esta fila.
                        if (nivelVertical < alturas[b]) {
                            linea.append(COLOR).append(String.valueOf(FILL_CHAR).repeat(ANCHO_BARRA)).append(ANSI_RESET);
                        } else {
                            linea.append(" ".repeat(ANCHO_BARRA)); // Espacio si está "apagada"
                        }
                        linea.append(" "); // Separador entre barras
                    }
                    
                    System.out.println(linea.toString());
                }
                
                // Imprimir una línea de estado debajo de la figura
                System.out.println("Ciclo: " + (ciclo + 1) + "/" + MAX_CICLOS);

                Thread.sleep(DELAY_MS); 
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
        
        System.out.println("\nSimulación de Barras de Sonido finalizada.");
    }

    // --- NUEVA ANIMACIÓN 13 (Desplazar Figura) ---
    public static void runL13_Desplazamiento() {
        
        final String[] FIGURA = {
            "\\ | | /",
            "(> <)",
            "oo0-(_)-0oo"
        };
        final int FILAS_FIGURA = FIGURA.length;
        final int MAX_DESPLAZAMIENTO = 30; 
        final int DELAY_MS = 50; 
        final int MAX_CICLOS = 50; 
        
        System.out.println("Iniciando animación de desplazamiento...");

        try {
            for (int ciclo = 0; ciclo < MAX_CICLOS; ciclo++) {
                
                // FASE 1: DERECHA (Ciclos 0-24)
                if (ciclo < MAX_CICLOS / 2) {
                    int i = ciclo * (MAX_DESPLAZAMIENTO / (MAX_CICLOS / 2));
                    String espacio = " ".repeat(i);
                    System.out.print("\u001b[" + FILAS_FIGURA + "A"); 
                    
                    for (String linea : FIGURA) {
                        System.out.println(espacio + ANSI_RED + linea + ANSI_RESET);
                    }
                }
                // FASE 2: IZQUIERDA (Ciclos 25-49)
                else {
                    int i = MAX_DESPLAZAMIENTO - ((ciclo - (MAX_CICLOS / 2)) * (MAX_DESPLAZAMIENTO / (MAX_CICLOS / 2)));
                    String espacio = " ".repeat(i);
                    System.out.print("\u001b[" + FILAS_FIGURA + "A"); 
                    
                    for (String linea : FIGURA) {
                        System.out.println(espacio + ANSI_CYAN + linea + ANSI_RESET);
                    }
                }
                
                Thread.sleep(DELAY_MS);
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
        
        System.out.println("\nAnimación de desplazamiento finalizada.");
    }
}