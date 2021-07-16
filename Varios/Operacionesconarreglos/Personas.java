// Joaquín Martínez Benjamín
// Examen de la tercera unidad
import javax. swing. *;

public class Personas{

       public Personas(){}
       
          public void compararEdades(){

int tot= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el total de personas"));
 
String nombres[]=new String [tot];
int edades[]=new int [tot];
int diferenciasEdad[]=new int[tot];
////////////////////////////////////////////////////////////////////////////////////////////////// 
for (int x=0; x <tot; x++) {
     
 nombres[x]= JOptionPane.showInputDialog ("Escriba el nombre "+ x);
 edades [x]=  Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad de la personas"+x));
     
                       }
//////////////////////////////////////////////////////////////////////////////////////////////////                       
for (int x=0; x <tot; x++) {

int y=x+1;
while(y<tot){
if (edades[x]<edades[y]){
diferenciasEdad[x]=edades[y]-edades[x];
y=tot;}
y++;}

                      }
                      
                      
                      for (int x=0; x <tot; x++) {
                          System.out.println(nombres[x]+ " "+edades[x]+" "+diferenciasEdad[x]);
                        }

//////////////////////////////////////////////////////////////////////////////////////////////////                      
                              }
                             
public static void main (String [] args){
     
     Personas result= new Personas();
     result.compararEdades();
                                         }
                                          
                                          
                                        }


     
