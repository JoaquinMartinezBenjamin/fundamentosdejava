import java.io.*;
import java.util.*;
import javax.swing.*;

public class Generador_Datos {
    private RandomAccessFile archiv,temporal;   
    public Generador_Datos(){
  //  recopilandoDatos();
}

    int numeroDatos=15;
 
     String[] a = {
"Sofía","Valentina", "Isabella", "Camila", "Valeria", "Mariana", "Gabriela", "Sara", 
"Daniella", "María José", "Victoria", "Martina", "Luciana", "Ximena", "María Fernanda", 
"Lucía", "Natalia", "Catalina", "Mía", "Fernanda", "Nicole", "Julieta", "Abril", "Samantha", 
"Andrea", "Antonella", "Emily", "Emilia", "Paula", "Alessandra", "Juana", "Antonia", "Juliana", 
"Alejandra", "Guadalupe", "Emma", "Regina", "Danna", "Abigail", "Agustina","Renata","Allison", "Brianna", 
"Valery","Florencia", "Constanza", "Josefina", "Ashley", "Laura", "Manuela", "Santiago", "Sebastián",
 "Matías", "Nicolás", "Samuel", "Alejandro", "Mateo", "Diego", "Benjamín", "Daniel", "Joaquín", "Tomás", 
 "Gabriel", "Lucas", "Martín", "Emmanuel", "Alexander", "David", "Emiliano", "Carlos", "Juan José", 
"Andrés", "Felipe", "Ignacio", "Leonardo", "Adrián", "Francisco","Rodrigo", "Alvaro", "Miguel Ángel", 
"Fernando", "Santino", "Bautista", "Agustín", "Juan Pablo", "Vicente", "Thiago", "Maximiliano", 
"Pablo", "Eduardo", "Christopher", "Kevin", "Isaac", "Juan Diego", "Aarón", "Dylan", "Jesús", 
"Esteban", "Manuel", "Juan Sebastián" 
        };
                  
        
      String[] b = {
"Ramírez","Ripoll","Cruz","Pastor","Gil","Toledo","Marques","Puig","Lara",
"Pires","Ramos","Alfonso","Santos","Cerda","Aviz","Peña","Duran","Ortiz","Coma","Ayala",
"Jiménez","Quintana","Roca","Oliveira","Molina","Juan","Ortega","Almeida","Morales","Machado","Luis",
"Riera","Padilla","Melo","Montoya","Enríquez","Pimentel","Sola","Cabrera","Font",
"Torrent","Flores","Medeiros","Fonseca","Salazar","Andrade","Bivar","Espinosa",
"Medina","Velasco","López","Aragón","Portugal","Martínez","Sánchez","Pérez","León",
"González","Costa","Rodríguez","Fernández","Navarre","Sousa","Gómez","Hernández",
"Pereira","Silva","Martin","Jesús","Vidal","Castro","Ruiz","Alonso","Pujo",
"Herrera","Moreno","Soler","María","Torres","Ferrer","Días","Bourgogne",
"Romero","Cerdán","Gutiérrez","Serra","Espagne","Muñoz","Borbón","Viegas",
"Mendoza","Guzmán","Correa","Cano","Rosa","Blanch","Álvarez","Ferreira","Sala","Pacheco"
        };
        
            String[] c = {
   "Carreras","Mira","Bertrán","Aguilar","Planas","Campos","Coelho","Osorio",
"Rome","José","Nava","Antón","Chávez","Miranda","Gaitán","Ávila","Carrillo",
"Reguero","Guerrero","Suarez","Vargas","Antonio","Cunha","Estrada","Cervera","Borja","Blanco",
"Figueroa","Cabral","Andreu","Ribas","Acevedo","Lucero","Roger","Franco","Anglada",
"Faria","Beltrán","Prieto","Carbonell","Cardoso","Rocha","Manuel","Nieto","Córdova",
"Soria","Marín","Fuentes","Rojas","Alves","García","Castillo","Carballo","Cortez",
"Vázquez","Delgado","Brito","Rito","Luna","Cardona","Candelaria","Vega","Varela",
"Baro","Serrano","Rubio","Pinto","Aguirre","Castillo","Trujillo","Sunyer","Laurence",
"Genis","Sandoval","Tavares","Arias","Soto","Sancho","Diego","Comas","Heredia",
"Colomer","Lima","Montes","Camacho","Zúñiga","Rivera","Carvajal","Contreras",
"Zamora","Vera","Crespo","Garza","Guevara","Lozano","Salas","Pascual","Peralta","Parra","Thomas"
            };
            
            
   
        String [] direcciones= {
                "morelos 408 colonia centro",
                "independencia 1789 colonia nuevo mexico",
                "av. juarez 215 colonia bugambilias",
                "andador luna lote 12 manzana 43 el rosario",
                "independencia 1789 colonia nuevo mexico",
                "av. juarez 215 colonia bugambilias",
                "san valentin 43 colonia el rosario",
                "independencia 139 colonia centro",
                "av. juarez 200 colonia bugambilias",
                "san lucas 80 colonia santa cecilia",
                "independencia 123 colonia centro",
                "av. juarez 212 colonia centro",
                "san valentin 234 colonia santa cecilia",
                "independencia 108 colonia centro",
                "av.Hidalgo 345 colinia centro"
            };         
        
            String [] calle= {
              "CALLE AGUSTIN LARA No.","AV. INDEPENDENCIA No.","AV. INDEPENDENCIA No.",
"AV. 20 DE NOVIEMBRE No.","CARRETERA A LOMA ALTA No.","AV. 20 DE NOVIEMBRE No.","CALLE ZARAGOZA No.",
"CALLE MATAMOROS No.","AV. 20 DE NOVIEMBRE No.","AV. 20 DE NOVIEMBRE No.","BLVD. BENITO JUAREZ NO.",
"CALLE MATAMOROS No.","AV. INDEPENDENCIA No.","AV. INDEPENDENCIA No.","CALLE MATAMOROS No.","AV.INDEPENDENCIA No.",
"AV. 5 DE MAYO No.","AV. 5 DE MAYO No.","AV. INDEPENDENCIA No.","AV. INDEPENDENCIA No.",
"AV. INDEPENDENCIA No.","BLVD. BENITO JUAREZ No.","MATAMOROS No.","AV. 5 DE MAYO No.",
"AV. 20 DE NOVIEMBRE No.","AV. 5 DE MAYO No.","CALLE OCAMPO No.","BLVD. BENITO JUAREZ ESQ. 20 DE NOVIEMBRE No.",
"CALLE ALDAMA No.","AV. INDEPENDENCIA No.","AV. 20 DE NOVIEMBRE No.","CALLE IGNACIO RAYON No.",
"CALLE IGNACIO RAYON No.","AV. 20 DE NOV. No.","AV. 20 DE NOVIEMBRE No.","AV. 5 DE MAYO No.",
"AV. INDEPENDENCIA No.","MATAMOROS No.","AV. 20 DE NOVIEMBRE No.","CALLE OCAMPO No.","AV.INDEPENDENCIA No.","AV. INDEPENDENCIA No.",
"CALLE MORELOS No.","CALLE ALDAMA No.","CALLE IGNACIO MATIAS No.","AV. INDEPENDENCIA No.",
"PROL.5 DE MAYO No.","AV. LIBERTAD No.","AV. 5 No.","AV. 5 No.","AV. 20 DE NOVIEMBRE No.",
"AV. INDEPENDENCIA No.","CALLE BENITO JUAREZ No.","20 DE NOVIEMBRE No.","AV. INDEPENDENCIA No.",
"AV INDEPENDENCIA No.","CALLE MATAMOROS No.", "CALLE RIVA PALACIOS No.","AV. 20 DE NOVIEMBRE No.",
"5 DE MAYO No.","INDEPENDENCIA No.","AV. 20 DE NOVIEMBRE No.","AV. INDEPENDENCIA No.","AV. 20 DE NOVIEMBRE No.",
"5 DE MAYO No.","20 DE NOVIEMBRE No.","AV. JESUS CARRANZA No.","OCAMPO 254-B No.","AV. INDEPENDENCIA No.", "AV. INDEPENDENCIA No.",
"AV. JESUS CARRANZA No.","AV. ROBERTYO COLORADO No.","C. ALDAMA No.","AV. LIBERTAD No.",
"AV. 20 DE NOVIEMBRE No.","CAMINO LOMA ALTA No.","AV. INDEPENDENCIA No.","CALLE 21 DE MARZO No.",
"CALLE MATAMOROS No.","INDEPENDENCIA No.","18 DE MARZO No.","AV. INDEPENDENCIA No.","ALDAMA No.","AV.LIBERTAD No.",
"AV. INDEPENDENCIA No.","CALLE MATAMOROS No.", "CALLEJON DE LA NOCHE TRISTE No.","CALLE OCAMPO No.",
"OCAMPO No.","CALLE MORELOS No.","AV DANIEL SOTO No.","AV. INDEPENDENCIA No.","AV. INDEPENDENCIA No.",
"AV. 5 DE MAYO No.","AV. LIBERTAD No.","AV. INDEPENDENCIA No.","AV. INDEPENDENCIA No.","AV. 20 DE NOVIEMBRE No.",
"AV. PRINCIPAL No.","AV INDEPENDENCIA No.","AV. INDEPENDENCIA No.",
  
            };
            
            
            String [] colonia = {
                
              "COL. EX-NORMAL  ","COL. CENTRO  ","COL. CENTRO  ","COL.CENTRO",
"LOMAS DEL PEDREGAL  ","COL. CENTRO  ","COL. LA PIRAGUA  ","COL. CENTRO  ",
"COL. CENTRO","COL. CENTRO  ","FRACC. LOS ANGELES  ","COL. CENTRO  ",
"COL. CENTRO  ","COL.CENTRO  ","COL. CENTRO  ","COL.CENTRO  .",
"LA PIRAGUA","COL.CENTRO  ","COL. CENTRO  ","COL. CENTRO  ","CENTRO","LA PIRAGUA  ","CENTRO  ",
"CENTRO  ","LA PIRAGUA  ","CENTRO  ","CENTRO  ","CENTRO  ",
"CENTRO  ","CENTRO  ","CENTRO  ","COL. LAZARO CARDENAS","COL.LAZARO CARDENAS",
"COL.CENTRO  .","COL.CENTRO","COL.CENTRO  ","CENTRO  ","CENTRO  ","CENTRO  ",
"COL.CENTRO  ","COL. CENTRO","COL. LA PIRAGUA  ","COL. CENTRO  ","COL.CENTRO  ","COL.MA. LUISA",
"CENTRO","COL.5 DE MAYO  ","COL.CENTRO  ","COSTA VERDE","FRACC. COSTA VERDE  ",
"COL. CENTRO  .","COL. CENTRO  ","COL.LAZARO CARDENAS.","CENTRO","CENTRO","CENTRO",
"COL.CENTRO  .","COL. LA PIRAGUA  ","COL. CENTRO  ","CENTRO","CENTRO","COL.CENTRO  ",
"COL. CENTRO  ","COL. LA PIRAGUA","CENTRO","CENTRO","COL.CENTRO  ","CENTRO","CENTRO",
"COL.CENTRO  ","LAZARO CARDENAS","SANTA FE  ","COL.CENTRO  ","COL. CENTRO","COL.CENTRO  ",
"COL.LOS AMIGOS CHARROS","COL.CENTRO  ","COL. MA. EUGENIA  .",
"COL. CENTRO  ","CENTRO","CENTRO","COL.CENTRO  ","CENTRO",
"COL.CENTRO  ","COL. CENTRO  ","COL.CENTRO  ","COL. CENTRO","COL. CENTRO  ",
"CENTRO","COL. CENTRO  ","COL. EL REPOSO","LA PIRAGUA","CENTRO","COL.CENTRO",
"COL. CENTRO  ","CENTRO","COL. CENTRO  ","CENTRO","TEMASCAL","CENTRO  ",
"COL.CENTRO  "  
            };
public void generarDatos(int numeroDatos)
    { 
        try
        {          
                         archiv = new RandomAccessFile("Directo.dat","r");
                       temporal= new RandomAccessFile("temporal.dat","rw");
          Random r = new Random();
            int numeroControl=11160000;
             String nombre="";
             int semestre=0;
              int edad=0;
           String direccion="";
          int contDatos=0;
           int numero=0;
         String soloNombre="";
         String apellido="";
      for (int i = 0; i <= (a.length - 1); i++)
      for (int j = 0; j <= (b.length - 1); j++)
      for (int k = 0; k <= (c.length - 1); k++) {
          
          edad= r.nextInt(5) + 18;
          semestre= r.nextInt(11)+ 1;
          numero= r.nextInt(5000)+1;
          if(contDatos<numeroDatos){
             
          nombre= a[i]+" "+b[j]+" "+c[k];
          apellido=b[j]+" "+c[k];
          soloNombre=a[i];
         // calle= ""+numeroControl+" de la calle ";
          direccion= calle[j] +" "+numero+" " +colonia[k]+ " Oaxaca Oax.";
                    temporal.writeInt(numeroControl);
                    temporal.writeUTF(nombre);
                    temporal.writeUTF(apellido);
                     temporal.writeInt(semestre);
                    temporal.writeInt(edad);
                    temporal.writeUTF(direccion);
                    temporal.writeUTF(soloNombre);
                  // System.out.println( numeroControl+"\t"+nombre+"\t\t\t"+semestre+"\t"+edad+"\t"+direccion);
                    //temporal.writeDouble(0);
                    //temporal.writeByte(0
                    numeroControl++;
                    
                    
                } // cierra los tres for

          //  }
                   
           contDatos++;
        }
        }
      catch (IOException ee)
        {}
        finally{
            try{
                archiv.close();
                temporal.close();
                File  f1,f2;
                f2=new File("Directo.dat");
                f2.delete();
                f1=new File("temporal.dat");
                f2=new File("Directo.dat");
                f1.renameTo(f2);
               }
            catch (IOException ffff){
                System.out.println("No se pudo cerrar el archivo" + ffff.getMessage());
                                    }
        }
    }
    
   
    
    
public Alumno []  obtenerDatos (int numeroDatos )  {
    
    
    Alumno [] alumnos = new Alumno [numeroDatos];
    
            File fichero=new File("Directo.dat");
          
             int numControl=0;
             String nombre="";
             String apellido="";
             String direccion="";
             int edad=0;
             int semestre=0;
             String soloNombre="";
        if (fichero.exists())
        {
           try
            {
                archiv=new RandomAccessFile(fichero,"rw");
                int cont=0;
                do{
                     numControl=archiv.readInt();
                     nombre=archiv.readUTF();
                     apellido=archiv.readUTF();
                     semestre=archiv.readInt();
                     edad=archiv.readInt();
                     direccion=archiv.readUTF();
                     soloNombre=archiv.readUTF();
                    //edad=archiv.readByte(); 
                    //datosAlumnos.insertar( new Alumno(numControl,nombre,promedio,edad));
             //  System.out.println( ""+ numControl+" "+nombre+" " + direccion);
               alumnos[cont]= new Alumno(numControl,nombre,"",semestre,edad,direccion);
             //    System.out.println(alumnos[cont].getNombre()+" "+alumnos[cont].getApellido());
               cont++;
              // System.out.println(cont);
                }while (cont<numeroDatos);
      
            }
            catch (IOException e)
            {}
            finally
            {
                try
                {
                    archiv.close();
                }
                catch (IOException ff)
                {
                    System.out.println("No se pudo cerrar el archivo" + ff.getMessage());
                }
            }
                }
        else  JOptionPane.showMessageDialog(null,"El archivo no esta creado","Informacion",JOptionPane.PLAIN_MESSAGE);
    
    
        return alumnos;
        
}

    
public Alumno []  obtenerDatosBusqueda (int numeroDatos )  {
    
    
    Alumno [] alumnos2 = new Alumno [numeroDatos];
    
            File fichero=new File("Directo.dat");
          
             int numControl=0;
             String soloNombre="";
             String apellido="";
             String direccion="";
             int edad=0;
             int semestre=0;
             String nombre="";
        if (fichero.exists())
        {
           try
            {
                archiv=new RandomAccessFile(fichero,"rw");
                int cont=0;
                do{
                     numControl=archiv.readInt();
                     nombre=archiv.readUTF();
                     apellido=archiv.readUTF();
                     semestre=archiv.readInt();
                     edad=archiv.readInt();
                     direccion=archiv.readUTF();
                          soloNombre=archiv.readUTF();
                     
                   //  System.out.println(apellido);
//                      
//                       temporal.writeInt(numeroControl);
//                     temporal.writeUTF(nombre);
//                     temporal.writeUTF(apellido);
//                      temporal.writeInt(semestre);
//                     temporal.writeInt(edad);
//                     temporal.writeUTF(direccion);
//                     temporal.writeUTF(soloNombre);
//                      
                     
                    //edad=archiv.readByte(); 
                    //datosAlumnos.insertar( new Alumno(numControl,nombre,promedio,edad));
             //  System.out.println( ""+ numControl+" "+nombre+" " + direccion);
               alumnos2[cont]= new Alumno(numControl,soloNombre,apellido,semestre,edad,direccion);
               //System.out.println(alumnos2[cont].getNombre()+" "+alumnos2[cont].getApellido());
               cont++;
              // System.out.println(cont);
                }while (cont<numeroDatos);
      
            }
            catch (IOException e)
            {}
            finally
            {
                try
                {
                    archiv.close();
                }
                catch (IOException ff)
                {
                    System.out.println("No se pudo cerrar el archivo" + ff.getMessage());
                }
            }
                }
        else  JOptionPane.showMessageDialog(null,"El archivo no esta creado","Informacion",JOptionPane.PLAIN_MESSAGE);
    
    
        return alumnos2;
        
}




}