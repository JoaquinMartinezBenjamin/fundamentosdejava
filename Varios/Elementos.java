import javax.swing.*;

public class Elementos {

public int lista[];
public JTextArea area;

public Elementos()

    {
     lista=new int [10];
     area = new JTextArea ();
    } 
    
public void almacenar (){
         
            for (int i =0; i<10; i++)
             {
             lista [i]= (int)( Math.random () *100);
             }
            
                         }
        
public void mostrar (){

      for (int i=0; i<10; i++)
     {
         area.append (i+" " +lista [i]+ "\n");
     } 
     
   JOptionPane.showMessageDialog (null,area);
                      }


public static void main (String []args){

Elementos obj = new Elementos();
obj.almacenar();
obj.mostrar();
                                       }

                            }



           