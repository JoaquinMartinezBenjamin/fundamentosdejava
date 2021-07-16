import javax.swing.*;
public class Matriz{

public Matriz(){}


int renglon=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de renglones"));
int columna=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de columnas"));
 
          
int bidi[][]= new int [renglon] [columna];
int uni[]= new int [renglon*columna];

public void leerImprimir(){

         System.out.println("Original");
for (int x=0; x<renglon; x++) { 
 for (int y=0; y <columna; y++) {
                  bidi[x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el elemento ["+x+"]["+y+"] del arreglo"));
                   System.out.print( bidi[x][y] + " ");
                                }
                        System.out.println();
                              }
                         }         
                         
public void ordenar(){                           
  int aux=0;
  for (int x=0; x<renglon; x++){ 
  for (int y=0; y <columna; y++){
             for (int i=0; i<renglon; i++) { 
             for (int j=0; j <columna;j++) {
           
       if (bidi[x][y]<bidi[i][j]){
              aux=bidi[x][y];
       bidi[x][y]=bidi[i][j];
       bidi[i][j]=aux;           }
                                              }
                                           }
                               }
                               }
                      }
                      
  public void imprimirOrdenado(){
               System.out.println("Ordenado");
       for (int x=0; x<renglon; x++) { 
       for (int y=0; y <columna; y++) {
   
           System.out.print(bidi[x][y]+"  ");
     
                                      }
           System.out.println();     }
                              
                                  }
                                  
  public void imprimirUnidimensional(){
           System.out.println("En unidimensional");
 int conta=0;
       for (int x=0; x<renglon; x++) { 
       for (int y=0; y <columna; y++) {
   
        uni[conta]=bidi[x][y];
        
        System.out.println(uni[conta]);
        conta++;
        
                                      }
                                      }
                              
                                  }                                
                                  
                            
                
public static void main ( String args []){
Matriz result= new Matriz ();
result.leerImprimir();
result.ordenar();
result.imprimirOrdenado();
result.imprimirUnidimensional();              }
                                         
                                         
                        }