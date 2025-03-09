/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPrincipales;

/**
 *
 * @author Dimerson
 */
import java.util.List;

public class EntradaMercancia {
    private int idEntrada;
    private Transportista transportista;
    private List<Articulo> articulosRecibidos;

    public EntradaMercancia(int idEntrada, Transportista transportista, List<Articulo> articulosRecibidos) {
        this.idEntrada = idEntrada;
        this.transportista = transportista;
        this.articulosRecibidos = articulosRecibidos;
    }
}