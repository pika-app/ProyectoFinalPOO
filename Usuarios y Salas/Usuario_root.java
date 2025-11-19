import java.util.List;
import java.util.LinkedList; 

public class Usuario_root extends Usuario{
    private List<SalaRoot> salasRoot; 
    
    public Usuario_root(String nombre, int id, int tipo, int contrasenia) {
        super(nombre, id, tipo, contrasenia);
        this.salasRoot = new LinkedList<>();
    }
    
    public void crearSala(){
    
    }
    
    public void eliminarSala(){
    
    }
    
    @Override
    public void mostrar(){
        
    }
    
    
    
    
}
