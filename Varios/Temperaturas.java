import javax.swing.*;
public class Temperaturas {


private String estado[];
private String mes[];

private float temperatura[][];
private float promedios[];
private float promedioGeneral;
private JScrollPane barra;
private JTextArea area;
public Temperaturas(){

estado= new String[32];
mes= new String [12];
temperatura= new float[32][12];
promedios=new float [32];
promedioGeneral=0;
area  = new JTextArea   (40,40);
barra = new JScrollPane (area) ;
}


public void crearDatos(){

String estados[]= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z","a1","b1","c1","d1","e1"};
estado=estados;
String meses[]={ "Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
                    "Septiembre","Octubre","Noviembre","Diciembre"};
mes=meses;
for( int i=0; i<32; i++){
for ( int j=0; j<12; j++){

temperatura[i][j]=(int)( Math.random () *100);
 
                          }}
                        }
                        
                        
public void calcularPromedios(){

float  sumaTemperatura=0;
float sumaPromedios=0;


for (int i=0; i<32; i++){
sumaTemperatura=0;
for (int j=0; j<12; j++){

sumaTemperatura= sumaTemperatura + temperatura [i][j];
}
promedios[i]= sumaTemperatura /12;
sumaPromedios= sumaPromedios + promedios[i];
area.append ("El promedio de temperaturas de " + estado [i]+" es "+promedios [i]+" grados\n");
}
promedioGeneral= sumaPromedios/32;
 area.append ("..................................................................................\n");
area.append ("El promedio general es "+promedioGeneral+" grados\n");
area.append ("..................................................................................\n");
 JOptionPane.showMessageDialog ( null,barra);
}



public void buscarArribaAbajoDelPromedio(){

for (int i=0; i<32; i++){

if(promedios[i]>promedioGeneral){

area.append("El estado "+estado[i]+" se encuentra arriba del promedio con una temperatura de "
+promedios[i]+" grados\n");

}}
  area.append ("..................................................................................\n");
for (int i=0; i<32; i++){

if(promedios[i]<promedioGeneral){

area.append("El estado "+estado[i]+" se encuentra abajo del promedio con una temperatura de "
+promedios[i]+" grados\n");

}} area.append ("..................................................................................\n");
 JOptionPane.showMessageDialog ( null,barra);
}


public static void main (String [] args){


Temperaturas Registro = new Temperaturas();
Registro.crearDatos();
Registro.calcularPromedios();
Registro.buscarArribaAbajoDelPromedio();
 
                        
}
}