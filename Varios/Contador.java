/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Contador extends JFrame implements KeyListener {
    private JTextArea areaTexto;
    private JLabel contador ;      
    private int contadorLetras;
   
    public Contador()
    {
        super( "Texto solo letras, contador de caracteres" );
        addKeyListener( this ); 

        areaTexto = new JTextArea( );

        areaTexto.setEnabled( false );
        areaTexto.setDisabledTextColor( Color.blue );

        contadorLetras = 0;
       
        contador  = new JLabel("Contador"); 
        contador.setBounds(100,200,300,300);

        areaTexto.add(contador);
        getContentPane().add( areaTexto );

        setSize( 500, 500 );
        setVisible(true);
        setLayout(null);

        this.setLocationRelativeTo(null); //para centrar ventana

    } // fin del constructor 
    public void keyPressed( KeyEvent evento )
    {
        if((evento.getKeyCode()>=65 && evento.getKeyCode()<=90)
        ||evento.getKeyCode()==32//Espacio
        ||evento.getKeyCode()==10//enter
        ){  
            String texto= ""+ evento.getKeyChar( );
            areaTexto.append(texto);
        }
        
        if(evento.getKeyCode()==8){ //retroceso
            try{
                
             char ultimo= (areaTexto.getText()).charAt(areaTexto.getText().length()-1); //para saber el ultimo escrito
             if(ultimo==' '||ultimo=='\n'){contadorLetras++;} //para que no se pierda la cuenta al retroceder
                                                              //si fuera el caso de que no son letras
                String back=((areaTexto.getText()).substring(0, (areaTexto.getText()).length()-1));//para restar al borrar letras
                
                areaTexto.setText("");
                areaTexto.append(back);
                contadorLetras=contadorLetras - 1;
             
                if(contadorLetras<0){contadorLetras=0;}//para cuando no haya nada que borrar
                contador.setText("Numero de letras: "+ contadorLetras);
            }catch(Exception  e){areaTexto.setText(""); }
        }
    }

    public void keyReleased( KeyEvent evento ){
        if(evento.getKeyCode()>=65 && evento.getKeyCode()<=90){ //alfabeto
            contadorLetras++;
            contador.setText("Numero de letras: "+ contadorLetras);
           

        }
        
    }

    public void keyTyped( KeyEvent evento )
    {}

    public static void main( String args[] )
    {

        JFrame.setDefaultLookAndFeelDecorated(true);
        Contador aplicacion = new Contador();
        aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
}