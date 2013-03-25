package clases;

import java.util.ArrayList;

/**
 *@author OnubaSoftware
 * Clase apendice, que contiene todos los atributos necesarios para guardar la informacion
 * de los Apendices.
 */
public class Apendice extends Generico {
    /**
     * Contiene un String para guardar el nombre, una variable Tipo que indica si es un apendice o Seccion
     * Un participante que es el Autor del Apendice/seccion y un Arraylist que contiene una lista de los
     * elementos que estan en su interior.
     */
    
    private String Nombre;
    private boolean Tipo;
    private String Comentario;
    private Participante Autor;
    private ArrayList <Generico> listadehijos;
    
    /**
     * Constructor de la clase, instancia al objeto.
     */
    public Apendice(){
        
    }
    
    /**
     * Obtiene el nombre
     * @return Nombre de Tipo String
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Establece el nombre de nuestra seccion/apendice
     * @param Nombre String
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Devuelve el Tipo del objeto
     * @return Tipo en Booleano
     */
    public boolean isTipo() {
        return Tipo;
    }

    /**
     * Establece el Tipo del objeto
     * @param Tipo boolean
     */
    public void setTipo(boolean Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * Obtiene el comentario
     * @return Comentario de tipo String
     */
    public String getComentario() {
        return Comentario;
    }

    /**
     * Establece el contenido del Comentario
     * @param Comentario String
     */
    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    /**
     * Devuelve el Autor del Apendice/Seccion
     * @return Autor de tipo Participante
     */
    public Participante getAutor() {
        return Autor;
    }

    /**
     * Establece el autor del Apendice/seccion
     * @param Autor Participante
     */
    public void setAutor(Participante Autor) {
        this.Autor = Autor;
    }
    
    /**
     * Sobrecarga del Metodo ToString para que en el JTextpane se muestre correctamente el nombre.
     * @return Buff de tipo String
     */
    
    @Override
    public String toString()
    {
        String buff;
        if(this.isTipo()){
            buff="Apendice: "+this.getNombre();
            return buff;
        }else{
            buff="Seccion: "+this.getNombre();
            return buff;
        }
    }
        
}
