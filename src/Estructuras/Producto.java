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
    protected String prov;   
    protected double precio;    
    protected String id;
    protected int unidades;
    protected int vendidos;

    public Producto(String nombre, String prov, double precio,String id, int unidades, int vendidos) {
        this.nombre = nombre;
        this.prov = prov;
        //this.tipo = tipo;
        this.precio = precio;
        this.id = id;
        this.unidades = unidades;
        this.vendidos=vendidos;
    }

    public Producto() {
         nombre="";
         prov="";   
         precio=0;    
         id="";
         unidades=0;
         vendidos=0;
    }

    public String getNombre() {
        return nombre;
    }

//public String getTipo() {
//    return tipo;
//}
//
//public void setTipo(String tipo) {
//    this.tipo = tipo;
//}

    public String getProv() {
        return prov;
    }
    
    public int getUnidades(){
        return unidades;
    }

    public int getVendidos() {
        return vendidos;
    }


    public double getPrecio() {
        return precio;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }

    
    public void setUnidades(int unidades){
        this.unidades=unidades;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setId(String id) {
        this.id = id;
    }
 
}
