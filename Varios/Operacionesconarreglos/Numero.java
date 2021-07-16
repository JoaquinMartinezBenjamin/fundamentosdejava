
import javax. swing. *;

public class Numero{
           String imprimir="";
           int subindice= 0;
           int subindice2=0;
           int maximo=0;
           int minimo=0;
           
    int n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del arreglo"));
    int arreglo[]=new int [n];
    
       public Numero(){}
        
 public static void main (String [] args){
     
     Numero result= new Numero();
     result.leerArreglo();
     result.buscarMayMe();
     result.imprimirResultado();
                                          }
                                          
  public void leerArreglo(){
   /////////////////////////////////////////////////////////////////////////////////////////////////////          
   for (int i=0; i < n; i++) {
   arreglo [i]= Integer.parseInt (JOptionPane.showInputDialog ("Ingrese el elemento " + i+ " del arreglo"));
                             }
                           }
   /////////////////////////////////////////////////////////////////////////////////////////////////////  
  public void buscarMayMe(){                     
        maximo=arreglo [0];
        minimo=arreglo [0];
     for (int i=0; i < n; i++) {
       if(  arreglo [i]>maximo  ){maximo=arreglo [i];
                                  subindice= i;}
       if(  arreglo [i]<minimo  ){minimo=arreglo [i];
                                  subindice2= i;}
                               }
                            }  
   /////////////////////////////////////////////////////////////////////////////////////////////////////
   public void imprimirResultado(){
  for (int i=0; i < n; i++) {

if(arreglo [i]==maximo){imprimir +=i+"="+ arreglo [i] +" Es el mayor y su lugar es el "+i+"\n";}else{
if(arreglo [i]==minimo){imprimir +=i+"="+ arreglo [i] +" Es el menor y su lugar es el "+i+"\n";}else{
imprimir +=i+"="+ arreglo [i] +"\n";}}
                             }
 ///////////////////////////////////////////////////////////////////////////////////////////////////////                            
  JOptionPane.showMessageDialog(null,"::::ARREGLO:::: \n"+imprimir);
}
                              
                    }