package clases;

/**
 * Clase que define los requisitos funcionales.
 * Hereda de Requisitos los atributos comunes a Requisitos de informacion, 
 * @author OnubaSoftware
 */
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.6892E6EF-A2CB-6039-FC94-5FAA4987E08E]
// </editor-fold> 
public class RFuncional extends Requisito
{
    /**
     * Variable Tipo para diferenciar los objetos entre si cuando se consulten a traves de la clase padre.
     */
    private Boolean tipo;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A3283368-9C29-FACE-C0D6-90AC2A5440B9]
    // </editor-fold> 
    /**
     * Constructor de la Clase
     */
    
    public RFuncional () 
    {
        
    }

    /**
     * Obtiene el tipo del Requisito
     * @return tipo boolean
     */
    public Boolean getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del Requisito
     * @param tipo boolean
     */
    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Sobrecarga de Tostring para obtener correctamente el nombre del requisito y el tipo 
     * @return Buff de tipo String
     */
    
    public String toString()
    {
        String buff;
        if(this.getTipo()) buff=this.getNombre()+"-->Req_Funcional";
        else buff=this.getNombre()+"-->Req_No_funcional";
        return buff;
    }
}

