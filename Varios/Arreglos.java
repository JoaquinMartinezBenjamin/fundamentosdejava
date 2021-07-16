import javax. swing. *;

public class Arreglos{

           int i;//contador del primer for
           int j;//contador del segundo for
           int m;// elementos totales del conjunto a
           int n;//elementos totales del conjunto b
           int total=0;// total de elementos sumando el total del conjunto y el conjunto
           int a []; // arreglo que guarda el conjunto a
           int b [];// arreglo que guarda el conjunto b
           int contador=0;
           int interseccion [];// arreglo que guarda los valores de la interseccion
           int union [];// arreglo que guarda los valores de la union
           int repeticion; // contador de repeticiones de un valor
      
           
public Arreglos(){}
       
public void ingresarValores(){ // pide, guarda e imprime los valores de los conjuntos
           
    
   m= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de elementos del conjunto a"));
   n= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de elementos del conjunto b")); 
   a=new int [m];
   b=new int [n];

 System.out.println ("conjunto a");
for (i=0; i < m; i++) {
 a [i]= Integer.parseInt (JOptionPane.showInputDialog ("Escriba el elemento "+(i+1)+" del conjunto a"));
 System.out.print (a[i]+" \t");
                      }
                System.out.println ("\nconjunto b");               
for (i=0; i < n; i++){
 b[i]= Integer.parseInt (JOptionPane.showInputDialog ("Escriba el elemento "+(i+1)+" del conjunto b"));
  System.out.print (b[i]+" \t");
                     }
                     
                    }
                    
             
public void buscarInterseccion (){           
     
   
     for (i=0; i < m; i++){
     for (j=0; j < n; j++){
                         if (a[i]==b[j]){ repeticion++;}   //compara cada valor de a con cada valor de b y busca cuantas veces
                                                           // se repite cada valor del conjunto a en el conjunto b
                          }
                          }
     
                          // primero se midio el tamaño que tendra el arreglo de interseccion para declararlo
 
     interseccion= new int [repeticion];  // la interseccion medira el numero de veces que se encontro una repeticion
                                           // ya que interseccion es el total de números repetidos
     
     for (i=0; i < m; i++){
     for (j=0; j < n; j++){
                         if (a[i]==b[j]){
                            
                             interseccion[contador]=a[i];  // ahora se guardan esos valores repetidos
                              contador++;                       }
                                                            }
                                                        }
                       
                     
                          
                          

                       System.out.println ("\nLa interseccion es: \n");         
for (i=0; i < repeticion; i++) {
System.out.print (interseccion [i]+" \t");
                               }

}


 public void buscarUnion (){            
                total=m + n; // la union sera la suma de todos los elementos de ambos conjuntos menos el numero de veces que se repite cada uno
          total= total-repeticion;  // esto para declarar el tamaño del arreglo union
           
                union= new int [total];
                contador=0;
                
for (i=0; i < m; i++){ // se le dan todos los valores del conjunto a
                             union[contador]=a[i];
                             contador++;  
                                         
                     } 
                     
                     boolean busqueda= false;
                     
     for (i=0; i <n; i++){                
     for( j= 0; j< repeticion; j++){


if (b[i]==interseccion[j]){ busqueda=true;} // si se encuentra por lo menos una repeticion busqueda da true pues si encontro repeticion


                            }
                            if (busqueda==false) { // si a no encuentra alguna repeticion en el conjunto b captura el valor en el arreglo union
                             union[contador]=b[i];
                             contador++;  
                               }
                               busqueda=false; // busqueda cambia a false para una nueva busqueda
                        }
                      
                        
                           System.out.println ("\nLa union es: \n");  
for (i=0; i < total; i++) {
System.out.print (union [i]+" \t");
                          }

                            }

                             
public static void main (String [] args){
     
     Arreglos result= new Arreglos();
     result.ingresarValores();
     result.buscarInterseccion();
     result.buscarUnion();
   
                                         }
                                          
                                          
                                        }