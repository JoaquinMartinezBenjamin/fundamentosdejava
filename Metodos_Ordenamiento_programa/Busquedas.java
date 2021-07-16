public class Busquedas {

    public Alumno [] arreglo;
    Generador_Datos datos= new Generador_Datos();
    public Busquedas(){}

    public void busquedaL(int numeroDatos, String nombre){
        String buscado="";
        arreglo = datos.obtenerDatosBusqueda(numeroDatos);

        double start = System.currentTimeMillis();
        busquedaLineal( arreglo, numeroDatos, nombre);
        double end = System.currentTimeMillis();
        double res = end - start;
        System.out.println("Busqueda lineal en "+numeroDatos+" datos terminado en " + (res/1000)+" segundos");

    }

    public void busquedaL_apellido(int numeroDatos, String apellido){

        String buscado="";
        arreglo = datos.obtenerDatosBusqueda(numeroDatos);

        double start = System.currentTimeMillis();
        busquedaLinealApellido( arreglo, numeroDatos, apellido);
        double end = System.currentTimeMillis();
        double res = end - start;
        System.out.println("Busqueda lineal en "+numeroDatos+" datos terminado en " + (res/1000)+" segundos");

    }

    public void busquedaLineal(Alumno[] arreglo,int numeroDatos, String nombre) {
        int cont=0;
        int medio;
     //   Alumno buscado=null;
        boolean buscado=false;
            System.out.println ("No.control\tNombre\t\tApellido\tsemestre\tedad\tDirección");
        for(medio=0; medio<arreglo.length; medio++) {
            if (arreglo[medio].getNombre().equalsIgnoreCase(nombre)) {
                cont++;
                buscado=true;
         
         
                    System.out.println( arreglo[medio].getNumControl()+"\t"+arreglo[medio].getNombre()+"\t\t"+arreglo[medio].getApellido()
                                    +"\t"+arreglo[medio].getSemestre()+"\t\t"+arreglo[medio].getEdad()+"\t"+arreglo[medio].getDireccion());
  
            } //if palabra

        }
             if(buscado==false)
            System.out.println("No se encontró a "+nombre+"\n");
        // return null;
    }

    public void busquedaLinealApellido(Alumno[] arreglo,int numeroDatos, String apellido) {

        int medio;
        //Alumno buscado=null;
        boolean buscado=false;
        for(medio=0; medio<arreglo.length; medio++) {
            if (arreglo[medio].getApellido().equalsIgnoreCase(apellido)) {
                buscado=true;

              //  buscado= arreglo[medio];//contador = medioarr+1;
              System.out.println ("No.control\tNombre\t\tApellido\tsemestre\tedad\tDirección");
                     System.out.println( arreglo[medio].getNumControl()+"\t"+arreglo[medio].getNombre()+"\t\t"+arreglo[medio].getApellido()
                                    +"\t"+arreglo[medio].getSemestre()+"\t\t"+arreglo[medio].getEdad()+"\t"+arreglo[medio].getDireccion());
                //       return buscado;
            } //if palabra
        }
        // return null;
             if(buscado==false)
            System.out.println("No se encontró a "+apellido+"\n");
    }

    public void busquedaBinariaNombre(int numeroDatos, String nombre){
        String buscado="";
        Ordenamiento order = new Ordenamiento();

        arreglo= order.shellSort(datos.obtenerDatosBusqueda(numeroDatos));

        //      for (int i=0; i<arreglo.length; i++){
        //          
        //          System.out.println(arreglo[i].getNombre()+ " "+ arreglo[i].getApellido());
        //         }
        //  String nombre="";
        double start = System.currentTimeMillis();
        busquedaBinaria( arreglo, nombre);
        double end = System.currentTimeMillis();
        double res = end - start;
        System.out.println("Busqueda binaria en "+numeroDatos+" datos terminado en " + (res/1000)+" segundos");

    }

    public void busquedaBinaria(Alumno [] arreglo, String nombre ) {
        int inicio= 0;
        int fin = arreglo.length-1;
        int medio;   
        int contador=1;
        boolean buscado=false;
        int comparador;
        while(inicio<=fin){
            medio=(inicio+fin)/2;            

            comparador=(arreglo[medio].getNombre()).compareToIgnoreCase(nombre);   

            if(arreglo[medio].getNombre().equalsIgnoreCase(nombre)){
                buscado=true;
                System.out.println ("No.control\tNombre\t\tApellido\tsemestre\tedad\tDirección");
                      System.out.println( arreglo[medio].getNumControl()+"\t"+arreglo[medio].getNombre()+"\t\t"+arreglo[medio].getApellido()
                                    +"\t"+arreglo[medio].getSemestre()+"\t\t"+arreglo[medio].getEdad()+"\t"+arreglo[medio].getDireccion());
                System.out.println();
                inicio=fin+1;
            }            
            if(comparador<0)
                inicio=medio+1;            
            else
                fin=medio-1;            
        }
        System.out.println();
        if(buscado==false)
            System.out.println("No se encontró a "+nombre+"\n");

    }// Fin metodo

    
        public void busquedaBinariaApellido(int numeroDatos, String apellido){
        String buscado="";
        Ordenamiento order = new Ordenamiento();

        arreglo= order.shellSort(datos.obtenerDatosBusqueda(numeroDatos));

        //      for (int i=0; i<arreglo.length; i++){
        //          
        //          System.out.println(arreglo[i].getNombre()+ " "+ arreglo[i].getApellido());
        //         }
        //  String nombre="";
        double start = System.currentTimeMillis();
        busquedaBinariaApellido( arreglo, apellido);
        double end = System.currentTimeMillis();
        double res = end - start;
        System.out.println("Busqueda binaria en "+numeroDatos+" datos terminado en " + (res/1000)+" segundos");

    }

    public void busquedaBinariaApellido(Alumno [] arreglo, String apellido ) {
        int inicio= 0;
        int fin = arreglo.length-1;
        int medio;   
        int contador=1;
        boolean buscado=false;
        int comparador;
        while(inicio<=fin){
            medio=(inicio+fin)/2;            

            comparador=(arreglo[medio].getApellido()).compareToIgnoreCase(apellido);   

            if(arreglo[medio].getApellido().equalsIgnoreCase(apellido)){
                buscado=true;
                System.out.println ("No.control\tNombre\t\tApellido\tsemestre\tedad\tDirección");
                System.out.println( arreglo[medio].getNumControl()+"\t"+arreglo[medio].getNombre()+"\t\t"+arreglo[medio].getApellido()
                                    +"\t"+arreglo[medio].getSemestre()+"\t\t"+arreglo[medio].getEdad()+"\t"+arreglo[medio].getDireccion());
                System.out.println();
                inicio=fin+1;
            }            
            if(comparador<0)
                inicio=medio+1;            
            else
                fin=medio-1;            
        }
        System.out.println();
        if(buscado==false)
            System.out.println("No se encontró a "+apellido+"\n");

    }// Fin 
    
    
    
    
    
    
    
    
    
    
}