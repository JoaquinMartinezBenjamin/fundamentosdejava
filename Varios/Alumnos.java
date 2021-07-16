import javax.swing.*;

public class Alumnos {

private int [] clave;
private String [] nombre;
private String [] materia; 
private double [] promedio;
private JScrollPane barra;
private JTextArea area;

public Alumnos (){
     
     clave= new int [10]; 
     nombre= new String [10];
     materia= new String [3];
     promedio = new double [10]; 
      
      
    int cl [] = { 10, 20, 59, 120, 22, 88, 668, 718, 990, 120};
    clave = cl; 

    String nom []= { "Juan ", "Miguel", "Pedro" , "Luis" , "Maria", "Mario", 
        "Roberto", "Alejandro" , "Enrique", "Mauricio" };
    nombre = nom;
        
    String mat []= {  "Programación 1 ", "Lenguajes 1", "Estructura de datos" };
    materia= mat; 
         
    double prom [] ={ 80,90,70,85,95,100,78,89,90,100 } ; 
    promedio= prom; 
            
    area = new JTextArea   (30,30);
    barra = new JScrollPane (area) ;
                  }
              
public void impresion  () {
area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");                    
area.append ( "Listado  de alumnos \n " );
area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  \n");
area.append ( "Clave        Nombre del alumno    Promedio \n");
                   
       for (int i = 0; i <10; i++) {
                        
        area.append ( clave [i] + " \t" + nombre[i] +"\t"+ promedio[i]+"\n");

                                     }
         JOptionPane.showMessageDialog ( null,barra);           
                            }
                                               
public void porcentajes() {
int p1=0;
int leng=0;
int est=0;
      
 for(int i=0; i<3; i ++)
      
      {
          if(materia [i].equals ("Programación 1")) p1++;
          if(materia [i].equals ("Lenguajes 1")) leng ++;
          if(materia [i].equals ("Estructura de datos"))  est++;
      }
        
 area.append ("Porcentaje de las materias \n");
        area.append ("Programación   " + (p1 /100)*100+"\n");
        area.append ("Lenguajes 1    " + (leng/100)*100+"\n");
        area.append ("Estructura de datos    " + (est/100)*100 + "\n");
        
                          }
                         
    public static void main (String []args){
        Alumnos obj= new Alumnos ();
        obj.porcentajes();
        obj.impresion();
          
                                           }
}
          
          
                                                
                                            