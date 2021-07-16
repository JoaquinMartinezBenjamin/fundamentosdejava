import java.util.*;
import javax.swing.*;
public class ReportesTrabajadores  extends JFrame {
    private JScrollPane barra;
    private JTextArea area; 
    ArrayList lista = new ArrayList();
    ArrayList listaRespaldo= new ArrayList();
    ArrayList<TrabajadorXdias> tdias = new ArrayList<TrabajadorXdias>();
    ArrayList<TrabajadorXhora> thoras = new ArrayList<TrabajadorXhora>();
    ArrayList<TrabajadorXcontrato> tcontrato = new ArrayList<TrabajadorXcontrato>();
    ArrayList<Ordenacion_Criterios> criterios = new ArrayList<Ordenacion_Criterios>();
    private Trabajador t1=null;
    private Trabajador t2=null;
    private int resultado=0;
    //*********************************************************************************************************************

    //************************************
    public ReportesTrabajadores(){
        precargarDatos();
        area  = new JTextArea   (30,40);
        barra = new JScrollPane (area) ;

    }

    public void agregarNuevoCriterio(int tipo){
        criterios.add(new Ordenacion_Criterios(tipo));
    }

    public void ordenar(){

        Comparator<Object> comparadorCriterios =  new Comparator<Object>()  {
                @Override 
                public int compare(Object o1, Object o2){
                    if(o1 instanceof TrabajadorXdias || o1 instanceof TrabajadorXhora|| o1 instanceof TrabajadorXcontrato){ 
                        t1= (Trabajador) o1;
                    }
                    if(o2 instanceof TrabajadorXdias || o2 instanceof TrabajadorXhora|| o2 instanceof TrabajadorXcontrato){ 
                        t2= (Trabajador) o2;
                    }               
                    for(Ordenacion_Criterios c: criterios){
                        resultado= c.comparar(t1,t2);
                        if ( resultado != 0 ) { return resultado; }
                    }
                    return resultado; 
                }
            };
        Collections.sort(lista,comparadorCriterios );
    }

    private boolean buscarTrabajador(int codigo){
        boolean encontrado=false;
        for( Object o : lista){
            if(o instanceof TrabajadorXdias){TrabajadorXdias t= (TrabajadorXdias) o; if(t.getCodigo()==codigo){encontrado=true;}}
            if(o instanceof TrabajadorXhora){TrabajadorXhora t= (TrabajadorXhora) o;  if(t.getCodigo()==codigo){encontrado=true;}} 
            if(o instanceof TrabajadorXcontrato){TrabajadorXcontrato t= (TrabajadorXcontrato) o; if(t.getCodigo()==codigo){encontrado=true;}}
        }
        return encontrado;
    }

    public void agregarTrabajadorDias(){
        int codigo= Integer.parseInt (JOptionPane.showInputDialog ( "Introduzca el codigo del nuevo trabajador"));
        while(buscarTrabajador(codigo)){
            codigo= Integer.parseInt (JOptionPane.showInputDialog ( "Codigo ya existente\nIntroduzca el codigo del nuevo trabajador"));
        }
        String nombre= JOptionPane.showInputDialog ( "Introduzca el nombre del nuevo trabajador");
        String apellido_pat= JOptionPane.showInputDialog ( "Introduzca el apellido_paterno del nuevo trabajador");
        String apellido_mat= JOptionPane.showInputDialog ( "Introduzca el apellido_materno del nuevo trabajador");
        String genero= JOptionPane.showInputDialog ( "Introduzca H si el trabajador es hombre"
                +" \n Introduzca M si el trabajador es mujer");
        while(!genero.equals("H")&& !genero.equals("M")){
            genero= JOptionPane.showInputDialog ( "Introduzca H si el trabajador es hombre"
                +" \n Introduzca M si el trabajador es mujer");
        }
        int edad= Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del trabajador"));
        while(edad>90||edad<18){
            edad= Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del trabajador (mayor de 18)"));
        }
        int diasTrabajados=Integer.parseInt (JOptionPane.showInputDialog (" Introduzca el numero de dias trabajados"));
        double sueldoXdia= Double.parseDouble (JOptionPane.showInputDialog ( "Introduzca el sueldo que gana al día el trabajador"));
        while(sueldoXdia<=0){sueldoXdia= Double.parseDouble (JOptionPane.showInputDialog ( "Introduzca el sueldo que gana al día el trabajador"));}
        double descuentos =Double.parseDouble (JOptionPane.showInputDialog ("Introduzca el valor de los descuentos al trabajador"));
        agregarTrabajador(codigo,nombre,apellido_pat,apellido_mat,genero,edad,diasTrabajados,sueldoXdia,descuentos);
    }

    public void agregarTrabajadorHoras(){
        int codigo= Integer.parseInt (JOptionPane.showInputDialog ( "Introduzca el codigo del nuevo trabajador"));
        while(buscarTrabajador(codigo)){
            codigo= Integer.parseInt (JOptionPane.showInputDialog ( "Codigo ya existente\nIntroduzca el codigo del nuevo trabajador"));
        }
        String nombre= JOptionPane.showInputDialog ( "Introduzca el nombre del nuevo trabajador");
        String apellido_pat= JOptionPane.showInputDialog ( "Introduzca el apellido_paterno del nuevo trabajador");
        String apellido_mat= JOptionPane.showInputDialog ( "Introduzca el apellido_materno del nuevo trabajador");
        String genero= JOptionPane.showInputDialog ( "Introduzca H si el trabajador es hombre"
                +" \n Introduzca M si el trabajador es mujer");
        while(!genero.equals("H")&& !genero.equals("M")){
            genero= JOptionPane.showInputDialog ( "Introduzca H si el trabajador es hombre"
                +" \n Introduzca M si el trabajador es mujer");
        }
        int edad= Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del trabajador"));
        while(edad>90||edad<18){
            edad= Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del trabajador (mayor de 18)"));
        }
        int horasTrabajadas=Integer.parseInt (JOptionPane.showInputDialog (" Introduzca el numero de horas trabajadas"));
        while(horasTrabajadas<=0){horasTrabajadas=Integer.parseInt (JOptionPane.showInputDialog (" Introduzca el numero de horas trabajadas"));}
        double sueldoXhora= Double.parseDouble (JOptionPane.showInputDialog ( "Introduzca el sueldo que gana por hora el trabajador"));
        while(sueldoXhora<=0){sueldoXhora= Double.parseDouble (JOptionPane.showInputDialog ( "Introduzca el sueldo que gana por hora el trabajador"));}
        agregarTrabajador(codigo,nombre,apellido_pat,apellido_mat,genero,edad,sueldoXhora,horasTrabajadas);
    }

    public void agregarTrabajadorContrato(){
        int codigo= Integer.parseInt (JOptionPane.showInputDialog ( "Introduzca el codigo del nuevo trabajador"));
        while(buscarTrabajador(codigo)){
            codigo= Integer.parseInt (JOptionPane.showInputDialog ( "Codigo ya existente\nIntroduzca el codigo del nuevo trabajador"));
        }
        String nombre= JOptionPane.showInputDialog ( "Introduzca el nombre del nuevo trabajador");
        String apellido_pat= JOptionPane.showInputDialog ( "Introduzca el apellido_paterno del nuevo trabajador");
        String apellido_mat= JOptionPane.showInputDialog ( "Introduzca el apellido_materno del nuevo trabajador");

        String genero= JOptionPane.showInputDialog ( "Introduzca H si el trabajador es hombre"
                +" \n Introduzca M si el trabajador es mujer");
        while(!genero.equals("H")&& !genero.equals("M")){
            genero= JOptionPane.showInputDialog ( "Introduzca H si el trabajador es hombre"
                +" \n Introduzca M si el trabajador es mujer");
        }
        int edad= Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del trabajador"));
        while(edad>90||edad<18){
            edad= Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad del trabajador (mayor de 18)"));
        }

        double sueldoQuincenal=Double.parseDouble (JOptionPane.showInputDialog ("Introduzca el sueldo quincenal del trabajador"));
        while(sueldoQuincenal<=0){sueldoQuincenal=Double.parseDouble (JOptionPane.showInputDialog ("Introduzca el sueldo quincenal del trabajador"));}
        int faltas=Integer.parseInt (JOptionPane.showInputDialog ( "Introduzca el numero de dias que falto el trabajador"));
        double descuentos=Double.parseDouble (JOptionPane.showInputDialog ("Introduzca el valor de los descuentos al trabajador"));
        double bonos=Double.parseDouble (JOptionPane.showInputDialog ("Introduzca el valor de los bonos hechos al trabajador"));
        agregarTrabajador(codigo,nombre,apellido_pat,apellido_mat,genero,edad,sueldoQuincenal,faltas,descuentos,bonos);
    }

    private void agregarTrabajador(int codigo, String nombre, String apellido_pat,String apellido_mat,String genero,int edad, int diasTrabajados, double sueldoXdia, double descuentos){
        lista.add(new TrabajadorXdias(codigo,nombre,apellido_pat,apellido_mat,genero,edad,diasTrabajados,sueldoXdia,descuentos));
        listaRespaldo.add(new TrabajadorXdias(codigo,nombre,apellido_pat,apellido_mat,genero,edad,diasTrabajados,sueldoXdia,descuentos));
    }

    private void agregarTrabajador(int codigo, String nombre,String apellido_pat,String apellido_mat, String genero,int edad,double sueldoXhora, int horasTrabajadas){
        lista.add( new TrabajadorXhora(codigo,nombre,apellido_pat, apellido_mat,genero,edad,sueldoXhora,horasTrabajadas));
        listaRespaldo.add( new TrabajadorXhora(codigo,nombre,apellido_pat,apellido_mat,genero,edad,sueldoXhora,horasTrabajadas));
    }

    private void agregarTrabajador(int codigo,String nombre,String apellido_pat, String apellido_mat,String genero,int edad,double sueldoQuincenal,int faltas,double descuentos,double bonos){
        lista.add( new TrabajadorXcontrato(codigo,nombre,apellido_pat, apellido_mat,genero,edad,sueldoQuincenal,faltas,descuentos,bonos));
        listaRespaldo.add(new TrabajadorXcontrato(codigo,nombre,apellido_pat,apellido_mat,genero,edad,sueldoQuincenal,faltas,descuentos,bonos));
    }

    public void reiniciarLista(){
        criterios.clear();
        lista.clear();
        for(Object o: listaRespaldo){
            lista.add(o);
        }

    }

    public String reordenar(){

        String mensaje="";
        tdias.clear();
        thoras.clear();
        tcontrato.clear();
        for( Object o : lista){
            if(o instanceof TrabajadorXdias){TrabajadorXdias t= (TrabajadorXdias) o; tdias.add(t);}
            if(o instanceof TrabajadorXhora){TrabajadorXhora t= (TrabajadorXhora) o; thoras.add(t);} 
            if(o instanceof TrabajadorXcontrato){TrabajadorXcontrato t= (TrabajadorXcontrato) o; tcontrato.add(t);}
        }
        mensaje+= "------------------------------------------------------------------------------------------------------\n";
        mensaje+= "                     TRABAJADORES POR DIA\n";
        mensaje+= "------------------------------------------------------------------------------------------------------\n";
        mensaje+= "Codigo\tNombre\tApellido\tGenero\tSueldoF\n";
        mensaje+= "------------------------------------------------------------------------------------------------------\n";
        for(TrabajadorXdias t: tdias){
            mensaje+= t.getCodigo()+"\t"+t.getNombre()+"\t"+t.getApellido_pat()+"\t"+t.getApellido_mat()+"\t"+t.getEdad()+"\t"+t.getGenero()+"\t$"+t.getSueldoFinal()+"\n";
        }

        mensaje+= "------------------------------------------------------------------------------------------------------\n";
        mensaje+= "                     TRABAJADORES POR HORAS\n";
        mensaje+= "------------------------------------------------------------------------------------------------------\n";
        mensaje+= "Codigo\tNombre\tApellido\tGenero\tSueldoF\n";
        mensaje+= "------------------------------------------------------------------------------------------------------\n";
        for(TrabajadorXhora t: thoras){
            mensaje+= t.getCodigo()+"\t"+t.getNombre()+"\t"+t.getApellido_pat()+"\t"+t.getApellido_mat()+"\t"+t.getEdad()+"\t"+t.getGenero()+"\t$"+t.getSueldoFinal()+"\n";
        }
        mensaje+= "------------------------------------------------------------------------------------------------------\n";
        mensaje+= "                     TRABAJADORES POR CONTRATO\n";
        mensaje+= "------------------------------------------------------------------------------------------------------\n";
        mensaje+= "Codigo\tNombre\tApellido\tGenero\tSueldoF\n";
        mensaje+= "------------------------------------------------------------------------------------------------------\n";
        for(TrabajadorXcontrato t: tcontrato){
            mensaje+= t.getCodigo()+"\t"+t.getNombre()+"\t"+t.getApellido_pat()+"\t"+t.getApellido_mat()+"\t"+t.getEdad()+"\t"+t.getGenero()+"\t$"+t.getSueldoFinal()+"\n";
        }

        return mensaje;
    }

    public void totalSueldoXgenero(){

        double totSueldo = 0;

        for( Object o : lista){
            if(o instanceof TrabajadorXdias){
                TrabajadorXdias t= (TrabajadorXdias) o; 
                if(t.getGenero().equals("H")){totSueldo+= t.getSueldoFinal();}
            }
            if(o instanceof TrabajadorXhora){
                TrabajadorXhora t= (TrabajadorXhora) o; 
                if(t.getGenero().equals("H")){totSueldo+= t.getSueldoFinal();}
            }
            if(o instanceof TrabajadorXcontrato){
                TrabajadorXcontrato t= (TrabajadorXcontrato) o; 
                if(t.getGenero().equals("H")){totSueldo+= t.getSueldoFinal();}

            }

        }
        String mensaje = "El total de sueldos pagados por genero masculino es : $"+ totSueldo+"\n";
        totSueldo = 0;

        for( Object o : lista){
            if(o instanceof TrabajadorXdias){
                TrabajadorXdias t= (TrabajadorXdias) o; 
                if(t.getGenero().equals("M")){totSueldo+= t.getSueldoFinal();}
            }
            if(o instanceof TrabajadorXhora){
                TrabajadorXhora t= (TrabajadorXhora) o; 
                if(t.getGenero().equals("M")){totSueldo+= t.getSueldoFinal();}
            }
            if(o instanceof TrabajadorXcontrato){
                TrabajadorXcontrato t= (TrabajadorXcontrato) o; 
                if(t.getGenero().equals("M")){totSueldo+= t.getSueldoFinal();}

            }

        }
        mensaje += "El total de sueldos pagados por genero femenino es : $"+ totSueldo+"\n";
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void totalSueldoXtipoTrabajadorGenero(){
        String mensaje="";
        double totSueldoDias= 0; 
        double totSueldoHoras = 0 ; 
        double totSueldoContrato = 0; 
        for( Object o : lista){
            if(o instanceof TrabajadorXdias){
                TrabajadorXdias t= (TrabajadorXdias) o; 
                if(t.getGenero().equals("H")){totSueldoDias+= t.getSueldoFinal();}
            }
            if(o instanceof TrabajadorXhora){
                TrabajadorXhora t= (TrabajadorXhora) o; 
                if(t.getGenero().equals("H")){totSueldoHoras+= t.getSueldoFinal();}
            }
            if(o instanceof TrabajadorXcontrato){
                TrabajadorXcontrato t= (TrabajadorXcontrato) o; 
                if(t.getGenero().equals("H")){totSueldoContrato += t.getSueldoFinal();}

            }

        }
        mensaje += "El total de sueldos pagados a los trabajadores del genero masculino es :";
        mensaje +="\nTrabajadores por dias : $"+totSueldoDias;
        mensaje +="\nTrabajadores por horas : $"+totSueldoHoras;
        mensaje += "\nTrabajadores por contrato: $"+totSueldoContrato;

        totSueldoDias= 0; 
        totSueldoHoras = 0 ; 
        totSueldoContrato = 0; 

        for( Object o : lista){
            if(o instanceof TrabajadorXdias){
                TrabajadorXdias t= (TrabajadorXdias) o; 
                if(t.getGenero().equals("M")){totSueldoDias+= t.getSueldoFinal();}
            }
            if(o instanceof TrabajadorXhora){
                TrabajadorXhora t= (TrabajadorXhora) o; 
                if(t.getGenero().equals("M")){totSueldoHoras+= t.getSueldoFinal();}
            }
            if(o instanceof TrabajadorXcontrato){
                TrabajadorXcontrato t= (TrabajadorXcontrato) o; 
                if(t.getGenero().equals("M")){totSueldoContrato += t.getSueldoFinal();}

            }

        }
        mensaje += "\nEl total de sueldos pagados a los trabajadores del genero femenino es :";
        mensaje +="\nTrabajadores por dias : $"+totSueldoDias;
        mensaje +="\nTrabajadores por horas : $"+totSueldoHoras;
        mensaje += "\nTrabajadores por contrato: $"+totSueldoContrato;
        JOptionPane.showMessageDialog ( null, mensaje);    
    }

    public void trabajadoresConDescuentoXtipo(){
        area.setText("");
        String mensaje = ""; 
        String espacios="";
        mensaje+= "Trabajadores por dias\n";
        mensaje+= "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        mensaje+= "Codigo\tNombre\t\tApe_pat\tApe_mat\tEdad\tGenero\tDescuento\tSueldoFinal\n";
        mensaje+= "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        for( Object o : lista){
            if(o instanceof TrabajadorXdias){
                TrabajadorXdias t= (TrabajadorXdias) o; 
                if(t.getDescuentos()!=0){
                    if(t.getNombre().length()<35){int cont =35-t.getNombre().length();  while (cont>0){espacios+=" ";cont--;}}
                    mensaje+= t.getCodigo()+"\t"+t.getNombre()+espacios+"\t"+t.getApellido_pat()+"\t"+t.getApellido_mat()+"\t"+t.getEdad()+"\t"+t.getGenero()+"\t$"+t.getDescuentos()+"\t$"+t.getSueldoFinal()+"\n";}
            }
            espacios="";
        }   
        mensaje+= "________________________________________________________\n";
        mensaje+= "Trabajadores por contrato\n";

        mensaje+= "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        mensaje+= "Codigo\tNombre\t\tApe_pat\tApe_mat\tEdad\tGenero\tDescuento\tSueldoFinal\n";
        mensaje+= "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        for( Object o : lista){

            if(o instanceof TrabajadorXcontrato){
                TrabajadorXcontrato t= (TrabajadorXcontrato) o; 
                if(t.getDescuentos()!=0){
                    if(t.getNombre().length()<35){int cont =35-t.getNombre().length();  while (cont>0){espacios+=" ";cont--;}}
                    mensaje+= t.getCodigo()+"\t"+t.getNombre()+espacios+"\t"+t.getApellido_pat()+"\t"+t.getApellido_mat()+"\t"+t.getEdad()+"\t"+t.getGenero()+"\t$"+t.getDescuentos()+"\t$"+t.getSueldoFinal()+"\n";}

            }
            espacios="";
        }
        area.setText(mensaje);
        JOptionPane.showMessageDialog(null,barra);
    }

    public void trabajadoresConFaltasXgenero(){
        area.setText("");
        String mensaje="";
        String espacios="";
        mensaje+= "-------------------------------------------HOMBRES----------------------------------------------\n";
        mensaje+= "Codigo\tNombre\t\tApe_pat\tApe_mat\tEdad\tGenero\tFaltas\tSueldoFinal\n";
        mensaje+= "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        for( Object o : lista){

            if(o instanceof TrabajadorXcontrato){
                TrabajadorXcontrato t= (TrabajadorXcontrato) o; 
                if(t.getGenero().equals("H")&&t.getFaltas()!=0){
                    if(t.getNombre().length()<35){int cont =35-t.getNombre().length();  while (cont>0){espacios+=" ";cont--;}}
                    mensaje+= t.getCodigo()+"\t"+t.getNombre()+espacios+"\t"+t.getApellido_pat()+"\t"+t.getApellido_mat()+"\t"+t.getEdad()+"\t"+t.getGenero()+"\t"+t.getFaltas()+"\t$"+t.getSueldoFinal()+"\n";}
            }
            espacios="";
        }
        mensaje+= "-------------------------------------------MUJERES----------------------------------------------\n";
        mensaje+= "Codigo\tNombre\t\tApe_pat\tApe_mat\tEdad\tGenero\tFaltas\tSueldoFinal\n";
        mensaje+= "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        for( Object o : lista){

            if(o instanceof TrabajadorXcontrato){
                TrabajadorXcontrato t= (TrabajadorXcontrato) o; 
                if(t.getGenero().equals("M")&&t.getFaltas()!=0){ 
                    if(t.getNombre().length()<35){int cont =35-t.getNombre().length();  while (cont>0){espacios+=" ";cont--;}}
                    mensaje+= t.getCodigo()+"\t"+t.getNombre()+espacios+"\t"+t.getApellido_pat()+"\t"+t.getApellido_mat()+"\t"+t.getEdad()+"\t"+t.getGenero()+"\t"+t.getFaltas()+"\t$"+t.getSueldoFinal()+"\n";}
            }
            espacios="";
        }
        area.setText(mensaje);
        JOptionPane.showMessageDialog(null,barra);
    }

    public void trabajadoresConBonosXgenero(){
        area.setText("");
        String mensaje="";
        String espacios="";
        mensaje+= "-------------------------------------------HOMBRES----------------------------------------------\n";
        mensaje+= "Codigo\tNombre\t\tApe_pat\tApe_mat\tEdad\tGenero\tBonos\tSueldoFinal\n";
        mensaje+= "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        for( Object o : lista){

            if(o instanceof TrabajadorXcontrato){
                TrabajadorXcontrato t= (TrabajadorXcontrato) o; 
                if(t.getGenero().equals("H")&&t.getBonos()!=0){ 
                    if(t.getNombre().length()<35){int cont =35-t.getNombre().length();  while (cont>0){espacios+=" ";cont--;}}
                    mensaje+= t.getCodigo()+"\t"+t.getNombre()+espacios+"\t"+t.getApellido_pat()+"\t"+t.getApellido_mat()+"\t"+t.getEdad()+"\t"+t.getGenero()+"\t$"+t.getBonos()+"\t$"+t.getSueldoFinal()+"\n";}
            }
            espacios="";
        }
        mensaje+= "-------------------------------------------MUJERES----------------------------------------------\n";
        mensaje+= "Codigo\tNombre\t\tApe_pat\tApe_mat\tEdad\tGenero\tBonos\tSueldoFinal\n";
        mensaje+= "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        for( Object o : lista){

            if(o instanceof TrabajadorXcontrato){
                TrabajadorXcontrato t= (TrabajadorXcontrato) o; 
                if(t.getGenero().equals("M")&&t.getBonos()!=0){
                    if(t.getNombre().length()<35){int cont =35-t.getNombre().length();  while (cont>0){espacios+=" ";cont--;}}
                    mensaje+= t.getCodigo()+"\t"+t.getNombre()+espacios+"\t"+t.getApellido_pat()+"\t"+t.getApellido_mat()+"\t"+t.getEdad()+"\t"+t.getGenero()+"\t$"+t.getBonos()+"\t$"+t.getSueldoFinal()+"\n";}
            }
            espacios="";
        }
        area.setText(mensaje);
        JOptionPane.showMessageDialog(null,barra);
    }

    public String imprimir(){
        String mensaje="";
        String espacios="";
        mensaje+= "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        mensaje+= "CODIGO\tNOMBRE\tAPELLIDO_PAT\t      APELLIDO_MAT\tEDAD\tGENERO\tSUELDO\n";
        mensaje+= "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
        for( Object o : lista){
            if(o instanceof TrabajadorXdias){TrabajadorXdias t= (TrabajadorXdias) o;
                if(t.getNombre().length()<35){int cont =35-t.getNombre().length();  while (cont>0){espacios+=" ";cont--;}}
                mensaje+= t.getCodigo()+"\t"+t.getNombre()+espacios+"\t"+t.getApellido_pat()+"\t"+t.getApellido_mat()+"\t"+t.getEdad()+"\t"+t.getGenero()+"\t$"+t.getSueldoFinal()+"\n";}
            if(o instanceof TrabajadorXhora){TrabajadorXhora t= (TrabajadorXhora) o; 
                if(t.getNombre().length()<35){int cont =35-t.getNombre().length();  while (cont>0){espacios+=" ";cont--;}}
                mensaje+= t.getCodigo()+"\t"+t.getNombre()+espacios+"\t"+t.getApellido_pat()+"\t"+t.getApellido_mat()+"\t"+t.getEdad()+"\t"+t.getGenero()+"\t$"+t.getSueldoFinal()+"\n";} 
            if(o instanceof TrabajadorXcontrato){TrabajadorXcontrato t= (TrabajadorXcontrato) o;
                if(t.getNombre().length()<35){int cont =35-t.getNombre().length();  while (cont>0){espacios+=" ";cont--;}}
                mensaje+= t.getCodigo()+"\t"+t.getNombre()+espacios+"\t"+t.getApellido_pat()+"\t"+t.getApellido_mat()+"\t"+t.getEdad()+"\t"+t.getGenero()+"\t$"+t.getSueldoFinal()+"\n";}
            espacios="";
        }
        return mensaje;
    }

    //*****************************

    private void precargarDatos(){
        Importacion_Datos i = new Importacion_Datos();
        ArrayList temp= i.importarDatos();
        for(Object o: temp){
            lista.add(o);
            listaRespaldo.add(o);
        }
        temp.clear();
    }
}