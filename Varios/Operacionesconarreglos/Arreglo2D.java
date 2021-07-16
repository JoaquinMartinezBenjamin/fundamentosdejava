import javax.swing.*;


public class Arreglo2D{

public Arreglo2D(){} 




int m = Integer.parseInt (JOptionPane.showInputDialog (" Inserte m"));
int n = Integer.parseInt (JOptionPane.showInputDialog (" Inserte n"));
 
    public void crearMatriz1() {
        
        
        int [][] matriz1;
        matriz1= new int [n][m];
        
        for(int x=0; x<matriz1.length; x++)
        for(int y=0; y<matriz1[x].length; y++)
        {

    matriz1 [x] [y]=Integer.parseInt (JOptionPane.showInputDialog ("Ingrese valores en la matriz 1"));
}


         System.out.println("__________");    
         
          for (int x=0; x<n; x++)   {
          for (int y=0; y<m; y++)       
          
          System.out.print(matriz1[x][y]+" ");
          System.out.println ("");
                                                      }
                                                     
          System.out.println("__________");    
        }
          
          
          public static void main (String args[]){
              
              
                              Arreglo2D arreglo= new Arreglo2D();
                                  arreglo.crearMatriz1();
                                
                                }

}