package clases;

import java.io.File;
import java.util.ArrayList;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.02ED456B-97B3-19C6-B8A9-2B2726AE7275]
// </editor-fold> 
/**
 * Clase principal de la aplicación. Contiene toda la información que el usuario
 * va guardando dentro de ella para su posterior tratamiento, si bien con jdbc,
 * con algún otro mecanismo de persistencia.
 * @author OnubaSoftware
 */
public class Documento
{   
    /**
     * Lista de casos de uso del sistema.
     */
    private ArrayList<Caso_de_uso> CasosDeUso;
    /**
     * Lista de requisitos creados del sistema.
     */
    private ArrayList<Requisito> req_creado;
    /**
     * Lista de participantes creados del sistema.
     */
    private ArrayList<Participante> Part_creados;
    /**
     * Lista de objetivos del sistema creados.
     */
    private ArrayList<Objetivo> Obj_creados;
    /**
     * Lista de reuniones creadas del sistema.
     */
    private ArrayList<Reunion> Reu_creados;
    /**
     * Lista de imágenes archivadas en el proyecto.
     */
    private ArrayList<Imagen> Imagenes;
    /**
     * Lista de párrafos de texto archivados en el proyecto.
     */
    private ArrayList<Parrafo> Parrafos;
    /**
     * Lista de términos de glosario del proyecto.
     */
    private ArrayList<Glosario> Glosario;
    /**
     * Lista de apéndices creados en el proyecto.
     */
    private ArrayList<Apendice> Apendice;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EE20F989-A52E-C286-510E-C924335743DD]
    // </editor-fold> 
    /**
     * Constructor de la clase. Se encarga de inicializar todas las listas.
     */
    public Documento () 
    {
        this.CasosDeUso=new ArrayList<Caso_de_uso>();
        this.req_creado=new ArrayList<Requisito>();
        this.Part_creados=new ArrayList<Participante>();
        this.Obj_creados=new ArrayList<Objetivo>();
        this.Reu_creados=new ArrayList<Reunion>();
        this.Imagenes=new ArrayList<Imagen>();
        this.Apendice=new ArrayList<Apendice>();
        this.Glosario=new ArrayList<Glosario>();
        this.Parrafos=new ArrayList<Parrafo>();
    }

    /**
     * Obtiene los casos de uso del sistema.
     * @return Lista de casos de uso.
     */
    public ArrayList<Caso_de_uso> getCasosDeUso() {
        return CasosDeUso;
    }

    /**
     * Establece los casos de uso del sistema.
     * @param CasosDeUso Lista de casos de uso.
     */
    public void setCasosDeUso(ArrayList<Caso_de_uso> CasosDeUso) {
        this.setCasosDeUso(CasosDeUso);
    }

    /**
     * Añade un nuevo caso de uso a la lista.
     * @param cu Caso de uso
     */
    public void Crear_CU(Caso_de_uso cu)
    {
        this.getCasosDeUso().add(cu);
    }

    /**
     * Obtiene la lista de requisitos creados en el proyecto.
     * @return Lista de requisitos, tanto funcionales como no funcionales.
     */
    public ArrayList<Requisito> getReq_creado() {
        return req_creado;
    }

    /**
     * Establece la lista de requisitos creados en el proyecto.
     * @param req_creado Lista de requisitos, tanto funcionales como no funcionales.
     */
    public void setReq_creado(ArrayList<Requisito> req_creado) {
        this.setReq_creado(req_creado);
    }

    /**
     * Crea un nuevo requisito y lo añade a la lista de requisitos del proyecto.
     * @param req Nuevo requisito funcional/no funcional.
     */
    public void Crear_Req(Requisito req)
    {
        this.getReq_creado().add(req);
    }
    
    /**
     * Crea un nuevo objetivo del sistema y lo añade a la lista de objetivos
     * del proyecto.
     * @param o Nuevo objetivo del sistema
     */
    public void Crear_Objetivo(Objetivo o)
    {
        this.getObj_creados().add(o);
    }
    
    /**
     * Crea un nuevo apéndice y lo añade a la lista de apéndices del proyecto.
     * @param A Nuevo apéndice/sección
     */
    public void Crear_Apendice(Apendice A)
    {
        this.getApendice().add(A);
        System.out.println("Apendice :"+A.getNombre());
        if(A.isTipo()==false){
            System.out.println("Es una Seccion");
        }else{
            System.out.println("Es un apendice ");
        }
        System.out.println("Comentario : "+ A.getComentario());
        
    }
    
    /**
     * Devuelve la lista de objetivos del sistema creados en el proyecto.
     * @return Lista de objetivos del sistema.
     */
    public ArrayList<Objetivo> getObj_creados() {
        return Obj_creados;
    }

    /**
     * Establece la lista de objetivos del sistema.
     * @param Obj_creados Nueva lista de objetivos del sistema.
     */
    public void setObj_creados(ArrayList<Objetivo> Obj_creados) {
        this.setObj_creados(Obj_creados);
    }
    
    /**
     * Añade un nuevo participante a la lista de participantes del proyecto.
     * @param p Nuevo participante.
     */
    public void Crear_Participante(Participante p)
    {
        this.getPart_creados().add(p);
    }

    /**
     * Obtiene la lista de participantes creados del proyecto.
     * @return Lista de participantes del proyecto.
     */
    public ArrayList<Participante> getPart_creados() {
        return Part_creados;
    }

    /**
     * Establece la lista de participantes creados del proyecto.
     * @param Part_creados Lista de participantes.
     */
    public void setPart_creados(ArrayList<Participante> Part_creados) {
        this.setPart_creados(Part_creados);
    }

    /*public void Agregar_Evt()
    {
        
    }*/

    /**
     * Añade una nueva reunión a la lista de reuniones del proyecto.
     * @param re Nueva reunión.
     */
    public void Crear_Reunion(Reunion re) {
        this.getReu_creados().add(re);
    }

    /**
     * Obtiene la lista de archivos gráficos insertados en el proyecto.
     * @return Lista con todas las imágenes del proyecto.
     */
    public ArrayList<Imagen> getImagenes() {
        return Imagenes;
    }

    /**
     * Establece la lista de archivos gráficos insertados en el proyecto.
     * @param Imagenes Lista de imágenes.
     */
    public void setImagenes(ArrayList<File> Imagenes) {
        this.setImagenes(Imagenes);
    }

    /**
     * Añade una imagen a la lista de imágenes del proyecto.
     * @param f Nueva imagen.
     */
    public void Añadir_imagen(Imagen f)
    {
        this.getImagenes().add(f);
    }

    /**
     * Devuelve la lista de reuniones creadas del proyecto.
     * @return Lista de reuniones.
     */
    public ArrayList<Reunion> getReu_creados() {
        return Reu_creados;
    }

    /**
     * Establece la lista de reuniones creadas del proyecto.
     * @param Reu_creados Lista de reuniones.
     */
    public void setReu_creados(ArrayList<Reunion> Reu_creados) {
        this.Reu_creados = Reu_creados;
    }

    /**
     * Devuelve la lista de párrados del proyecto.
     * @return Lista de párrafos.
     */
    public ArrayList<Parrafo> getParrafos() {
        return Parrafos;
    }

    /**
     * Establece la lista de párrafos del proyecto.
     * @param Parrafos Lista de párrafos.
     */
    public void setParrafos(ArrayList<Parrafo> Parrafos) {
        this.Parrafos = Parrafos;
    }

    /**
     * Devuelve la lista de términos de glosario del proyecto.
     * @return Lista de glosarios.
     */
    public ArrayList<Glosario> getGlosario() {
        return Glosario;
    }

    /**
     * Establece la lista de términos de glosario del proyecto.
     * @param Glosario Lista de términos.
     */
    public void setGlosario(ArrayList<Glosario> Glosario) {
        this.Glosario = Glosario;
    }
    
    /**
     * Añade un nuevo término de glosario al proyecto.
     * @param g Nuevo término.
     */
    public void Añadir_Glosario(Glosario g)
    {
        this.Glosario.add(g);
    }
    
    /**
     * Añade un nuevo párrafo al proyecto.
     * @param p Nuevo párrafo.
     */
    public void Añadir_Parrafo(Parrafo p)
    {
        this.Parrafos.add(p);
    }

    /**
     * Obtiene una lista de apéndices/secciones del proyecto.
     * @return Lista de apéndices.
     */
    public ArrayList<Apendice> getApendice() {
        return Apendice;
    }

    /**
     * Establece la lista de apéndices/secciones del proyecto.
     * @param Apendice Lista de apéndices.
     */
    public void setApendice(ArrayList<Apendice> Apendice) {
        this.setApendice(Apendice);
    }
    
    public void Eliminar(Object o)
    {
        this.Apendice.remove(o);
        this.CasosDeUso.remove(o);
        this.Glosario.remove(o);
        this.Imagenes.remove(o);
        this.Obj_creados.remove(o);
        this.Parrafos.remove(o);
        this.Part_creados.remove(o);
        this.Reu_creados.remove(o);
        this.req_creado.remove(o);
    }

    public void Vaciar_documento()
    {
        this.Apendice.clear();
        this.CasosDeUso.clear();
        this.Glosario.clear();
        this.Imagenes.clear();
        this.Obj_creados.clear();
        this.Parrafos.clear();
        this.Part_creados.clear();
        this.Reu_creados.clear();
        this.req_creado.clear();
    }

    /**
     * Indica el número de objetos totales contenidos en el documento.
     * @return Número de objetos creados hasta la llamada al método.
     */
    public int elementos_totales()
    {
        int total = 0;

        total += this.Apendice.size();
        total += this.CasosDeUso.size();
        total += this.Glosario.size();
        total += this.Imagenes.size();
        total += this.Obj_creados.size();
        total += this.Parrafos.size();
        total += this.Part_creados.size();
        total += this.Reu_creados.size();
        total += this.req_creado.size();

        return total;
    }

}

