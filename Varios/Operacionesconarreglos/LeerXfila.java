/**@ ITO Fundamentos de programación
 * @ Este programa lee un arreglo bidimensional para despues imprimirlo
 * @author Joaquín Martínez Benjamín
 */
import javax.swing.*;

public class LeerXfila {

public LeerXfila(){}

int n[][];
int renglon,columna;
String matrizImpresa="";

public void leerHacer(){

renglon=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de renglones"));
columna=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de columnas"));
 
          n= new int [renglon] [columna];

for (int x=0; x<renglon; x++) { 
       for (int y=0; y <columna; y++) {
                        n[x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el elemento ["+x+"]["+y+"] del arreglo"));
                        matrizImpresa+= n[x][y] + " ";
                                      }
                        matrizImpresa+="\n";
                              }
  JOptionPane.showMessageDialog(null,"El arreglo es: \n"+matrizImpresa);                              
                        }

public static void main ( String args []){
LeerXfila result= new LeerXfila ();
result.leerHacer();
                                         }
                                         
                                         
                        }