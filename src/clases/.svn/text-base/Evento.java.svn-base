package clases;

/**
 * La clase contiene los atributos propios de Pasos y Excepciones.
 * Num_paso es el paso al que esta asociadas las excepcion o el identificador del paso dentro del caso de uso.
 * Tipo indica si es un paso o una excepcion.
 * Descripcion, como su nombre indica, es la descripcion de la situacion durante el paso/Excepcion.
 * @author OnubaSoftware
 */

public class Evento extends Generico
{

    private String Descripcion;
    private int num_paso;
    private boolean tipo;//false indica un paso, true indica excepcion
    private Caso_de_uso pertenece;

    /**
     * Constructor de la clase
     */
    public Evento(){
    }

    /**
     * Obtiene la descripcion del Evento
     * @return Descripcion de tipo String
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * Establece la descripcion para el Evento
     * @param Descripcion String
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * Obtiene el numero asociado al Paso/Excepcion
     * @return num_paso de tipo Entero
     */
    public int getNum_paso() {
        return num_paso;
    }

    /**
     * Establece el numero asociado al Paso/Excepcion
     * @param num_paso int
     */
    public void setNum_paso(int num_paso) {
        this.num_paso = num_paso;
    }

    /**
     * Obtiene el Tipo de objeto que es el Evento
     * @return tipo booleano
     */
    public boolean isTipo() {
        return tipo;
    }

    /**
     * Establece el Tipo de objeto que es el Evento
     * @param tipo boolean
     */
    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Sobrecarga de Tostring para obtener correctamente el nombre del Evento en el JtextPane 
     * @return Buff de tipo String
     */
    
    public String toString()
    {
        return String.valueOf(this.num_paso);
    }

    /**
     * Obtiene a que caso de uso pertenece el paso/Excepcion
     * @return pertenece de tipo Caso_de_Uso
     */
    public Caso_de_uso getPertenece() {
        return pertenece;
    }

    /**
     * Establece el caso de uso al que pertenece el objeto Evento
     * @param pertenece Caso_de_uso
     */
    public void setPertenece(Caso_de_uso pertenece) {
        this.pertenece = pertenece;
    }
    
    /**
     * Metodos de la persistencia para Grabar la informacion, recuperarla, etc etc
     */

}
