/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author leito
 */
public class Usuario {
    protected String nombre;
    protected String correo;
    protected char[] clave;
    protected ArrayList<Proveedor> proveedores;

    public Usuario(String nombre, String correo, char[] clave, ArrayList<Proveedor> proveedores) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.proveedores = proveedores;
    }
       public Usuario(String nombre, String correo, char[] clave) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;        
    }
   



    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public char[] getClave() {
        return clave;
    }
    public String getClaveS(){
        return Arrays.toString(clave);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setClave(char[] clave) {
        this.clave = clave;
    }

    public void registrarse(Usuario usuario,String correo){

    }

}
