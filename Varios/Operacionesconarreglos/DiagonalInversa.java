/**@ ITO Fundamentos de programación
 * @ Este programa lee una matriz bidimensional y cambia las diagonales 
 *   principales
 * @author Joaquín Martínez Benjamín
 */
import javax.swing.*;

public class DiagonalInversa{

public DiagonalInversa(){} 

int n = Integer.parseInt (JOptionPane.showInputDialog (" Inserte el número de filas y columnas"));
int aux= 0;
 
public void crearMatriz1() {
        
        String matrizImpresa="";
        String matrizImpresa2="";
        int [][] matriz1;
        matriz1= new int [n][n];
        ///////////////////LEE LA MATRIZ///////////////////////////
        for(int x=0; x<n; x++)
        for(int y=0; y<n; y++)
        {
         matriz1 [x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Ingrese valores en la matriz"));
        }

        for(int x=0; x<n; x++){
        for(int y=0; y<n; y++){
                                matrizImpresa+= matriz1 [x] [y]+"  ";
                              }
                matrizImpresa+= "\n";
                              }
        ///////////////////INVIERTE LAS DIAGONALES Y GUARDA LA NUEVA MATRIZ////////////////                      
           int y= n-1;
        for (int x=0; x< n; x++){
                                                            aux= matriz1 [x][x];
                                               matriz1[x][x]= matriz1[x][y];
                                                            matriz1[x][y]= aux;
                                                            y--;
                                                                   
   
                                                       }
         
        for(int x=0; x<n; x++){
        for( y=0; y<n; y++){
                                matrizImpresa2+= matriz1 [x][y]+"  ";
                              }
                                matrizImpresa2+= "\n";
                              }
                              
        JOptionPane.showMessageDialog(null,"La matriz es: \n"+matrizImpresa +"\nCon la diagonal inversa "
        + "la matriz es:\n" +matrizImpresa2 );

        }

        public static void main (String args[]){
              
              DiagonalInversa arreglo=new DiagonalInversa();
                                      arreglo.crearMatriz1();
                                
                                                }
}
