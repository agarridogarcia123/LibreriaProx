/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libprox3av;

import javax.swing.JOptionPane;

/**
 *
 * @author Araceli
 */
public class pedirDatos {
    public String dameTipo(){
return(JOptionPane.showInputDialog("Tipo de prenda: "));
}
      public String dameRef(){
return(JOptionPane.showInputDialog("Referencia: "));
}
        public String dameTalla(){
return(JOptionPane.showInputDialog("Talla: "));
}


   public int pedirInt(){
    return(Integer.parseInt(JOptionPane.showInputDialog("Dame o número de unidades: ")));
}
public float pedirFloat(){
    return(Float.parseFloat(JOptionPane.showInputDialog("Precio: ")));
}
}
