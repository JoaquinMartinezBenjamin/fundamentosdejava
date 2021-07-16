public class TrabajadorXhora extends Trabajador{ 
    private double sueldoXhora ; 
    private int horasTrabajadas ; 
    public TrabajadorXhora (int codigo, String nombre, String apellido_pat,String apellido_mat, String genero, int edad,double sueldoXhora, int horasTrabajadas )  {
       super(codigo,nombre,apellido_pat,apellido_mat,genero,edad);
        setSueldoXhora (sueldoXhora) ; 
        setHorasTrabajadas(horasTrabajadas); 
        calcularSueldo();
    } 

    public void setSueldoXhora(double sueldoXhora) { 
        this.sueldoXhora= sueldoXhora; 
    }

    public void setHorasTrabajadas(int horasTrabajadas) { 
        this.horasTrabajadas= horasTrabajadas; 
    } 

    public double getSueldoXhora()  { 
        return sueldoXhora; 
    } 

    public int getHorasTrabajadas() {
        return horasTrabajadas; 
    } 
         @Override

   public void calcularSueldo(){
    
    double sueldo= getHorasTrabajadas() * getSueldoXhora();
    setSueldoFinal(sueldo);
    }
}