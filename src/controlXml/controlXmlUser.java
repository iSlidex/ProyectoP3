package controlXml;

import Estructuras.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class controlXmlUser{
    private Element root;
    private String fileLocation= "src//files//listauser.xml";
    //constructor//
    public controlXmlUser(){
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
    private Element userToXmlElement(Usuario user){
        Element Usuario = new Element("usuario");
        Element tipo = new Element("tipo");
        tipo.setText(user.getClass().getSimpleName());
        Element nombre = new Element("nombre");
        nombre.setText(user.getNombre());
        Element correo = new Element("correo");
        correo.setText(user.getCorreo());
        Element clave = new Element("clave");
        clave.setText(new String(user.getClave()));
        Usuario.addContent(tipo);
        Usuario.addContent(nombre);
        Usuario.addContent(correo);
        Usuario.addContent(clave);        
        return Usuario;
    }
        /*Método que retorna un Electrodomestico. A este metodo se le manda un Element y con
    sus datos se hará los pasos requeridos para crear el Electrodomestico*/
    private Usuario userToObject(Element element) throws ParseException {
        String tipo = element.getChildText("tipo");
        switch (tipo) {
                case "Administrador":
                    Administrador user1 = new Administrador(element.getChildText("nombre"),element.getChildText("correo"),element.getChildText("clave").toCharArray());   
                    return user1;                    
                case "Empleado":
                    Empleado user2 = new Empleado(element.getChildText("nombre"),element.getChildText("correo"),element.getChildText("clave").toCharArray());   
                    return user2;                          
                default:
                    return null;
        }
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
    public boolean agregarUser(Usuario user) {
        boolean resultado = false;
        root.addContent(userToXmlElement(user));
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
        public static Element buscarU(List raiz, String correo) {
        Iterator i = raiz.iterator();
        while (i.hasNext()) {
            Element e = (Element) i.next();
            if (correo.equals(e.getChildText("correo"))) {
                return e;
            }            
        }
        return null;
    }
    public boolean agregarCosa(Usuario user) {
        boolean resultado = false;
        root.addContent(userToXmlElement(user));
        resultado = updateDocument();
        return resultado;
    }

    public Usuario buscarCosa(Integer index) {
        Element aux = new Element("Usuario");
        List cosas = this.root.getChildren("Usuario");
        while (aux != null) {
            aux = controlXmlUser.buscar(cosas, index);
            if (aux != null) {
                try {
                    return userToObject(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
    }
        public Usuario buscarUsuario(String correo) {
        Element aux = new Element("Usuario");
        List users = this.root.getChildren("Usuario");
        while (aux != null) {
            aux = controlXmlUser.buscarU(users, correo);
            if (aux != null) {
                try {
                    return userToObject(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        return null;
    }
            public boolean agregarCosa(Usuario prod,int index) {        
              boolean resultado = false;
              root.addContent(index, userToXmlElement(prod));
              resultado = updateDocument();
              return resultado;
          }
        public boolean actualizarCosa(Usuario user, int index) {
            boolean resultado = false;
            Element aux = new Element("Usuario");
            List cosas = this.root.getChildren("Usuario");
            
                aux = controlXmlUser.buscar(cosas,index );
                if (aux != null) {
                    cosas.remove(aux);
                    resultado = updateDocument();
                }
            
            agregarCosa(user,index);
            return resultado;
        }
        public boolean borrarCosa(Integer index) {
            boolean resultado = false;
            Element aux = new Element("Usuario");
            List cosas = this.root.getChildren("Usuario");
            aux = controlXmlUser.buscar(cosas, index);
            if (aux != null) {
                    cosas.remove(aux);
                    resultado = updateDocument();
            }            
            return resultado;
        }
        

        public ArrayList<Usuario> todasLosUser() {
            ArrayList<Usuario> resultado = new ArrayList<>();
            for (Object it : root.getChildren()) {
                Element xmlElem = (Element) it;
                try {
                    resultado.add(userToObject(xmlElem));
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            return resultado;
        }
        public static Element buscar(List raiz, String dato) {
        Iterator i = raiz.iterator();
        while (i.hasNext()) {
            Element e = (Element) i;
            if (dato.equals(e.getChildText("correo"))) {
                return e;
            }
            i=(Iterator) i.next();
        }
        return null;
    }
        public Usuario buscarPersona(String correo) {
        Element aux = new Element("Usuario");
        List Usuarios = this.root.getChildren("Usuario");
        
            aux = controlXmlUser.buscar(Usuarios, correo);
            if (aux != null) {
                try {
                    return userToObject(aux);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            
        }
        return null;
    }

}


