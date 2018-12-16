/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import static java.awt.Color.red;
import javax.swing.*;
/**
 *
 * @author leito
 */
public class controlador {

    private JFrame ventana;
//control vista login
    public controlador(JFrame ventana){
    this.ventana=ventana;
    }
    
   public static boolean isNum(String strNum) {
    boolean ret = true;
    try {

        Double.parseDouble(strNum);

    }catch (NumberFormatException e) {
        ret = false;
    }
    return ret;
}
    public void cambiaBorde(JComponent nuevoBorde){
        nuevoBorde.setBorder(BorderFactory.createLineBorder(red));
    }
            
    public void activaVentana(JFrame ventana,JFrame ventana2) {      
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana2.dispose(); //elimina la ventana de la memoria, incluyendo datos
    }
    
    
}
