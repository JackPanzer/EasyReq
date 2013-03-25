package clases;

import java.io.Serializable;
import java.util.Observable;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.0BC71D3C-0343-7A3C-E5DC-98E03DECEEC6]
// </editor-fold> 
/**
 * Clase de la que heredan todos los elementos. Busca hacer una implementación
 * eficaz del patrón observer para todos los elementos así como definir un
 * mecanismo de <b>rastreabilidad</b> para todos los elementos que lo requieran.
 * @author OnubaSoftware
 */
public class Generico extends Observable implements Serializable{

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BD91F123-054F-FEE0-A084-63B6BB777EF3]
    // </editor-fold> 
    /**
     * Constructor de la clase, instancia al objeto.
     */
    public Generico () {
    }

    /**
     * Notifica al observer que se han realizado cambios sobre un objeto
     * observado y se requisa realizar la acción determinada por el primero.
     */
    public void notificar_observer()
    {
        this.setChanged();
        this.notifyObservers();
    }
}

