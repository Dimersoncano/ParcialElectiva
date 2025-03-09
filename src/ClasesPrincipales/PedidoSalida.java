
package ClasesPrincipales;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dimerson
 */
public class PedidoSalida {
    private int idPedido; 
    private String fechaPedido; 
    private Cliente cliente;
    private Destinatario destinatario; 
    private List<Articulo> articulos; 

    // Constructor - Inicializa un pedido con su información
    public PedidoSalida(int idPedido, String fechaPedido, Cliente cliente, Destinatario destinatario) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.cliente = cliente;
        this.destinatario = destinatario;
        this.articulos = new ArrayList<>();
    }

    // Método para agregar un artículo al pedido
    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    // Método para obtener el cliente del pedido
public Cliente getCliente() {
    return cliente;
}

// Método para obtener el destinatario del pedido
public Destinatario getDestinatario() {
    return destinatario;
}

    // Método para obtener la fecha del pedido
    public String getFechaPedido() {
        return fechaPedido;
    }

  // Método para obtener la lista de artículos en el pedido
public List<Articulo> getArticulos() {
    return articulos;
}

}
