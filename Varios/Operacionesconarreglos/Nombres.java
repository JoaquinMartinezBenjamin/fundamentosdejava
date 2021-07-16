import javax. swing. *;

public class Nombres{
           int i;
String matrizImpresa="";
int n=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de elementos del arreglo"));
String arreglo []=new String[n];

       public Nombres(){}
          public void leerNombres(){
           
 for (i=0; i < n; i++) {
     
     arreglo [i]=  JOptionPane.showInputDialog ("Escriba los elementos del arreglo");
     
                       }
                                   }
                                   
          public void imprimirNombres(){                         
 for (i=0; i < n; i++) {
     
matrizImpresa +="["+ arreglo [i]+"]" +"\n";

                       }
  JOptionPane.showMessageDialog(null,"El arreglo desordenado es: \n"+matrizImpresa);
                                        }
 
          public void ordenarNombres()             {
for(int j = 0; j < arreglo.length; j++) { 
for( i = j + 1; i < arreglo.length; i++) { 
if(arreglo[i].compareTo(arreglo[j]) < 0) { 
String aux = arreglo[j]; 
arreglo[j] = arreglo[i]; 
arreglo[i] = aux; 
} 
} 
                                        } 
                                                   }      
          
          public void imprimirOrdenados(){                                         
matrizImpresa="";
 for (i=0; i < n; i++) {
matrizImpresa +="["+ arreglo [i]+"]" +"\n";

                       }
  JOptionPane.showMessageDialog(null,"El arreglo ordenado es: \n"+matrizImpresa);
                
                                         }
                              
 public static void main (String [] args){
     
     Nombres result= new Nombres();
     result.leerNombres();
     result.imprimirNombres();
     result.ordenarNombres();
     result.imprimirOrdenados();
                                         }
                                          
                                          
                                        }