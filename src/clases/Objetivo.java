package clases;

/**
 * Establece un objetivo del sistema en el proyecto.
 * @author OnubaSoftware
 */
public class Objetivo extends Generico
{
    private String Nombre;
    private String Importancia;
    private String Urgencia;
    private String Estado;
    private String Estabilidad;
    private String Descripcion;
    private String Comentarios;
    
    /**
     * Obtiene el nombre otorgado al objetivo del sistema.
     * @return Nombre del objetivo del sistema.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Establece el nombre al objetivo del sistema.
     * @param Nombre Nuevo nombre del objetivo del sistema.
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Obtiene la importancia establecida al objetivo del sistema.
     * @return Improtancia del objetivo.
     */
    public String getImportancia() {
        return Importancia;
    }

    /**
     * Establece la importacia dada al objetivo del sistema.
     * @param Importancia Nueva importancia para el objetivo.
     */
    public void setImportancia(String Importancia) {
        this.Importancia = Importancia;
    }

    /**
     * Obtiene la urgencia establecida al objetivo del sistema.
     * @return Urgencia del objetivo.
     */
    public String getUrgencia() {
        return Urgencia;
    }

    /**
     * Establece la urgencia del objetivo del sistema.
     * @param Urgencia Nueva urgencia del objetivo del sistema.
     */
    public void setUrgencia(String Urgencia) {
        this.Urgencia = Urgencia;
    }

    /**
     * Obtiene el estado de desarrollo del objetivo del sistema.
     * @return Estado de desarrollo del objetivo.
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * Establece el estado de desarrollo del objetivo del sistema.
     * @param Estado Nuevo estado de desarrollo del sistema.
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * Obtiene la estabilidad del objetivo del sistema.
     * @return Estabilidad del objetivo.
     */
    public String getEstabilidad() {
        return Estabilidad;
    }

    /**
     * Establece la estabilidad del objetivo del sistema.
     * @param Estabilidad Nueva estabilidad del objetivo.
     */
    public void setEstabilidad(String Estabilidad) {
        this.Estabilidad = Estabilidad;
    }

    /**
     * Obtiene la descripción del objetivo del sistema.
     * @return Descripción del objetivo del sistema.
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * Establece una descripción al objetivo del sistema.
     * @param Descripcion Nueva descripción.
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * Obtiene los comentarios relacionados con el objetivo del sistema.
     * @return Comentarios del objetivo.
     */
    public String getComentarios() {
        return Comentarios;
    }

    /**
     * Establece los comentarios del objetivo del sistema.
     * @param Comentarios Nuevos comentarios.
     */
    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }
    
     @Override
    public String toString()
    {
        String buff;
        buff="Objetivo: "+this.getNombre();
        return buff;
    }


}
