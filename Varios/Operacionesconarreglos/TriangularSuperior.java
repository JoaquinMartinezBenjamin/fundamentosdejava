/**@ ITO Fundamentos de programación
 * @ Este programa lee una matriz bidimensional e imprime la matriz 
 *   simetrica basandose en los valores de arriba de la diagonal
 * @author Joaquín Martínez Benjamín
 */
import javax.swing.*;

public class TriangularSuperior{

public TriangularSuperior(){}

int n[][];
int simetrica[][];
int renglon,columna;
int aux;
String original="";
String simetricaImpresa="";

public void leerHacer(){

renglon=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de columnas"));
columna=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de renglones"));
 
          n= new int [renglon] [columna];
simetrica= new int [columna][renglon];

for (int x=0; x<renglon; x++) { 
       for (int y=0; y <columna; y++) {
 n[x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el elemento["+x+"]["+y+"] del arreglo"));
                       original+= n[x][y]+"  ";
                                      }
                       original+= "\n";             
                              }

   for (int x=0; x<renglon; x++) { 
       for (int y=x; y <columna; y++) {
                      
                        simetrica[y][x]=n[x][y];
                       
                                      }
                              }
                              int y=0;
   for (int x=0; x<renglon; x++) { 
       for ( y=x; y <columna; y++) {
                      
                       simetrica[x][y]=n[x][y];
                       
                                      }
                              }
                              
   for (int x=0; x<renglon; x++) { 
       for ( y=0; y <columna; y++) {
                        simetricaImpresa+=simetrica[x][y] + "  ";
                                      }
                                       simetricaImpresa+="\n";
                              }
   JOptionPane.showMessageDialog(null,"La matriz original es: \n"+original+"\nLa matriz simetrica es\n"
   +simetricaImpresa);
                        
                    }

public static void main ( String args []){
TriangularSuperior result= new TriangularSuperior ();
result.leerHacer();
                                         }
                                         
}