/**@ ITO Fundamentos de programación
 * @(#)OrdenarDiagonal.java
 * @ Este programa lee una matriz y la convierte en un vector de acuerdo al orden
 *   de filas y un vector de acuerdo al orden de columnas
 * @author Joaquín Martínez Benjamín
 */

import javax.swing.*;


public class FilasColumnas{

public FilasColumnas(){} 

int m = Integer.parseInt (JOptionPane.showInputDialog (" Inserte el número de filas"));
int n = Integer.parseInt (JOptionPane.showInputDialog (" Inserte el número de columnas"));

public void crearMatriz1() {
        
        String matrizImpresa="";
        int [][] matriz1;
        matriz1= new int [m][n];
        int vector[]= new int [m*n];
        int vector2[]= new int [m*n];
        String vectorImpreso= "";
        String vectorImpreso2= "";
        int conta=0;
        /////////////Rellena la matriz//////////////////////////////////////////////
        for(int x=0; x<m; x++)
        for(int y=0; y<n; y++)
        {
         matriz1 [x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Ingrese valores en la matriz"));
        }
        
        /////////////////// Rellena el vector según el orden de las filas///////////
        /////////////////// Guarda la matriz para imprmirla en pantalla/////////////
        for(int x=0; x<m; x++){
        for(int y=0; y<n; y++){
                               matrizImpresa+= matriz1 [x][y]+" ";
                               vector[conta]=matriz1 [x][y];
                        
                               conta ++;
                                               }
                matrizImpresa+= "\n";
                                               }
        conta=0;// Reinicia conta para volver a usarlo en otro ciclo
        
        /////////////////// Rellena el vector según el orden de las columnas///////////
        for(int x=0; x<n; x++){
        for(int y=0; y<m; y++){
                             
                               vector2[conta]=matriz1 [y][x];
                               conta ++;
                                               }
     
                                               }
        /////////////Guarda los dos vectores en una variable String para imprimirlos
        for(int x=0; x<m*n; x++) {
                             vectorImpreso+= vector [x]+"\n";
                             vectorImpreso2+= vector2 [x]+" ";
                            }
                            
         JOptionPane.showMessageDialog(null,"La matriz es: \n"+matrizImpresa
         +"El vector por filas es: \n"+vectorImpreso+"\n El vector por columnas es\n"+vectorImpreso2);                
         
        

}

public static void main (String args[]){
                                          FilasColumnas arreglo= new FilasColumnas();
                                                              arreglo.crearMatriz1();
                                       }

}