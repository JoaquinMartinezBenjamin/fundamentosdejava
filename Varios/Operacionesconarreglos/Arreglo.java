import javax.swing.*;
public class Arreglo{

public Arreglo(){}

int filas=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de renglones"));
int columnas=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de columnas"));

int a[][]= new int [filas][columnas];
int b[][]= new int [filas][columnas];
int c[][]= new int [filas][columnas];
int transpuestaB[][]= new int [filas][columnas];
int transpuestaC[][]= new int [filas][columnas];
int uni[]= new int  [filas*columnas];

public void leerImprimir(){
System.out.println("Original");
for (int x=0; x<filas; x++)     { 
for (int y=0; y <columnas; y++) {
 a[x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el elemento ["+x+"]["+y+"] del arreglo"));
        b[x][y]=a[x][y];
        c[x][y]=a[x][y];
  System.out.print(a[x][y] + " ");
                                }
                        System.out.println();
                                }
                         }         
                         
public void ordenarFilas(){                           
  int aux=0;
  for (int x=0; x<filas; x++)   { 
  for (int y=0; y<columnas; y++){
  for (int z=0; z<columnas; z++){
           
       if (b[x][y]<b[x][z]){
              aux=b[x][y];
          b[x][y]=b[x][z];
              b[x][z]=aux; }
                                           }
                                           }
                                           }
                               
                      }
                      
public void ordenarColumnas()  {
  int aux=0;
for (int x=0; x<columnas; x++){ 
for (int y=0; y<filas; y++){
for (int z=0; z<filas; z++){

             if (c[y][x]<c[z][x]){
                 aux=c[y][x];
             c[y][x]=c[z][x];
             c[z][x]=aux;        }
              
                             }
                             }                      
                             }
                               }
                               
 public void cambiarFilasXcolumnas(){
    for (int x=0; x<columnas; x++) { 
       for (int y=0; y<filas; y++) {
           
                        transpuestaB[x][y]=b[y][x];
                        transpuestaC[x][y]=c[y][x];
                   
                                      }
                                   }
                                   }  
 
 
 
 
  public void imprimirOrdenado(){
   System.out.println("B: filas ordenadas de A convertidas en columnas de B");
   for (int x=0; x<filas; x++)     { 
   for (int y=0; y<columnas; y++)  {
   System.out.print(transpuestaB[x][y]+"  ");
                                   }
         System.out.println();     }
           
  System.out.println("C: columnas ordenadas de A convertidas en filas de C");
  for (int x=0; x<filas; x++)    { 
  for (int y=0; y<columnas; y++) {
   System.out.print(transpuestaC[x][y]+"  ");
                                }
           System.out.println();  
                               }
                            }
                            
  public void imprimirUnidimensional(){
  System.out.println("C en unidimensional");
  int conta=0;
       for (int x=0; x<filas; x++) { 
       for (int y=0; y<columnas; y++) {
         uni[conta]=transpuestaC[x][y];
         System.out.println(uni[conta]);
         conta++;
        
                                      }
                                      }
                              
                                  }                                
                                  
public static void main ( String args []){
Arreglo result= new Arreglo();
result.leerImprimir();
result.ordenarFilas();
result.ordenarColumnas();
result.cambiarFilasXcolumnas();
result.imprimirOrdenado();
result.imprimirUnidimensional();         }
                                         
                                         
                        }