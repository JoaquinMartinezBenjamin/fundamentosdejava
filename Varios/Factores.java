import javax.swing.*;
public class Factores{


private int aux;

private int factorMinimo; 
private int repeticiones;
private String factores;
private JScrollPane barra;
private JTextArea area;

public Factores (){

factorMinimo=0;
repeticiones=0;
factores="";
 area  = new JTextArea   (40,40);
barra = new JScrollPane (area) ;
 
}

public void buscarFactores (){
factorMinimo=0;
repeticiones=0;

for (int i=2;i<=100;i++){
 factores="";
for( int j=i; j>1; j--){

if ( i%j == 0){
factorMinimo=j;

}
}
repeticiones= i/factorMinimo;

   for (int k=0; k<repeticiones;k++){

factores= factores+factorMinimo;

    }
    
     area.append (i+"  "+factores+"\n");   
            
}
  area.append ("1 "+"\n");   
            JOptionPane.showMessageDialog ( null,barra);
}
            
            
  public static void main (String [] args ) {
     
      
      Factores Obj= new Factores ();
      Obj.buscarFactores();
            }
        }