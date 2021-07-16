import javax.swing.*;


public class ImprimirFilas{

public ImprimirFilas(){} 



int m = Integer.parseInt (JOptionPane.showInputDialog (" Inserte el número de filas"));
int n = Integer.parseInt (JOptionPane.showInputDialog (" Inserte el número de columnas"));

 
    public void crearMatriz1() {
        
        String matrizImpresa="";
        int [][] matriz1;
        matriz1= new int [m][n];
        int vector[]= new int [m*n];
       String vectorImpreso= "";
        
        for(int x=0; x<m; x++)
        for(int y=0; y<n; y++)
        {

    matriz1 [x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Ingrese valores en la matriz 1"));
}
int conta=0;
  
   for(int x=0; x<m; x++) {
     
        for(int y=0; y<n; y++)
                                              {
                                               matrizImpresa+= matriz1 [x][y]+" ";
                                               vector [conta]=matriz1 [x][y];
                                        
                                               conta ++;
                                               }
                matrizImpresa+= "\n";
               
                                        }
                                        
JOptionPane.showMessageDialog(null,"La matriz es: \n"+matrizImpresa+"\n" );

   for(int x=0; x<m*n; x++) {
     
                                            
                                              vectorImpreso+= vector [x];
                                        
                                     
                vectorImpreso+= "\n";
               
                                        }
         JOptionPane.showMessageDialog(null,"El vector es: \n"+vectorImpreso+"\n" );

}


          
          
          public static void main (String args[]){
              
              
                              ImprimirFilas arreglo= new ImprimirFilas();
                                  arreglo.crearMatriz1();
                                
                                }

}