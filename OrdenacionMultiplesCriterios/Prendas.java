public class Prendas
{
    private String prenda;
    private String temporada;
    private String colorPrenda;
    private int id;

    public Prendas ( String prenda, String temporada, String colorPrenda, int id) {
        setPrenda (prenda);
        setTemporada(temporada);
        setColorPrenda(colorPrenda);
        setId(id);
    }
    
    public void setPrenda (String prenda){
        this.prenda=prenda;
    }
      public void setTemporada ( String temporada ) { 
        this.temporada = temporada; 
    } 

    public void setColorPrenda ( String colorPrenda )  {
        this.colorPrenda = colorPrenda; 
    } 

    public void setId ( int id) { 
        this.id = id; 
    } 
    public String getPrenda(){
        return prenda;
    }
       public String getTemporada() {
        return temporada; 
    }

    public String getColorPrenda ()  {
        return colorPrenda ; 
    } 

    public int getId ( )  {
        return id; 
    } 

}




























