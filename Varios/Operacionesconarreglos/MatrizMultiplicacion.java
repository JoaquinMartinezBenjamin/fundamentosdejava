//Programa que lee una matriz A, una Matriz B, multiplica la Matriz A por la matriz B y guarda
// los resultados en una matriz C para despues imprimir las tres Matrices.
//Alumno: Joaquín Martínez Benjamín
//Materia: Fundamentos de programación 9:00-10:00 A.M
import javax.swing.*;       

public class MatrizMultiplicacion{

public MatrizMultiplicacion (){}
int totfilasA;
int totcolumnasA;
int totfilasB;
int totcolumnasB;
int matrizA[][];
int matrizB[][];
int matrizC[][];
String A="";
String B="";
String C="";

 public void crearDatos(){
     totfilasA=    Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas de la matriz A"));
     totcolumnasA= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas de la matriz A"));
     totfilasB= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas de la matriz B"));
do{
if (totcolumnasA!=totfilasB){
 totfilasB= Integer.parseInt(JOptionPane.showInputDialog("El número de filas de la matriz B debe ser igual "+
"al número de columnas de la matriz A\nIngrese nuevamente el número de filas de la matriz B"));
                           }
   }while (totcolumnasA!=totfilasB);
totcolumnasB= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas de la matriz B"));
matrizA= new int [totfilasA][totcolumnasA];
matrizB= new int [totfilasB][totcolumnasB];
matrizC= new int [totfilasA][totcolumnasB];

}
/////////////////////////////ABRE METODO LEER MATRICES//////////////////////////
public void leerMatrices(){



for ( int filasA = 0;       filasA < totfilasA;       filasA++){ 
for ( int columnasA = 0; columnasA < totcolumnasA; columnasA++){

matrizA[filasA][columnasA]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento [" +filasA+"]["+columnasA+"] de la matriz A"));
                                                               }
                                                               }
/////////////////////////////////////////////////////////////////////////////////
for ( int filasB = 0;       filasB < totfilasB;       filasB++){ 
for ( int columnasB = 0; columnasB < totcolumnasB; columnasB++){

matrizB[filasB][columnasB]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento [" +filasB+"]["+columnasB+"] de la matriz B"));
                                                               }
                                                               } 
                          }
 ////////////////////////////ABRE METODO MULTIPLICAR////////////////////////////
public void Multiplicar(){                          
for ( int j = 0; j < totfilasA; j++){   // controla el orden en que se debe trabajar con las filas
for ( int k = 0; k < totcolumnasB; k++){//  las columnas se usan mas y se reinician despues de que se termina con una fila de A 
                                        // por eso va dentro del for  de filas de A

                              for ( int i = 0; i < totfilasB; i++ ){// también se podria usar el total de columnas de A como condición
                                                                    // para entrar al for pues los valores de columnas de A y filas de B
                                                                    // son iguales
                                        matrizC[j][k] += matrizA[j][i]*matrizB[i][k];
                                        
                               // un elemento de una fila de A se multiplican con un elemento de una columnas de B 
                               // cuando todos los elementos de una fila de A se han multiplicado con todos los elementos de una columna de B
                               // según el orden que controla i, los resultados se van sumando y guardando en un elemento de una fila de la matrizC
                               // es por eso que j aumenta mas lento que K, ya que K lleva la cuenta de las columnas que se deben crear
                               // en C.
                                                           }
                            } 
                            }
                                              }
                                              
/////////////////////////////ABRE METODO IMPRIMIR MATRICES//////////////////////////
public void imprimirMatrices(){
for ( int filasA = 0;       filasA < totfilasA;       filasA++){ 
for ( int columnasA = 0; columnasA < totcolumnasA; columnasA++){

A+=matrizA[filasA][columnasA]+" ";
                                                               } A+= "\n";
                                                               }
/////////////////////////////////////////////////////////////////////////////////
for ( int filasB = 0;       filasB < totfilasB;       filasB++){ 
for ( int columnasB = 0; columnasB < totcolumnasB; columnasB++){

B+=matrizB[filasB][columnasB]+" ";
                                                               }B+= "\n";
                                                               } 
//////////////////////////////////////////////////////////////////////////////////
for ( int filasC = 0;       filasC < totfilasA;       filasC++){ 
for ( int columnasC = 0; columnasC < totcolumnasB; columnasC++){

C+=matrizC[filasC][columnasC]+" ";
                                                               }C+= "\n";
                                                               }  
//////////////////////////////////////////////////////////////////////////////////
 JOptionPane.showMessageDialog(null,"La matriz A es: \n"+A+"\n La matriz B es: \n"+B+"El producto de A X B es: \n"+C);                                                                 
                          }                                                             
///////////////////////////////////////////////////////////////////////////////                                              
                                              
public static void main (String[]args){

MatrizMultiplicacion Multi= new MatrizMultiplicacion();
Multi.crearDatos();
Multi.leerMatrices();
Multi.Multiplicar();
Multi.imprimirMatrices();              }
                                              
                                              
                                            }//cierra clase