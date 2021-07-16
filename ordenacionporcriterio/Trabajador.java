import java.util.*;
public class Trabajador {
    protected int codigo ; 
    protected String nombre ;
    protected String apellido_pat; 
    protected String apellido_mat;
    protected String genero; 
    protected double sueldoFinal; 
    protected int edad;
    public Trabajador ( int codigo, String nombre,String apellido_pat,String apellido_mat, String genero, int edad ){ 
        setCodigo (codigo) ; 
        setNombre (nombre);
        setGenero (genero) ; 
        setApellido_pat(apellido_pat); 
        setApellido_mat(apellido_mat);
        setEdad(edad);
        calcularSueldo () ; 
    }

    public void setApellido_pat ( String apellido_pat) {
        this.apellido_pat = apellido_pat; 
    }

    public String getApellido_pat ( )  {
        return apellido_pat ; 
    }

    public void setApellido_mat( String apellido_mat) {
        this.apellido_mat= apellido_mat;
    }

    public String getApellido_mat( ) {

        return apellido_mat;
    }

    public void setEdad( int edad) {
        this.edad= edad; 
    }

    public int getEdad(){
        return edad;
    }


    public void setCodigo (int codigo){ 
        this.codigo = codigo ; 
    }

    public void setNombre(String nombre){
        this.nombre= nombre; 
    }

    public void setGenero (String genero){
        this.genero = genero ; 
    }

    public void calcularSueldo(){

    }

    public void setSueldoFinal (double sueldoFinal){
        this.sueldoFinal = sueldoFinal;
    } 

    public double getSueldoFinal (){
        return sueldoFinal ; 
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getGenero(){
        return genero;
    }

            
}