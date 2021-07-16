/**@ ITO Fundamentos de programación
 * @ Este programa lee un arreglo bidimensional para despues imprimirlo
 *   separando el método leer del método imprimir
 * @author Joaquín Martínez Benjamín
 */
import javax.swing.*;

public class LeerXfila2 {

public LeerXfila2(){}

String matrizImpresa="";

int renglon=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de renglones"));
int columna=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de columnas"));
 
         int n[][]= new int [renglon] [columna];
          
public void leer(){
        
for (int x=0; x<renglon; x++) { 
       for (int y=0; y <columna; y++) {
    n[x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el elemento ["+x+"]["+y+"] del arreglo"));
                                      }                         
                              }
                        
                    }
     
public void hacer(){    
                        
for (int x=0; x<renglon; x++) { 
       for (int y=0; y <columna; y++) {
                        matrizImpresa+= n[x][y] + " ";
                                      }
                                       matrizImpresa+="\n";
                              }
    JOptionPane.showMessageDialog(null,"El arreglo es: \n"+matrizImpresa);   
                   }
                        
                    
                        
public static void main ( String args []){
LeerXfila2 result= new LeerXfila2 ();
result.leer();
result.hacer();
                                         }
                                         
                                         
                        }