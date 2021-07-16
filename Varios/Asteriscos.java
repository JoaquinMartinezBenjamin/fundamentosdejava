import javax.swing.*;


public class Asteriscos  {
    
private int valor;
private JScrollPane barra;
private JTextArea area;

public Asteriscos  (int valor) {
this.valor= valor;
    area  = new JTextArea   (15,15);
    barra = new JScrollPane (area) ;
   }    
   
   public void crearTriangulo(){
    
      for(int x=1;x<= valor;x++)             {
                              int y=1;
                              area.append (x+" ");
                            
                            while (y<=x){
                                 area.append ("*");
                                 y++;
                           
                                     }  area.append ("\n");         }
                       JOptionPane.showMessageDialog ( null,barra);
                               }
    
public static void main (String [] args){

int valor=Integer.parseInt (JOptionPane.showInputDialog("Introduzca"
                                      + " el total de elementos de la lista "));

Asteriscos miTriangulo  = new Asteriscos(valor);

      miTriangulo.crearTriangulo();


                                        }
                                                                    }