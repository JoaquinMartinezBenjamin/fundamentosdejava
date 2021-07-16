/**@ ITO Fundamentos de programación
 * @ Este programa lee una matriz bidimensional e imprime su transpuesta
 * @author Joaquín Martínez Benjamín
 */

import javax.swing.*;

public class Trans{

public Trans(){}

int original[][];
int transpuesta[][];
int renglon,columna;
String originalImpresa="";
String transpuestaImpresa="";
public void leerHacer(){

renglon=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de columnas"));
columna=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de renglones"));
 
   original= new int [renglon] [columna];
transpuesta= new int [columna][renglon];

for (int x=0; x<renglon; x++) { 
       for (int y=0; y <columna; y++) {
                        original[x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el elemento del arreglo"));
                       originalImpresa+="["+original[x][y]+"]  ";
                                      }
                             originalImpresa+="\n";              
                              }


for (int x=0; x<columna; x++) { 
       for (int y=0; y <renglon; y++) {
                        transpuesta[x][y]=original[y][x];
                       transpuestaImpresa+=transpuesta[x][y] + " ";
                                      }
                       transpuestaImpresa+="\n";
                              }
JOptionPane.showMessageDialog(null,"La matriz original es:\n"+originalImpresa+"\nLa matriz transpuesta es:\n"+transpuestaImpresa);                        
                        
                    }

public static void main ( String args []){
Trans result= new Trans ();
result.leerHacer();
                                         }
                                         
}
