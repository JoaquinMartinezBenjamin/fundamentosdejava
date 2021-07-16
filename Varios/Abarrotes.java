import javax.swing.*;
public class Abarrotes{
    
private int    [] numerosIdentificacion ;
private String []nombres;
private double  []precios;
private JScrollPane barra;
private JTextArea area;



public Abarrotes (){

numerosIdentificacion= new int [4];
nombres= new String [4];
precios= new double [4];

area  = new JTextArea   (40,40);
barra = new JScrollPane (area) ;
                               }
                               
public void introducirDatos(){
      area.append ("No.Ident.\tProducto\t\tPrecio unitario\n");
    int identificacion[] = { 1111,2222,3333,1234};
    numerosIdentificacion=identificacion;      
    String productos[] = {"Ariel 500 gms","Aceite litro","Sal kilo", "Leche lala litro"};
    nombres=productos;
    double costos[]= {4.50,7.70,3.30,8.00};
    precios=costos;
    for (int i= 0; i<4; i++){
        
          area.append ("............................................................................");
          area.append ("............................................................................\n");
        area.append ( numerosIdentificacion[i]+"\t "+nombres[i]+"\t\t $"+precios[i]+"\t\n");
      
}  
         area.append (".............................................................................");
          area.append ("............................................................................\n");
          JOptionPane.showMessageDialog ( null,barra);
}

public  void comprar () {

double total=0;
double importe=0;
int selector=0;
int apuntador=-1;
int cantidad=0;
int i=1;

while( i!=0){

selector=Integer.parseInt (JOptionPane.showInputDialog ( "Introduza el número de identificación del producto "
+"que desea comprar")); 
     area.append (".....Nueva compra...........................\n");
    area.append ("No.Ident.\tProducto\tPrecio unitario\tCantidad\tImporte\n");
for ( int j=0; j<4; j++){

if (numerosIdentificacion [j]== selector){ apuntador=j;}
                         }
                         
cantidad=Integer.parseInt (JOptionPane.showInputDialog ( "Introduza la cantidad del producto "
+"que desea comprar"));                          
importe = precios[apuntador] * cantidad;
total= total + importe;
area.append(numerosIdentificacion[apuntador]+"\t"+ nombres[apuntador]+"\t$"+precios[apuntador]+"\t"
+cantidad+"\t$"+importe+"\n"); 
JOptionPane.showMessageDialog ( null,barra);
i=Integer.parseInt (JOptionPane.showInputDialog ( "Si desea comprar otro producto presione culquier número "
+",si ya no desea comprar presione 0"));  
}
 area.append ("Total de compra...........................$"+total+"\n");
 JOptionPane.showMessageDialog ( null,barra);
}

public static void main (String []args) { 
Abarrotes compra = new Abarrotes();
compra.introducirDatos();
compra.comprar();
}
}