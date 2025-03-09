
package ClasesPrincipales;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dimerson
 */
public class Destinatario {
    private int idDestinatario; // Identificador único del destinatario
    private String nombre; // Nombre del destinatario
    private String direccion; // Dirección del destinatario
    private String telefono; // Teléfono del destinatario

    // Constructor - Inicializa un destinatario con sus datos
    public Destinatario(int idDestinatario, String nombre, String direccion, String telefono) {
        this.idDestinatario = idDestinatario;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Método para obtener el nombre del destinatario
    public String getNombre() {
        return nombre;
    }
}