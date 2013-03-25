package clases;

import java.util.ArrayList;
import java.util.List;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.0D69041C-3448-84F2-6B42-794E829B7E95]
// </editor-fold> 
/**
 * Caso de uso estándar de la aplicación. Contiene una serie de <b>Eventos</b> para
 * indicar la secuencia que sigue el caso de uso.
 * @author OnubaSoftware
 * @see Evento
 */
public class Caso_de_uso extends Generico{

    /**
     * Lista de pasos que tendrá el caso de uso.
     */
    private List<Evento> Pasos=new ArrayList<Evento>();
    /**
     * Lista de excepciones que tendrá el caso de uso.
     */
    private List<Evento> Excepciones=new ArrayList<Evento>();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.277185CA-D4CC-47D8-3BBE-8A607BFECD49]
    // </editor-fold> 
    /**
     * Nombre que tendrá el caso de uso en el documento.
     */
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CE0E9288-8488-F6B4-8D3E-FEFE6C8B4E48]
    // </editor-fold> 
    /**
     * Número de veces que se ejecutará el caso de uso cada una determinada
     * unidad de tiempo.
     */
    private String frecuencia;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F80B35BC-FFBC-EDA4-E1A1-84B7CF606DC6]
    // </editor-fold> 
    /**
     * Unidad de tiempo en la que se produce la/s llamada/s al caso de uso.
     */
    private String unidad;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C5DDF355-AF96-648D-A8DD-5C8A28770537]
    // </editor-fold> 
    /**
     * Descripción de lo que realiza el caso de uso.
     */
    private String detalle;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.58931B96-F6C7-4284-FF37-3DBAED5D4C54]
    // </editor-fold> 
    /**
     * Variable que determina si el caso de uso es abstracto.
     */
    private boolean abstracto;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3C1FFA1E-0BDB-B73C-4F28-F9EA988D849D]
    // </editor-fold> 
    /**
     * Evento de activación del caso de uso.
     */
    private String evento;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E6699EA6-A8B0-6664-2D71-F3F72EDAA2BF]
    // </editor-fold> 
    /**
     * Condición necesaria para que el caso de uso llegue a ejecutarse.
     */
    private String precondicion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8A06E1BA-9FE4-F25B-78C6-B18B91DE1F10]
    // </editor-fold> 
    /**
     * Estado en el que quedará el sistema tras la ejecución del caso de uso.
     */
    private String postcondicion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EE0799C0-EEB8-11A0-B733-221C5F199C3A]
    // </editor-fold> 
    /**
     * Observaciones varias sobre el caso de uso.
     */
    private String comentario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.64857F87-47CA-6BAD-B5EE-AC4869E2BD96]
    // </editor-fold> 
    /**
     * Prioridad del caso de uso durante la fase de inicio.
     */
    private String PriInicio;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A97F347D-44DB-5B98-DE06-C711AFEE0714]
    // </editor-fold> 
    /**
     * Prioridad del caso de uso durante la fase de elaboración.
     */
    private String PriElaboracion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ADB51FA2-0177-753F-339C-3D5BD186903F]
    // </editor-fold> 
    /**
     * Prioridad del caso de uso durante la fase de construcción.
     */
    private String PriConstruccion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DAD8A337-5A52-8C0B-F5B7-E90F9A98AFAC]
    // </editor-fold> 
    /**
     * Constructor de la clase.
     */
    public Caso_de_uso () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.87FED3C8-7F0C-E2B4-E7F8-542EBEE847C2]
    // </editor-fold> 
    /**
     * Obtiene la prioridad del caso de uso durante la fase de construcción.
     * @return Prioridad durante la fase de construcción.
     */
    public String getPriConstruccion () {
        return PriConstruccion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2A2BE210-4B23-44C8-182B-AA33DB9F5CC2]
    // </editor-fold> 
    /**
     * Establece la prioridad del caso de uso durante la fase de construcción.
     * @param val Valor de la prioridad durante la fase de construcción.
     */    
    public void setPriConstruccion (String val) {
        this.PriConstruccion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D3EB443D-7B43-A469-1F91-31703E3BB876]
    // </editor-fold> 
    /**
     * Obtiene la prioridad del caso de uso durante la fase de elaboración.
     * @return Prioridad durante la fase de elaboración.
     */
    public String getPriElaboracion () {
        return PriElaboracion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.17105502-28BB-9B74-932D-91FC8C775FB3]
    // </editor-fold> 
    /**
     * Establece la prioridad del caso de uso durante la fase de elaboración.
     * @param val Valor de la prioridad durante la fase de elaboración.
     */ 
    public void setPriElaboracion (String val) {
        this.PriElaboracion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D07946A5-1BD4-187B-D878-C70D49AB85A4]
    // </editor-fold> 
    /**
     * Obtiene la prioridad del caso de uso durante la fase de inicio.
     * @return Prioridad durante la fase de inicio.
     */
    public String getPriInicio () {
        return PriInicio;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B66B1726-8D06-7549-7575-F783AC84ECB1]
    // </editor-fold> 
    /**
     * Establece la prioridad del caso de uso durante la fase de inicio.
     * @param val Valor de la prioridad durante la fase de inicio.
     */ 
    public void setPriInicio (String val) {
        this.PriInicio = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E52716FF-1444-E2DE-4FB1-710A96B79F4D]
    // </editor-fold> 
    /**
     * Obtiene si el caso de uso es abstracto.
     * @return Verdadero o falso.
     */
    public boolean getAbstracto () {
        return abstracto;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C027D23B-700C-419F-C40F-FD691002BC7A]
    // </editor-fold> 
    /**
     * Establece la abstracción del caso de uso.
     * @param val Verdadero o falso.
     */
    public void setAbstracto (boolean val) {
        this.abstracto = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AEC57953-BF87-622C-83B7-40E480EFB927]
    // </editor-fold> 
    /**
     * Obtiene las observaciones del caso de uso.
     * @return Devuelve dichas observaciones.
     */
    public String getComentario () {
        return comentario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.33537B12-8605-139A-812F-40BAA638215B]
    // </editor-fold> 
    /**
     * Establece las observaciones del caso de uso.
     * @param val Variable que contiene las observaciones.
     */
    public void setComentario (String val) {
        this.comentario = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.69628317-BA97-D9FD-8DC5-251702A63474]
    // </editor-fold> 
    /**
     * Devuelve una descripción detallada de lo que hace el caso de uso.
     * @return Descripción del caso de uso.
     */
    public String getDetalle () {
        return detalle;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FB9BC601-917E-6C64-E9F2-91098AA25CBB]
    // </editor-fold> 
    /**
     * Establece una descripción detallada de lo que hace el caso de uso.
     * @param val Detalle del caso de uso.
     */
    public void setDetalle (String val) {
        this.detalle = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9C7AD422-328A-46FB-86B4-18521F2103DE]
    // </editor-fold> 
    /**
     * Devuelve el evento de activación para que se ejecute el caso de uso.
     * @return Evento de activación.
     */
    public String getEvento () {
        return evento;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2AC32EC0-C3A8-EA31-7BCC-D19ECE38873E]
    // </editor-fold> 
    /**
     * Establece el evento de activación para que se ejecute el caso de uso.
     * @param val Evento de activación.
     */
    public void setEvento (String val) {
        this.evento = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BF01D44B-3238-324A-F6C1-F45C20DD3E27]
    // </editor-fold> 
    /**
     * Devuelve la frecuencia de activación del caso de uso.
     * @return Frecuencia de activación.
     */
    public String getFrecuencia () {
        return frecuencia;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C5C05DCB-AE17-E3C1-714D-59189154EFCA]
    // </editor-fold> 
    /**
     * Establece la frecuencia de activación del caso de uso.
     * @param val Frecuencia de activación.
     */
    public void setFrecuencia (String val) {
        this.frecuencia = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EAC96773-9302-3B5E-DB5B-E7EBE4092F1E]
    // </editor-fold> 
    /**
     * Devuelve el nombre del caso de uso.
     * @return Nombre del caso de uso.
     */
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.52271AA2-4124-3DEC-E1FC-C9EFCE39674F]
    // </editor-fold> 
    /**
     * Establece el nombre del caso de uso.
     * @param val Nombre del caso de uso.
     */
    public void setNombre (String val) {
        this.nombre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2782E603-DCE3-B441-57DB-62A4FD49EDBA]
    // </editor-fold> 
    /**
     * Obtiene el estado en el que quedará el sistema tras la ejecución de este
     * caso de uso.
     * @return Postcondición al caso de uso.
     */
    public String getPostcondicion () {
        return postcondicion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F9B8F3EC-3474-61B7-A3E1-658CBF252CCD]
    // </editor-fold> 
    /**
     * Establece el estado en el que quedará el sistema tras la ejecución de este
     * caso de uso.
     * @param val Postcondición al caso de uso.
     */
    public void setPostcondicion (String val) {
        this.postcondicion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A38BFAC0-AB27-BBAE-0031-AB07566C9C42]
    // </editor-fold> 
    /**
     * Obtiene la condición que debe cumplir el sistema para ejecutar el caso
     * de uso.
     * @return Precondición al caso de uso. 
     */
    public String getPrecondicion () {
        return precondicion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.235DE348-FC9B-C95A-E5B4-16B13FA2B945]
    // </editor-fold> 
    /**
     * Establece la condición que debe cumplir el sistema para ejecutar el caso
     * de uso.
     * @param val Precondición al caso de uso.
     */
    public void setPrecondicion (String val) {
        this.precondicion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D41299A9-6C35-70AB-D85D-9057C3C5156F]
    // </editor-fold> 
    /**
     * Obtiene la unidad de tiempo en el que el caso de uso se ejecuta un número
     * de veces determinado por la <b>frecuencia</b>.
     * @return Unidad de tiempo.
     */
    public String getUnidad () {
        return unidad;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8AA72907-BAD7-4BAE-05D3-4CCCEFD82A3F]
    // </editor-fold> 
    /**
     * Establece la unidad de tiempo en el que el caso de uso se ejecuta un
     * número de veces determinado por la <b>frecuencia</b>.
     * @param val Unidad de tiempo
     */
    public void setUnidad (String val) {
        this.unidad = val;
    }

    @Override
    public String toString()
    {
        return this.nombre;
    }

    /**
     * Obtiene la lista de <b>Eventos</b> que realizan la función de pasos en
     * el caso de uso.
     * @return Lista de pasos del CU.
     * @see Evento
     */
    public ArrayList<Evento> getPasos() {
        return (ArrayList<Evento>)Pasos;
    }

    /**
     * Establece la lista de <b>Eventos</b> que realizan la función de pasos
     * en el caso de uso.
     * @param Pasos Lista de pasos del CU.
     * @see Evento
     */
    public void setPasos(ArrayList<Evento> Pasos) {
        this.Pasos = Pasos;
    }

    /**
     * Obtiene la lista de <b>Eventos</b> que realizan la función de excepciones
     * en el caso de uso.
     * @return Lista de excepciones del CU.
     * @see Evento
     */
    public ArrayList<Evento> getExcepciones() {
        return (ArrayList<Evento>)Excepciones;
    }

    /**
     * Establece la lista de <b>Eventos</b> que realizan la función de excepciones
     * en el caso de uso.
     * @param Excepciones Lista de excepciones del CU.
     * @see Evento
     */
    public void setExcepciones(ArrayList<Evento> Excepciones) {
        this.Excepciones = Excepciones;
    }

    /**
     * Añade nuevo paso a la lista de pasos del CU.
     * @param aux Nuevo paso.
     */
    public void nuevo_Paso(Evento aux)
    {
        this.Pasos.add(aux);
    }

    /**
     * Añade nueva excepción a la lista de excepciones del CU.
     * @param aux Nueva excepción.
     */
    public void nuevaExcepcion(Evento aux)
    {
        this.Excepciones.add(aux);
    }

}

