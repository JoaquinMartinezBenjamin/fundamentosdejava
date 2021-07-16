
import javax.swing.*;



public class ContadorCaracteres { 


private JScrollPane barra;
private JTextArea area; 
private String texto;
private int a;
private int b;
private int c;
private int d;
private int e;
private int f;
private int g;
private int h;
private int i;
private int j;
private int k;
private int l;
private int m;
private int n;
private int o;
private int p;
private int q;
private int r;
private int s;
private int t;
private int u;
private int v;
private int w;
private int x;
private int y;
private int z;


 public ContadorCaracteres () { 
           
      texto= "";
      a=0;
      b=0;
      c=0;
       d=0;
        e=0;
         f=0;
          g=0;
           h=0;
            i=0;
             j=0;
              k=0;
               l=0;
                m=0;
                 n=0;
            
                   o=0;
                    p=0;
                     q=0;
                      r=0;
                       s=0;
                        t=0;
              u=0;
               v=0;
               w=0;
                x=0;
                 y=0;
                 z=0;
                 area  = new JTextArea   (30,40);
      barra = new JScrollPane (area) ;
    }
    
    
    
     public void contarCaracteres () {
        
        
        texto=JOptionPane.showInputDialog ("Introduzca la cadena de texto" );
        
        
        
        for ( int i =1; i < texto.length(); i++){
            
            
          switch (texto.charAt(i)){
          
           case 'a': a++;
           case 'b': b++;
           case 'c': c++;
           case 'd': d++;
           case 'e': e++;
           case 'f': f++;
           case 'g': g++;
           case 'h': h++;
           case 'i': i++;
           case 'j': j++;
           case 'k': k++;
          case 'l': l++;
          case 'm': m++;
          case 'n': m++;
          case 'o': o++;
          case 'p': p++;
          case 'q': q++;
          case 'r': r++;
          case 's': s++;
          case 't': t++;
          case 'u': u++;
          case 'v': v++;
          case 'w': w++;
           case 'x': x++;
           case 'y': y++;
           case 'z': z++;
           }
           
           
           
        }
        
          area.append ("a="+ a + "\n"
                         + "b="+ b + "\n"
                         + "c="+ c + "\n"
                         + "d="+ d + "\n"
                         + "e="+ e + "\n"
                         + "f="+ f + "\n"
                         + "g="+ g + "\n"
                         + "h="+ h + "\n"
                         + "i="+ i + "\n"
                         + "j="+ j + "\n"
                         + "k="+  k+ "\n"
                         + "l="+ l+ "\n"
                         + "m="+ m + "\n"
                         + "n="+ n + "\n"
                         + "o="+ o + "\n"
                         + "p="+ p + "\n"
                         + "q="+ q + "\n"
                         + "r="+ r + "\n"
                         + "s="+ s + "\n"
                         + "t="+ t + "\n"
                         + "u="+ u + "\n"
                         + "v="+ v + "\n"
                         + "w="+ w + "\n"
                         + "x="+ x + "\n"
                         + "y="+ y + "\n"
                         + "z="+ z + "\n");
       
    JOptionPane.showMessageDialog (null,area );


 }
     
      public static void main (String [] args) 
      {
          
           ContadorCaracteres Obj = new ContadorCaracteres () ; 
           
            Obj.contarCaracteres () ; 
            
        }
    }
        
 