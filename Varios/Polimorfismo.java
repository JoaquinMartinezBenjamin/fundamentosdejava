public class Polimorfismo{

private int area, l1,l2;

public void figura (int a, int b) {

System.out.println ("El área del cuadrado es " + a * b);
                                  }
                                  
public void figura (int radio)    {

System.out.println ("El área del circulo es " + 3.1416 * (radio * radio));
                                  }                                 

public void figura (double altura, double base) {

System.out.println ("El área del triangulo es " + (base * altura) / 2);
                                                }                                   
                                                
      public static void main ( String []args)
        { Polimorfismo obj= new Polimorfismo ();
            
           obj.figura(10.50,20.80);
           obj.figura(10,10);
           obj.figura(10);
        }
        
                                }//cierra clase  