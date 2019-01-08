package controlXml;

import Estructuras.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class controlXmlProd{
    private Element root;
    private String fileLocation= "src//files//listaprod.xml";
    //constructor//
    public controlXmlProd(){
        try {
            SAXBuilder builder = new SAXBuilder(false);
            Document doc = null;
            doc = builder.build(fileLocation);
            root = doc.getRootElement();
        } catch (JDOMException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        }
    }
    private Element prodToXmlElement(Producto prod){

        Element Producto = new Element("Producto");
//        Element tipo = new Element("Tipo");
//        tipo.setText(prod.getTipo());
        Element nombre = new Element("Nombre");
        nombre.setText(prod.getNombre());
        Element id = new Element("id");
        id.setText(prod.getId());
        Element precio = new Element("Precio");
        precio.setText(Double.toString(prod.getPrecio()));
        Element prov = new Element("prov");
        prov.setText(prod.getProv());
        Element unidades = new Element("Unidades");
        unidades.setText(Integer.toString(prod.getUnidades()));
        Element vendidos = new Element("Vendidos");
        vendidos.setText(Integer.toString(prod.getVendidos()));
//        Producto.addContent(tipo);
        Producto.addContent(nombre);
        Producto.addContent(id);
        Producto.addContent(precio);        
        Producto.addContent(prov);    
        Producto.addContent(unidades);
        Producto.addContent(vendidos);
        return Producto;
    }
    /*Método que retorna un Electrodomestico. A este metodo se le manda un Element y con
    sus datos se hará los pasos requeridos para crear el Electrodomestico*/
    private Producto prodToObject(Element element) throws ParseException {
        Producto prod = new Producto(element.getChildText("Nombre"),element.getChildText("prov"),Float.parseFloat(element.getChildText("Precio")),element.getChildText("id"), Integer.parseInt(element.getChildText("Unidades")), Integer.parseInt(element.getChildText("Vendidos")));
       return prod;
    }
    
     /* Operacion para guardar en el documento Xml los cambios efectuados
    * @return true si se cumplio la operacion con exito, false en caso contrario*/
    private boolean updateDocument() {
        try {
            XMLOutputter out = new XMLOutputter(org.jdom.output.Format.getPrettyFormat());
            try (FileOutputStream file = new FileOutputStream(fileLocation)) {
                out.output(root, file);
                file.flush();
            }
            return true;
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
            return false;
        }
    }
    public boolean agregarUser(Producto prod) {
        boolean resultado = false;
        root.addContent(prodToXmlElement(prod));
        resultado = updateDocument();
        return resultado;
    }
    public static Element buscar(List raiz, int index) {
        Iterator i = raiz.iterator();
        int cont=0;
        while (i.hasNext()) {
            
            Element e = (Element) i.next();
            if (index==cont) {
                return e;
            }
            cont++;
        }
        return null;
    }
    
        public static Element buscarNombre(List raiz, String nombreP, String nombreProv) {
            /*Buscar producto por su nombre*/
        Iterator i = raiz.iterator();
        int cont=0;
        while (i.hasNext()) {
            
            Element e = (Element) i.next();
            if (e.getChildText("Nombre").equals(nombreP) && (e.getChildText("prov").equals(nombreProv))) {
               return e;
            }
            cont++;
        }
        return null;
    }
    
        public static Element maximo(List productos, String nombre) {
        /*Buscara el producto mas vendido segun el proveedor*/
        Iterator i = productos.iterator();
        int base=0;
        Element e = null;
        Element aux = null;
        while (i.hasNext()) {
            
            e = (Element) i.next();
            if (e.getChildText("prov").equals(nombre) && (Integer.parseInt(e.getChildText("Vendidos"))>base)) {
                base = Integer.parseInt(e.getChildText("Vendidos"));
                aux = e;
            }
        }
        return aux;
    }
        
        public static Element minimo(List productos, String nombre) {
        /*Buscara el producto menos vendido segun el proveedor*/
        Iterator i = productos.iterator();
        Element e = (Element) i.next();
        Element aux = null;
        int base= Integer.parseInt(e.getChildText("Vendidos"));
        while (i.hasNext()) {
            if (e.getChildText("prov").equals(nombre) && (Integer.parseInt(e.getChildText("Vendidos"))<base)) {
                base = Integer.parseInt(e.getChildText("Vendidos"));
                aux = e;
            }
             e = (Element) i.next();
        }
        return aux;
    }
    
    public Element unidades(List raiz, Integer index) {
         /*Buscara y devolvera todos los elementos que contengan 3 productos o menos*/
         try{
            Element e = (Element) raiz.get(index);
            if ((Integer.parseInt(e.getChild("Unidades").getText())<=3) && (Integer.parseInt(e.getChild("Unidades").getText())!=-1)) {
                return e;
        }
         }
         catch (IndexOutOfBoundsException ioobe){
             return null;
         }

        return null;
    }
    
     public Integer unidadespos(List raiz, Integer index) {
         /*Buscara y devolvera todos los elementos que contengan 3 productos o menos*/
         try{
            Element e = (Element) raiz.get(index);
            if ((Integer.parseInt(e.getChild("Unidades").getText())<=3) && (Integer.parseInt(e.getChild("Unidades").getText())!=-1)) {
                return index;
            }
            if (index==raiz.size())
            /*Llego al final de la lista*/
                return -1;
            }
            
            catch (IndexOutOfBoundsException ioobe){
                    return -1;
            }
       return 0;
    }
     
          public String masVendido(List raiz, String prov) {
         /*Buscara y devolvera nombre del producto mas vendido por proveedor*/
        Element aux = new Element("Producto");
        List cosas = this.root.getChildren("Producto");
        while (aux != null) {
            aux = controlXmlProd.maximo(cosas, prov);
            if (aux != null) {
                try {
                    return prodToObject(aux).getNombre();
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
         }
          
               
          public String menosVendido(List raiz, String prov) {
         /*Buscara y devolvera nombre del producto mas vendido por proveedor*/
        Element aux = new Element("Producto");
        List cosas = this.root.getChildren("Producto");
        while (aux != null) {
            aux = controlXmlProd.minimo(cosas, prov);
            if (aux != null) {
                try {
                    return prodToObject(aux).getNombre();
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
         }
          
          
    public boolean agregarCosa(Producto prod) {
        boolean resultado = false;
        root.addContent(prodToXmlElement(prod));
        resultado = updateDocument();
        return resultado;
    }
    
     public Producto unidad(Integer index) {
        Producto flag = new Producto ("aux", "aux", 1, "1", -1, 1);
        Element aux = new Element("Producto");
        List cosas = this.root.getChildren("Producto");
            aux = unidades(cosas, index);
            int termino = unidadespos(cosas,index);
            System.out.println("se termino?"+termino+"\n");
            
            if (termino==-1){
                return null;
            }
            if ((aux != null) && (termino>0)) {
                try {
                    return prodToObject(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
            }
                
        }
        return flag;
    }

    public Producto buscarCosa(Integer index) {
        Element aux = new Element("Producto");
        List cosas = this.root.getChildren("Producto");
        while (aux != null) {
            aux = controlXmlProd.buscar(cosas, index);
            if (aux != null) {
                try {
                    return prodToObject(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
    }
    
    public Producto buscarnombre(String nombreP, String nombreProv) {
        Element aux = new Element("Producto");
        List cosas = this.root.getChildren("Producto");
        while (aux != null) {
            aux = controlXmlProd.buscarNombre(cosas, nombreP, nombreProv);
            if (aux != null) {
                try {
                    return prodToObject(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
    }
        public boolean agregarCosa(Producto prod,int index) {        
        boolean resultado = false;
        root.addContent(index, prodToXmlElement(prod));
        resultado = updateDocument();
        return resultado;
    }
        public boolean actualizarCosa(Producto prod, int index) {
            boolean resultado = false;
            Element aux = new Element("Producto");
            List cosas = this.root.getChildren("Producto");
            
                aux = controlXmlProd.buscar(cosas,index );
                if (aux != null) {
                    cosas.remove(aux);
                    resultado = updateDocument();
                }
            
            agregarCosa(prod,index);
            return resultado;
        }
        public boolean borrarCosa(Integer index) {
            boolean resultado = false;
            Element aux = new Element("Producto");
            List cosas = this.root.getChildren("Producto");
            aux = controlXmlProd.buscar(cosas, index);
            if (aux != null) {
                    cosas.remove(aux);
                    resultado = updateDocument();
            }            
            return resultado;
        }
        

        public ArrayList<Producto> todasLosUser() {
            ArrayList<Producto> resultado = new ArrayList<>();
            for (Object it : root.getChildren()) {
                Element xmlElem = (Element) it;
                try {
                    resultado.add(prodToObject(xmlElem));
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            return resultado;
        }
    
}


