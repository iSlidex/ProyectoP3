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
        Element tipo = new Element("Tipo");
        tipo.setText(prod.getTipo());
        Element nombre = new Element("Nombre");
        nombre.setText(prod.getNombre());
        Element id = new Element("id");
        id.setText(prod.getId());
        Element precio = new Element("Precio");
        precio.setText(Float.toString(prod.getPrecio()));
        Element prov = new Element("prov");
        prov.setText(prod.getProv());
        Producto.addContent(tipo);
        Producto.addContent(nombre);
        Producto.addContent(id);
        Producto.addContent(precio);        
        Producto.addContent(prov);        
        return Producto;
    }
    /*Método que retorna un Electrodomestico. A este metodo se le manda un Element y con
    sus datos se hará los pasos requeridos para crear el Electrodomestico*/
    private Producto prodToObject(Element element) throws ParseException {
        Producto prod = new Producto(element.getChildText("Nombre"),element.getChildText("prov"),Float.parseFloat(element.getChildText("Precio")),element.getChildText("tipo"),element.getChildText("id"));
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
    public boolean agregarCosa(Producto prod) {
        boolean resultado = false;
        root.addContent(prodToXmlElement(prod));
        resultado = updateDocument();
        return resultado;
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
        public boolean actualizarCosa(Producto prod, int index) {
            boolean resultado = false;
            Element aux = new Element("Producto");
            List cosas = this.root.getChildren("Producto");
            while (aux != null) {
                aux = controlXmlProd.buscar(cosas,index );
                if (aux != null) {
                    cosas.remove(aux);
                    resultado = updateDocument();
                }
            }
            agregarCosa(prod);
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


