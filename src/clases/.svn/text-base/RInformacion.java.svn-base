package clases;

import java.util.ArrayList;

/**
 *Clase que define los requisitos de informacion. Contiene el tiempo de Vida, el tiempo Ocupado y los datos especificos del requisito.
 * @author OnubaSoftware
 */
public class RInformacion extends Requisito
{
    private ArrayList<String> Datos_esp;
    private String Tv_unidad;
    private String Tv_cantidad;
    private String Tocu_cantidad;
    private String Tocu_unidad;
    private boolean tipo;
    
    /**
     * Constructor de los requisitos de Informacion. Se inicializa el ArraayList de Datos especificos.
     */
    public RInformacion()
    {
        this.Datos_esp=new ArrayList<String>();
    }

    /**Obtiene los datos especificos asociados a los Requisitos de Informacion
     * @return Datos_esp de tipo Array_List
     */
    public ArrayList<String> getDatos_esp() {
        return Datos_esp;
    }

    /**
     * Establece los datos especificos de los Requisitos de Informacion
     * @param Datos_esp ArrayList
     */
    public void setDatos_esp(ArrayList<String> Datos_esp) {
        this.Datos_esp = Datos_esp;
    }

    /**
     * Obtiene el tiempo de Vida del Requisito de Informacion
     * @return Tv_unidad de tipo String
     */
    public String getTv_unidad() {
        return Tv_unidad;
    }

    /**
     * Establece el tiempo de Vida del Requisito de Informacion
     * @param Tv_unidad String
     */
    public void setTv_unidad(String Tv_unidad) {
        this.Tv_unidad = Tv_unidad;
    }

    /**
     * Obtiene la cantidad del Tv requisito (dias, mes.. etc)
     * @return  Tv_cantidad de tipo String
     */
    public String getTv_cantidad() {
        return Tv_cantidad;
    }

    /**
     * Establece la cantidad del TV requisito (dias, mes.. etc)
     * @param Tv_cantidad String
     */
    public void setTv_cantidad(String Tv_cantidad) {
        this.Tv_cantidad = Tv_cantidad;
    }

    /**
     * Obtiene la cantidad del Tiempo ocupado del requisito (dias, mes.. etc)
     * @return Tocu_cantidad de tipo String
     */
    public String getTocu_cantidad() {
        return Tocu_cantidad;
    }

    /**
     * Establece la cantidad del Tiempo ocupado del requisito (dias, mes.. etc)
     * @param Tocu_cantidad String
     */
    public void setTocu_cantidad(String Tocu_cantidad) {
        this.Tocu_cantidad = Tocu_cantidad;
    }

    /**
     * Obtiene el tiempo ocupado del Requisito
     * @return Tocu_unidad de tipo String
     */
    public String getTocu_unidad() {
        return Tocu_unidad;
    }

    /**
     * Establece el tiempo ocupado del Requisito
     * @param Tocu_unidad String
     */
    public void setTocu_unidad(String Tocu_unidad) {
        this.Tocu_unidad = Tocu_unidad;
    }

    /**
     * Obtiene el tipo del Requisito
     * @return tipo boolean
     */
    public boolean isTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del Requisito
     * @param tipo boolean
     */
    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    /**
     * Sobrecarga de Tostring para obtener correctamente el nombre del requisito y el tipo 
     * @return Buff de tipo String
     */
    
    public String toString()
    {
        String buff;
        if(this.isTipo()) buff=this.getNombre()+"-->Relacionado_Informacion";
        else buff=this.getNombre()+"-->Relacionado_Arquitectura";
        return buff;
    }
}
