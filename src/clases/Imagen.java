/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.File;

/**
 * Clase que contiene la referencia a un fichero.
 * @author OnubaSoftware
 */
public class Imagen extends Generico
{
    private String path;
    private String filename;
    private File fichero;
    
    public Imagen()
    {
    }

    /**
     * Devuelve la ruta canónica (dependiente del SO) del fichero como String.
     * @return Ruta del fichero.
     */
    public String getPath() {
        return path;
    }

    /**
     * Establece la ruta de un fichero.
     * @param path Nueva ruta.
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    @Override
    public String toString()
    {        
        return fichero.getName();
    }

    /**
     * Obtiene el nombre del fichero al que representa la clase.
     * @return Nombre del fichero.
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Establece el nombre del fichero al que representa la clase.
     * @param filename Nuevo nombre.
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * Obtiene el objeto de tipo File que identifica a nuestro fichero.
     * @return Fichero original.
     */
    public File getFichero() {
        return fichero;
    }

    /**
     * Establece el objeto de tipo File que identifica a nuestro fichero.
     * @param fichero Nuevo fichero.
     */
    public void setFichero(File fichero) {
        this.fichero = fichero;
    }
    
}
