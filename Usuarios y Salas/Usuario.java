public abstract class Usuario {
    private String nombre;
    private int id;
    private int tipo;
    private int contrasenia;
    

    public Usuario(String nombre, int id, int tipo,int contrasenia){
        this.nombre=nombre;
        this.id=id;
        this.tipo=tipo;
        this.contrasenia=contrasenia;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }   

    public abstract void mostrar();
    
}
