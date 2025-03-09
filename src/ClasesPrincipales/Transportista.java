/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPrincipales;

/**
 *
 * @author Dimerson
 */
public class Transportista {
    private int idTransportista;
    private String nombre;
    private String empresa;
    private String telefono;

    public Transportista(int idTransportista, String nombre, String empresa, String telefono) {
        this.idTransportista = idTransportista;
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
    }

   // Método para obtener el nombre del transportista
public String getNombre() {
    return nombre;
}
}