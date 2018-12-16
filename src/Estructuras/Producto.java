/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author leito
 */
public class Producto {
    protected String nombre;
    protected Proveedor prov;
    protected Usuario acargo;
    protected float precio;
    protected String tipo;
    protected String id;

    public Producto(String nombre, Proveedor prov, Usuario acargo, float precio, String tipo,String id) {
        this.nombre = nombre;
        this.prov = prov;
        this.acargo = acargo;
        this.tipo = tipo;
        this.precio = precio;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Proveedor getProv() {
        return prov;
    }

    public Usuario getAcargo() {
        return acargo;
    }

    public float getPrecio() {
        return precio;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProv(Proveedor prov) {
        this.prov = prov;
    }

    public void setAcargo(Usuario acargo) {
        this.acargo = acargo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setId(String id) {
        this.id = id;
    }
 
}
