/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPrincipales;

/**
 *
 * @author Dimerson
 */
import java.util.Date;

public class HistorialMovimiento {
    private int idMovimiento;
    private Articulo articulo;
    private UbicacionArticulo ubicacionAnterior;
    private UbicacionArticulo ubicacionNueva;
    private Date fechaMovimiento;

    public HistorialMovimiento(int idMovimiento, Articulo articulo, UbicacionArticulo ubicacionAnterior, UbicacionArticulo ubicacionNueva, Date fechaMovimiento) {
        this.idMovimiento = idMovimiento;
        this.articulo = articulo;
        this.ubicacionAnterior = ubicacionAnterior;
        this.ubicacionNueva = ubicacionNueva;
        this.fechaMovimiento = fechaMovimiento;
    }
}