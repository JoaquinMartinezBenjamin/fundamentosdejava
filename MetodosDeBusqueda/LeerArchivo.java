import java.io.*;
import java.util.*;
public class LeerArchivo{

public ArrayList leerArchivo1 (){
   ArrayList <Alumno> alumnos = new ArrayList<Alumno>();
   try{
        FileInputStream fstream = new FileInputStream("archivo1.csv");
          DataInputStream entrada = new DataInputStream(fstream);
           BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
           String strLinea ;
            int cont =0;
            int id=0;
             String nomb="";
              String apellido="";
        String sexo="";
         int edad=0;
          String tipo="";
          while ((strLinea = buffer.readLine()) != null){
              if (cont>0){
                    String [] valores;
                      valores= strLinea.split(";");
                       id= Integer.parseInt(valores[0]);
                         nomb= valores[1];
                         apellido= valores[2];
                         sexo=valores[3];
               edad=Integer.parseInt(valores[4]);
                tipo=valores[5];
                alumnos.add(new Alumno(id,nomb,apellido,sexo,edad,tipo ));
            }
            cont++;
        }
             entrada.close();
              }catch (Exception e){ //Catch de excepciones
                   System.err.println("Ocurrio un error: " + e.getMessage());
                }
                return alumnos;
            }
        }
        
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
       



