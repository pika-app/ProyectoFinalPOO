import java.util.List;
import java.util.LinkedList; 
import java.util.Scanner;
import java.time.LocalDate;

public class AgendaPersonal {
    private List<Nota> notas;
    private List<Tarea> tareas; 
    private Scanner teclado;
    
    public AgendaPersonal(){
        this.notas = new LinkedList<>();
        this.tareas = new LinkedList<>();
        teclado = new Scanner(System.in);
    }
    
    public void verNotas(){
        
        int notaElegir;
        
        System.out.println("Ingrese la nota que desee ver con el numero que esta a su izquierda");
        for(int i=0;i<notas.size();i++){
            System.out.println((i+1)+"-"+notas.get(i).getNombreNota());
        }
        notaElegir=teclado.nextInt(); 
        teclado.nextLine();
        
        System.out.println("Contenido: ");
        System.out.println(notas.get(notaElegir-1).getContenido());
        
    }
    
    public void agregarNota(){
        String titulo, contenido; 
        
        System.out.println("Ingrese el titulo de la nota");
        titulo = teclado.nextLine();
        System.out.println("Ingrese el contenido de la nota");
        contenido= teclado.nextLine();
        
        Nota nuevaNota = new Nota(titulo,contenido);
        notas.add(nuevaNota);   
    }
    
    public void eliminarNota(){
        int notaEliminar;
        
        System.out.println("Ingrese el numero de la nota que desea eliminar");
        for(int i=0;i<notas.size();i++){
            System.out.println((i+1)+"-"+notas.get(i).getNombreNota());
        }
        
        notaEliminar = teclado.nextInt();
        teclado.nextLine();
        
        notas.remove(notaEliminar-1);
        System.out.println("La nota ha sido eliminada");
    }
    
    public void agregarTarea(){
        String nombreTarea,descripcion; 
        double puntajeMaximo;
        int anio,mes,dia;   
        
        System.out.println("Ingrese el titulo de la tarea");
        nombreTarea = teclado.nextLine();
        System.out.println("Ingrese una descripcion de la tarea");
        descripcion = teclado.nextLine();
        System.out.println("Ingrese el puntaje maximo que tendra esta tarea");
        puntajeMaximo = teclado.nextDouble();
        System.out.println("Ingrese el anio de la fecha maxima de entrega");
        anio = teclado.nextInt();
        System.out.println("Ingrese el mes de la fecha maxima de entrega");
        mes = teclado.nextInt();
        System.out.println("Ingrese el dia de la fehca maxima de entrega");
        dia = teclado.nextInt();
        teclado.nextLine();
        
        Tarea nuevaTarea = new Tarea(nombreTarea,puntajeMaximo,-1,descripcion,true,anio,mes,dia);
        tareas.add(nuevaTarea);
        System.out.println("La tarea ha sido aniadida");
    }
    
    public void eliminarTarea(){
        int tareaEliminar;
        
        
        for(int i=0;i<tareas.size();i++){
            System.out.println((i+1)+"-"+tareas.get(i).getNombre());
        }
        System.out.println("Elija la tarea que desee eliminar ingresando el numero que aparece a su izquierda");
        tareaEliminar= teclado.nextInt();
        teclado.nextLine();
        tareas.remove(tareaEliminar-1);
        System.out.println("La tarea ha sido eliminada");
    }
    
    public void verTareas(){
        int indiceTarea;
        Tarea verTarea;
        
        for(int i=0;i<tareas.size();i++){
            System.out.println((i+1)+"-"+tareas.get(i).getNombre());
        }
        
        System.out.println("Elija la tarea que desee ver ingresando el numero que aparece a su izquierda");
        indiceTarea = teclado.nextInt(); 
        
        verTarea = tareas.get(indiceTarea-1); 
        
        System.out.println("Descripcion de la tarea: "+verTarea.getDescripcion());
        System.out.println("Se encuentra activa la tarea?: "+verTarea.getEstado());
        System.out.println("Puntaje maximo de la tarea: "+verTarea.getPuntajeMaximo());
        System.out.println(verTarea.getPuntajeObtenido()==-1? "Aun no ha sido calificada la tarea":"El puntaje de la tarea fue: "+verTarea.getPuntajeObtenido());
        verTarea.mostrarFecha();     
    }
    
    public void calificarTarea(){
        int indiceTarea;
        double calificacion;
        Tarea tareaCalificar;
        LocalDate fechaEntrega;
        
        for(int i=0;i<tareas.size();i++){
            System.out.println((i+1)+"-"+tareas.get(i).getNombre());
        }
        System.out.println("Elija la tarea que desee calificar ingresando el numero que aparece a su izquierda");
        indiceTarea= teclado.nextInt();
        teclado.nextLine();
        
        tareaCalificar = tareas.get(indiceTarea-1);
        fechaEntrega = tareaCalificar.getFechaEntrega();
        
        tareaCalificar.mostrarFecha();
        System.out.println(fechaEntrega.isAfter(LocalDate.now())==true? "La tarea a expirado":"la tarea aun no ha expirado");
        
        System.out.println("Ingrese la calificacion de la tarea");
        calificacion = teclado.nextDouble(); 
        teclado.nextLine();
        tareaCalificar.setPuntajeObtenido(calificacion);
    }
    
}
