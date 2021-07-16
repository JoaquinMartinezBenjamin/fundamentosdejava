public class TrabajadorXcontrato extends Trabajador{ 

    private int diasTrabajados ; 
    private double sueldoQuincenal;
    private int faltas;
    private double descuentos;
    private double bonos;
    private double sueldoBase;

    public TrabajadorXcontrato (int codigo, String nombre, String apellido_pat,String apellido_mat, String genero, int edad, double sueldoQuincenal, int faltas, double descuentos, double bonos){
         super(codigo,nombre,apellido_pat,apellido_mat,genero,edad);
       
        setSueldoQuincenal(sueldoQuincenal);
        setFaltas(faltas);
        setDescuentos(descuentos);
        setBonos(bonos);
      calcularSueldo();
    }

    public void setDiasTrabajados( int diasTrabajados) {
        this.diasTrabajados= diasTrabajados; 
    }

    public void setSueldoQuincenal( double sueldoQuincenal) {
        this.sueldoQuincenal= sueldoQuincenal;
    }

    public void setFaltas( int faltas) {
        this.faltas= faltas;
    }

    public void setDescuentos( double descuentos) {
        this.descuentos = descuentos;
    }

    public void setBonos ( double bonos) {
        this.bonos= bonos;
    }

    public int getDiasTrabajados ( ) {
        return diasTrabajados; 
    }

    public double getSueldoQuincenal() {
        return sueldoQuincenal;
    }

    public int getFaltas(){
        return faltas; 
    }

    public double getDescuentos () {
        return descuentos; 
    }

    public double getBonos() {
        return bonos;
    }
      @Override

   public void calcularSueldo(){
       int diasTotTrab=  15 - getFaltas();
       setDiasTrabajados(diasTotTrab);
      double sueldo= (((getSueldoQuincenal()/15)*diasTotTrab)-descuentos)+bonos;
      setSueldoFinal (sueldo);
    }

}