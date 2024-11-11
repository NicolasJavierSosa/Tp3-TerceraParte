package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 * Clase Singleton para gestionar el sistema de logging en la aplicación.
 * Garantiza que solo exista una única instancia de Logger y permite registrar
 * mensajes de error, advertencia e información en un archivo de log.
 */
public class Logger {
    private static Logger instance;
    private static final String LOG_FILE = "application.log";

    /**
     * Constructor privado para evitar la creación de instancias externas.
     */
    private Logger() {
        // Constructor privado para prevenir instanciación directa
    }

    /**
     * Obtiene la única instancia de Logger.
     * @return la instancia única de Logger
     */
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * Registra un mensaje de información en el archivo de log.
     * @param message el mensaje de información a registrar
     */
    public void info(String message) {
        log("INFO", message);
    }

    /**
     * Registra un mensaje de advertencia en el archivo de log.
     * @param message el mensaje de advertencia a registrar
     */
    public void warning(String message) {
        log("WARNING", message);
    }

    /**
     * Registra un mensaje de error en el archivo de log.
     * @param message el mensaje de error a registrar
     */
    public void error(String message) {
        log("ERROR", message);
    }

    /**
     * Registra un mensaje en el archivo de log con el nivel especificado.
     * @param level el nivel de log (INFO, WARNING, ERROR)
     * @param message el mensaje a registrar
     */
    private void log(String level, String message) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.printf("[%s] [%s]: %s%n", LocalDateTime.now(), level, message);
        } catch (IOException e) {
            System.err.println("No se pudo escribir en el archivo de log: " + e.getMessage());
        }
    }
}
