/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;
import Estructuras.Usuario;
import java.util.ArrayList;
/**
 *
 * @author leito
 */
public class Proveedor {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String horario;
    protected Usuario acargo;
    protected ArrayList<Producto> productos;

    public Proveedor(String nombre, String direccion, String telefono, String horario, Usuario acargo, ArrayList<Producto> productos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
        this.acargo = acargo;
        this.productos = productos;
    }



    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getHorario() {
        return horario;
    }

    public Usuario getAcargo() {
        return acargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setAcargo(Usuario acargo) {
        this.acargo = acargo;
    }
    
}
