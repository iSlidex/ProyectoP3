/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.ArrayList;

/**
 *
 * @author leito
 */
public class Administrador extends Usuario {
    
    public Administrador(String nombre, String correo, char[] clave, ArrayList<Proveedor> proveedores) {
        super(nombre, correo, clave, proveedores);
    }
    

}
