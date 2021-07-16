 

import javax.swing.*;

public class CalculadoraSimple {

private int variable1;
private int variable2; 
private int resultado;
private int centinela;
private JScrollPane barra;
private JTextArea area;
private String operando;

public CalculadoraSimple( int variable1,int variable2) {

this.variable1= variable1;
this.variable2= variable2;
centinela=1;
operando="";
area  = new JTextArea   (15,15);
barra = new JScrollPane (area) ;                    }

public void sumar () {
area.append ("  CALCULADORA\n"); 
resultado= variable1 + variable2;
operando= " + ";
   area.append (" "+variable1+operando+variable2+" = "+resultado+"\n"); 
 JOptionPane.showMessageDialog ( null,barra);   
while ( centinela!= 0){
centinela=Integer.parseInt (JOptionPane.showInputDialog ("Si desea sumar otro número al resultado presione cualquier número, si no presione 0"));
 if (centinela!=0){
variable1=resultado;
variable2=Integer.parseInt ( JOptionPane.showInputDialog (" Introduzca el siguiente número a sumar"));
resultado= variable1 + variable2;
   area.append (" "+variable1+operando+variable2+" = "+resultado+"\n"); 
   JOptionPane.showMessageDialog ( null,barra); 
                  }
                                
                      }
area.append ("Fin de la operación sumar\n"); 
JOptionPane.showMessageDialog ( null,barra); 

                       }
////////////////////////////////////////////////
public void restar (){ 
area.append ("  CALCULADORA\n"); 
resultado= variable1 - variable2;
operando= " - ";
       area.append (" "+variable1+operando+variable2+" = "+resultado+"\n"); 
JOptionPane.showMessageDialog ( null,barra);   
while ( centinela!= 0){
centinela=Integer.parseInt (JOptionPane.showInputDialog ("Si desea restar otro número al resultado presione cualquier número, si no presione 0"));
if (centinela!=0){
variable1=resultado;
variable2=Integer.parseInt ( JOptionPane.showInputDialog (" Introduzca el siguiente número a restar"));
resultado= variable1 - variable2;
area.append (" "+variable1+operando+variable2+" = "+resultado+"\n"); 
JOptionPane.showMessageDialog ( null,barra); 
                 }
                                
                       }
area.append ("Fin de la operación restar\n"); 
JOptionPane.showMessageDialog ( null,barra); 

                      }
///////////////////////////////////////
public void multiplicar () {
area.append ("  CALCULADORA\n"); 
resultado= variable1 * variable2;
operando= " * ";
area.append (" "+variable1+operando+variable2+" = "+resultado+"\n"); 
JOptionPane.showMessageDialog ( null,barra);   
while ( centinela!= 0){
centinela=Integer.parseInt (JOptionPane.showInputDialog ("Si desea multiplicar otro número con el resultado presione cualquier número, si no presione 0"));
if (centinela!=0){
variable1=resultado;
variable2=Integer.parseInt ( JOptionPane.showInputDialog (" Introduzca el siguiente número por el cual multiplicar"));
resultado= variable1 * variable2;
area.append (" "+variable1+operando+variable2+" = "+resultado+"\n"); 
JOptionPane.showMessageDialog ( null,barra); 
                  }
                                
                      }
area.append ("Fin de la operación multiplicar\n"); 
JOptionPane.showMessageDialog ( null,barra); 
                           }
////////////////////////////////////////////
public void dividir  () {
area.append ("  CALCULADORA\n"); 
 resultado= variable1 /  variable2;
 operando= " / ";
 area.append (" "+variable1+operando+variable2+" = "+resultado+"\n"); 
JOptionPane.showMessageDialog ( null,barra);   
while ( centinela!= 0){
centinela=Integer.parseInt (JOptionPane.showInputDialog ("Si desea dividir otro número con el resultado presione cualquier número, si no presione 0"));
if (centinela!=0){
variable1=resultado;
variable2=Integer.parseInt ( JOptionPane.showInputDialog (" Introduzca el número por el cual dividir"));
resultado= variable1 / variable2;
area.append (" "+variable1+operando+variable2+" = "+resultado+"\n"); 
JOptionPane.showMessageDialog ( null,barra); 
                  }
                                
                      }
area.append ("Fin de la operación dividr\n"); 
JOptionPane.showMessageDialog ( null,barra); 
       
                         }
///////////////////////////////////////////////
public static void main ( String []args){
String selector="";
int seleccion =Integer.parseInt ( JOptionPane.showInputDialog ("Introduzca el número correspondiente a la operación"
 +" que desea realizar\n 1 = Suma\n 2 = Resta\n 3 = Multiplicación\n 4 = División\n "));
 
if(seleccion==1) { selector = "sumar";}else{
if(seleccion==2) { selector = "restar";}else{
if(seleccion==3) { selector = "multiplicar";}else{
if(seleccion==4) { selector = "dividir";}}}}

int variable1= Integer.parseInt ( JOptionPane.showInputDialog (" Introduzca el número que desea "+ selector));
int variable2= Integer.parseInt ( JOptionPane.showInputDialog (" Introduzca el segundo número que desea "+selector+" con el primero"));
int centinela=1;

while ( centinela!= 0){

CalculadoraSimple operacion= new CalculadoraSimple(variable1,variable2);

   switch (seleccion){
        
        case 1:  operacion.sumar();
centinela=Integer.parseInt (JOptionPane.showInputDialog ("Si desea hacer otra operacion presione cualquier número, si no presione 0"));
                 break;
       case 2:   operacion.restar();
centinela=Integer.parseInt (JOptionPane.showInputDialog ("Si desea hacer otra operacion presione cualquier número, si no presione 0"));
                 break;   
       case 3:   operacion.multiplicar();
centinela=Integer.parseInt (JOptionPane.showInputDialog ("Si desea hacer otra operacion presione cualquier número, si no presione 0"));
                 break;  
       case 4:   operacion.dividir();  
centinela=Integer.parseInt (JOptionPane.showInputDialog ("Si desea hacer otra operacion presione cualquier número, si no presione 0"));
                 break;  
      default:   JOptionPane.showMessageDialog (null,"vuelva a intentarlo");  
                 break;
            
    } 

 if (centinela!=0){ seleccion=Integer.parseInt ( JOptionPane.showInputDialog ("Introduzca el número correspondiente a la operación"
 +" que desea realizar\n1 = Suma\n 2 = Resta\n 3 = Multiplicación\n 4 = División\n"));
 if(seleccion==1) { selector = "sumar";}else{
 if(seleccion==2) { selector = "restar";}else{
 if(seleccion==3) { selector = "multiplicar";}else{
 if(seleccion==4) { selector = "dividir";}}}}
variable1= Integer.parseInt ( JOptionPane.showInputDialog (" Introduzca el número que desea "+ selector));
variable2= Integer.parseInt ( JOptionPane.showInputDialog (" Introduzca el segundo número que desea "+selector+" con el primero"));

                  }


}// Cierra while
}// Cierra main
}// Cierra Clase

