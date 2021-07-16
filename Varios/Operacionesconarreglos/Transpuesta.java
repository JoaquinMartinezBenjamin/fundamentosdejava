import javax.swing.*;

public class Transpuesta {

public Transpuesta(){}

int n[][];
int transpuesta[][];
int renglon,columna;

public void leerHacer(){

renglon=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de renglones"));
columna=Integer.parseInt (JOptionPane.showInputDialog ("Escriba el total de columnas"));
 
          n= new int [renglon] [columna];
transpuesta= new int [columna][renglon];

for (int x=0; x<renglon; x++) { 
       for (int y=0; y <columna; y++) {
                        n[x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el elemento del arreglo"));
                        System.out.print ( n[x][y] + " ");
                                      }
                                       System.out.println("");
                              }

 System.out.println("La matriz transpuesta es: \n");
for (int x=0; x<columna; x++) { 
       for (int y=0; y <renglon; y++) {
                        transpuesta[x][y]=n[y][x];
                        System.out.print ( transpuesta[x][y] + " ");
                                      }
                                       System.out.println("");
                              }
                        
                        
                    }
public static void main ( String args []){
Transpuesta result= new Transpuesta ();
result.leerHacer();
                                         }
                                         
                                         
                        }