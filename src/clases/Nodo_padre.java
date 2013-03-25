/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author amaranto
 */
public class Nodo_padre extends Generico
{
    private String Dato;
    private ArrayList<Nodo> hijos;

    public Nodo_padre(String Dato)
    {
        this.Dato = Dato;
        this.hijos=new ArrayList<Nodo>();
    }
    
    //------------------Metodos para operar-------------------------------------

    public void insertar_hijo(Generico dato)
    {
        this.getHijos().add(new Nodo(dato));
    }

    public int num_hijos()
    {
        return this.getHijos().size();
    }
    
    public Nodo getHijo(int i)
    {
        return this.getHijos().get(i);
    }
    
    public void borrar_hijos()
    {
        this.getHijos().clear();
    }

    public void elimina_hijo(Nodo obj)
    {
        this.getHijos().remove(obj);
    }

    public void elimina_hijo(int pos)
    {
        this.getHijos().remove(pos);
    }

    //----------------------------------GET y SET-------------------------------
    /**
     * @return the Dato
     */
    public String getDato() {
        return Dato;
    }

    /**
     * @param Dato the Dato to set
     */
    public void setDato(String Dato) {
        this.Dato = Dato;
    }

    /**
     * @return the hijos
     */
    public ArrayList<Nodo> getHijos() {
        return hijos;
    }

    /**
     * @param hijos the hijos to set
     */
    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }
}
