package clases;

/**
 * Clase que define el elemento Glosario. 
 * @author OnubaSoftware
 */
public class Glosario extends Generico
{   /**
     * Contiene los atributos que componen un Glosario. Antecesor es un atribuo que contiene el Nodo
     * Padre del que cuelga el objeto Glosario creado.
     */
    private String Nombre;
    private String Descripcion;
    private String Palabra;
    private Apendice Antecesor; //String para guardar el Padre, que solo sera de tipo Antecesor. 
    
    /**
     * Constructor de la clase, instancia al objeto.
     */
    public Glosario(){
        
    }
    
    /**Obtiene el nombre del Glosario
     * @return Nombre de tipo String
     */
    public String getNombre() {
        return Nombre;
    }

    /**Establece el nombre del glosario
     * @param Nombre String
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Obtiene la descripcion del Glosario
     * @return Descripcion de tipo String
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * Establece la descripcion del Glosario
     * @param Descripcion String
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * Obtiene la Palabra descrita en el Glosario
     * @return palabra de tipo String
     */
    public String getPalabra() {
        return Palabra;
    }

    /**
     * Establece la Palabra a definir en el Glosario
     * @param palabra String
     */
    public void setPalabra(String palabra) {
        this.Palabra = palabra;
    }
    
    /**
     * Sobrecarga de Tostring para obtener correctamente el Glosario en el JtextPane 
     * @return Buff de tipo String
     */
    
    @Override
    public String toString()
    {
        String buff;
        buff="Glosario: "+this.getPalabra();
        return buff;
    }

    /**
     * Obtiene el Antecesor del cual cuelga nuestro glosario.
     * Pensado para saber a donde pertenece el objeto para implementaciones futuras.
     * @return Antecesor de tipo Apendice
     */
    public Apendice getAntecesor() {
        return Antecesor;
    }

    /**
     * Establece el Antecesor de nuestro Glosario
     * @param Antecesor Apendice
     */
    public void setAntecesor(Apendice Antecesor) {
        this.Antecesor = Antecesor;
    }
    
    
}
