/**@ ITO Fundamentos de programación
 * @(#)OrdenarDiagonal.java
 * @ Este programa lee una matriz e imprime su diagonal principal ordenada
 * @author Joaquín Martínez Benjamín
 */

import javax.swing.*;


public class OrdenarDiagonal{

public OrdenarDiagonal(){} 

int n = Integer.parseInt (JOptionPane.showInputDialog (" Inserte el número de filas y columnas"));
int diagonal= 0;
 
public void crearMatriz1() {
        
        String matrizImpresa="";
        String matrizImpresa2="";
        int [][] matriz1;
        matriz1= new int [n][n];
        
        for(int x=0; x<n; x++)
        for(int y=0; y<n; y++)
        {
         matriz1 [x] [y]=Integer.parseInt (JOptionPane.showInputDialog ("Ingrese valores en la matriz"));
        }

        for(int x=0; x<n; x++){
        for(int y=0; y<n; y++){
                                matrizImpresa+= matriz1 [x] [y]+"  ";
                              }
                matrizImpresa+= "\n";
                              }

        for (int conta=0; conta< n-1; conta++)
        for (int conta2=conta+1; conta2 < n; conta2++){

             if ( matriz1[conta][conta]>matriz1 [conta2][conta2]){
                                                            diagonal= matriz1 [conta] [conta];
                                               matriz1[conta][conta]= matriz1[conta2][conta2];
                                                            matriz1[conta2][conta2]= diagonal;
                                                                  }  
   
                                                       }
         
        for(int x=0; x<n; x++){
        for(int y=0; y<n; y++){
                                matrizImpresa2+= matriz1 [x][y]+"  ";
                              }
                                matrizImpresa2+= "\n";
                              }
                              
        JOptionPane.showMessageDialog(null,"La matriz es: \n"+matrizImpresa +"\nCon la diagonal ordenada "
        + "la matriz es\n" +matrizImpresa2 );

        }

        public static void main (String args[]){
              
              OrdenarDiagonal arreglo= new OrdenarDiagonal();
                                      arreglo.crearMatriz1();
                                
                                                }
}