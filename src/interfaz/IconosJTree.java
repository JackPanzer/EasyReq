/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import clases.*;
import java.awt.Component;
import java.awt.MediaTracker;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author amaranto
 */

public class IconosJTree extends DefaultTreeCellRenderer
{
    private ImageIcon icono=null;
    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, 
        boolean leaf, int row, boolean hasFocus)
    {
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
        DefaultMutableTreeNode nodo=(DefaultMutableTreeNode) value;
        if(nodo.getUserObject() instanceof Caso_de_uso)
        {
            this.icono=new ImageIcon("src/Icons/Caso de Uso.png");
            if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                this.icono=new ImageIcon("Icons/Caso de Uso.png");
        }
        else if(nodo.getUserObject() instanceof String)
        {
            String aux=(String)nodo.getUserObject();
            if(aux.equals("Excepciones"))
            {
                this.icono=new ImageIcon("src/Icons/Excepción.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/Excepción.png");
                //System.out.println("Excepcion!!"+this.icono.getImageLoadStatus());
            }
            else if(aux.equals("Pasos"))
            {
                this.icono=new ImageIcon("src/Icons/Paso.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/Paso.png");
                //System.out.println("Paso!!"+this.icono.getImageLoadStatus());
            }
            else
            {
                this.icono=new ImageIcon("src/Icons/nuevo_nodo.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/nuevo_nodo.png");
            }
        }
        else if(nodo.getUserObject() instanceof RFuncional)
        {
            if(((RFuncional)nodo.getUserObject()).getTipo())
            {
                this.icono=new ImageIcon("src/Icons/Requisito Funcional.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/Requisito Funcional.png");
            }
            else
            {
                this.icono=new ImageIcon("src/Icons/Requisito no funcional.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/Requisito no funcional.png");
            }
        }
        else if(nodo.getUserObject() instanceof RInformacion)
        {
            this.icono=new ImageIcon("src/Icons/Información.png");
            if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                this.icono=new ImageIcon("Icons/Información.png");
        }
        else if(nodo.getUserObject() instanceof Evento)
        {
            if(((Evento)nodo.getUserObject()).isTipo())
            {
                this.icono=new ImageIcon("src/Icons/Excepción.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/Excepción.png");
            }
            else
            {
                this.icono=new ImageIcon("src/Icons/Paso.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/Paso.png");
            }
        }
        else if(nodo.getUserObject() instanceof Participante)
        {
            if(((Participante)nodo.getUserObject()).getTipo()==Participante.CLIENTE)
            {
                this.icono=new ImageIcon("src/Icons/Cliente.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/Cliente.png");
            }
            else if(((Participante)nodo.getUserObject()).getTipo()==Participante.EMPLEADO)
            {
                this.icono=new ImageIcon("src/Icons/Empleado.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/Empleado.png");
            }
            else if(((Participante)nodo.getUserObject()).getTipo()==Participante.ORGANIZACION)
            {
                this.icono=new ImageIcon("src/Icons/Organización.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/Organización.png");
            }
        }else if(nodo.getUserObject() instanceof Objetivo)
        {
                this.icono=new ImageIcon("src/Icons/Objetivo del sistema.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/Objetivo del sistema.png");
            
        }
        else if(nodo.getUserObject() instanceof Reunion)
        {
                this.icono=new ImageIcon("src/Icons/reunion.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/reunion.png");
        }
        else if(nodo.getUserObject() instanceof Glosario)
        {
            this.icono=new ImageIcon("src/Icons/Glosario.png");
            if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                this.icono=new ImageIcon("Icons/reunion.png");
        }    
        else if(nodo.getUserObject() instanceof Apendice)
        {   Apendice Ap_seccion =(Apendice) nodo.getUserObject();
            if(Ap_seccion.isTipo()){
                this.icono=new ImageIcon("src/Icons/Abrir.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/Abrir.png");
            }else{
                this.icono=new ImageIcon("src/Icons/Apendice.png");
                if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                    this.icono=new ImageIcon("Icons/Apendice.png");
            }
        }
        else if(nodo.getUserObject() instanceof Parrafo)
        {
            this.icono=new ImageIcon("src/Icons/Parrafo.png");
            if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                this.icono=new ImageIcon("Icons/Parrafo.png");
        }
        else if(nodo.getUserObject() instanceof Imagen)
        {
            this.icono=new ImageIcon("src/Icons/Imagen.png");
            if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                this.icono=new ImageIcon("Icons/Imagen.png");
        }
        else if(nodo.getUserObject() instanceof Apendice)
        {
            this.icono=new ImageIcon("src/Icons/Apendice.png");
            if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                this.icono=new ImageIcon("Icons/Apendice.png");
        }
        else if(nodo.getUserObject() instanceof Glosario)
        {
            this.icono=new ImageIcon("src/Icons/Glosario.png");
            if(this.icono.getImageLoadStatus()==MediaTracker.ERRORED)
                this.icono=new ImageIcon("Icons/Glosario.png");
        }
        this.setIcon(this.icono);
        return this;
    }


}
