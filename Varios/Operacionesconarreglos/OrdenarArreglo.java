 

/**@ ITO Fundamentos de programación
 * @ Este programa lee un arreglo unidimensional para despues ordenarlo de menor a mayor
 * @author Joaquín Martínez Benjamín
 */
import javax. swing. *;

public class OrdenarArreglo{

       public OrdenarArreglo(){}
           int i;
           int aux;
           String matrizImpresa="";
           
 int n= Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el número de elementos del arreglo"));
 int arreglo []=new int [n];
 
          public void leerImprimir(){
//////////////////////////////////////////////Rellena el arreglo//////
 for (i=0; i < n; i++) {
     
     arreglo [i]= Integer.parseInt (JOptionPane.showInputDialog ("Escriba los elementos del arreglo"));
     
                       }
/////////////////////////////////////////// Imprime el arreglo desordenado
 for (i=0; i < n; i++) {
matrizImpresa +="["+ arreglo [i]+"]" +"\n";

                      }
  JOptionPane.showMessageDialog(null,"El arreglo desordenado es: \n"+matrizImpresa);
                                     }
  
  public void ordenaArreglo(){
 //////////////////////////////////////////////// Ordena el arreglo
 for (int x=0; x < n-1; x++)
 for (int y=x+1; y < n; y++){
     
    if (arreglo [x]>arreglo [y])
    {        aux=arreglo[x];
             arreglo [x]=arreglo[y];
             arreglo[y]=aux;
    }
                           }
                            }
  ////////////////////////////////////Imprime el arreglo ordenado
 public void imprimeOrdenado(){
 matrizImpresa="";
 for (i=0; i < n; i++) {
     
 matrizImpresa +="["+ arreglo [i]+"]" +"\n";

                      }
  JOptionPane.showMessageDialog(null,"El arreglo ordenado es: \n"+matrizImpresa);
///////////////////////////////////////////////////////////////////                     
                              }
                            

public static void main (String [] args){
     
     OrdenarArreglo result= new OrdenarArreglo();
     result.leerImprimir();
     result.ordenaArreglo();
     result.imprimeOrdenado();
                                          }
                                          
                                              }
