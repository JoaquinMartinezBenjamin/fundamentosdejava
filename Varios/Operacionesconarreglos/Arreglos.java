/**@ ITO Fundamentos de programación
 * @ Este programa lee un arreglo unidimensional para despues imprimirlo
 * @author Joaquín Martínez Benjamín
 */
 
import javax. swing. *;

public class Arreglos{

       public Arreglos(){}
       
          public void Numeros(){
           
           int i;
           int n;
           String matrizImpresa="";
           
n= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de elementos del arreglo"));
 
int matriz []=new int [n];
////////////////////////////////////////////////////////////////////////////////////////////////// 
for (i=0; i < n; i++) {
     
matriz [i]= Integer.parseInt (JOptionPane.showInputDialog ("Escriba el elemento "+i+" del arreglo"));
     
                       }
//////////////////////////////////////////////////////////////////////////////////////////////////                       
for (i=0; i < n; i++) {

matrizImpresa +="["+ matriz [i]+"]" +"\n";

                      }
JOptionPane.showMessageDialog(null,"La matriz es: \n"+matrizImpresa);
//////////////////////////////////////////////////////////////////////////////////////////////////                      
                              }
                             
public static void main (String [] args){
     
     Arreglos result= new Arreglos();
     result.Numeros();
                                         }
                                          
                                          
                                        }


     