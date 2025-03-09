
package ClasesPrincipales;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Dimerson
 */
public class Cliente {
    private int idCliente; 
    private String nombre; 
    private String cedula; 
    private String direccion; 
    private String telefono; 
    private String clasificacion; 
    private List<PedidoSalida> pedidos; 

    // Constructor - Inicializa un nuevo cliente con sus datos
    public Cliente(int idCliente, String nombre, String cedula, String direccion, String telefono, String clasificacion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clasificacion = clasificacion;
        this.pedidos = new ArrayList<>();
    }

    // Método para agregar pedidos a la lista del cliente
    public void agregarPedido(PedidoSalida pedido) {
        pedidos.add(pedido);
    }

    // Método para obtener el nombre del cliente
    public String getNombre() {
        return nombre;
    }
}            
            
