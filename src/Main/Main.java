package main;
import ClasesPrincipales.Articulo;
import ClasesPrincipales.Cliente;
import ClasesPrincipales.Destinatario;
import ClasesPrincipales.EntradaMercancia;
import ClasesPrincipales.PedidoSalida;
import ClasesPrincipales.Proveedor;
import ClasesPrincipales.Transportista;
import Clasesprincipales.*; 
import logicanegocio.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inicializar el controlador del sistema
        ControladorInventario inventario = new ControladorInventario();
        
        // Solicitar datos del cliente
        int idCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cliente:"));
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
        Cliente cliente1 = new Cliente(idCliente, nombreCliente, cedula, "Calle 1", "555-1234", "Muy bueno");
        inventario.agregarCliente(cliente1);
        
        // Solicitar datos del proveedor
        int idProveedor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del proveedor:"));
        String nombreProveedor = JOptionPane.showInputDialog("Ingrese el nombre del proveedor:");
        String contactoProveedor = JOptionPane.showInputDialog("Ingrese el contacto del proveedor:");
        String direccionProveedor = JOptionPane.showInputDialog("Ingrese la dirección del proveedor:");
        Proveedor proveedor1 = new Proveedor(idProveedor, nombreProveedor, contactoProveedor, direccionProveedor);
        inventario.agregarProveedor(proveedor1);
        
        // Solicitar datos del transportista
        int idTransportista = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del transportista:"));
        String nombreTransportista = JOptionPane.showInputDialog("Ingrese el nombre del transportista:");
        String empresaTransportista = JOptionPane.showInputDialog("Ingrese el nombre de la empresa de transporte:");
        String telefonoTransportista = JOptionPane.showInputDialog("Ingrese el teléfono del transportista:");
        Transportista transportista1 = new Transportista(idTransportista, nombreTransportista, empresaTransportista, telefonoTransportista);
        inventario.agregarTransportista(transportista1);
        
        //  Solicitar datos del destinatario
        int idDestinatario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del destinatario:"));
        String nombreDestinatario = JOptionPane.showInputDialog("Ingrese el nombre del destinatario:");
        String direccionDestinatario = JOptionPane.showInputDialog("Ingrese la dirección del destinatario:");
        String telefonoDestinatario = JOptionPane.showInputDialog("Ingrese el teléfono del destinatario:");
        Destinatario destinatario1 = new Destinatario(idDestinatario, nombreDestinatario, direccionDestinatario, telefonoDestinatario);
        
        // Registrar entrada de mercancía
        List<Articulo> articulosRecibidos = new ArrayList<>();
        int idArticulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del artículo recibido:"));
        String nombreArticulo = JOptionPane.showInputDialog("Ingrese el nombre del artículo:");
        String dimensiones = JOptionPane.showInputDialog("Ingrese las dimensiones del artículo:");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo:"));
        boolean asegurado = JOptionPane.showConfirmDialog(null, "¿El artículo está asegurado?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        Articulo articulo1 = new Articulo(idArticulo, nombreArticulo, dimensiones, precio, asegurado);
        articulosRecibidos.add(articulo1);

        if (transportista1 != null) {
            EntradaMercancia entrada1 = new EntradaMercancia(1, transportista1, articulosRecibidos);
            inventario.registrarEntradaMercancia(entrada1);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Transportista no válido. No se puede registrar la entrada de mercancía.");
        }
        
        // Crear pedido y agregar artículo
        PedidoSalida pedido1 = new PedidoSalida(1, "2025-03-10", cliente1, destinatario1);
        pedido1.agregarArticulo(articulo1);
        
        // Agregar pedido al inventario
        inventario.agregarPedido(pedido1);
        
// Destalles del pedido agregado
        String mensajePedido = "📦 Pedido agregado con éxito:\n" +
                               "Cliente: " + cliente1.getNombre() + "\n" +
                               "Destinatario: " + destinatario1.getNombre() + "\n" +
                               "Artículo: " + articulo1.getNombre() + "\n" +
                               "Fecha del pedido: " + pedido1.getFechaPedido();
        JOptionPane.showMessageDialog(null, mensajePedido, "Pedido Registrado", JOptionPane.INFORMATION_MESSAGE);

        // Mostrar pedidos registrados
        inventario.mostrarPedidos();
    }
}
