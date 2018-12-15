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
public class listaProv {



/**
 *
 * @author leito */

    ArrayList <Proveedor> lista;

    public listaProv(ArrayList<Proveedor> lista) {
        this.lista = lista;
    }

    public listaProv() {
        this.lista = new ArrayList<>();
    }
    

    public ArrayList<Proveedor> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Proveedor> lista) {
        this.lista = lista;
    }
    
    public void incluirProv(Proveedor P) {
        lista.add(P);
    }
    public void incluirProv(int index,Proveedor P) {
        lista.add(index,P);
    }
    public void eliminarProv(Proveedor P) {
        lista.remove(P);
    }
    public int indiceProv(Proveedor P){
       return lista.indexOf(P);
    }
    public boolean existeProv (){
        return lista.isEmpty();
    }
    
}


