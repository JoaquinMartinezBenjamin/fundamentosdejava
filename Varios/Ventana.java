import javax.swing.*;

public class Ventana {

private JScrollPane barra;
private JTextArea area;

 public Ventana(){

               area = new JTextArea   (10,15);
              barra = new JScrollPane (area) ;

 for (int i=0;i<10; i++){

           area.append ("hola\n");

                        }

 JOptionPane.showMessageDialog (null, barra);
               }

                   }