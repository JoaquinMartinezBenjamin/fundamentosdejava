
import javax.swing.*;
public class Depreciacion {

private double capitalInicial, capitalFinal, dep;
private int annios;
private int i;
private JScrollPane barra;
private JTextArea area; 
 
 
  public Depreciacion (double cap, int annio){
      annios = annio; 
      capitalInicial = cap;
      area  = new JTextArea   (30,40);
      barra = new JScrollPane (area) ;
                                             }
    
    
public void calcular () {
                   dep= capitalInicial /annios ; 
   area.append ("Año\tCapital inicial\tDepreciacion\tCapital final\n"); 
   area.append (":::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
               +":::::::::::::::::::::::::::::::::::::::::::::::::::::\n"); 
     for  (i = 1; i <= annios ; i++) { 
     
        capitalFinal = capitalInicial - dep ; 
        area. append  ( i + "\t" + capitalInicial+ "\t"+ dep+ "\t"+ capitalFinal+ "\n");
        area.append ("..............................................."
                  +"...............................................................\n");
        capitalInicial = capitalFinal ; 
      
                                  }
     JOptionPane. showMessageDialog (null, barra); 
                                        }


 public static void main (String []args) {
     
      double cap ;
      int annio; 
    cap= Double.parseDouble (JOptionPane.showInputDialog ( "Introduzco el monto total a pagar"));
   annio= Integer.parseInt (JOptionPane.showInputDialog ( "Número años a depreciar")); 
      
   Depreciacion Obj = new Depreciacion (cap, annio);
                Obj.calcular ();
      
                                         }
                                                    }



      
                                  
                                  