public class Recompensa {
    private String nombreRecompensa;
    private int puntosRecompensa; 
    
    public Recompensa(String nombreRecompensa, int puntosRecompensa){
        this.nombreRecompensa = nombreRecompensa; 
        this.puntosRecompensa = puntosRecompensa; 
  
    }

    public String getNombreRecompensa() {
        return nombreRecompensa;
    }

    public void setNombreRecompensa(String nombreRecompensa) {
        this.nombreRecompensa = nombreRecompensa;
    }

    public int getPuntosRecompensa() {
        return puntosRecompensa;
    }

    public void setPuntosRecompensa(int puntosRecompensa) {
        this.puntosRecompensa = puntosRecompensa;
    }
    
    
    
}
