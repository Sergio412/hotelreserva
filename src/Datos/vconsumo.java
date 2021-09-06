/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Sergio
 */
public class vconsumo {
    private int idconsumo;
    private int idreserva;
    private int idproducto;
    private double cantidad_producto;
    private double precio_venta;
    private String estado; 

    public vconsumo() {
    }

    public vconsumo(int idconsumo, int idreserva, int idproducto, double cantidad_producto, double precio_venta, String estado) {
        this.idconsumo = idconsumo;
        this.idreserva = idreserva;
        this.idproducto = idproducto;
        this.cantidad_producto = cantidad_producto;
        this.precio_venta = precio_venta;
        this.estado = estado;
    }

    public int getIdconsumo() {
        return idconsumo;
    }

    public void setIdconsumo(int idconsumo) {
        this.idconsumo = idconsumo;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public double getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(double cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
