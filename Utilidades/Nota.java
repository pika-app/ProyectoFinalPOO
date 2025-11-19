public class Nota {
    private String contenido;
    private String nombreNota;

    public Nota(String contenido,String nombreNota){
        this.contenido=contenido;
        this.nombreNota=nombreNota; 
    }


    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public String getNombreNota(){
        return nombreNota; 
    }
    
    public void setNombreNota(String nombreNota){
        this.nombreNota = nombreNota;
    }
}
