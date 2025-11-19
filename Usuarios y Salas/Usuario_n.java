import java.util.List;
import java.util.LinkedList;

public class Usuario_n extends Usuario implements Notificaciones {
    private List<SalaRoot> salasInscrito;
    
    public Usuario_n(String nombre, int id, int tipo, int contrasenia) {
        super(nombre, id, tipo, contrasenia);
        this.salasInscrito = new LinkedList<>();
    }
    
    public void unirseSalaRoot(){
    
    }
    
    public void salirSala(){
    
    }
    
    @Override
    public void mostrar(){
    
    }
    
    @Override
    public void notificacion(){
        System.out.println();
    }
    
    
}
