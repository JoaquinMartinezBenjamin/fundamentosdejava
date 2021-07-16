import javax.swing.*;
public class CuentaBancaria {

private double cantidadDinero;
private double tasaInteres;
private int annio;
private double interes;
private double nuevoSaldo;
private JScrollPane barra;
private JTextArea area;

public CuentaBancaria (double cantidadDinero,double tasaInteres, int annio)
{
this.cantidadDinero= cantidadDinero;
this.tasaInteres=tasaInteres;
this.annio=annio;
nuevoSaldo= cantidadDinero;
area  = new JTextArea   (40,40);
barra = new JScrollPane (area) ;
}

public void calcularIntereses(){
interes= (1+tasaInteres) /100;
interes = cantidadDinero * interes;
area.append( "AÑO\tCAPITAL INICIAL\tINTERES\tNUEVO SALDO\n");
area.append ("..................................................................................\n");
while ( nuevoSaldo >0){
 cantidadDinero=nuevoSaldo;
nuevoSaldo= nuevoSaldo - interes;
area.append( annio +"\t"+cantidadDinero+"\t\t"+interes+"\t"+nuevoSaldo+"\n");
area.append ("..................................................................................\n");

annio++;

}
     JOptionPane.showMessageDialog ( null,barra);
}

public static void main (String [] args){
CuentaBancaria Cuenta = new CuentaBancaria(20000.00,10.00,2000);
Cuenta.calcularIntereses();

}
}