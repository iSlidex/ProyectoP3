/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;
import java.util.*;

/**
 *
 * @author leito
 */
public class listaUser {
    ArrayList <Usuario> lista;

    public listaUser(ArrayList<Usuario> lista) {
        this.lista = lista;
    }

    public listaUser() {
        this.lista = new ArrayList<>();
    }    

    public ArrayList<Usuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Usuario> lista) {
        this.lista = lista;
    }
    
    public void incluirUser(Usuario P) {
        lista.add(P);
    }
    public void incluirUser(int index,Usuario P) {
        lista.add(index,P);
    }
    public void eliminarUser(Usuario P) {
        lista.remove(P);
    }
    public int indiceUser(Usuario P){
       return lista.indexOf(P);
    }
    public boolean existeUser (){
        return lista.isEmpty();
    }
    
}
