/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author OnubaSoftware
 */
public class XMLParser
{
    public static Element setString(String str, Document doc)
    {
        System.out.println("Nombre de carpeta: " + str);

        Element elm = doc.createElement("Carpeta");
        Element valor = doc.createElement("valor");
        valor.appendChild(doc.createTextNode(str));

        elm.appendChild(valor);
        return elm;
    }
    public static Element setRecFun(RFuncional rf, Document doc)
    {
        System.out.println("Requisito de funcionalidad: " + rf.toString());

        Element nodo = doc.createElement("Objeto");
        Element elm = doc.createElement("tipo");

        if(rf.getTipo())
        {
            elm.appendChild(doc.createTextNode("Req_Funcional"));
        }
        else
        {
            elm.appendChild(doc.createTextNode("Req_N_Funcional"));
        }

        nodo.appendChild(elm);

        Element nombre = doc.createElement("nombre");
        Element descripcion = doc.createElement("descripcion");
        Element version = doc.createElement("version");
        Element importancia = doc.createElement("importancia");
        Element urgencia = doc.createElement("urgencia");
        Element estado = doc.createElement("estado");
        Element estabilidad = doc.createElement("estabilidad");
        Element comentario = doc.createElement("comentario");
        Element dependencia = doc.createElement("dependencia");

        Text dNombre = doc.createTextNode(rf.getNombre());
        Text dDescripcion;

        if(rf.getDescripcion().equals(""))
            dDescripcion = doc.createTextNode("PD");
        else
            dDescripcion = doc.createTextNode(rf.getDescripcion());

        Text dVersion = doc.createTextNode("");
        if(rf.getVersion().equals(""))
            dVersion = doc.createTextNode("PD");
        else
            dVersion = doc.createTextNode(rf.getVersion());

        Text dImportancia = doc.createTextNode("");
        if(rf.getImportancia().equals(""))
            dImportancia = doc.createTextNode("PD");
        else
            dImportancia = doc.createTextNode(rf.getImportancia());

        Text dUrgencia = doc.createTextNode("");
        if(rf.getUrgencia().equals(""))
            dUrgencia = doc.createTextNode("PD");
        else
            dUrgencia = doc.createTextNode(rf.getUrgencia());

        Text dEstado = doc.createTextNode("");
        if(rf.getEstado().equals(""))
            dEstado = doc.createTextNode("PD");
        else
            dEstado = doc.createTextNode(rf.getEstado());

        Text dEstabilidad = doc.createTextNode("");
        if(rf.getEstabilidad().equals(""))
            dEstabilidad = doc.createTextNode("PD");
        else
            dEstabilidad = doc.createTextNode(rf.getEstabilidad());

        Text dComentario = doc.createTextNode("");
        if(rf.getComentario().equals(""))
            dComentario = doc.createTextNode("PD");
        else
            dComentario = doc.createTextNode(rf.getComentario());

        ArrayList<String> datosDep = rf.getDependencia();
        Element sDependencia;
        Element tDependencia;

        if (datosDep.isEmpty())
        {
            sDependencia = doc.createElement("RFDep");
            tDependencia = doc.createElement("valor");
            tDependencia.appendChild(doc.createTextNode("PD"));
            sDependencia.appendChild(tDependencia);
            dependencia.appendChild(sDependencia);
        }
        else
        {
            for(int i = 0; i < datosDep.size(); i++)
            {
                sDependencia = doc.createElement("RFDep");
                tDependencia = doc.createElement("valor");
                tDependencia.appendChild(doc.createTextNode(datosDep.get(i)));
                sDependencia.appendChild(tDependencia);
                dependencia.appendChild(sDependencia);
            }
        }

        nombre.appendChild(dNombre);
        version.appendChild(dVersion);
        descripcion.appendChild(dDescripcion);
        importancia.appendChild(dImportancia);
        urgencia.appendChild(dUrgencia);
        estado.appendChild(dEstado);
        estabilidad.appendChild(dEstabilidad);
        comentario.appendChild(dComentario);

        nodo.appendChild(nombre);
        nodo.appendChild(version);
        nodo.appendChild(descripcion);
        nodo.appendChild(importancia);
        nodo.appendChild(urgencia);
        nodo.appendChild(estado);
        nodo.appendChild(estabilidad);
        nodo.appendChild(comentario);
        nodo.appendChild(dependencia);

        return nodo;
    }
    public static Element setCasoDeUso(Caso_de_uso cu, Document doc)
    {
        System.out.println("Caso de uso: "+cu.toString());

        StringBuilder constructor = new StringBuilder();
        Element nodo = doc.createElement("Objeto");
        Element elm = doc.createElement("tipo");
        elm.appendChild(doc.createTextNode("CasoDeUso"));
        nodo.appendChild(elm);

        //Plantilla de datos para el CU - Definición de datos
        Element nombre = doc.createElement("nombre");
        Element frecuencia = doc.createElement("frecuencia");
        Element esAbstracto = doc.createElement("abstracto");
        Element detalle = doc.createElement("detalles");
        Element comentario = doc.createElement("comentarios");
        Element evento = doc.createElement("eventoDeActivacion");
        Element precondicion = doc.createElement("precondicion");
        Element postcondicion = doc.createElement("postcondicion");
        Element pasos = doc.createElement("pasos");
        Element excepciones = doc.createElement("excepciones");
        Element prioridad = doc.createElement("prioridades");

        Text dNombre, dFrecuencia, dEsAbstracto,
                dDetalle, dComentario, dEvento, dPrecondicion, dPostcondicion,
                dPasos, dExcepciones, dPrioridad;
        //Cumplimentando datos adcionales
        //Nombre del CU (Obligatorio)
        dNombre = doc.createTextNode(cu.getNombre());
        //Frecuencia/Unidad
        if(cu.getFrecuencia().equals("")){ constructor.append("PD cada "); }
        else{ constructor.append(cu.getFrecuencia()+" cada "); }

        if(cu.getUnidad().equals("")){ constructor.append("PD"); }
        else{ constructor.append(cu.getUnidad()); }

        dFrecuencia = doc.createTextNode(constructor.toString());
        //Detalle
        if(cu.getDetalle().equals(""))
            dDetalle = doc.createTextNode("PD");
        else
            dDetalle = doc.createTextNode(cu.getDetalle());
        //Comentario
        if(cu.getComentario().equals(""))
            dComentario = doc.createTextNode("PD");
        else
            dComentario = doc.createTextNode(cu.getComentario());
        //Evento
        if(cu.getEvento().equals(""))
            dEvento = doc.createTextNode("PD");
        else
            dEvento = doc.createTextNode(cu.getEvento());
        //Precondición
        if(cu.getPrecondicion().equals(""))
            dPrecondicion = doc.createTextNode("PD");
        else
            dPrecondicion = doc.createTextNode(cu.getPrecondicion());
        //Postcondición
        if(cu.getPostcondicion().equals(""))
            dPostcondicion = doc.createTextNode("PD");
        else
            dPostcondicion = doc.createTextNode(cu.getPostcondicion());
        //Es abstracto?
        if(cu.getAbstracto())
        {
            dEsAbstracto = doc.createTextNode("Sí");
        }
        else
        {
            dEsAbstracto = doc.createTextNode("No");
        }

        //Codificando los pasos en html

        if(!cu.getPasos().isEmpty())
        {
           ArrayList<Evento> arrEv = cu.getPasos();
           for(int index = 0; index < arrEv.size(); index++)
           {
               Element sPasos = doc.createElement("CuPaso");
               Element vPasos = doc.createElement("valor");
               Text txPaso = doc.createTextNode(arrEv.get(index).getNum_paso()+
                       ".- "+arrEv.get(index).getDescripcion());
               vPasos.appendChild(txPaso);
               sPasos.appendChild(vPasos);
               pasos.appendChild(sPasos);
           }
        }
        else
        {
           Element sPasos = doc.createElement("CuPaso");
           Element vPasos = doc.createElement("valor");

           vPasos.appendChild( doc.createTextNode("PD") );
           sPasos.appendChild(vPasos);
           pasos.appendChild(sPasos);
        }
        //Codificando las Excepciones en html
        if(!cu.getExcepciones().isEmpty())
        {
           ArrayList<Evento> arrEv = cu.getExcepciones();
           for(int index = 0; index < arrEv.size(); index++)
           {
               Element sExcepcion = doc.createElement("CuExcepcion");
               Element vExcepcion = doc.createElement("valor");
               Text txPaso = doc.createTextNode(arrEv.get(index).getNum_paso()+
                       ".- "+arrEv.get(index).getDescripcion());
               vExcepcion.appendChild(txPaso);
               sExcepcion.appendChild(vExcepcion);
               excepciones.appendChild(sExcepcion);
           }
        }
        else
        {
           Element sExcepcion = doc.createElement("CuExcepcion");
           Element vExcepcion = doc.createElement("valor");

           vExcepcion.appendChild( doc.createTextNode("PD") );
           sExcepcion.appendChild(vExcepcion);
           excepciones.appendChild(sExcepcion);
        }

        //Codificando las Prioridades en html
        Element sPriInicio, sPriElaboracion, sPriConstruccion;
        Element vPriInicio, vPriElaboracion, vPriConstruccion;

        sPriInicio = doc.createElement("CuPri");
        sPriElaboracion = doc.createElement("CuPri");
        sPriConstruccion = doc.createElement("CuPri");

        vPriInicio = doc.createElement("valor");
        vPriElaboracion = doc.createElement("valor");
        vPriConstruccion = doc.createElement("valor");

        vPriInicio.appendChild(doc.createTextNode("Durante la fase de inicio: "+
                cu.getPriInicio()));
        vPriElaboracion.appendChild(doc.createTextNode("Durante la fase "+
                "de elaboración: "+ cu.getPriElaboracion()));
        vPriConstruccion.appendChild(doc.createTextNode("Durante la fase "+
                "de construcción: "+ cu.getPriConstruccion()));

        sPriInicio.appendChild(vPriInicio);
        sPriElaboracion.appendChild(vPriElaboracion);
        sPriConstruccion.appendChild(vPriConstruccion);

        prioridad.appendChild(sPriInicio);
        prioridad.appendChild(sPriElaboracion);
        prioridad.appendChild(sPriConstruccion);


        //Rellenando datos
        nombre.appendChild(dNombre);
        frecuencia.appendChild(dFrecuencia);
        esAbstracto.appendChild(dEsAbstracto);
        detalle.appendChild(dDetalle);
        comentario.appendChild(dComentario);
        evento.appendChild(dEvento);
        precondicion.appendChild(dPrecondicion);
        postcondicion.appendChild(dPostcondicion);

        nodo.appendChild(nombre);
        nodo.appendChild(evento);
        nodo.appendChild(detalle);
        nodo.appendChild(esAbstracto);
        nodo.appendChild(comentario);
        nodo.appendChild(frecuencia);
        nodo.appendChild(postcondicion);
        nodo.appendChild(precondicion);
        nodo.appendChild(pasos);
        nodo.appendChild(excepciones);
        nodo.appendChild(prioridad);

        return nodo;
    }
    
    public static Element setParticipante(Participante pr, Document doc)
    {
        Element nodo = doc.createElement("Objeto");
        Element elm = doc.createElement("tipo");
        elm.appendChild(doc.createTextNode("Participante"));
        
        Element clase, nombre, rol, comentario;
        
        clase = doc.createElement("clase");
        nombre = doc.createElement("nombre");
        rol = doc.createElement("rol");
        comentario = doc.createElement("comentario");
        
        Text dClase = null, dNombre, dRol, dComentario;
        
        switch(pr.getTipo())
        {
            case 1:
                dClase = doc.createTextNode("Empleado");
                break;
                
            case 2:
                dClase = doc.createTextNode("Cliente");
                break;
                
            case 3:
                dClase = doc.createTextNode("Organización");
                break;
        }
        dNombre = doc.createTextNode(pr.getNombre());
        dRol = doc.createTextNode(pr.getRol());
        dComentario = doc.createTextNode(pr.getComentario());
        
        nombre.appendChild(dNombre);
        rol.appendChild(dRol);
        clase.appendChild(dClase);
        comentario.appendChild(dComentario);
        
        nodo.appendChild(elm);
        nodo.appendChild(nombre);
        nodo.appendChild(clase);
        nodo.appendChild(rol);
        nodo.appendChild(comentario);
        
        return nodo;
    }

    public static Element setObjetivo(Objetivo ob, Document doc)
    {
        Element nodo = null;
        
        nodo = doc.createElement("Objeto");
        Element elm = doc.createElement("tipo");
        elm.appendChild(doc.createTextNode("Objetivo"));
        
        Element nombre = doc.createElement("nombre");
        Element importancia = doc.createElement("importancia");
        Element urgencia = doc.createElement("urgencia");
        Element estado = doc.createElement("estado");
        Element estabilidad = doc.createElement("estabilidad");
        Element descripcion = doc.createElement("descripcion"); 
        Element comentarios = doc.createElement("comentarios");
        
        nombre.appendChild(doc.createTextNode(ob.getNombre()));
        importancia.appendChild(doc.createTextNode(ob.getImportancia()));
        urgencia.appendChild(doc.createTextNode(ob.getUrgencia()));
        estado.appendChild(doc.createTextNode(ob.getEstado()));
        estabilidad.appendChild(doc.createTextNode(ob.getEstabilidad()));
        descripcion.appendChild(doc.createTextNode(ob.getDescripcion()));
        comentarios.appendChild(doc.createTextNode(ob.getComentarios()));
        
        nodo.appendChild(elm);
        nodo.appendChild(nombre);
        nodo.appendChild(importancia);
        nodo.appendChild(urgencia);
        nodo.appendChild(estado);
        nodo.appendChild(estabilidad);
        nodo.appendChild(descripcion);
        nodo.appendChild(comentarios);
        
        return nodo;
    }
    
    public static Element setRecInf(RInformacion ri, Document doc)
    {
        Element nodo = doc.createElement("Objeto");
        Element elm = doc.createElement("tipo");
        elm.appendChild(doc.createTextNode("RInformacion"));
        nodo.appendChild(elm);
        
        Element nombre = doc.createElement("nombre");
        Element descripcion = doc.createElement("descripcion");
        Element version = doc.createElement("version");
        Element importancia = doc.createElement("importancia");
        Element urgencia = doc.createElement("urgencia");
        Element estado = doc.createElement("estado");
        Element estabilidad = doc.createElement("estabilidad");
        Element comentario = doc.createElement("comentario");
        Element dependencia = doc.createElement("dependencia");
        Element clase = doc.createElement("clase");
        Element tv_cantidad = doc.createElement("tv_cantidad");
        Element tv_unidad = doc.createElement("tv_unidad");
        Element tocu_cantidad = doc.createElement("tocu_cantidad");
        Element tocu_unidad = doc.createElement("tocu_unidad");
        Element datosespeciales = doc.createElement("datosespeciales");
        
        nombre.appendChild(doc.createTextNode(ri.getNombre()));
        descripcion.appendChild(doc.createTextNode(ri.getDescripcion()));
        version.appendChild(doc.createTextNode(ri.getVersion()));
        importancia.appendChild(doc.createTextNode(ri.getImportancia()));
        urgencia.appendChild(doc.createTextNode(ri.getUrgencia()));
        estado.appendChild(doc.createTextNode(ri.getEstado()));
        estabilidad.appendChild(doc.createTextNode(ri.getEstabilidad()));
        comentario.appendChild(doc.createTextNode(ri.getComentario()));
        tv_cantidad.appendChild(doc.createTextNode(ri.getTv_cantidad()));
        tv_unidad.appendChild(doc.createTextNode(ri.getTv_unidad()));
        tocu_cantidad.appendChild(doc.createTextNode(ri.getTocu_cantidad()));
        tocu_unidad.appendChild(doc.createTextNode(ri.getTocu_unidad()));
        
        if(ri.isTipo())
        {
            clase.appendChild(doc.createTextNode("Relacionado con la información"));
        }
        else
        {
            clase.appendChild(doc.createTextNode("Relacionado con la arquitectura"));
        }
        
        ArrayList<String> datosDep = ri.getDependencia();
        Element sDependencia;
        Element tDependencia;

        if (datosDep.isEmpty())
        {
            sDependencia = doc.createElement("RIDep");
            tDependencia = doc.createElement("valor");
            tDependencia.appendChild(doc.createTextNode(""));
            sDependencia.appendChild(tDependencia);
            dependencia.appendChild(sDependencia);
        }
        else
        {
            for(int i = 0; i < datosDep.size(); i++)
            {
                sDependencia = doc.createElement("RIDep");
                tDependencia = doc.createElement("valor");
                tDependencia.appendChild(doc.createTextNode(datosDep.get(i)));
                sDependencia.appendChild(tDependencia);
                dependencia.appendChild(sDependencia);
            }
        }
        
        ArrayList<String> datosEsp = ri.getDatos_esp();
        Element sDespeciales;
        Element tDespeciales;

        if (datosEsp.isEmpty())
        {
            sDespeciales = doc.createElement("RIEsp");
            tDespeciales = doc.createElement("valor");
            tDespeciales.appendChild(doc.createTextNode("PD"));
            sDespeciales.appendChild(tDespeciales);
            datosespeciales.appendChild(sDespeciales);
        }
        else
        {
            for(int i = 0; i < datosDep.size(); i++)
            {
                sDespeciales = doc.createElement("RIEsp");
                tDespeciales = doc.createElement("valor");
                tDespeciales.appendChild(doc.createTextNode(datosEsp.get(i)));
                sDespeciales.appendChild(tDespeciales);
                datosespeciales.appendChild(sDespeciales);
            }
        }
        
        nodo.appendChild(nombre);
        nodo.appendChild(version);
        nodo.appendChild(descripcion);
        nodo.appendChild(importancia);
        nodo.appendChild(urgencia);
        nodo.appendChild(estado);
        nodo.appendChild(estabilidad);
        nodo.appendChild(comentario);
        nodo.appendChild(dependencia);
        nodo.appendChild(datosespeciales);
        nodo.appendChild(tv_cantidad);
        nodo.appendChild(tv_unidad);
        nodo.appendChild(tocu_cantidad);
        nodo.appendChild(tocu_unidad);
        
        
        
        return nodo;
    }

    public static Element setReunion(Reunion reunion, Document doc) {
        Element nodo = doc.createElement("Objeto");
        Element elm = doc.createElement("tipo");
        elm.appendChild(doc.createTextNode("Reunion"));
        nodo.appendChild(elm);
        
        Element nombre, fecha, clientes, autores, puntos;
        nombre = doc.createElement("nombre");
        nombre.appendChild(doc.createTextNode(reunion.getNombre()));
        
        fecha = doc.createElement("fecha");
        fecha.appendChild(doc.createTextNode(reunion.getFecha()));
        
        clientes = doc.createElement("clientes");
        autores = doc.createElement("autores");
        puntos = doc.createElement("puntos");
        
        //Faltan rellenar esos 3
        int i = 0;
        Element dClientes, dAutores, dPuntos;
        Element tClientes, tAutores, tPuntos;
        
        dClientes = doc.createElement("campoC");
        dAutores = doc.createElement("campoA");
        dPuntos = doc.createElement("campoP");
        
        ArrayList<Participante> arrC, arrA;
        arrC = reunion.getClientes();
        for(i = 0; i < arrC.size(); i++)
        {
            dClientes = doc.createElement("campoC");
            tClientes = doc.createElement("valor");
            tClientes.appendChild(doc.createTextNode(arrC.get(i).getNombre()));
            dClientes.appendChild(tClientes);
            clientes.appendChild(dClientes);
        }
        
        
        arrA = reunion.getAutores();
        for(i = 0; i < arrA.size(); i++)
        {
            dAutores = doc.createElement("campoA");
            tAutores = doc.createElement("valor");
            tAutores.appendChild(doc.createTextNode(arrA.get(i).getNombre()));
            dAutores.appendChild(tAutores);
            autores.appendChild(dAutores);
        }
        
        
        ArrayList<String> arrP = reunion.getPuntos();
        for(i = 0; i < arrP.size(); i++)
        {
            dPuntos = doc.createElement("campoP");
            tPuntos = doc.createElement("valor");
            tPuntos.appendChild(doc.createTextNode(arrP.get(i)));
            dPuntos.appendChild(tPuntos);
            puntos.appendChild(dPuntos);
        }
        
        
        nodo.appendChild(nombre);
        nodo.appendChild(fecha);
        nodo.appendChild(clientes);
        nodo.appendChild(autores);
        nodo.appendChild(puntos);
        
        return nodo;
    }

    public static Element setApendice(Apendice apendice, Document doc) {
        Element nodo = doc.createElement("Objeto");
        Element elm = doc.createElement("tipo");
        elm.appendChild(doc.createTextNode("Apendice"));
        nodo.appendChild(elm);
        
        Element nombre, tipo, comentario, autor;
        nombre = doc.createElement("nombre");
        nombre.appendChild(doc.createTextNode(apendice.getNombre()));
        nodo.appendChild(nombre);
        
        tipo = doc.createElement("clase");
        if(apendice.isTipo())
        {
            tipo.appendChild(doc.createTextNode("Apéndice"));
        }
        else
        {
            tipo.appendChild(doc.createTextNode("Sección"));
        }
        nodo.appendChild(tipo);
        
        comentario = doc.createElement("comentario");
        comentario.appendChild(doc.createTextNode(apendice.getComentario()));
        nodo.appendChild(comentario);
        
        autor = doc.createElement("autor");
        if(apendice.getAutor()!=null)
            autor.appendChild(doc.createTextNode(apendice.getAutor().getNombre()));
        else
            autor.appendChild(doc.createTextNode(""));
        nodo.appendChild(autor);
        
        return nodo;
    }

    public static Element setGlosario(Glosario glosario, Document doc) {
        Element nodo = doc.createElement("Objeto");
        Element elm = doc.createElement("tipo");
        elm.appendChild(doc.createTextNode("Glosario"));
        nodo.appendChild(elm);
        
        Element palabra, descripcion;
        
        palabra = doc.createElement("nombre");
        palabra.appendChild(doc.createTextNode(glosario.getPalabra()));
        nodo.appendChild(palabra);
        
        descripcion = doc.createElement("descripcion");
        descripcion.appendChild(doc.createTextNode(glosario.getDescripcion()));
        nodo.appendChild(descripcion);
        
        return nodo;
    }

    public static Element setParrafo(Parrafo parrafo, Document doc) {
        Element nodo = doc.createElement("Objeto");
        Element elm = doc.createElement("tipo");
        elm.appendChild(doc.createTextNode("Parrafo"));
        nodo.appendChild(elm);
        
        Element descripcion;
        
        descripcion = doc.createElement("descripcion");
        descripcion.appendChild(doc.createTextNode(parrafo.getDescripcion()));
        nodo.appendChild(descripcion);
        
        return nodo;
    }

    public static Element setImagen(File file, Document doc) {
        Element nodo = doc.createElement("Objeto");
        Element elm = doc.createElement("tipo");
        elm.appendChild(doc.createTextNode("Imagen"));
        nodo.appendChild(elm);
        
        Element ruta = doc.createElement("ruta");
        try
        {
            ruta.appendChild(doc.createTextNode(file.getCanonicalPath()));
        }
        catch(Exception e)
        {
            ruta.appendChild(doc.createTextNode("IOException"));
        }
        
        nodo.appendChild(ruta);
        return nodo;
    }
}
