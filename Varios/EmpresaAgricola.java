import javax.swing.*;

public class EmpresaAgricola {
private float []totales;
private float [] totMes;
private float [] maiz;
private float [] frijol;
private float [] arroz;
private float totAnio;
private float totMaiz;
private float totFrijol;
private float totArroz;
private float mayorVendido;
private String producto;
private String [] meses;
private String mayorVentaMesMaiz;
private String mayorVentaMesFrijol;
private String mayorVentaMesArroz;
private float promMaiz;
private float promFrijol;
private float promArroz; 
private float porcentajeMaiz; 
private float porcentajeFrijol;
private float porcentajeArroz;
private JScrollPane barra;
private JTextArea area;

public EmpresaAgricola (){
     
     totMes= new float [12]; 
     maiz= new float [12];
     frijol=new float[12];
     arroz=new float [12];
     totales= new float [4];
     totMaiz=0;
     totFrijol=0;
     totArroz=0;
     mayorVendido=0;
     producto = "";
     mayorVentaMesMaiz= " ";
      mayorVentaMesFrijol= " ";
       mayorVentaMesArroz= " ";
       promMaiz=0;
       promFrijol=0;
       promArroz=0;
       porcentajeMaiz=0;
       porcentajeFrijol=0;
       porcentajeArroz=0;
       
     
   
    String mes[]= { "Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
                    "Septiembre","Octubre","Noviembre","Diciembre"};
    meses = mes;
    area  = new JTextArea   (30,50);
    barra = new JScrollPane (area) ;
                  }
                  
/////////////////////////////////////////////////////////////////                  
public void obtenerToneladas () {
for(int i=0; i<12; i ++){
  maiz[i]= (float)( Math.random () *100);
frijol[i]= (float)( Math.random () *100);
 arroz[i]= (float)( Math.random () *100);
 
}      

}     
/////////////////////////////////////////////////////////////////
public void obtenerPromedios () {

 for(int i=0; i<12; i ++){
             totMaiz=totMaiz + maiz[i];
             totFrijol=totFrijol + frijol[i];
             totArroz=totArroz + arroz[i];
             
        totMes[i]= maiz[i] + frijol[i] + arroz[i];
        totAnio=totAnio + totMes[i];
      }
         promMaiz = totMaiz /12; 
         promFrijol= totFrijol / 12;
         promArroz = totArroz /12; 
                                }
///////////////////////////////////////////////////////////////                               

public void buscarMayorVendido(){
float suma [] = {totMaiz,totFrijol,totArroz,totAnio};
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
  
/////////////////////////////////////////////////////////////////////////                          
public void encontrarPorcentajeXproducto (){

porcentajeMaiz= (totMaiz*100)/totAnio;
porcentajeFrijol=(totFrijol*100)/totAnio;
porcentajeArroz= (totArroz*100) / totAnio;
} 
//////////////////////////////////////////////////////////////////////////
public void buscarMayorVentaMes(){ 
float mayorMesMaiz=0;
float mayorMesFrijol=0;
 float mayorMesArroz= 0;
for (int i=0; i < 12 ; i++) {
if ( mayorMesMaiz< maiz [i]) { mayorMesMaiz= maiz [i]; 
                               mayorVentaMesMaiz= meses [i];}
if ( mayorMesFrijol< frijol [i]) { mayorMesFrijol= frijol [i]; 
                               mayorVentaMesFrijol= meses [i];}                               
if ( mayorMesArroz< arroz [i]) { mayorMesArroz= arroz [i]; 
                               mayorVentaMesArroz= meses [i];}
} 
}
////////////////////////////////////////////                             
public void imprimirResultados() {
area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  \n");                    
area.append ( "                               Empresa LA CHIQUITA S.A de C.V\n " );
area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  \n");
area.append ( "Mes\t\tMaiz\tFrijol\tArroz\tTotal Mensual\n");
area.append ( "   \t\tToneladas\tToneladas\tToneladas\t           \n");
area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  \n");
                   
       for (int i = 0; i <12; i++) {
                        
area.append ( meses [i] + "\t\t" + maiz[i] +"\t"+frijol[i]+"\t"+ arroz[i]+"\t"+totMes[i]+"\n");

                                  }
  area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  \n");                                  
  area.append ("Total anual\t\t");                                     
       for (int i = 0; i <4; i++) {
                      
area.append (totales [i] + "\t");

                                     }    
        area.append ( "\n");
            area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  \n");
 area.append ("Promedio general\t"+ promMaiz +"\t"+promFrijol+"\t"+ promArroz +"\n");    
 area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  \n");
 area.append ("Porcentaje por producto\t"+ porcentajeMaiz +"\t"+porcentajeFrijol+"\t"+ porcentajeArroz+"\n"); 
 area.append ( " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  \n");
        area.append ("El producto más vendido fue el "+producto+"\n");
         area.append ("El mes de mayor venta para el maiz fue "+mayorVentaMesMaiz+"\n");
         area.append ("El mes de mayor venta para el frijol fue  "+mayorVentaMesFrijol+"\n");
         area.append ("El mes de mayor venta para el arroz fue  "+mayorVentaMesArroz+"\n");
                    JOptionPane.showMessageDialog ( null,barra);
                            }
                         
    public static void main (String []args){
        EmpresaAgricola obj= new EmpresaAgricola ();
        obj.obtenerToneladas();
        obj.obtenerPromedios();
        obj.buscarMayorVendido();
        obj.encontrarPorcentajeXproducto();
        obj.buscarMayorVentaMes ();
        obj.imprimirResultados ();
          
                                           }
}