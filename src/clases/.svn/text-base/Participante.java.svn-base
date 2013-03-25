package clases;

/**
 * Clase que define a los participantes del proyecto. 
 * @author OnubaSoftware
 */
public class Participante extends Generico
{   
    /**
     * Contiene los atributos que definen a los participantes
     * Tipo indica el tipo de participante :
     * 1- Empleado
     * 2- Cliente
     * 3- Organizacion
     * Nombre, Rol y Comentario son Strings que contienen la informacion
     * que su propio nombre indica de forma implicita.
     */
    
    private int tipo;
    public static final int EMPLEADO=1;
    public static final int CLIENTE=2;
    public static final int ORGANIZACION=3;
    
    
    private String nombre;
    private String rol;
    private String comentario;
    
    /**
     * Constructor de la clase, instancia al objeto.
     */
    public Participante(){
    }

    /**
     * Obtiene el nombre del Participante
     * @return nombre de tipo String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del Participante
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el Rol del participante. El papel que desempeña en relacion con el proyecto.
     * @return Rol de tipo String
     */
    public String getRol() {
        return rol;
    }

    /**
     * Establece el Rol del participante.
     * @param rol String
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Obtiene el comentario del Participante
     * @return Comentario de tipo String
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Establece comentarios sobre el Participante
     * @param comentario String
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Obtiene el tipo del Participante. Puede ser cualquiera de los 3 tipos definidos indicados en los atributos de la clase.
     * @return Tipo entero
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Establece el Tipo de Participante que se va a crear.
     * @param tipo Int
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Sobrecarga de ToString, para que el texto se muestre correctamente en la interfaz.
     * @return Buff de tipo String
     */
    
    @Override
    public String toString()
    {
        String buff;
        if(this.getTipo()==Participante.CLIENTE)
            buff="Cliente: "+this.getNombre();
        else if(this.getTipo()==Participante.EMPLEADO)
            buff="Empleado: "+this.getNombre();
        else
            buff="Organizacion: "+this.getNombre();
        return buff;
    }
}
