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

public class controlXmlProv{
    private Element root;
    private String fileLocation= "src//file//listaprov.xml";
    //constructor//
    public controlXmlProv(){
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
    private Element provToXmlElement(Proveedor prov){
        Element Proveedor = new Element("Proveedor");
        Element nombre = new Element("Nombre");
        nombre.setText(prov.getNombre());
        Element dir = new Element("Direccion");
        dir.setText(prov.getDireccion());
        Element telefono = new Element("Telefono");
        telefono.setText(prov.getTelefono());
        Element user = new Element("User");
        user.setText(prov.getAcargo());           
        Proveedor.addContent(nombre);
        Proveedor.addContent(dir);
        Proveedor.addContent(telefono);        
        Proveedor.addContent(user);        
        return Proveedor;
    }
    /*Método que retorna un Electrodomestico. A este metodo se le manda un Element y con
    sus datos se hará los pasos requeridos para crear el Electrodomestico*/
    private Proveedor provToObject(Element element) throws ParseException {
        Proveedor prov = new Proveedor(element.getChildText("Nombre"),element.getChildText("Direccion"),element.getChildText("Telefono"),element.getChildText("User"));
       return prov;
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
    public boolean agregarUser(Proveedor prod) {
        boolean resultado = false;
        root.addContent(provToXmlElement(prod));
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
    public boolean agregarCosa(Proveedor prod) {
        boolean resultado = false;
        root.addContent(provToXmlElement(prod));
        resultado = updateDocument();
        return resultado;
    }

    public Proveedor buscarCosa(Integer index) {
        Element aux = new Element("Producto");
        List cosas = this.root.getChildren("Producto");
        while (aux != null) {
            aux = controlXmlProv.buscar(cosas, index);
            if (aux != null) {
                try {
                    return provToObject(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
    }
        public boolean actualizarCosa(Proveedor prod, int index) {
            boolean resultado = false;
            Element aux = new Element("Producto");
            List cosas = this.root.getChildren("Producto");
            while (aux != null) {
                aux = controlXmlProv.buscar(cosas,index );
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
            aux = controlXmlProv.buscar(cosas, index);
            if (aux != null) {
                    cosas.remove(aux);
                    resultado = updateDocument();
            }            
            return resultado;
        }
        

        public ArrayList<Proveedor> todasLosUser() {
            ArrayList<Proveedor> resultado = new ArrayList<>();
            for (Object it : root.getChildren()) {
                Element xmlElem = (Element) it;
                try {
                    resultado.add(provToObject(xmlElem));
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            return resultado;
        }
    
}


