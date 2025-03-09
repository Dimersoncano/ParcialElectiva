
package ClasesPrincipales;

/**
 *
 * @author Dimerson
 */
public class Articulo {
    private int idArticulo; 
    private String nombre; 
    private String dimensiones; 
    private double precio; 
    private boolean asegurado; 

    // Constructor - Inicializa un nuevo artículo con sus datos
    public Articulo(int idArticulo, String nombre, String dimensiones, double precio, boolean asegurado) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.dimensiones = dimensiones;
        this.precio = precio;
        this.asegurado = asegurado;
    }

    // Método para obtener el nombre del artículo
    public String getNombre() {
        return nombre;
    }
}