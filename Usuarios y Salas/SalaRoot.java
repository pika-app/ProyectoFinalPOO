import java.util.List;
import java.util.LinkedList; 
import java.util.Scanner; 

public class SalaRoot {
    private String nombreSala; 
    private String contraseniaSala; 
    private Usuario_root administradorSala;
    private List<Usuario_n> usuariosInscritos;
    private List<Nota> comunicados;
    private List<Recompensa> recompensas; 
    private List<Actividad> actividades;
    private Scanner teclado;
    
    public SalaRoot(String nombreSala,String contraseniaSala, Usuario_root administradorSala){
        this.nombreSala = nombreSala;
        this.contraseniaSala = contraseniaSala;
        this.administradorSala = administradorSala;
        this.usuariosInscritos = new LinkedList<>();
        this.comunicados = new LinkedList<>();
        this.recompensas = new LinkedList<>();
        this.actividades = new LinkedList<>();
        this.teclado = new Scanner(System.in);
    }
    
    public void verUsuarios(){
        
    }
}
