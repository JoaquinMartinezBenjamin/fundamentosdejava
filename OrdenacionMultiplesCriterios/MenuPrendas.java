import javax.swing.*;
import java.util.*;
public class MenuPrendas
{
public JScrollPane barra;
    private JTextArea area;
    
    ArrayList<Alumno> alumnos = new ArrayList <Alumno> () ; 
    ArrayList <Prendas> prendas = new ArrayList <Prendas> ();

public MenuPrendas() {
        area  = new JTextArea   (30,60);
        barra = new JScrollPane (area) ;
    }

    
    public void importarDatos () {
        LeerArchivo lectura = new LeerArchivo (); 
        alumnos = lectura.leerArchivo1();
        prendas = lectura.leerArchivo2();
        agregarPrendasAlumno();
    }
    
    public void agregarPrendasAlumno (){
        
            for (Alumno  a: alumnos )  {
            int id= a.getId(); 
            for (Prendas p: prendas) {
                if ( id==p.getId()){ a.agregarPrenda(p);}
            }
        }
    } 
    
   public void imprimirAlumnos(){
          if (alumnos != null ) {
            area.setText("");
            area.append("ID\tNOMBRE\tAPELLIDO\tSEXO\tEDAD\tTIPO\n");
            for ( Alumno a : alumnos ){
                area.append ( a.getId()+"\t"+a.getNombre()+"\t"+a.getApellido()+"\t"+a.getSexo()+"\t"+a.getEdad()+"\t"+a.getTipo()+"\n");
            }
            JOptionPane.showMessageDialog (null,barra);
        }
        else { System.out.println ("NO SE HAN CARGADO LOS ALUMNOS"); }
    }
      
    public void imprimirPrendas(){
         if ( prendas != null ) {
            area.setText("");
            area.append("ID\tPRENDA\tTEMPORADA\tCOLOR\n");
            for ( Prendas p : prendas){
                area.append ( p.getId()+"\t"+p.getPrenda()+"\t"+p.getTemporada()+"\t"+p.getColorPrenda()+"\n");
            }
            JOptionPane.showMessageDialog (null,barra);
        } else {System.out.println ("NO SE HAN CARGADO LAS PRENDAS "); }
    }
  public void imprimirPrendasPorAlumno (){
        if (alumnos != null ) {
            area.setText("");

            for ( Alumno a : alumnos ){
                area.append("----------------------------------------------------------------------------------------------------------------------------------------\n");
                area.append("ID\tNOMBRE\tAPELLIDO\tSEXO\tEDAD\tTIPO\tNUM.PRENDAS\n");
                area.append("----------------------------------------------------------------------------------------------------------------------------------------\n");
                area.append ( a.getId()+"\t"+a.getNombre()+"\t"+a.getApellido()+"\t"+a.getSexo()+"\t"+a.getEdad()+"\t"+a.getTipo()+"\t"+a.getNumPrendas()+"\n");
                area.append("----------------------------------------------------------------------------------------------------------------------------------------\n");
                ArrayList <Prendas> temPrendas = a.getPrendas();
                area.append("\tPRENDA\tTEMPORADA\tCOLOR\n");
                for ( Prendas p : temPrendas){
                    area.append ("\t"+p.getPrenda()+"\t"+p.getTemporada()+"\t"+p.getColorPrenda()+"\n");
                }
            }
            JOptionPane.showMessageDialog (null,barra);
        }
        else { System.out.println ("NO SE HAN CARGADO LOS ALUMNOS"); }

    }
    
    public void ordenarTipoSexApe(){
        Comparator<Alumno> comparadorCriterios =  new Comparator<Alumno>()  {
                @Override 
                public int compare(Alumno a1, Alumno a2){
                    int resultado= a1.getTipo().compareTo(a2.getTipo());
                    if ( resultado != 0 ) { return resultado; }
                    resultado = a1.getSexo().compareTo(a2.getSexo());
                    if ( resultado != 0 ) { return resultado; }
                    resultado = a1.getApellido().compareTo(a2.getApellido());
                    return resultado;
                }
            };
        Collections.sort(alumnos,comparadorCriterios );
    }
    public void numPrendTemColor(){
         Comparator<Alumno> comparadorCriterios =  new Comparator<Alumno>()  {
                @Override 
                public int compare(Alumno a1, Alumno a2){

                    int resultado= (new Integer(a1.getNumPrendas())).compareTo(new Integer(a2.getNumPrendas())); 
                    return resultado;}
            };
        Collections.sort(alumnos,comparadorCriterios );

        Comparator<Prendas> comparadorCriterios2 =  new Comparator<Prendas>() {
                @Override 
                public int compare(Prendas p1, Prendas p2){
                    int resultado= p1.getTemporada().compareTo(p2.getTemporada());
                    if ( resultado != 0 ) { return resultado; }
                    resultado = p1.getColorPrenda().compareTo(p2.getColorPrenda());
                    return resultado;
                }
            };

        for (Alumno  a: alumnos )  {
            ArrayList <Prendas> temp = a.getPrendas();
            Collections.sort(temp,comparadorCriterios2 );
        }

    }
    public void ordenarPrendaColorTemporada (){
           Comparator<Prendas> comparadorCriterios =  new Comparator<Prendas>()  {
                @Override 
                public int compare(Prendas  p1, Prendas p2){
                    int resultado= p1.getPrenda().compareTo(p2.getPrenda());
                    if ( resultado != 0 ) { return resultado; }
                    resultado = p1.getColorPrenda().compareTo(p2.getColorPrenda());
                    if ( resultado != 0 ) { return resultado; }
                    resultado = p1.getTemporada().compareTo(p2.getTemporada());
                    return resultado;
                }
            };
        Collections.sort(prendas,comparadorCriterios );
    }
    
    public void apellidoPrendaTemporada(){
         Comparator<Alumno> comparadorCriterios =  new Comparator<Alumno>()  {
                @Override 
                public int compare(Alumno a1, Alumno a2){

                    int resultado= a1.getApellido().compareTo(a2.getApellido());
                    return resultado;}
            };
        Collections.sort(alumnos,comparadorCriterios );

        Comparator<Prendas> comparadorCriterios2 =  new Comparator<Prendas>() {
                @Override 
                public int compare(Prendas p1, Prendas p2){
                    int resultado= p1.getPrenda().compareTo(p2.getPrenda());
                    if ( resultado != 0 ) { return resultado; }
                    resultado = p1.getTemporada().compareTo(p2.getTemporada());
                    return resultado;
                }
            };

        for (Alumno  a: alumnos )  {
            ArrayList <Prendas> temp = a.getPrendas();
            Collections.sort(temp,comparadorCriterios2 );
        }

    }
        
    public void menu(){
        try{
     int selector = -1;
            while(selector!=0){
                selector = Integer.parseInt (JOptionPane.showInputDialog ("Introduzca el valor correspondiente de la opción que requiera"
                        +"\n 1= Imprimir Alumnos"
                        +"\n 2= Imprimir Prendas "
                        +"\n 3= Imprimir prendas por alumno "
                        +"\n _________  ORDENACIONES ___________   "
                        +"\n 4= tipo estudiante, sexo, apellido"
                        +"\n 5= numero de prendas,temporada, color"
                        +"\n 6= prenda, color, temporada"
                        +"\n 7= apellido, prenda, temporada"
                        +"\n _________  ORDENACIONES ___________   "
                        +"\n Presione 0 para salir"));
                        switch (selector){
                            
                     case 1: 
                    imprimirAlumnos();
                    break; 
                    case 2: 
                    imprimirPrendas();
                    break;
                    case 3:
                    imprimirPrendasPorAlumno();
                    break;
                    case 4:
                    ordenarTipoSexApe();
                    imprimirAlumnos();
                    break; 
                  case 5:
                    numPrendTemColor();
                    imprimirPrendasPorAlumno();
                    break;
                    case 6:
                     ordenarPrendaColorTemporada();
                    imprimirPrendas();
                    break;
                    case 7:
                    apellidoPrendaTemporada();
                    imprimirPrendasPorAlumno();
                    break;
                    case 0:
                    break;
                    default:
                    JOptionPane.showMessageDialog (null,"Opcion no valida");
                    break;
    
}
}
}
catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero entero", "Error de sintaxis", JOptionPane.ERROR_MESSAGE);
            menu();
        }
    }
    
    public static void main ( String [] args )  {
        MenuPrendas m = new MenuPrendas();
        m.importarDatos();
        m.menu();
    }
}











































































