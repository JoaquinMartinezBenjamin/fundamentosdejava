import javax.swing.*;
public class Pares{

public Pares(){}


int renglon=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de renglones"));
int columna=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de columnas"));
int bidi[][]= new int [renglon] [columna];
String pares= "";

public void leerImprimir(){
 System.out.println("Original");
for (int x=0; x<renglon; x++) { 
for (int y=0; y<columna; y++) {
  bidi[x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el elemento ["+x+"]["+y+"] del arreglo"));
 System.out.print( bidi[x][y] + " ");
                                }
                        System.out.println();
                               }
                         }         
                         
public void buscarPares(){
 for (int x=0; x<renglon; x++) { 
 for (int y=0; y<columna; y++) {
               
     if(bidi[x][y]%2==0)
 {pares= pares + bidi [x][y]+"\n";}
                               }
                               }
                              
  System.out.println("Los pares de la matriz son: " +pares);
                              
                            }
                          
                                  
public static void main ( String args []){
Pares result= new Pares ();
result.leerImprimir();
result.buscarPares();
                                         }
                                         
                                         
                        }