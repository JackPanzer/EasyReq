/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author amaranto
 */
public class Arbol implements Serializable
{
    private Nodo_padre Root;
    
    public Arbol(String Nombre)
    {
        this.setRoot(new Nodo_padre(Nombre));
    }
    
    //------------------------Operaciones y Recorridos--------------------------
    public void add(Generico padre,Generico objeto) throws Exception
    {
        if(this.getRoot().getDato().equals(padre))
            this.getRoot().insertar_hijo(objeto);
        else if(this.getRoot().num_hijos()==0)
            throw new Exception("Nodo no encontrado");
        else
        {
            Nodo dev=null;
            for(Nodo nodo_aux:this.getRoot().getHijos())
            {
                dev=this.recorrer(nodo_aux,padre);
                if(dev!=null)
                    break;
            }
            dev.insertar_hijo(objeto);
        }
    }
    
    public void add_root(Generico objeto)
    {
        this.getRoot().insertar_hijo(objeto);
    }
    
    private Nodo recorrer(Nodo nodo,Generico padre)
    {
        Nodo dev=null;
        if(nodo.getDato().equals(padre))
            dev=nodo;
        else if(nodo.num_hijos()>0)
            for(Nodo nodo_aux:nodo.getHijos())
                dev=recorrer(nodo_aux, padre);
        else
            dev=null;
        return dev;
    }

    public void Eliminar_nodo(Generico obj)
    {
        if(this.getRoot().num_hijos()==0)
            return;
        else
        {
            for(Nodo aux:this.getRoot().getHijos())
            {
                if(aux.getDato()==obj)
                {
                    this.getRoot().elimina_hijo(aux);
                    break;
                }
                else if(aux.num_hijos()>0)
                    this.Eliminar_nodo(aux, obj);
            }
        }
    }

    public boolean Eliminar_nodo(Nodo inicio,Generico obj)
    {
        boolean dev=false;
        if(inicio.num_hijos()==0)
            dev=false;
        else
        {
            for(Nodo aux:inicio.getHijos())
            {
                if(aux.getDato()==obj)
                {
                    aux.elimina_hijo(aux);
                    dev=true;
                    break;
                }
                else if(aux.num_hijos()>0)
                    dev=this.Eliminar_nodo(aux, obj);
            }
        }
        return dev;
    }

    //-------------------------------------GET y SET----------------------------  
    
    /**
     * @return the Root
     */
    public Nodo_padre getRoot()
    {
        return Root;
    }
    
    /**
     * @param Root the Root to set
     */
    public void setRoot(Nodo_padre Root) {
        this.Root = Root;
    }
}
