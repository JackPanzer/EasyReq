/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 * Reunión entre una serie de participantes.
 * @author OnubaSoftware
 */
public class Reunion extends Generico
{
    private String nombre;
    private ArrayList<Participante> clientes, autores;
    private String fecha = null;
    private ArrayList<String> puntos;
    
    public Reunion()
    {
    }

    /**
     * Obtiene la fecha de la reunión.
     * @return Fecha de la reunión.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la reunión.
     * @param fecha Nueva fecha.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene los puntos claves de la reunión (comida con los directivos, estimación
     * de costes, ...).
     * @return Lista de puntos claves.
     */
    public ArrayList<String> getPuntos() {
        return puntos;
    }

    /**
     * Establece los puntos claves de la reunión.
     * @param puntos Lista de puntos clave.
     */
    public void setPuntos(ArrayList<String> puntos) {
        this.puntos = puntos;
    }

    /**
     * Obtiene el nombre dado a la reunión.
     * @return Nombre de la reunión.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la reunión.
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString()
    {
        return "Reunion: "+this.nombre;
    }

    /**
     * Obtiene la lista de participantes que actúan como clientes en la reunión.
     * @return Lista de clientes.
     */
    public ArrayList<Participante> getClientes() {
        return clientes;
    }

    /**
     * Establece la lista de participantes que actuarán como clientes en la reunión.
     * @param clientes Nueva lista de clientes.
     */
    public void setClientes(ArrayList<Participante> clientes) {
        this.clientes = clientes;
    }

    /**
     * Obtiene la lista de participantes que actuarán como empleados en la reunión.
     * @return Lista de participantes.
     */
    public ArrayList<Participante> getAutores() {
        return autores;
    }

    /**
     * Establece la lista de participantes que actuarán como empleados en la reunión.
     * @param autores Nueva lista de autores.
     */
    public void setAutores(ArrayList<Participante> autores) {
        this.autores = autores;
    }
}
