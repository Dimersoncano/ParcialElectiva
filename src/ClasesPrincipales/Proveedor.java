/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPrincipales;

/**
 *
 * @author Dimerson
 */
public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String contacto;
    private String direccion;

    public Proveedor(int idProveedor, String nombre, String contacto, String direccion) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.contacto = contacto;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
}
