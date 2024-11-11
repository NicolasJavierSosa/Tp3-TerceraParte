package App;

import logger.Logger;

/**
 * Clase que simula una aplicación con múltiples procesos intentando escribir
 * en el archivo de log desde diferentes partes del programa.
 */
public class App {

    /**
     * Método principal que simula el uso del Logger en diferentes procesos.
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Simulación de múltiples hilos (procesos) usando el logger
        Thread process1 = new Thread(() -> {
            Logger logger = Logger.getInstance();
            logger.info("Proceso 1: Inicio de operación");
            logger.warning("Proceso 1: Posible inconsistencia detectada");
            logger.error("Proceso 1: Error crítico en operación");
        });

        Thread process2 = new Thread(() -> {
            Logger logger = Logger.getInstance();
            logger.info("Proceso 2: Inicio de operación");
            logger.warning("Proceso 2: Advertencia de rendimiento");
            logger.error("Proceso 2: Error de conexión");
        });

        // Iniciar los hilos de simulación
        process1.start();
        process2.start();
    }
}
