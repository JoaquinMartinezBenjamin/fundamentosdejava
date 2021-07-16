public class Alumno {

    private int numControl;
    private String nombre;
    private int semestre; 
    private int edad;
    private String direccion;
    private String apellido;
    public Alumno(int numControl, String nombre, String apellido ,int semestre, int edad, String direccion ){

        setNumControl(numControl);
        setNombre(nombre);
        setSemestre (semestre);
        setEdad(edad);
        setDireccion (direccion);
        setApellido(apellido);
    }

    
    public void setApellido (String apellido){
    this.apellido=apellido;
}

public String getApellido(){
return apellido;
 
}
    
    
    public void setSemestre (int semestre) {
        this.semestre=semestre ;
    }

    public double getSemestre (){ return semestre ; }
    public void setEdad(int edad){ this.edad=edad;}
    public int getEdad (){return edad;}
    public void setNumControl (int numControl){
        this.numControl=numControl;
    }

    public int getNumControl(){return numControl;}

    public void setNombre( String nombre) {

        this.nombre= nombre;
    }

    public String getNombre() {
        return nombre;
    }

    
    public void setDireccion  ( String direccion) {
        
        this.direccion = direccion;
    }

    public String getDireccion ( )  { return direccion  ;} 
}