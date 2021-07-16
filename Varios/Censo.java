import javax.swing.*;


public class Censo {
    
private int   [] numerosIdentificacion ;
private float []ingresoFamiliarAnual;
private int   [] numerosMiembrosFamilia ;
private double []nivelPobreza;
private int totCensados;
private float sumaIngresos;
private float promIngresos;
private String arribaDelPromedio;

private JScrollPane barra;
private JTextArea area;



public Censo (int totCensados){

this.totCensados= totCensados;

numerosIdentificacion= new int [totCensados];
ingresoFamiliarAnual= new float[totCensados];
numerosMiembrosFamilia= new int [totCensados];
nivelPobreza = new double [totCensados];
sumaIngresos=0;
promIngresos=0;
arribaDelPromedio="";
area  = new JTextArea   (30,40);
barra = new JScrollPane (area) ;
                               }
                               
                               
public void crearTablaDatos(){
 area.append (".......CENSO...........");
 area.append (".............................................................................................................");
 area.append (".............................................................................................................\n");
 area.append ("Número de identificación\tIngreso Familiar Anual\tNo.Miemb.Familia\tNivel de pobreza\n");
 area.append (".............................................................................................................");
 area.append (".............................................................................................................\n");
  for (int i=0; i< totCensados ; i++ ) {
numerosIdentificacion[i]=(int)( Math.random () *1000);
ingresoFamiliarAnual[i]=(float)( Math.random () *100000);
while (numerosMiembrosFamilia [i]==0){
numerosMiembrosFamilia[i]=(int)( Math.random () *10);}
 nivelPobreza[i]= 3750.00+ 750.00* (numerosMiembrosFamilia[i]-2);
 area.append (numerosIdentificacion[i]+"\t\t$"+ingresoFamiliarAnual[i]+"\t\t" +numerosMiembrosFamilia[i]+"\t\t"+ nivelPobreza[i]+"\n");
          area.append (".............................................................................................................");
          area.append (".............................................................................................................\n");
        }
}

public void calcularPromedioIngresos () {
for (int i = 0; i< totCensados; i++){

sumaIngresos= sumaIngresos + ingresoFamiliarAnual [i];
                                      }
promIngresos= sumaIngresos / totCensados;
                                          }

public void buscarArribaDelPromedio () {
       area.append ("El promedio de ingresos de los hogares es $"+ promIngresos+"\nAquellos arriba del promedio "
       +"son los siguientes\nNo.Identif.          Ingreso\n");
for (int i = 0; i< totCensados; i++){
if (ingresoFamiliarAnual [i]> promIngresos){
arribaDelPromedio=arribaDelPromedio+ numerosIdentificacion [i]+"\t$"+ ingresoFamiliarAnual [i]+"\n";

                                      }
                                         } 
                                          area.append(arribaDelPromedio); 
                                        }

public void imprimir(){
JOptionPane.showMessageDialog ( null,barra);}     

public static void main (String []args){
int totCensados =(int)( Math.random () *25);

Censo Obj = new Censo (totCensados);
Obj.crearTablaDatos();
Obj.calcularPromedioIngresos();
Obj.buscarArribaDelPromedio();
Obj.imprimir ();
}
}                          