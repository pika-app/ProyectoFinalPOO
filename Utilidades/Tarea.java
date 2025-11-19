import java.time.LocalDate;

public class Tarea {
    private String nombre;
    private double puntaje;
    private String descripcion;
    private boolean estado;
    private LocalDate fechaEntrega;

    public Tarea(String nombre, double puntaje, String descripcion, boolean estado, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaEntrega = LocalDate.of(anio,mes,dia);
    }

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public double getPuntaje() {
    return puntaje;
}

public void setPuntaje(double puntaje) {
    this.puntaje = puntaje;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

public boolean getEstado() {
    return estado;
}

public void setEstado(boolean estado) {
    this.estado = estado;
}

public void mostrarFecha(){
    System.out.println("La fecha de entrega es "+fechaEntrega.getDayOfYear()+"/"+fechaEntrega.getDayOfMonth()+"/"+fechaEntrega.getDayOfWeek());
}

}
