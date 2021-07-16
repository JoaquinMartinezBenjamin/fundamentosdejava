public class Ordenacion_Criterios{

    private int tipo;
    private int resultado;
    public Ordenacion_Criterios(int tipo){
        setTipo(tipo);
    }

    public void setTipo(int tipo){
        this.tipo=tipo;
    }

    public int getTipo( ) {
        return tipo;
    }

    public int comparar(Trabajador t1, Trabajador t2){
        switch(tipo){
            case 1:
            resultado= t1.getGenero().compareTo(t2.getGenero());
            break;
            case 2:
            resultado= (new Integer((int) t1.getSueldoFinal())).compareTo(new Integer((int) t2.getSueldoFinal()));
            break;
            case 3:
            resultado= (new Integer(t1.getCodigo())).compareTo(new Integer(t2.getCodigo()));
            break;
            case 4:
            resultado= t1.getNombre().compareToIgnoreCase(t2.getNombre());
            break;
            case 5:
            resultado= t1.getApellido_pat().compareToIgnoreCase(t2.getApellido_pat());
            break;
            case 6:
            resultado= t1.getApellido_mat().compareToIgnoreCase(t2.getApellido_mat());
            break;
            case 7:
            resultado= (new Integer(t1.getEdad())).compareTo(new Integer(t2.getEdad()));
            break;
        }
        return resultado;

    }

}