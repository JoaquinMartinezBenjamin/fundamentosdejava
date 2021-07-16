import javax.swing.*;
import java.util.*;

public class Busquedas {
    public JScrollPane barra;
    private JTextArea area;
    ArrayList<Alumno> alumnos = new ArrayList <Alumno> () ;

    public Busquedas(){
        area  = new JTextArea   (30,60);
        barra = new JScrollPane (area) ;
    }

    public void importarDatos () {
        LeerArchivo lectura = new LeerArchivo ();
        alumnos = lectura.leerArchivo1 ();

    }

    public void imprimirAlumnos(){       
        if (alumnos != null ) {
            area.setText("");
            area.append("ID\tNOMBRE\tAPELLIDO\tSEXO\tEDAD\tTIPO\n");
            for ( Alumno a : alumnos ){
                area.append ( a.getId()+"\t"+a.getNombre()+"\t"+a.getApellido()+"\t"+a.getSexo()+"\t"+a.getEdad()+"\t"+a.getTipo()+"\n");
            }
            JOptionPane.showMessageDialog (null,barra);
        }
        else { System.out.println ("NO SE HAN CARGADO LOS ALUMNOS"); }
    }

    public void ordenarAlumnosId(){
        Comparator<Alumno> comparadorID =  new Comparator<Alumno>()  {
                @Override 
                public int compare(Alumno a1, Alumno a2){
                    int resultado= (new Integer(a1.getId())).compareTo(new Integer(a2.getId()));
                    return resultado;}
            };
        Collections.sort(alumnos,comparadorID );
    }

    public Alumno busquedaLineal(int id){ 
        long startTime = System.nanoTime(); 
        for(int i=0; i<alumnos.size();i++){
            if(alumnos.get(i).getId()==id){
                long estimatedTime=System.nanoTime() - startTime;
                System.out.println("Busqueda lineal terminada en " + estimatedTime+" nanosegundos");
                return alumnos.get(i);}
        }
        long estimatedTime=System.nanoTime() - startTime;
        System.out.println("Busqueda lineal terminada en " + estimatedTime+" nanosegundos");
        return null;
    }

    public  Alumno busquedaBinaria(int id){      
        int n = alumnos.size();
        int centro,inf=0,sup=n-1;
        long startTime = System.nanoTime();
        while(inf<=sup){
            centro=(sup+inf)/2;
            if(alumnos.get(centro).getId()==id) {
                long estimatedTime=System.nanoTime() - startTime;
                System.out.println("Busqueda lineal terminada en " + estimatedTime+" nanosegundos");
                return alumnos.get(centro);}
            else if(id < alumnos.get(centro).getId()){
                sup=centro-1;
            }
            else {
                inf=centro+1;

            }
        }

        long estimatedTime=System.nanoTime() - startTime;

        System.out.println("Busqueda lineal terminada en " + estimatedTime+" nanosegundos");  
        return null;

    }

    public void menu(){
        try{

            int selector = -1;
            while(selector!=0){

                selector = Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el valor correspondiente de la opción que requiera"                        
                        +"\n 1= Imprimir alumnos"         
                        +"\n 2= BusquedaLineal"
                        +"\n 3= BusquedaBinaria "
                        +"\n Presione 0 para salir"));
                switch (selector){
                    case 1: 
                    imprimirAlumnos();
                    break; 

                    case 2:
                    int id= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del alumno a buscar"));
                    Alumno a=busquedaLineal(id);
                    if (a!= null){
                        System.out.println("ID\tNOMBRE\tAPELLIDO\tSEXO\tEDAD\tTIPO");
                        System.out.println(a.getId()+"\t"+a.getNombre()+"\t"+a.getApellido()+"\t"+a.getSexo()+"\t"+a.getEdad()+"\t"+a.getTipo()+"\n");
                    }else{System.out.println("Alumno no encontrado");}
                    break;

                    case 3:
                    ordenarAlumnosId();
                    id= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del alumno a buscar"));

                    a=busquedaBinaria(id);
                    if (a!= null){
                        System.out.println("ID\tNOMBRE\tAPELLIDO\tSEXO\tEDAD\tTIPO");
                        System.out.println(a.getId()+"\t"+a.getNombre()+"\t"+a.getApellido()+"\t"+a.getSexo()+"\t"+a.getEdad()+"\t"+a.getTipo()+"\n");
                    }else{System.out.println("Alumno no encontrado");}
                    break;

                    case 0:

                    break;
                    default:
                    JOptionPane.showMessageDialog (null,"Opcion no valida");
                    break;
                }
            }
        }

        catch(NumberFormatException e){     
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero entero", "Error de sintaxis", JOptionPane.ERROR_MESSAGE);
            menu();
        }
    }

    public static void main(String [] args ) {
        Busquedas b = new Busquedas();

        b.importarDatos ();
        b.menu();

    }
}

                                            
                                            
                                            
                                            
                                            
                                            
                                            
                                            
                                            
                                            
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                     
                                     
                                     
                                     
                                     
                                     
                                     
                                     
                                     
                                     
                                     
                                                
                                                
                                                
                                                
                                                
                                                
                                                
                                                
                                                
                                                
                                                
                                      
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                  
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        