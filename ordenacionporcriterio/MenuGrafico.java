import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MenuGrafico
extends ReportesTrabajadores
{
    private JScrollPane barra;
    public JTabbedPane jTabbedPane;
    //*** Pestaña1*****
    private JTextArea area1;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JLabel etiqueta4;
    private JLabel etiqueta5;
    public JButton b1;
    public JButton b2;
    public JButton b3;
    public JButton b4;
    public JButton b5;
    public JButton b6;

    //Pestaña 2************************
    private JTextArea area2;

    private JLabel etiqueta1a;
    private JLabel etiqueta2a;
    private JLabel etiqueta3a;
    public JButton b1a;
    public JButton b2a;
    public JButton b3a;
    //Pestaña 3************************
    private JTextArea area3;

    private JLabel etiqueta1b;
    public JButton b1b;
    public JButton b1c;
    public JButton b2b;
    public JButton b3b;
    public JButton b4b;
    public JButton b5b;
    public JButton b6b;
    public JButton salir;
    public JButton reiniciar;
    public JTextArea area4;
    private JTextArea area5;
    //*********************
    public MenuGrafico()
    {   
        setSize(900, 600);
        setTitle("   TRABAJADORES ");
        //****Pestaña 1*****************
        area1= new JTextArea   (10,20);
        area1.setEditable(false);
        b1=new JButton("Opción 1");
        b1.setBounds(10,30,100,40);
        b2=new JButton("Opción 2");
        b2.setBounds(10,80,100,40);
        b3=new JButton("Opción 3");
        b3.setBounds(10,130,100,40);
        b4=new JButton("Opción 4"); etiqueta1 = new JLabel();
        b4.setBounds(10,180,100,40);
        b5=new JButton("Opción 5");
        b5.setBounds(10,230,100,40);
        etiqueta1.setForeground(Color.black); 
        etiqueta1.setFont(new java.awt.Font("Arial",1,15));
        etiqueta1.setBounds(120,30, 400, 50);
        etiqueta1.setText("Total de sueldos pagados por genero ");
        area1.add(etiqueta1);
        etiqueta2 = new JLabel();
        etiqueta2.setForeground(Color.black); 
        etiqueta2.setFont(new java.awt.Font("Arial",1,15));
        etiqueta2.setBounds(120,80, 500, 50);
        etiqueta2.setText("Total de sueldos pagados por tipo de trabajador y genero" );
        etiqueta3 = new JLabel();
        etiqueta3.setForeground(Color.black); 
        etiqueta3.setFont(new java.awt.Font("Arial",1,15));
        etiqueta3.setBounds(120,100, 500, 100);
        etiqueta3.setText("Imprimir solo trabajadores con descuentos ordenados por tipo");
        area1.add(etiqueta3);
        area1.add(etiqueta2);
        etiqueta4 = new JLabel();
        etiqueta4.setForeground(Color.black); 
        etiqueta4.setFont(new java.awt.Font("Arial",1,15));
        etiqueta4.setBounds(120,150, 400, 100);
        etiqueta4.setText("Imprimir solo trabajadores con faltas por genero");
        area1.add(etiqueta4);
        etiqueta5 = new JLabel();
        etiqueta5.setForeground(Color.black); 
        etiqueta5.setFont(new java.awt.Font("Arial",1,15));
        etiqueta5.setBounds(120,200, 400, 100);
        etiqueta5.setText("Imprimir solo trabajadores con bonos por genero ");
        area1.add(etiqueta5);
        area1.add(b1);
        area1.add(b2);
        area1.add(b3);
        area1.add(b4);
        area1.add(b5);
        //Pestaña 2******************
        area2= new JTextArea   (10,20);
        area2.setEditable(false);
        b1a=new JButton("Opción 1");
        b1a.setBounds(10,30,100,40);
        b2a=new JButton("Opción 2");
        b2a.setBounds(10,80,100,40);
        b3a=new JButton("Opción 3");
        b3a.setBounds(10,130,100,40);
        etiqueta1a = new JLabel();
        etiqueta1a.setForeground(Color.black); 
        etiqueta1a.setFont(new java.awt.Font("Arial",1,15));
        etiqueta1a.setBounds(120,0, 400, 100);
        etiqueta1a.setText("Agregar nuevo trabajador por dias");
        area2.add(etiqueta1a);
        etiqueta2a = new JLabel();
        etiqueta2a.setForeground(Color.black); 
        etiqueta2a.setFont(new java.awt.Font("Arial",1,15));
        etiqueta2a.setBounds(120,50, 400, 100);
        etiqueta2a.setText("Agregar nuevo trabajador por horas");
        area2.add(etiqueta2a);
        etiqueta3a = new JLabel();
        etiqueta3a.setForeground(Color.black); 
        etiqueta3a.setFont(new java.awt.Font("Arial",1,15));
        etiqueta3a.setBounds(120,100, 400, 100);
        etiqueta3a.setText("Agregar nuevo trabajador por contrato");
        area2.add(etiqueta3a);
        area2.add(b1a);
        area2.add(b2a);
        area2.add(b3a);
        //Pestaña3*************************
        area3= new JTextArea();

        area3.setEditable(false);
        b1c=new JButton("Por código");
        b1c.setBounds(20,25,120,30);

        b1b=new JButton("Por nombre");
        b1b.setBounds(20,75,120,30);

        b2b=new JButton("Por sueldo");
        b2b.setBounds(20,125,120,30);

        b3b=new JButton("Por genero");
        b3b.setBounds(20,175,120,30);

        b4b=new JButton("Por ape_pat");
        b4b.setBounds(20,225,120,30);

        b5b=new JButton("Por ape_mat");
        b5b.setBounds(20,275,120,30);

        b6b=new JButton("Por edad");
        b6b.setBounds(20,325,120,30);

        reiniciar=new JButton("REINICIAR");
        reiniciar.setBounds(20,400,120,30);

        salir=new JButton("Salir");
        salir.setBounds(20,450,120,30);

        area3.add(b1b);
        area3.add(b1c);
        area3.add(b2b);
        area3.add(b3b);
        area3.add(b4b);
        area3.add(b5b);
        area3.add(b6b);
        area3.add(reiniciar);
        area3.add(salir);
        etiqueta1b = new JLabel();
        etiqueta1b.setForeground(Color.black); 
        etiqueta1b.setFont(new java.awt.Font("Arial",1,15));
        etiqueta1b.setBounds(50,0, 400, 100);
        area4= new JTextArea();
        area4.setBounds(150,25,700,500); //

        area4.setBackground(Color.black);
        area5= new JTextArea();
        area5.setBounds(0,0,700,500); //

        area5.setBackground(Color.black);
        area5.setForeground(Color.white); 

        area3.add(area4);

        barra = new JScrollPane (area5) ;
        barra.setBounds(0,0,700,500); //
        area4.add(barra);

        //*************************
        jTabbedPane = new JTabbedPane();
        jTabbedPane.addTab("Ordenación por criterio ",null,area3);
        jTabbedPane.addTab("Reportes de trabajadores",null, area1);
        jTabbedPane.addTab("Agregar nuevo trabajador",null, area2);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(jTabbedPane, BorderLayout.CENTER);
        area5.setText(imprimir());
        //****************************************************************************************

        ActionListener accion = new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evento){
                    Object obj=evento.getSource();

                    if (obj==b1){    totalSueldoXgenero();}
                    if (obj==b2){  totalSueldoXtipoTrabajadorGenero();}
                    if(obj==b3){trabajadoresConDescuentoXtipo();}
                    if (obj==b4){trabajadoresConFaltasXgenero();}
                    if (obj==b5) { trabajadoresConBonosXgenero();}
                    if(obj==b1a){
                        try{
                            agregarTrabajadorDias();
                        } catch(NumberFormatException e){ 
                            JOptionPane.showMessageDialog(null, "Por favor ingrese un número entero", "Error de sintaxis", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    if(obj==b2a){ 
                        try{
                            agregarTrabajadorHoras();
                        } catch(NumberFormatException e){ 
                            JOptionPane.showMessageDialog(null, "Por favor ingrese un número entero", "Error de sintaxis", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    if(obj==b3a){
                        try{
                            agregarTrabajadorContrato();
                        } catch(NumberFormatException e){ 
                            JOptionPane.showMessageDialog(null, "Por favor ingrese un número entero", "Error de sintaxis", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    if(obj==b1b){

                        area5.setText("");
                        agregarNuevoCriterio(4);
                        ordenar();
                        area5.setText(imprimir());
                    }

                    if(obj==b1c){
                        area5.setText("");
                        agregarNuevoCriterio(3);
                        ordenar();
                        area5.setText(imprimir());

                    }

                    if(obj==b2b){

                        area5.setText("");
                        agregarNuevoCriterio(2);
                        ordenar();
                        area5.setText(imprimir());
                    }   
                    if(obj==b3b){
                        area5.setText("");
                        agregarNuevoCriterio(1);
                        ordenar();
                        area5.setText(imprimir());

                    }

                    if(obj==b4b) {
                        area5.setText("");
                        agregarNuevoCriterio(5);
                        ordenar();
                        area5.setText(imprimir());

                    }
                    if(obj==b5b) {
                        area5.setText("");
                        agregarNuevoCriterio(6);
                        ordenar();
                        area5.setText(imprimir());
                    }
                    if(obj==b6b) {
                        area5.setText("");
                        agregarNuevoCriterio(7);
                        ordenar();
                        area5.setText(imprimir());
                    }
                    if(obj==reiniciar){
                        area5.setText("");
                        reiniciarLista();
                        area5.setText(imprimir());
                    }
                    if(obj==salir){
                        dispose();
                    }

                }
            };        

        b1.addActionListener(accion);     
        b2.addActionListener(accion);  
        b3.addActionListener(accion); 
        b4.addActionListener(accion); 
        b5.addActionListener(accion); 
        b1a.addActionListener(accion);     
        b2a.addActionListener(accion);  
        b3a.addActionListener(accion);
        b1b.addActionListener(accion); 
        b1c.addActionListener(accion); 
        b2b.addActionListener(accion);
        b3b.addActionListener(accion);
        b4b.addActionListener(accion);
        b5b.addActionListener(accion);
        b6b.addActionListener(accion);
        reiniciar.addActionListener(accion);
        salir.addActionListener(accion);

        //****************************************************************************************
    }

    public static void main(String[] args)
    {
        try {
            MenuGrafico jMyFrame7 = new MenuGrafico();

            jMyFrame7.addWindowListener(
                new WindowAdapter()
                {
                    public void windowClosing(WindowEvent e)
                    {
                        System.exit(0);
                    }
                }
            );
            jMyFrame7.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}