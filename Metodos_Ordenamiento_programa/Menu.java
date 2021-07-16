import javax.swing.*; 
import java.io.*;
public class Menu {

    public Menu(){

    }

    int selector=-1;
    public void menu(){
         MedirTiempos m= new MedirTiempos();
        try{
            while(selector!=0){
                selector = Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el valor correspondiente de la acción que desea realizar"
                        +"\n 1= Cuadro comparativo de metodos de ordenamiento"
                        +"\n 2= Cuadro comparativo de metodos de busqueda"
                        +"\n 3= Nuevo ordenamiento "
                        +"\n 4= Nueva busqueda  "

                        +"\n Presione 0 para salir"));
                switch (selector){
                    case 0:  
                    break;
                    case 1:
                    m.contar();  
                    break;

                    case 2: //MedirTiempos m= new MedirTiempos();
                    m.tiemposBusqueda();
                    break;

                    case 3:  ordenamientoNuevo();
                    break;
                    case 4: nuevaBusqueda();
                    break;

                    default:    System.out.println("Opción invalida"); 
                    break;

                }   
            }//fin de while
        }     catch(NumberFormatException e){ /*Aquí capturo la excepcion para cuando el usuario introduzca algo que no sea un número entero. */
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número entero", "Error de sintaxis", JOptionPane.ERROR_MESSAGE);
            //Llamo nuevamente al método 
            menu();
        }
    }
    public void nuevaBusqueda(){
    int numeroDatos=0;
    int selector3= -1;
    Busquedas b= new Busquedas();
     try{
     
            selector3 = Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el valor del metodo de ordenamiento"
                    +"\n 1= BusquedaLineal"
                    +"\n 2= BusquedaBinaria"
                     +"\n Presione 0 para volver al menu"));
                    
                                switch (selector3){
                                     case 0:  
                menu();
                break;


                case 1:
                numeroDatos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de datos entre los que buscar")); 
             
              
                  
               
                  
                     int seleccion= Integer.parseInt(JOptionPane.showInputDialog("Introduzca 1 para buscar por nombre o 2 para buscar por apellido"));
                 while( seleccion != 1 && seleccion !=2){seleccion= Integer.parseInt(JOptionPane.showInputDialog("Opcion invalidad\nIntroduzca 1 para buscar por nombre o 2 para buscar por apellido"));}
                  if (seleccion==1){
                          String nombreAlum=JOptionPane.showInputDialog("Introduzca el nombre del alumno a buscar");
                          while(validar(nombreAlum)==false) {nombreAlum= JOptionPane.showInputDialog ("Nombre invalido \nIntroduzca el nombre del alumno") ;}
                  b.busquedaL (numeroDatos,nombreAlum);
                }
     
                      if (seleccion==2){
                          String nombreAlum=JOptionPane.showInputDialog("Introduzca el apellido del alumno a buscar");
                          while(validar(nombreAlum)==false) {nombreAlum= JOptionPane.showInputDialog ("Nombre invalido\nIntroduzca el apellido del alumno") ;}
                  b.busquedaL_apellido (numeroDatos,nombreAlum);
                }
                    
                break;
                 case 2:
                       numeroDatos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de datos entre los que buscar")); 
             
              
                  
               
                  
                   seleccion= Integer.parseInt(JOptionPane.showInputDialog("Introduzca 1 para buscar por nombre o 2 para buscar por apellido"));
                 while( seleccion != 1 && seleccion !=2){seleccion= Integer.parseInt(JOptionPane.showInputDialog("Opcion invalidad\nIntroduzca 1 para buscar por nombre o 2 para buscar por apellido"));}
                  if (seleccion==1){
                          String nombreAlum=JOptionPane.showInputDialog("Introduzca el nombre del alumno a buscar");
                          while(validar(nombreAlum)==false) {nombreAlum= JOptionPane.showInputDialog ("Nombre invalido \nIntroduzca el nombre del alumno") ;}
                  b.busquedaBinariaNombre(numeroDatos,nombreAlum);
                }
     
                      if (seleccion==2){
                          String nombreAlum=JOptionPane.showInputDialog("Introduzca el apellido del alumno a buscar");
                          while(validar(nombreAlum)==false) {nombreAlum= JOptionPane.showInputDialog ("Nombre invalido\nIntroduzca el apellido del alumno") ;}
                  b.busquedaBinariaApellido(numeroDatos,nombreAlum);
                }
              // default:    System.out.println("Opción invalida"); 
                break;
                
            }
            
    
    }
         catch(NumberFormatException e){ /*Aquí capturo la excepcion para cuando el usuario introduzca algo que no sea un número entero. */
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número entero", "Error de sintaxis", JOptionPane.ERROR_MESSAGE);
            //Llamo nuevamente al método 
            ordenamientoNuevo();
        }
    }
    
    
    public void ordenamientoNuevo(){
        int numeroDatos=0;
        int selector2=-1;
        Ordenamiento order = new Ordenamiento();

        try{
     
            selector2 = Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el valor del metodo de ordenamiento"
                    +"\n 1= Quicksort"
                    +"\n 2= Burbuja"
                    +"\n 3= Seleccion"
                    +"\n 4= Insercion  "
                    +"\n 5= Shellsort  "
                    +"\n 6= Mergesort"
                    +"\n 7= Heapsort  "

                    +"\n Presione 0 para volver al menu"));
            switch (selector2){

                case 1: numeroDatos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de datos a ordenar"));  
                order.ordenamientoQuicksort(numeroDatos);
                break;
                case 2:numeroDatos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de datos a ordenar"));  
                order.ordenamientoBurbuja(numeroDatos);
                break;
                case 3:numeroDatos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de datos a ordenar"));  
                order.ordenamientoSeleccion(numeroDatos);
                break;
                case 4:numeroDatos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de datos a ordenar"));  
                order.ordenamientoInsercion(numeroDatos);
                break;
                case 5:numeroDatos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de datos a ordenar"));  
                order.ordenamientoShellSort(numeroDatos);
                break;
                case 6:numeroDatos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de datos a ordenar"));  
                order.ordenamientoMergeSort(numeroDatos);
                break;
                case 7:numeroDatos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de datos a ordenar"));  
                order.ordenamientoHeapsort(numeroDatos);
                break;
                case 0:  
                menu();
                break;

                default:    System.out.println("Opción invalida"); 
                break;

            }

     
        }           catch(NumberFormatException e){ /*Aquí capturo la excepcion para cuando el usuario introduzca algo que no sea un número entero. */
            JOptionPane.showMessageDialog(null, "Por favor ingrese un número entero", "Error de sintaxis", JOptionPane.ERROR_MESSAGE);
            //Llamo nuevamente al método 
            ordenamientoNuevo();
        }
    }

    public boolean  validar (String cadena ) {
        boolean valor=false;

        for ( int i =1; i < cadena.length(); i++){

            if (cadena.charAt(i)!='A' &&
            cadena.charAt(i)!='B' &&
            cadena.charAt(i)!='C' && 
            cadena.charAt(i)!='D' &&
            cadena.charAt(i)!='E' &&
            cadena.charAt(i)!='F' &&
            cadena.charAt(i)!='G' &&
            cadena.charAt(i)!='H' &&
            cadena.charAt(i)!='I' &&
            cadena.charAt(i)!='J' &&
            cadena.charAt(i)!='K' &&
            cadena.charAt(i)!='L' &&
            cadena.charAt(i)!='M' &&
            cadena.charAt(i)!='N' &&
            cadena.charAt(i)!='O' &&
            cadena.charAt(i)!='P' &&
            cadena.charAt(i)!='Q' &&
            cadena.charAt(i)!='R' &&
            cadena.charAt(i)!='S' &&
            cadena.charAt(i)!='T' &&
            cadena.charAt(i)!='U' &&
            cadena.charAt(i)!='V' &&
            cadena.charAt(i)!='W' &&
            cadena.charAt(i)!='X' &&
            cadena.charAt(i)!='Y' &&
            cadena.charAt(i)!='Z' &&
            cadena.charAt(i)!='a' &&
            cadena.charAt(i)!='b' &&
            cadena.charAt(i)!='c' &&
            cadena.charAt(i)!='d' &&
            cadena.charAt(i)!='e' &&
            cadena.charAt(i)!='f' &&
            cadena.charAt(i)!='g' &&
            cadena.charAt(i)!='h' &&
            cadena.charAt(i)!='i' &&
            cadena.charAt(i)!='j' &&
            cadena.charAt(i)!='k' &&
            cadena.charAt(i)!='l' &&
            cadena.charAt(i)!='m' &&
            cadena.charAt(i)!='n' &&
            cadena.charAt(i)!='o' &&
            cadena.charAt(i)!='p' &&
            cadena.charAt(i)!='q' &&
            cadena.charAt(i)!='r' &&
            cadena.charAt(i)!='s' &&
            cadena.charAt(i)!='t' &&
            cadena.charAt(i)!='u' &&
            cadena.charAt(i)!='v' &&
            cadena.charAt(i)!='w' &&
            cadena.charAt(i)!='x' &&
            cadena.charAt(i)!='y' &&
            cadena.charAt(i)!='z' &&
            cadena.charAt(i)!=' '
            ){

                valor= false;

            }else{ valor= true;}

        }
        return valor;
    }
public static void main (String[]args){
    Menu m= new Menu();
    m.menu();
}
    
}