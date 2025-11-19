import java.time.LocalDate; 

public class Actividad extends Tarea{
    private String propietario;
    private LocalDate fechaEntrega;

    public Actividad(String propietario, String nombre, double puntaje, String descripcion, boolean estado, int anio, int mes, int dia) {
        super(nombre, puntaje, descripcion, estado, anio, mes, dia);
        this.propietario = propietario;
        this.fechaEntrega = LocalDate.of(anio,mes,dia);
    }
    
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
}
