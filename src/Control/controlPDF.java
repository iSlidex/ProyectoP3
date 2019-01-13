package Control;
import Estructuras.Producto;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.test.annotations.WrapToTest;
import java.io.File;
import java.io.IOException;
 
public class controlPDF {
    public static final String DEST = "src\files\factura.pdf";
 
    public final PdfFont regular;
    public final PdfFont bold;
    
      public controlPDF() throws IOException {
        this.regular = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
        this.bold = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);
    }
      
      public void createPdf(String dest, Producto prod, String fecha, Double preciofinal, Integer unidades, String accion) throws IOException {
        UserObject objeto = new UserObject();
        objeto.setAccion(accion);
        objeto.setProv(prod.getProv());
        objeto.setName(prod.getNombre());
        objeto.setUnidades(unidades);
        objeto.setPF(preciofinal);
        objeto.setFecha(fecha);
  
        PdfDocument pdf = new PdfDocument(new PdfWriter(dest));
        Document document = new Document(pdf);
        document.add(createTable(objeto));
        document.close();
    }
      
      public Table createTable(UserObject user) {
        Table table = new Table(2);
        table.setWidth(30).setMarginBottom(10);
      /*  table.addHeaderCell(new Cell().setFont(bold).add("Acción"));
        table.addHeaderCell(new Cell().setFont(bold).add("Proveedor"));
        table.addCell(new Cell().setFont(bold).add("Producto"));
        table.addCell(new Cell().setFont(regular).add(user.getName()));
        table.addCell(new Cell().setFont(bold).add("Unidades"));
        table.addCell(new Cell().setFont(regular).add(user.getUnidades()));
        table.addCell(new Cell().setFont(bold).add("Precio"));
        table.addCell(new Cell().setFont(regular).add(String.valueOf(user.getPF())));
        table.addCell(new Cell().setFont(bold).add("Fecha"));
        table.addCell(new Cell().setFont(regular).add(user.getFecha()));*/
        return table;
    }
 
    class UserObject {
 
        protected String name;
        protected Integer unidades;
        protected Double precioFinal;
        protected String prov;
        protected String accion;
        protected String fecha;

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }
        
        public String getName() {
            return name;
        }
 
        public void setName(String name) {
            this.name = name;
        }
 
        /*Vendidas/Compradas*/
        public Integer getUnidades() {
            return unidades;
        }
        public void setUnidades(Integer unidades) {
            this.unidades = unidades;
        }
 
        public Double getPF() {
            return precioFinal;
        }
 
        public void setPF(Double precioFinal) {
            this.precioFinal = precioFinal;
        }
 
        public String getProv() {
            return prov;
        }
 
        public void setProv(String prov) {
            this.prov = prov;
        }
        
        public String getAccion(){
            return accion;
        }
        
        public void setAccion (String accion){
            this.accion = accion;
        }
    }
    
}
