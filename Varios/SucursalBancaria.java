import javax.swing.*;
public class SucursalBancaria{
    
private int    []numerosCuenta;
private String []nombresClientes;
private String []tiposCuenta;
private double []saldos;

private JScrollPane barra;
private JTextArea area;

public SucursalBancaria(){

numerosCuenta= new int [10];
nombresClientes= new String [10];
tiposCuenta= new String [10];
saldos= new double [10];

area  = new JTextArea   (40,40);
barra = new JScrollPane (area) ;
                               }
                               
  public void imprimirDatos () {
          int cuenta[]= {1111,2222,3333,4444,5555,6666,7777,8888,9999,0000};
      String nombres[]= {"Juan Pérez","Pedro Infante", "Enrique Peña", "Francisco T.","Pablo R.","Pablo Picaso",
        "Francisco Madero","Agustin Iturbide","Maria Mercedes","Richie Phelps"};
      double totales[]= {1232222,534543,45345,44444,55559999,234663435,534534534,6546546,23423,4444};
      String tipos[]= {"Corriente","Premium","Compartida","Corriente","Corriente","Corriente","Corriente","Corriente","Corriente","Corriente"};
      
      nombresClientes=nombres;
      numerosCuenta=cuenta;
      tiposCuenta=tipos;
      saldos=totales;
      
      area.append ("..........................Sucursal bancaria X.....................................\n");
      area.append ("..................................................................................\n");
      area.append ("Nombre\t\tSaldo\n");
      area.append ("_____________________________________________________\n");
      for (int i=0; i<10; i++){
          
          area.append (""+nombresClientes[i]+"\t\t$"+saldos[i]+"\n");
           area.append ("..................................................................................\n");
                             }
                              JOptionPane.showMessageDialog ( null,barra);
                               }
                               
public void buscarDatos(){
int numeroCuenta=Integer.parseInt (JOptionPane.showInputDialog ( "Introduzca el número de cuenta"));
 for(int i=0; i < 10; i++){
     if(numeroCuenta==numerosCuenta[i]){
          area.append("No.Cuenta\tNombre\tSaldo\n");
         area.append(numeroCuenta+"\t"+nombresClientes[i]+"\t$"+saldos[i]+"\n");
         area.append ("..................................................................................\n");
        }
    }JOptionPane.showMessageDialog ( null,barra);
}

public void abonarAcuenta(){
int numeroCuenta=Integer.parseInt (JOptionPane.showInputDialog ( "Introduzca el número de cuenta"));
 for(int i=0; i < 10; i++){
     if(numeroCuenta==numerosCuenta[i]){
         int pago=Integer.parseInt (JOptionPane.showInputDialog ( "Introduzca el monto que desea abonar"
        +" a la cuenta"+numeroCuenta));
        double aux=saldos[i];
    saldos[i]= saldos[i]+pago;
       area.append("No.Cuenta\tNombre\tSaldo\tPago\tNuevo saldo\n");
    area.append(numeroCuenta+"\t"+nombresClientes[i]+"\t$"+aux+"\t$"+pago+"\t$"+saldos[i]+"\n");
    area.append ("..................................................................................\n");
}
}JOptionPane.showMessageDialog ( null,barra);
}

public void verCuenta (){
int numeroCuenta=Integer.parseInt (JOptionPane.showInputDialog ( "Introduzca el número de cuenta"));

for(int i=0; i<10; i++){

if( numeroCuenta==numerosCuenta[i]){

  area.append("No.Cuenta\tNombre\tTipo cuenta\tSaldo\n");
         area.append(numeroCuenta+"\t"+nombresClientes[i]+"\t"+tiposCuenta[i]+"\t$"+saldos[i]+"\n");
area.append ("..................................................................................\n");
}
}JOptionPane.showMessageDialog ( null,barra);
}



  public static void main (String [] args ) {
      
      SucursalBancaria BaseDatos = new SucursalBancaria();
       BaseDatos.imprimirDatos();
       int centinela=1;
       int seleccion =Integer.parseInt ( JOptionPane.showInputDialog ("Introduzca el número correspondiente a la operación"
+" que desea realizar\n1 = Buscar datos\n 2 = Realizar un pago\n 3 = Examinar una cuenta\n"));
       
       
       while ( centinela!= 0){



   switch (seleccion){
        
        case 1:  BaseDatos.buscarDatos();
centinela=Integer.parseInt (JOptionPane.showInputDialog ("Si desea hacer otra operacion presione cualquier número, si no presione 0"));
                 break;
       case 2 : BaseDatos.abonarAcuenta();
centinela=Integer.parseInt (JOptionPane.showInputDialog ("Si desea hacer otra operacion presione cualquier número, si no presione 0"));
                 break;   
       case 3:   BaseDatos.verCuenta();
centinela=Integer.parseInt (JOptionPane.showInputDialog ("Si desea hacer otra operacion presione cualquier número, si no presione 0"));
                 break;  
       
      default:   JOptionPane.showMessageDialog (null,"vuelva a intentarlo");  
                 break;
            
    } 

 if (centinela!=0){ seleccion=Integer.parseInt ( JOptionPane.showInputDialog ("Introduzca el número correspondiente a la operación"
 +" que desea realizar\n1 = Buscar datos\n 2 = Realizar un pago\n 3 = Examinar una cuenta\n"));
                   }

                    }
       
            
    }
    
}
                               