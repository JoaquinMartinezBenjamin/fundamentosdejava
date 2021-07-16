/**@ ITO Fundamentos de programación
 * @(#)OrdenarDiagonal.java
 * @ Este programa lee una matriz e imprime su perímetro
 * @author Joaquín Martínez Benjamín
 */

import javax.swing.*;

public class Perimetro {

public Perimetro(){}

int n[][];
int renglon;
int contadorFila=0;
int contadorY=0;
int contadorX=0;
String matrizImpresa="";
String perimetro="";

public void leerHacer(){

renglon=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de renglones y columnas"));

n= new int [renglon] [renglon];
////////////////////////////Rellena e imprime la matriz/////////////////
for (int x=0; x<renglon; x++) { 
for (int y=0; y<renglon; y++) {
              
 n[x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Ingrese valores en la matriz"));
                                                    matrizImpresa+= n[x][y] + "   ";
                               }
                                                    matrizImpresa+="\n";
                               }
         
///////////////////////////Obtiene el perímetro////////////////////////////                               
while (contadorFila < renglon){ 
     
if (contadorFila== 0){
                           while (contadorY<renglon){
                                                     contadorX=0;
                        perimetro+=n[contadorX][contadorY]+"   ";
                                                     contadorY++;
                                                    }
                        perimetro+="\n"; 
                           }
             
if (contadorFila== renglon-1){
                           while (contadorY<renglon){
                                             contadorX= renglon-1;
                   perimetro += n[contadorX][contadorY]+"   ";
                                                      contadorY++;
                                                    }
                   perimetro += "\n";
                  
                              }          
          
if (!(contadorFila==0||contadorFila==renglon-1)){
                                           contadorX=contadorFila;
                          perimetro+=n[contadorX][contadorY]+"   ";
        int i=0;
                    while (i<renglon -2){
                                                  perimetro+="     ";
                                                              i++;
                                         }
                                contadorY=contadorY + (renglon-1);
                          perimetro+=n[contadorX][contadorY]+"   ";
                                                  perimetro+="\n";
                                                }        
               contadorX=0;          
               contadorY=0;
               contadorFila++;  
            }
            
JOptionPane.showMessageDialog(null,"La matriz es: \n"+matrizImpresa
         +"\nEl perímetro es: \n"+perimetro); 
                }

public static void main ( String args []){
Perimetro result= new Perimetro();
result.leerHacer();
                                         }
                                         
                                         
                        }