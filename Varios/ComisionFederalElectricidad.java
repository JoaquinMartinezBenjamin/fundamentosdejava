import javax.swing.*;
public class ComisionFederalElectricidad {

private float kwXhora,total,totalNeto,montoAdicional,centavos;
private int numClientes,horasDeConsumo;
private JScrollPane barra;
private JTextArea area; 
 
 
  public ComisionFederalElectricidad (int horasDeConsumo) 
  
  
  {
     this.horasDeConsumo= horasDeConsumo;
     area  = new JTextArea   (40,40);
     barra = new JScrollPane (area) ;
  }
    
    
public void calcularPagos() {

area.append ("NO. DE CLIENTE\tKW HORA-CONSUMIDA\tIMPORTE A PAGAR\t8% A PUBLICO \t\tNETO A PAGAR\n"); 
area.append ("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
area.append ("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");  


for (int i =1; i<=20 ; i++) {

kwXhora= (int)( Math.random () *100);
if (kwXhora <=300){centavos=8;}else{
if (kwXhora >300&&kwXhora<=600){centavos=6;}else{
if (kwXhora >600&&kwXhora<=1000){centavos=5;}else{
if (kwXhora >1000){centavos=3;}}}}

total= kwXhora *centavos;
montoAdicional= (total/100)*8;
totalNeto= total + montoAdicional;
//conversión a pesos
total= total/100;
montoAdicional=montoAdicional/100;
totalNeto= totalNeto/100;

area.append ( i+"\t\t"+kwXhora+"\t\t$"+total+"\t\t$"+montoAdicional+"\t\t$"+ totalNeto+"\n");
area.append (".............................................................................................................");
area.append (".............................................................................................................\n");


                            }

                            
   JOptionPane. showMessageDialog (null, barra); 
   
   }


 public static void main (String []args) {
int horasDeConsumo; 
horasDeConsumo= Integer.parseInt (JOptionPane.showInputDialog ( "Introduza el número de horas de consumo")); 
      
      
      
      ComisionFederalElectricidad Obj = new ComisionFederalElectricidad (horasDeConsumo );
      
      Obj.calcularPagos ();
      
    }
    
}



      
                    