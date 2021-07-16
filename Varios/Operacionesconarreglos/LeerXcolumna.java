/**@ ITO Fundamentos de programación
 * @ Este programa lee por columnas un arreglo bidimensional para despues imprimirlo
 * @author Joaquín Martínez Benjamín
 */
import javax.swing.*;

public class LeerXcolumna {

public LeerXcolumna(){}
int n[][];
int transpuesta[][];
int renglon,columna;
String matrizImpresa="";

public void leerHacer(){

columna=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de renglones"));
renglon=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de columnas"));
 
          n= new int [renglon] [columna];
transpuesta= new int [columna][renglon];

for (int x=0; x<renglon; x++) { 
       for (int y=0; y <columna; y++) {
      n[x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el elemento ["+y+"]["+x+"] del arreglo"));
                       
                                      }
                                    
                              }

for (int x=0; x<columna; x++) { 
       for (int y=0; y <renglon; y++) {
                        transpuesta[x][y]=n[y][x];
                        matrizImpresa+=transpuesta[x][y] + " ";
                                      }
                        matrizImpresa+="\n";
                              }
   JOptionPane.showMessageDialog(null,"La matriz es: \n"+matrizImpresa);                          
                        
                    }

public static void main ( String args []){
LeerXcolumna result= new LeerXcolumna ();
result.leerHacer();
                                         }
                                         
                                         
                        }
