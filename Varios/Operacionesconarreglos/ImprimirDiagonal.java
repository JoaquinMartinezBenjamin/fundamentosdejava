/**@ ITO Fundamentos de programación
 * @ Este programa lee un arreglo bidimensional e imprime los valores de la
 *   diagonal principal
 * @author Joaquín Martínez Benjamín
 */
import javax.swing.*;

public class ImprimirDiagonal{

public ImprimirDiagonal(){} 

int n = Integer.parseInt (JOptionPane.showInputDialog (" Inserte el número de columnas y filas"));
int conta=0;
String diagonal= "";
String matrizImpresa="";
int [][]matriz= new int [n][n]; 
    public void crearMatriz() {
        
for(int x=0; x<n; x++)
        for(int y=0; y<n; y++)
        {

    matriz[x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Ingrese valores en la matriz "));
        }
for(int x=0; x<n; x++) {
        for(int y=0; y<n; y++)
                                              {
                                               matrizImpresa+= matriz[x][y]+" ";
                                               }
                matrizImpresa+= "\n";
                                        }
                                        
JOptionPane.showMessageDialog(null,"La matriz es: \n"+matrizImpresa + "\n");                    
                               }
                               
   public void buscarDiagonal(){
while (conta < n)
 {
 diagonal+= matriz[conta][conta]+" ";
                     diagonal+= "\n";     
                    conta ++;}
                    
              JOptionPane.showMessageDialog(null,"La diagonal es: \n"+ diagonal); 
                                        
                               }        

 public static void main (String args[]){
              
              
                              ImprimirDiagonal arreglo= new ImprimirDiagonal();
                                  arreglo.crearMatriz();
                                  arreglo.buscarDiagonal();
                                
                                        }

}