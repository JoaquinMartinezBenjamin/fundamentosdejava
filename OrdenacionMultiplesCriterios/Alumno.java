import java.util.*;
public class Alumno{
    private int id;
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private String tipo ; 
    private int numPrendas;
    ArrayList < Prendas> prendas = new ArrayList<Prendas> ();

    public Alumno( int id, String nombre,String apellido, String sexo, int edad, String tipo )  { 
        setId(id);
        setNombre(nombre);
        setApellido(apellido);
        setSexo (sexo);
        setEdad (edad);
        setTipo(tipo);
        setNumPrendas(0);
    }

    public void setNumPrendas ( int numPrendas){
        this.numPrendas= numPrendas;
    }

    public void setId (int id) {
        this.id= id;
    }

    public void setNombre( String nombre) {
        this.nombre= nombre;
    }

    public void setApellido( String apellido ) {
        this. apellido = apellido;
    }

    public void setSexo ( String sexo ) {
        this.sexo= sexo;
    }

    public void setEdad( int edad)  {
        this. edad= edad; 
    }

    public void setTipo ( String tipo )  { 
        this.tipo=tipo; 
    } 

    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre; 
    }

    public String getApellido() {
        return apellido; 
    }

    public String  getSexo() {
        return sexo; 
    }

    public int getEdad(){
        return edad;
    }

    public String getTipo(){
        return tipo;
    }

    public int getNumPrendas(){
        return numPrendas;
    }

    public void agregarPrenda ( Prendas p){
        prendas.add(p);
        numPrendas++;
    }

    public ArrayList getPrendas (){
        return prendas;
    }

}

    
    
    
    
    
    
    
    
    
    
    
    

