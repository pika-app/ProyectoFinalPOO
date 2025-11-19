import java.time.LocalDate;

public class Tarea {
    private String nombre;
    private double puntajeMaximo;
    private double puntajeObtenido;
    private String descripcion;
    private boolean estado;
    private LocalDate fechaEntrega;

    public Tarea(String nombre, double puntajeMaximo,double puntajeObtenido ,String descripcion, boolean estado, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.puntajeMaximo = puntajeMaximo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaEntrega = LocalDate.of(anio,mes,dia);
        this.puntajeObtenido = puntajeObtenido;
    }

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public double getPuntajeMaximo() {
    return puntajeMaximo;
}

public void setPuntajeMaximo(double puntajeMaximo) {
    this.puntajeMaximo = puntajeMaximo;
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

public double getPuntajeObtenido() {
        return puntajeObtenido;
}

public void setPuntajeObtenido(double puntajeObtenido) {
        this.puntajeObtenido = puntajeObtenido;
}

public LocalDate getFechaEntrega() {
        return fechaEntrega;
}

public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
}




public void mostrarFecha(){
    System.out.println("La fecha de entrega es "+fechaEntrega.getDayOfYear()+"/"+fechaEntrega.getDayOfMonth()+"/"+fechaEntrega.getDayOfWeek());
}

}
