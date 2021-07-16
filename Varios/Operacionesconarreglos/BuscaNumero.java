import javax.swing.*;
public class BuscaNumero{

public BuscaNumero(){}


int renglon=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de renglones"));
int columna=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de columnas"));
int bidi[][]= new int [renglon] [columna];


public void leerImprimir(){
 System.out.println("Original");
for (int x=0; x<renglon; x++) { 
for (int y=0; y<columna; y++) {
  bidi[x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el elemento ["+x+"]["+y+"] del arreglo"));
 System.out.print( bidi[x][y] + " ");
                                }
                        System.out.println();
                               }
                         }         
                         
int num=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el número que desea buscar en el arreglo"));  
   
public void buscarNumero(){

int aux=0;
 for (int x=0; x<renglon; x++) { 
 for (int y=0; y<columna; y++) {
               
     if(bidi[x][y]==num)
     
 { System.out.println("El numero buscado "+num+" esta  en la posicion: " +x+","+y);
    aux=1;}
                               }
                               }
 if(aux==0){System.out.println("El numero buscado no esta en el arreglo");}
   }
                                  
public static void main ( String args []){
BuscaNumero result= new BuscaNumero ();
result.leerImprimir();
result.buscarNumero();
                                         }
                                         
                                         
                        }