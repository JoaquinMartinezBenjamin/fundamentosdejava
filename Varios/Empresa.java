import javax.swing.*;

public class Empresa {
private int []totales;
private int [] totMes;
private int [] maiz;
private int [] frijol;
private int [] arroz;
private int totAnio;
private int totMaiz;
private int totFrijol;
private int totArroz;
private int mayorVendido;
private String producto;
private String [] meses;
private JScrollPane barra;
private JTextArea area;

public Empresa (){
     
     totMes= new int [12]; 
     maiz= new int [12];
     frijol=new int[12];
     arroz=new int [12];
     totales= new int [4];
     totMaiz=0;
     totFrijol=0;
     totArroz=0;
     mayorVendido=0;
     producto = "";
     
    int m [] = { 9,20,59,120,22,88,668,718,990,120,11,12};
    maiz = m; 
    int f[] = { 9,20,59,120,22,88,668,718,990,120,11,12};
    frijol = f; 
    int a [] = { 10,20,59,120,22,88,668,718,990,120,11,12};
    arroz = a; 
    String mes[]= { "Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
                    "Septiembre","Octubre","Noviembre","Diciembre"};
    meses = mes;
    area  = new JTextArea   (30,40);
    barra = new JScrollPane (area) ;
                  }
                                               
public void obtenerTotales() {

 for(int i=0; i<12; i ++)
      
      {
        totMes[i]= maiz[i] + frijol[i] + arroz[i];
        totMaiz=totMaiz + maiz[i];
        totFrijol=totFrijol + frijol[i];
        totArroz=totArroz + arroz[i];
        totAnio=totAnio + totMes[i];
      }
        
                                }

public void obtenerTotAnual (){
int suma [] = {totMaiz,totFrijol,totArroz,totAnio};
    totales = suma; 
    for (int i=0; i<3; i++){
        if (mayorVendido<totales[i]){mayorVendido=totales [i];}
                           }
                           
    for (int i=0; i<3; i++){
        if (mayorVendido==totMaiz){producto=" maiz";}else{
            if (mayorVendido==totFrijol){producto =" frijol";}else{
                if (mayorVendido==totArroz){producto=" arroz";}}}}
            
  
  if (mayorVendido==totMaiz&&mayorVendido==totFrijol){producto="Los productos más vendidos fueron "
      +"el maiz y el frijol";}
  if (mayorVendido==totMaiz&&mayorVendido==totArroz){producto="Los productos más vendidos fueron "
      +"el maiz y el arroz";}  
  if (mayorVendido==totFrijol&&mayorVendido==totArroz){producto="Los productos más vendidos fueron "
      +"el frijol y el arroz";}     
  if (mayorVendido==totMaiz&&mayorVendido==totFrijol&&mayorVendido==totArroz){producto="Todos los productos"
      +" se vendieron en la misma cantidad";}
    }
                               
                                        
public void imprimirResultados() {
area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  \n");                    
area.append ( "                               Empresa X S.A de C.V\n " );
area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  \n");
area.append ( "Mes\tMaiz\tFrijol\tArroz\tTotal Mensual\n");
area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  \n");
                   
       for (int i = 0; i <12; i++) {
                        
area.append ( meses [i] + "\t" + maiz[i] +"\t"+frijol[i]+"\t"+ arroz[i]+"\t"+totMes[i]+"\n");

                                  }
  area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  \n");                                  
  area.append ("Total anual\t");                                     
       for (int i = 0; i <4; i++) {
                      
area.append (totales [i] + "\t");

                                     }    
        area.append ( "\n");
            area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  \n");
        area.append ("El producto más vendido fue el "+producto);
                    JOptionPane.showMessageDialog ( null,barra);
                            }
                         
    public static void main (String []args){
        Empresa obj= new Empresa ();
        obj.obtenerTotales();
        obj.obtenerTotAnual();
        obj.imprimirResultados();
          
                                           }
}
          