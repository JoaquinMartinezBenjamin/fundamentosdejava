import javax.swing.*;


public class ArregloBidimensional{

public ArregloBidimensional(){} 



int m = Integer.parseInt (JOptionPane.showInputDialog (" Inserte el número de filas"));
int n = Integer.parseInt (JOptionPane.showInputDialog (" Inserte el número de columnas"));

 
    public void crearMatriz1() {
        
        String matrizImpresa="";
        int [][] matriz1;
        matriz1= new int [m][n];
        
        for(int x=0; x<m; x++)
        for(int y=0; y<n; y++)
        {

    matriz1 [x] [y]=Integer.parseInt (JOptionPane.showInputDialog ("Ingrese valores en la matriz 1"));
}


   for(int x=0; x<m; x++) {
        for(int y=0; y<n; y++)
                                              {
                                               matrizImpresa+= matriz1 [x] [y]+" ";
                                               }
                matrizImpresa+= "\n";
                                        }
                                        
JOptionPane.showMessageDialog(null,"La matriz es: \n"+matrizImpresa);

}


          
          
          public static void main (String args[]){
              
              
                              ArregloBidimensional arreglo= new ArregloBidimensional();
                                  arreglo.crearMatriz1();
                                
                                }

}