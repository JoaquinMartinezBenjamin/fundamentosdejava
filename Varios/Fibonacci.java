import javax.swing. *;
public class Fibonacci {
private JTextArea area;
	private JScrollPane barra;
	private int limite, antecesor,sucesor,resultado;

   public Fibonacci(int limite){
	    area = new JTextArea   (10,15);
        barra = new JScrollPane (area) ;
	   this.limite= limite;
	   antecesor=0;
	   sucesor = 1;
	   resultado= sucesor;
	   
                                 }
		
     public void imprimirFibonacci(){
		    
           do{
			    area.append (String.valueOf(resultado)+" ");
                resultado=antecesor + sucesor;
                antecesor= sucesor;
                sucesor= resultado;
                limite--;
              }
           while (limite>0);
    JOptionPane.showMessageDialog(null,area);
		             } 
	
	public static void main (String[]args)
	{
	    int limite = 20;
		Fibonacci result= new Fibonacci (limite);
		result.imprimirFibonacci();}
                  }
                