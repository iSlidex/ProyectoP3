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
public class listaProd {
    
    ArrayList <Producto> lista;

    public listaProd(ArrayList<Producto> lista) {
        this.lista = lista;
    }

    public listaProd() {
        this.lista = new ArrayList<>();
    }
    

    public ArrayList<Producto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Producto> lista) {
        this.lista = lista;
    }
    
    public void incluirProd(Producto P) {
        lista.add(P);
    }
    public void incluirProd(int index,Producto P) {
        lista.add(index,P);
    }
    public void eliminarProd(Producto P) {
        lista.remove(P);
    }
    public int indiceProd(Producto P){
       return lista.indexOf(P);
    }
    public boolean existeProd (){
        return lista.isEmpty();
    }
}
