/**@ ITO Fundamentos de programación
 * @(#)OrdenarDiagonal.java
 * @ Este programa lee una matriz y ordena las filas en de menor a mayor 
 *   y las columnas de mayor a menor
 * @author Joaquín Martínez Benjamín
 */

import javax.swing.*;


public class OrdenarFilasColumnas{

public OrdenarFilasColumnas(){} 



int matrizFilas[][];
int matrizColumnas[][];
int renglon,columna;
int aux;
String matriz="";
String matriz2="";
String matriz3="";
public void leerHacer(){

renglon=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de renglones"));
columna=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de columnas"));
 
 matrizFilas   = new int [renglon] [columna];
 matrizColumnas= new int [renglon] [columna];
////////// Rellena la matriz y la guarda para imprimir////////////////////
for (int x=0; x<renglon; x++) { 
       for (int y=0; y <columna; y++) {
           matrizFilas[x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el elemento del arreglo"));
           matrizColumnas[x][y]=matrizFilas[x][y];
           matriz+= matrizFilas[x][y] + " ";
                                      }
                                       matriz+="\n";
                              }
//////////////Ordena las filas en orden descendente///////////////////////                              
for (int x=0; x<renglon; x++) { 
       for (int y=0; y <columna-1; y++) {
                                              if(matrizFilas[x][y]>matrizFilas[x][y+1])  {
                                                        aux=matrizFilas[x][y];
                                                  matrizFilas[x][y]=matrizFilas[x][y+1];
                                                      matrizFilas[x][y+1]=aux;            }
                                         }
                              }                                                   

////////////////////Ordena las columnas en orden ascendente/////////////////////////////////////// 
  for(int x=0; x<columna; x++){
        for(int y=0; y<renglon-1; y++){
                                        if(matrizColumnas[y][x]<matrizColumnas[y+1][x])  {
                                                        aux=matrizColumnas[y][x];
                                                  matrizColumnas[y][x]=matrizColumnas[y+1][x];
                                                      matrizColumnas[y+1][x]=aux; }
                              
                                               }
     
                                               }

     ////////////////////Guarda la matriz de filas y de columnas ordenadas para imprimir///////////                              
for (int x=0; x<renglon; x++) { 
       for (int y=0; y <columna; y++) {
                                       matriz2+= matrizFilas[x][y] + " ";
                                       matriz3+= matrizColumnas[x][y]+" ";  
                                    }
                                       matriz2+="\n";
                                       matriz3+="\n";
                              }
                                                                            
JOptionPane.showMessageDialog(null,"La matriz es: \n"+matriz+"\nLa matriz con filas ordenadas es\n"
+matriz2+"\nLa matriz con las columnas ordenadas es\n"+matriz3);
                        }
                        
                        

public static void main ( String args []){
OrdenarFilasColumnas result= new OrdenarFilasColumnas();
result.leerHacer();
                                         }
                                         
                                         
                        }