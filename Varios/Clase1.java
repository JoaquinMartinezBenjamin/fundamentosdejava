import javax.swing.*;
public class Clase1{
   private JTextArea area;
   private int edad; 
   private String nombre;
  public Clase1 ( int edad, String nombre ){
                      this.edad=edad;
                      this.nombre=nombre;
                                           }

  public Clase1 () {
                            edad=25;
               nombre= "Juan Perez";
                    }

  public void imprimir (){
                   area = new JTextArea   (10,15);
                   area.append ("Nombre: "+ nombre +" Edad: " + edad + "\n");
                   JOptionPane.showMessageDialog  (null,area);
                          }

  public Clase1 (int b){
                   edad=b;
                   nombre= "Luis";
                        }

   public static void main (String []args) {
     Clase1 Obj1= new Clase1(); 
     Clase1 Obj2= new Clase1 (30, "Jose Lopez");
                                    Obj1.imprimir();
                                    Obj2.imprimir();
           Clase1 Obj3=  new Clase1 (35);
                       Obj3.imprimir ();

                                          }
}     
