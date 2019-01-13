package Control;

import Estructuras.Producto;
import Estructuras.Proveedor;
import Estructuras.Usuario;
import Estructuras.listaProd;
import Vista.vistaCompraVenta;
import controlXml.controlXmlProd;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class controlCompraVenta extends controlador {
    List lista;
    Usuario currentUser;
    controlXmlProd xml = new controlXmlProd();
    ArrayList<Producto> objeto= xml.todasLosUser();
    listaProd cosas = new listaProd(objeto);

    ////////VARIABLES PARA vistaCompraVenta///////////////
    private JButton aceptar;
    private JButton cancelar;
    private JComboBox selAccion;
    private JTextField unidadesCVTx;

    ////////VARIABLES PARA vistaCompraVentaDespues///////////////

    private JButton pdf;
    private JButton regresar;
    private JTextField accionTx;
    private JTextField fechaTx;
    private JTextField preciototalTx;
    private JTextField prodTx;
    private JTextField provTx;
    private JTextField unidadesTx;

    /*Controlador para ventana vistaCompraVenta*/

    public controlCompraVenta(List lista, JTextField unidadesCVTx, JComboBox selAccion, JFrame ventana) {
        super(ventana);
        this.lista = lista;
        this.unidadesCVTx = unidadesCVTx;
        this.selAccion = selAccion;
    }

    /*Controlador para ventana vistaCompraVentaDespues*/

    
    public controlCompraVenta(List lista, JTextField accionTx, JTextField fechaTx, JTextField preciototalTx, JTextField prodTx, JTextField provTx, JTextField unidadesTx, JFrame ventana) {
        super(ventana);
        this.lista = lista;
        this.accionTx = accionTx;
        this.preciototalTx = preciototalTx;
        this.prodTx = prodTx;
        this.provTx = provTx;
        this.unidadesTx = unidadesTx;
    }

    public boolean validarCompraVenta(Integer unidades, String accion) throws InputMismatchException{
        boolean sePuede = true;
        if (!(selAccion.getSelectedItem().toString()).equals("Seleccionar")){
            try{
                /*Es numero*/
                int u = Integer.parseInt(unidadesCVTx.getText());
                    if (u>=1)
                        /*Es numero valido, 1 o mas*/
                        if (accion.equals("Venta"))
                            return (unidades-u>=0);
                            /*El numero de unidades para la venta es menor o igual que el numero de unidades en inventario*/
                        else return (u>=1);
                    else return false;
            }
            catch (InputMismatchException ime){
                sePuede = false;
            }
        }
        else return false;
        return sePuede;
    
    }
    
    public boolean validarDatos(){
        if (!(selAccion.getSelectedItem().toString()).equals("Seleccionar"))
            return true;
        else return false;
    }   

    public boolean unidadesCorrectas (Integer unidades, String accion){
        if((!unidadesCVTx.getText().equals("")))
            if (unidadesCVTx.getText().matches("^[0-9]*\\.?"))
                if (Integer.parseInt(unidadesCVTx.getText())>=1)
                    if (accion.equals("Venta")){
                        Integer aux = Integer.parseInt(unidadesCVTx.getText());
                        try{
                        int retval = aux.compareTo(unidades);
                            if (retval>=0)
                                return false;
                            else return true;
                        }
                        catch (NullPointerException npe){
                            return false;
                        }
                    }
                    else return (Integer.parseInt(unidadesCVTx.getText())>=1);
                else return false;
            else return false;
        else return false;
    }

    public boolean accionVacia(){
        if (!(selAccion.getSelectedItem().toString()).equals("Seleccionar"))
            return false;
        else return true; 
    }

    public ArrayList<String> mensajeErrorCV(String accion,Integer unidades){
        ArrayList<String> msg=new ArrayList<>();
        if(accionVacia())msg.add("<br>Acción: Debe seleccionar compra o venta\n");
        if(!(unidadesCorrectas(unidades,accion)) && (accion.equals("Venta"))){
            msg.add("<br>Unidades: Debe ser un numero positivo diferente de cero menor o igual al número de productos en el inventario\n");
        }
        else if (!(unidadesCorrectas(unidades,accion))){
            msg.add("<br>Unidades: Debe ser un numero positivo diferente de cero\n"); 
        }
        return msg;
    }

    public void actualizarProd(Producto prod,Integer unidades, Integer index){
            System.out.println("index"+index+"\n");    
            xml.borrarCosa(index);
            this.cosas.eliminarProd(prod);
            
                if(accionTx.getText().equals("Venta")){
                    prod.setUnidades(prod.getUnidades()-unidades);
                    prod.setVendidos(prod.getVendidos()+unidades);
                }
                else if (accionTx.getText().equals("Compra"))
                    prod.setUnidades(prod.getUnidades()+unidades);
            /*Luego de actualizarlo lo modifico en el xml*/
            xml.agregarCosa(prod, index);
    }
       
    public void comboSet(JComboBox comboBox, String value){
        String item;
        for (int i = 0; i < comboBox.getItemCount(); i++){
            item = (String) comboBox.getItemAt(i);
            if (item.equalsIgnoreCase(value)){
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }
    
    public Double precioTotal(Integer unidades, Double precio){
        return unidades*precio;
    }
}