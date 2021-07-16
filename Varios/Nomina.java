import javax.swing.*;
public class Nomina {

private String [] empleados;
private int totEmpleados ; 
private int [] numeroEmpleados;
private float [] horasTrabajadas ;
private float salarioBruto;
private float []sueldosBase;
    private float impuesto;
    private float seguroSocial; 
    private float cuotaSindical;
    private float neto;
private JScrollPane barra;
private JTextArea area;


public Nomina (int totEmpleados ){

this.totEmpleados= totEmpleados;
salarioBruto=0;
    impuesto=0;
    seguroSocial=0;
   cuotaSindical=0;
    neto=0;

empleados = new String [totEmpleados];
numeroEmpleados= new int [totEmpleados];
horasTrabajadas = new float[totEmpleados];
sueldosBase= new float [totEmpleados];
     area  = new JTextArea   (30,40);
    barra = new JScrollPane (area) ;
                  }
                  
                  
  public void introducirDatos () { 
      
      
       for (int i=0; i< totEmpleados ; i++ ) {
           
           
            empleados[i]= JOptionPane.showInputDialog ( "Introduza el nombre del empleado "+ (i+1));
            sueldosBase[i]=Integer.parseInt (JOptionPane.showInputDialog ( "Introduzca el sueldo base por hora del empleado "+ empleados[i]
            + " en pesos"));
            horasTrabajadas[i]=  Integer.parseInt (JOptionPane.showInputDialog ( "Introduzca el número de horas trabajadas del empleado "+ empleados[i])); 
            numeroEmpleados[i]=  Integer.parseInt (JOptionPane.showInputDialog ( "Introduzca el número correspodiente al empleado "+ empleados[i]));   
                  
        }
        
    }
   
    
    public void calcularDatos () {
         area.append ("....NOMINA EMPRESA X....\n");
         area.append (".............................................................................................................");
        area.append (".............................................................................................................\n");
       area.append ("Número\tNombre     Hrs Trabajadas\tsueldo base\tsalarioBruto\timpuesto\tseguroSocial\tcuotaSindical"
          +"\tTotal neto\n"); 
        area.append (".............................................................................................................");
        area.append (".............................................................................................................\n");
        for (int i=0; i< totEmpleados ; i++ ) {
        salarioBruto= horasTrabajadas [i] * sueldosBase[i];
        impuesto= (salarioBruto/100) * 15;
        seguroSocial= (salarioBruto/100)*3;
        cuotaSindical= (salarioBruto/100) * 2;
        neto= salarioBruto - (impuesto + seguroSocial + cuotaSindical);
          area.append (numeroEmpleados[i]+"\t"+empleados [i]+"\t" +horasTrabajadas[i]+"\t"+sueldosBase[i]+"$\t"+salarioBruto+"$\t"+impuesto+"$\t" + seguroSocial
          +"$\t"+ cuotaSindical
          + "$\t"+neto+"$\n");   
          area.append (".............................................................................................................");
          area.append (".............................................................................................................\n");
        }
         JOptionPane.showMessageDialog ( null,barra);
    }
    
    
        public static void main (String []args) {
            
            int totEmpleados = Integer.parseInt (JOptionPane.showInputDialog ( "Introduza el total de empleados")); 
            
            Nomina Obj= new Nomina ( totEmpleados) ; 
              Obj.introducirDatos();
            Obj.calcularDatos ();
        }
        
    }