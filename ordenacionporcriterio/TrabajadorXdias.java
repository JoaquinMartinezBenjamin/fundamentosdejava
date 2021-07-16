public class TrabajadorXdias extends Trabajador { 

    private int diasTrabajados ;
    private double sueldoXdia;
    private double descuentos ; 
 

    public TrabajadorXdias (int codigo, String nombre, String apellido_pat,String apellido_mat, String genero,int edad,int diasTrabajados, double sueldoXdia, double descuentos){ 
        super(codigo,nombre,apellido_pat,apellido_mat,genero,edad);
        setDiasTrabajados (diasTrabajados) ; 
        setSueldoXdia (sueldoXdia) ; 
        setDescuentos (descuentos) ; 
        calcularSueldo();
    }

    public void setDiasTrabajados (int diasTrabajados){
        this.diasTrabajados = diasTrabajados;
    } 

    public void setSueldoXdia(double sueldoXdia){
        this.sueldoXdia= sueldoXdia; 
    }

    public void setDescuentos ( double descuentos){
        this.descuentos = descuentos ; 
    } 

    public int getDiasTrabajados(){ 
        return diasTrabajados;
    }

    public double getSueldoXdia(){
        return sueldoXdia; 
    }

    public  double getDescuentos(){
        return descuentos;
    }

        @Override

   public void calcularSueldo(){
    
    double sueldo= (getDiasTrabajados() * getSueldoXdia())-getDescuentos();
    setSueldoFinal(sueldo);
    }
   
} 

                