import javax.swing.*;


public class ImprimirColumnas{

public ImprimirColumnas(){} 



int m = Integer.parseInt (JOptionPane.showInputDialog (" Inserte el número de filas"));
int n = Integer.parseInt (JOptionPane.showInputDialog (" Inserte el número de columnas"));

 
    public void crearMatriz1() {
        
        String matrizImpresa="";
        int [][] matriz1;
        matriz1= new int [m][n];
        int vector[]= new int [m*n];
       String vectorImpreso= "";
        
        for(int x=0; x<m; x++){
        for(int y=0; y<n; y++)
        {

    matriz1 [x][y]=Integer.parseInt (JOptionPane.showInputDialog ("Ingrese valores en la matriz 1"));
    matrizImpresa+= matriz1[x][y] +" ";
} matrizImpresa+="\n";}
int conta=0;
  
   for(int x=0; x<n; x++) {
     
        for(int y=0; y<m; y++)
                                              {
                                             
                                               vector [conta]=matriz1 [y][x];
                                        
                                               conta ++;
                                            }
               
                                        }
                                        


   for(int x=0; x<m*n; x++) {
     
                                            
                                              vectorImpreso+= vector [x];
                                        
                                     
                vectorImpreso+= "\n";
               
                                        }
  JOptionPane.showMessageDialog(null,"La matriz es: \n"+matrizImpresa+"\n"
   + "El vector es: \n"+ vectorImpreso );
      
}


          
          
          public static void main (String args[]){
              
              
                              ImprimirColumnas arreglo= new ImprimirColumnas();
                                  arreglo.crearMatriz1();
                                
                                }

}
