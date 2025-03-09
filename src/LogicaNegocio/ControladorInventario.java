package logicanegocio;

// Importación de clases (corregido en minúsculas)
import ClasesPrincipales.Articulo;
import ClasesPrincipales.Cliente;
import ClasesPrincipales.EntradaMercancia;
import ClasesPrincipales.HistorialMovimiento;
import ClasesPrincipales.PedidoSalida;
import ClasesPrincipales.Proveedor;
import ClasesPrincipales.Transportista;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorInventario {
    private List<Cliente> clientes; 
    private List<PedidoSalida> pedidos; // Lista de pedidos realizados
    private List<Proveedor> proveedores; // Lista de proveedores
    private List<Transportista> transportistas; // Lista de transportistas
    private List<EntradaMercancia> entradasMercancia; // Lista de entradas de mercancía
    private List<HistorialMovimiento> movimientos; // Lista de movimientos en el almacén

    // Constructor - Inicializa listas vacías para almacenar datos
    public ControladorInventario() {
        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.proveedores = new ArrayList<>();
        this.transportistas = new ArrayList<>();
        this.entradasMercancia = new ArrayList<>();
        this.movimientos = new ArrayList<>();
    }

    // Método para agregar un cliente y mostrar confirmación
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        JOptionPane.showMessageDialog(null, "Cliente agregado: " + cliente.getNombre());
    }

    // Método para agregar un pedido y mostrar confirmación
    public void agregarPedido(PedidoSalida pedido) {
        pedidos.add(pedido);
        JOptionPane.showMessageDialog(null, "Pedido agregado con fecha: " + pedido.getFechaPedido());
    }

    // Método para agregar un proveedor y mostrar confirmación
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
        JOptionPane.showMessageDialog(null, "Proveedor agregado: " + proveedor.getNombre());
    }

    // Método para agregar un transportista y mostrar confirmación
    public void agregarTransportista(Transportista transportista) {
        transportistas.add(transportista);
        JOptionPane.showMessageDialog(null, "Transportista agregado: " + transportista.getNombre());
    }

    // Método para registrar una entrada de mercancía
    public void registrarEntradaMercancia(EntradaMercancia entrada) {
        entradasMercancia.add(entrada);
        JOptionPane.showMessageDialog(null, "Entrada de mercancía registrada correctamente.");
    }

    // Método para registrar un movimiento de mercancía
    public void registrarMovimiento(HistorialMovimiento movimiento) {
        movimientos.add(movimiento);
        JOptionPane.showMessageDialog(null, "Movimiento registrado correctamente.");
    }

    // Método para mostrar todos los pedidos en el sistema
    public void mostrarPedidos() {
        if (pedidos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay pedidos registrados.");
            return;
        }

        StringBuilder mensaje = new StringBuilder("📋 Lista de Pedidos:\n");
        for (PedidoSalida pedido : pedidos) {
            mensaje.append("📦 Pedido Fecha: ").append(pedido.getFechaPedido()).append("\n")
                   .append("   Cliente: ").append(pedido.getCliente().getNombre()).append("\n")
                   .append("   Destinatario: ").append(pedido.getDestinatario().getNombre()).append("\n")
                   .append("   Artículos: \n");

            for (Articulo articulo : pedido.getArticulos()) {
                mensaje.append("      - ").append(articulo.getNombre()).append("\n");
            }

            mensaje.append("\n");
        }
        
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Pedidos Registrados", JOptionPane.INFORMATION_MESSAGE);
    }
}
