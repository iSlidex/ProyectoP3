package Control;
import java.util.*;
import java.awt.Font;
import Estructuras.*;
import static java.awt.Color.red;
import static java.awt.SystemColor.text;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class controlAgregar extends controlador{
    List lista;
    private JButton bttnCancel;
    private JButton bttnCont;
    private JTextField codigoTx;
    private JTextField nombreTx;
    private JTextField precioTx;
    private JTextField unidadesTx;
    private JTextField vendidosTx;
    private JTextField dirTx;    
    private JTextField telfTx;
    private JComboBox combo;

    public controlAgregar(List lista, JButton bttnCancel, JButton bttnCont, JTextField codigoTx, JTextField nombreTx, JTextField precioTx, JFrame ventana) {
        super(ventana);
        this.lista = lista;
        this.bttnCancel = bttnCancel;
        this.bttnCont = bttnCont;
        this.codigoTx = codigoTx;
        this.nombreTx = nombreTx;
        this.precioTx = precioTx;
        this.unidadesTx = unidadesTx;
    }
    
        public controlAgregar(JButton bttnCancel, JButton bttnCont, JTextField dirTx, JTextField nombreTx, JTextField telfTx, JFrame ventana) {
        super(ventana);
        
        this.bttnCancel = bttnCancel;
        this.bttnCont = bttnCont;
        this.dirTx = dirTx;
        this.nombreTx = nombreTx;
        this.telfTx = telfTx;
    }
    public controlAgregar(JComboBox combo,JButton bttnCancel, JButton bttnCont, JTextField codigoTx, JTextField nombreTx, JTextField precio, JTextField unidades, JTextField vendidos, JFrame ventana) {
        super(ventana);
        this.combo=combo;
        this.bttnCancel = bttnCancel;
        this.bttnCont = bttnCont;
        this.codigoTx = codigoTx;
        this.nombreTx = nombreTx;
        this.precioTx = precio;
        this.unidadesTx= unidades;
        this.vendidosTx= vendidos;
    }   
    
    public boolean sePuedeAgregarPR() throws InputMismatchException{
        //Verifica que los campos de producto sean correctos
        boolean sePuede = true;
        if (!(codigoTx.getText().equals("")) && !(nombreTx.getText().equals("")) && !(precioTx.getText().equals("")) && !(unidadesTx.getText().equals("")) && !(vendidosTx.getText().equals(""))){
            //Si no esta vacio verificara que precio sea un numero dentro del rango del tipo de dato en el que fueron declarados
            try{
                double d = Double.parseDouble(precioTx.getText());
                int i = Integer.parseInt(unidadesTx.getText());
                int v = Integer.parseInt(vendidosTx.getText());
            }
            catch (InputMismatchException ime){
                sePuede = false;
            }
        }
    return sePuede;
    }
    
    public boolean sePuedeAgregarP() throws InputMismatchException{
        //Verifica que los campos de proveedor sean correctos
        boolean sePuede = true;
        if ((dirTx.getText().equals("")) || (nombreTx.getText().equals("")) || (telfTx.getText().equals("") || (unidadesTx.getText().equals("")))){
            sePuede = false;
        }
    return sePuede;
    }
    
    public boolean direccionInvalida(){
      if((!dirTx.getText().equals("")))
        return true;
      else return false;           
    }
    
    public boolean telefonoInvalido(){
       if((!telfTx.getText().equals("")))
            if (telfTx.getText().matches("^[0-9]*\\+?\\-?"))
                return true;
            else return false;        
        else return false;   
    }
    
    public boolean precioInvalido(){
        if((!precioTx.getText().equals("")))
            if (precioTx.getText().matches("^[0-9]*\\.?"))
                return (Integer.parseInt(precioTx.getText())>=0);
            else return false;        
        else return false;   
    }
    
    public boolean nombreInvalido(){
        if((!nombreTx.getText().equals("")))
          return true;
        else return false;  
    }
    public boolean codigoInvalido(){
        if((!codigoTx.getText().equals("")))
          return true;
        else return false;          
    }
    
    public boolean unidadesCorrectas (){
        if((!unidadesTx.getText().equals("")))
            if (unidadesTx.getText().matches("^[0-9]*\\.?"))
                return (Integer.parseInt(unidadesTx.getText())>=1);  
            else return false;
        else return false;
    }
    
        public boolean ventasCorrectas (){
        if((!vendidosTx.getText().equals("")))
            if (vendidosTx.getText().matches("^[0-9]*\\.?"))
                return (Integer.parseInt(vendidosTx.getText())>=1);  
            else return false;
        else return false;
    }
    
    public boolean avisoUnidades (){
        return (Integer.parseInt(unidadesTx.getText())>3);  
    }
    
    
    public ArrayList<String> mensajeErrorPR(){
        ArrayList<String> msg=new ArrayList<>();             
        if(nombreInvalido())msg.add("Nombre del producto");
        if(precioInvalido())msg.add(" Precio");
        if(codigoInvalido())msg.add(" Codigo");
        if(!unidadesCorrectas())msg.add(" Unidades");
        if(!ventasCorrectas())msg.add(" Unidades vendidas");
        return msg;
    }
    
        public ArrayList<String> mensajeErrorP(){
        ArrayList<String> msg=new ArrayList<>();             
        if(nombreInvalido())msg.add("Nombre del proveedor");
        if(direccionInvalida())msg.add(" Direccion");
        if(telefonoInvalido())msg.add(" Telefono");
        return msg;
    }
        
        public ArrayList<String> avisoU(){
        ArrayList<String> msg=new ArrayList<>();             
        if (!(avisoUnidades()))msg.add("AVISO: Su producto está apunto de agotarse, pues cuenta con "+unidadesTx.getText()+" unidades");
        return msg;
    }
    
    public void actualizar(){
        
    }
        public Proveedor añadirProv(String uAcargo,listaProv proveedores,int index){
        Proveedor prov= new Proveedor(nombreTx.getText(),dirTx.getText() ,telfTx.getText() ,uAcargo);        
        proveedores.incluirProv(index,prov);
        return prov;
    }
        public Proveedor añadirProv(String uAcargo,listaProv proveedores){
        Proveedor prov= new Proveedor(nombreTx.getText(),dirTx.getText() ,telfTx.getText() ,uAcargo);        
        proveedores.incluirProv(prov);
        return prov;
    }
        public void agregarProv(String userAcargo,listaProv list, Proveedor prov,int index){
            prov.setAcargo(userAcargo);
            prov.setDireccion(dirTx.getText());
            prov.setNombre(nombreTx.getText());
            prov.setTelefono(telfTx.getText());
            list.incluirProv(index, prov);
        }
        public void agregarProd(String prov,listaProd list, Producto prod,int index){
            prod.setProv(prov);
            prod.setId(codigoTx.getText());
            prod.setNombre(nombreTx.getText());
            prod.setPrecio(Float.parseFloat(precioTx.getText()));
            prod.setUnidades(Integer.parseInt(unidadesTx.getText()));
            prod.setVendidos(Integer.parseInt(vendidosTx.getText()));
            list.incluirProd(index, prod);
        }
        public Producto añadirProd(String prov,listaProd proveedores){
            System.out.println(combo.getSelectedItem().toString());
            System.out.println(nombreTx.getText());
            
            System.out.println(codigoTx.getText());
        Producto prod= new Producto(nombreTx.getText(),combo.getSelectedItem().toString(),Double.parseDouble(precioTx.getText()) ,codigoTx.getText(), Integer.parseInt(unidadesTx.getText()), Integer.parseInt(vendidosTx.getText()));        
        proveedores.incluirProd(prod);
        return prod;
    }

    public void llenarComboProv(ArrayList<Proveedor>  list){
        for (Proveedor i : list){
            combo.addItem(i.getNombre());
        }        
    }

}
