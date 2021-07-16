import javax.swing.*;
public class Elecciones {


 private String [] distritos;
 private String [] partidos;
 private String [] candidatos;
 private int    [][] votos;
 private int    []totalVotos;
 private JScrollPane barra;
private JTextArea area;

 
 public Elecciones(){
     partidos= new String [7];
     distritos= new String [10];
     candidatos= new String [7];
     votos= new int [10][7];
     totalVotos= new int [7];
      area  = new JTextArea   (40,40);
barra = new JScrollPane (area) ;
     
    }
    
 public void crearDatos () {
     String distrito[]= {"Distrito 1","Distrito 2","Distrito 3","Distrito 4","Distrito 5","Distrito 6",
        "Distrito 7","Distrito 8","Distrito 9","Distrito 10"};
            distritos= distrito;
     String partido[]= {"PRI","PAN","PRD","PT","CONVERGENCIA","VERDE ECOLOGISTA","PAS"};
            partidos=partido;
     String candidato[]= {"Enrique Peña","Josefina Ortiz","Juan Pérez","Andres Manuel","Eviel Perez",
        "Benjamín Robles","Patricio Estrella"};
              candidatos= candidato;
              
              
    for( int i=0; i< 10; i++){
     for( int j=0; j< 7; j++){
         
         votos[i][j]= (int)( Math.random () *100);
                             }
                             }
                            }
                            
    public void contarVotos (){
        
         for ( int i=0; i<7; i++){
             int sumaVotos=0;
             for ( int j=0; j<10; j++){
      sumaVotos= sumaVotos + votos [j][i];
                                    }
  area.append ( "El candidato "+ candidatos[i]+" tiene "+sumaVotos+" votos.\n");
  totalVotos [i]= sumaVotos;
                                 }
     area.append ("..............................................................................................................\n");                              
                                   JOptionPane.showMessageDialog ( null,barra);
                                }
                                
 public void buscarGanador(){
     int mayor=0;
     int apuntador=0;
     
     for ( int i=0; i<7; i++){
         if(mayor< totalVotos[i]){  mayor=totalVotos[i];
                                    apuntador=i;
                                }
                            }
    area.append("El partido ganador fue el "+ partidos[apuntador]+"\nEl nombre del candidato ganador es "
    +candidatos[apuntador]+" con un total de "+totalVotos[apuntador]+" votos\n");
      area.append ("..............................................................................................................\n");
      JOptionPane.showMessageDialog ( null,barra);
}

public void buscarDistritoMasVotos(){
int mayor=0;
int sumaVotos=0;
int apuntador=0;
int totales[]= new int [10];

     for ( int i=0; i<10; i++){
         sumaVotos=0;
             for ( int j=0; i<7; i++){
                 sumaVotos=sumaVotos+ votos[i][j];
                }
            totales[i]=sumaVotos;
            }
            
    for( int i=0; i< 10; i++){
        
        if( mayor< totales [i]){
            mayor=totales[i];
            apuntador= i;
            
        }
    }
    area.append("El distrito donde hubo más votos fue el " + distritos[apuntador]+"\n con un total de "
    +totales[apuntador]+" votos.\n");
      area.append ("..............................................................................................................\n");
      JOptionPane.showMessageDialog ( null,barra);
}


    public void buscarCandidatoNoPopular(){
        
           int menor=totalVotos[0];
     int apuntador=0;
     
     for ( int i=0; i<7; i++){
         if(menor> totalVotos[i]){ menor=totalVotos[i];
                                    apuntador=i;
                                }
                            }
    area.append("El partido con menos votos fue "+ partidos[apuntador]+"\nEl nombre del candidato es "
    +candidatos[apuntador]+" con un total de votos de "+totalVotos[apuntador]+"\n");
      area.append ("..............................................................................................................\n");
      JOptionPane.showMessageDialog ( null,barra);
}

public static void main (String [] args) {
 Elecciones Votacion= new Elecciones();
        Votacion.crearDatos();
        Votacion.contarVotos();
        Votacion.buscarGanador();
        Votacion.buscarDistritoMasVotos();
        Votacion.buscarCandidatoNoPopular();
  
 
}
}
            

