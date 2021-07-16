import java.io.*;
import java.util.*;
import javax.swing.*;
public class MedirTiempos { 
    private RandomAccessFile archiv,temporal;  
    private JScrollPane barra,barra2;
    private JTextArea area,area2;
    Tiempos time= new Tiempos();
    String []times10;
    String[][] todos = new String [7][6];
    String []times100;
    String []times1000;
    String []times10000;
    String []times100000;
    String []times1000000;

    String [] tiemposBurbuja= new String [6];
    String [] tiemposInsercion= new String [6];
    String [] tiemposSeleccion= new String [6];
    String [] tiemposShellsort= new String [6];
    String [] tiemposQuicksort= new String [6];
    String [] tiemposMergesort= new String [6];
    String [] tiemposHepsort= new String [6];
    public MedirTiempos(){
        area  = new JTextArea   (30,60);
        area2  = new JTextArea   (20,95);
        barra = new JScrollPane (area) ;
        barra2 = new JScrollPane (area2) ;
        // contr();
    }

    public void contar(){
        //      times10=  time.contrTiempos(10);
        //      System.out.println("Proceso terminado para 10 datos");
        //       times100= time.contrTiempos(100);
        //         System.out.println("Proceso terminado para 100 datos");
        //        times1000= time.contrTiempos(1000);
        //          System.out.println("Proceso terminado para 1000 datos");
        //           times10000= time.contrTiempos(10000);
        //             System.out.println("Proceso terminado para 10000 datos");
        //              times100000= time.contrTiempos(100000);
        //                System.out.println("Proceso terminado para 100000 datos");
        //                 times1000000= time.contrTiempos(1000000);
        //                   System.out.println("Proceso terminado para 1000000 datos");

        //        todos[0][0]= times10[0];
        //        todos[1][0]= times10[1];
        //        todos[2][0]= times10[2];
        //        todos[3][0]= times10[3];
        //        todos[4][0]= times10[4];
        //        todos[5][0]= times10[5];
        //        todos[6][0]= times10[6];
        //        
        //        
        //        todos[0][1]= times100[0];
        //        todos[1][1]= times100[1];
        //        todos[2][1]= times100[2];
        //        todos[3][1]= times100[3];
        //        todos[4][1]= times100[4];
        //        todos[5][1]= times100[5];
        //        todos[6][1]= times100[6];
        //        
        //        
        //        
        //        todos[0][2]= times1000[0];
        //        todos[1][2]= times1000[1];
        //        todos[2][2]= times1000[2];
        //        todos[3][2]= times1000[3];
        //        todos[4][2]= times1000[4];
        //        todos[5][2]= times1000[5];
        //        todos[6][2]= times1000[6];
        //        
        //        todos[0][3]= times100000[0];
        //        todos[1][3]= times100000[1];
        //        todos[2][3]= times100000[2];
        //        todos[3][3]= times100000[3];
        //        todos[4][3]= times100000[4];
        //        todos[5][3]= times100000[5];
        //        todos[6][3]= times100000[6];
        //        
        //        todos[0][4]= times1000000[0];
        //        todos[1][4]= times1000000[1];
        //        todos[2][4]= times1000000[2];
        //        todos[3][4]= times1000000[3];
        //        todos[4][4]= times1000000[4];
        //        todos[5][4]= times1000000[5];
        //        todos[6][4]= times1000000[6];
        //        
        //        todos[0][5]= times10[0];
        //        todos[1][5]= times10[1];
        //        todos[2][5]= times10[2];
        //        todos[3][5]= times10[3];
        //        todos[4][5]= times10[4];
        //        todos[5][5]= times10[5];
        //        todos[6][5]= times10[6];




        todos[0][0]= (0.0/1000)+"s";
        todos[1][0]= (0.0/1000)+"s";
        todos[2][0]= (0.0/1000)+"s";
        todos[3][0]= (1.0/1000)+"s";
        todos[4][0]= (0.0/1000)+"s";
        todos[5][0]= (0.0/1000)+"s";
        todos[6][0]= (0.0/1000)+"s";

        todos[0][1]= (10.0/1000)+"s";
        todos[1][1]= (1.0/1000)+"s";
        todos[2][1]= (0.0/1000)+"s";
        todos[3][1]= (1.0/1000)+"s";
        todos[4][1]= (0.0/1000)+"s";
        todos[5][1]= (0.0/1000)+"s";
        todos[6][1]= (0.0/1000)+"s";

       
        todos[0][2]= (342.0/1000)+"s";
        todos[1][2]= (33.0/1000)+"s";
        todos[2][2]= (33.0/1000)+"s";
        todos[3][2]= (10.0/1000)+"s";
        todos[4][2]= (0.0/1000)+"s";
        todos[5][2]= (0.0/1000)+"s";
        todos[6][2]= (16.0/1000)+"s";

        todos[0][3]= (53626.0/1000)+"s";
        todos[1][3]= (7071.0/1000)+"s";
        todos[2][3]= (18734.0/1000)+"s";
        todos[3][3]= (62.0/1000)+"s";
        todos[4][3]= (31.0/1000)+"s";
        todos[5][3]= (375.0/1000)+"s";
        todos[6][3]= (47.0/1000)+"s";

        todos[0][4]= (4212735.0/1000)+"s";
        todos[1][4]= (960785.0/1000)+"s";
        todos[2][4]= (1219053.0/1000)+"s";
        todos[3][4]= (624.0/1000)+"s";
        todos[4][4]= (499.0/1000)+"s";
        todos[5][4]= (412.0/1000)+"s";
        todos[6][4]= (501.0/1000)+"s";

        todos[0][5]= (5989050.0/1000)+"s";
        todos[1][5]= (3785860.0/1000)+"s";
        todos[2][5]= (6089050.0/1000)+"s";
        todos[3][5]= (7649.0/1000)+"s";
        todos[4][5]= (4561.0/1000)+"s";
        todos[5][5]= (4025.0/1000)+"s";
        todos[6][5]= (8033.0/1000)+"s";
        cargarTiemposGuardados();
        // guardarTiempos(todos);

    }

    public void tiemposBusqueda(){
        
      
        String metodo[]={"Búsqueda lineal","Búsqueda binaria"};

        String tiempo[]={"0.0     ","0.015","0.031","1.639","8.255","0.0     ","0.015","0.016","0.624","5.167"};

        area2.append("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"); 

        area2.append("MÉTODO\t\t10 datos\t\t100 datos\t\t1000 datos\t\t100000 datos\t\t1000000 datos\n");
        area2.append("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"); 
        int cont=0;
        for(int i=0;i<metodo.length;i++){
            area2.append( metodo[i]+"\n");
            for(int j=0;j<5;j++){                       
                if(cont<tiempo.length)
                    area2.append("\t\t"+tiempo[cont]+" s");                       
                cont++;   
            }                    
            area2.append("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"); 
        }

              
        JOptionPane.showMessageDialog ( null,barra2);

    }

    
    public void cargarTiemposGuardados(){
        String temp10="";
        String temp100="";
        String temp1000="";
        String temp10000="";
        String temp100000="";
        String temp1000000="";
        area.append ("Metodo\\Datos\t10\t100\t1000\t10000\t100000\t1000000\n");

        String[]nombres= new String [7];
        nombres[0]="Burbuja";
        nombres[1]="Insercion";
        nombres[2]="Seleccion";
        nombres[3]="Shellsort";
        nombres[4]="Quicksort";
        nombres[5]="Mergesort";
        nombres[6]="Heapsort";

        String temp="";
        for (int i=0; i<7;i++){

            for(int j=0; j<6; j++){

                temp+= todos[i][j]+"\t";

                //                      temp10= todos[j][i];
                //                        temp100= todos[j][i];
                //                          temp1000= todos[j][i];
                //                            temp10000= todos[j][i];
                //                              temp100000= todos[j][i];
                //                                temp1000000= todos[j][i];

                //area.append (nombres[j] + "\t"+temp10+ "\t"+temp100+ "\t"+temp1000+ "\t"+temp10000+ "\t"+temp100000+ "\t"+temp1000000+"\n");
                //area.append (nombres[j] + "\t"+todos[j][i]+"\n" //"\t"+temp100+ "\t"+temp1000+ "\t"+temp10000+ "\t"+temp100000+ "\t"+temp1000000+"\n");
            }
            area.append("---------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            area.append(nombres[i]+"\t"+temp+"\n\n");
            temp="";
        }
        JOptionPane.showMessageDialog ( null,barra);

    }
}
//     
//     public void guardarTiempos(String [][]t)
//     { 
//           String temp10="";
//           String temp100="";
//           String temp1000="";
//           String temp10000="";
//           String temp100000="";
//           String temp1000000="";
//         try
//         { 
//            
//                          archiv = new RandomAccessFile("Tiempos.dat","r");
//                        temporal= new RandomAccessFile("temp.dat","rw");
//                        //  while (!(temp.isEmpty ())){
//       
//                  //   Alumno aux= temp.pollLast();
//                 //    temporal.writeInt(aux.getNumControl());
//                 
//                 for (int i=0; i<7;i++){
//                     for(int j=0; j<6; j++){
//                         
//                      temp10= t[j][i];
//                        temp100= t[j][i];
//                          temp1000= t[j][i];
//                            temp10000= t[j][i];
//                              temp100000= t[j][i];
//                                temp1000000= t[j][i];
//                     temporal.writeUTF(temp10);
//                      temporal.writeUTF(temp100);
//                       temporal.writeUTF(temp1000);
//                        temporal.writeUTF(temp10000);
//                         temporal.writeUTF(temp100000);
//                          temporal.writeUTF(temp1000000);
//                          
//                         }
//                     }
//                          
//                   //  temporal.writeDouble(aux.getPromedio());
//                     //temporal.writeByte(aux.getEdad());
//                     
//               
// 
//             
//                    
//         }
//       
//         
//         
//         catch (IOException ee)
//         {
//            
//         }
//         finally
//         {
//             try
//             {
//                 archiv.close();
//                 temporal.close();
//                 File  f1,f2;
//                 f2=new File("Tiempos.dat");
//                 f2.delete();
//                 f1=new File("temp.dat");
//                 f2=new File("Tiempos.dat");
//                 f1.renameTo(f2);
//                 
//            
//             }
//             catch (IOException ffff)
//             {
//                 System.out.println("No se pudo cerrar el archivo" + ffff.getMessage());
//             }
//         }
//     }
//     
//     
//     
//     
//     public void cargarTiemposGuardados()
//     {
//         File fichero=new File("Tiempos.dat");
//        String temp10="";
//           String temp100="";
//           String temp1000="";
//           String temp10000="";
//           String temp100000="";
//           String temp1000000="";
//           area.append ("Metodo\\Datos\t10\t100\t1000\t10000\t100000\t1000000\n");
//         if (fichero.exists())
//         {
//            try
//             {
//                 archiv=new RandomAccessFile(fichero,"rw");
//                 int cont=0;
//                 String[]nombres= new String [7];
//                 nombres[0]="Burbuja";
//                 nombres[1]="Insercion";
//                 nombres[2]="Seleccion";
//                 nombres[3]="Shellsort";
//                 nombres[4]="Quicksort";
//                 nombres[5]="Mergesort";
//                 nombres[6]="Heapsort";
//                 do{
//                     
//                       temp10= archiv.readUTF();
//                      temp100=archiv.readUTF();
//                       temp1000=archiv.readUTF();
//                        temp10000=archiv.readUTF();
//                         temp100000=archiv.readUTF();
//                          temp1000000=archiv.readUTF();
//                     
//                     
// //                      numControl=archiv.readInt();
// //                     nombre=archiv.readUTF();
// //                     promedio=archiv.readDouble();
// //                     edad=archiv.readByte();
// //                     datosAlumnos.insertar( new Alumno(numControl,nombre,promedio,edad));
// area.append (nombres[cont] + "\t"+temp10+ "\t"+temp100+ "\t"+temp1000+ "\t"+temp10000+ "\t"+temp100000+ "\t"+temp1000000+"\n");
//              cont++;
//                 }while (true);
//                 
//     
//             }
//             catch (IOException e)
//             {}
//             finally
//             {
//                 try
//                 {    JOptionPane.showMessageDialog ( null,barra);
//                     archiv.close();
//                 }
//                 catch (IOException ff)
//                 {
//                     System.out.println("No se pudo cerrar el archivo" + ff.getMessage());
//                 }
//             }
//                 }
//         else  JOptionPane.showMessageDialog(null,"El archivo no esta creado","Informacion",JOptionPane.PLAIN_MESSAGE);
//     }
// }