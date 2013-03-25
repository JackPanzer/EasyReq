/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jfrReunion.java
 *
 * Created on Jan 10, 2012, 10:10:28 PM
 */
package interfaz;

import clases.Participante;
import clases.Reunion;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author jackpanzer
 */
public class jfrReunion extends javax.swing.JFrame {

    /** Creates new form jfrReunion */
    Interfaz padre;
    DefaultMutableTreeNode nodo_insercion;
    DefaultListModel lCliente, lAutor, lPuntos;
    ArrayList<Participante> clientes = new ArrayList<Participante>();
    ArrayList<Participante> autores = new ArrayList<Participante>();
    private boolean editar;
    
    public jfrReunion(Interfaz padre, DefaultMutableTreeNode nodo,
            ArrayList<Participante> datos,boolean n_editar) {
        initComponents();
        this.padre = padre;
        this.nodo_insercion = nodo;
        lCliente = new DefaultListModel();
        lAutor = new DefaultListModel();
        lPuntos = new DefaultListModel();
        jlsAutores.setModel(lAutor);
        jlsClientes.setModel(lCliente);
        jlstPunto.setModel(lPuntos);
        
        int i = 0;
        if(datos != null && !datos.isEmpty())
        {
            for(i = 0; i < datos.size(); i++)
            {
                if(datos.get(i).getTipo() == 1 || datos.get(i).getTipo() == 2 )
                {
                    System.out.println(datos.get(i));
                    autores.add(datos.get(i));
                    jcmbAutores.addItem(datos.get(i));
                }
                if(datos.get(i).getTipo() == 3 || datos.get(i).getTipo() == 2 )
                {
                    System.out.println(datos.get(i));
                    clientes.add(datos.get(i));
                    jcmbClientes.addItem(datos.get(i));
                }
            }
            
            if(!autores.isEmpty())
            {
                jbtnAgregarA.setEnabled(true);
                jcmbAutores.setSelectedIndex(0);
            }
            if(!clientes.isEmpty())
            {
                jbtnAgregarC.setEnabled(true);
                jcmbClientes.setSelectedIndex(0);
            }
        }
        this.editar=n_editar;
        if(n_editar)this.inicializar_edicion();
    }

    
    private void inicializar_edicion()
    {
        Reunion n=(Reunion) this.nodo_insercion.getUserObject();
        this.jtxNombre.setText(n.getNombre());
        for(String aux_puntos:n.getPuntos())
            this.lPuntos.addElement(aux_puntos);
        String aux[]=n.getFecha().split("/");
        this.jtxDay.setText(aux[0]);
        this.jtxMonth.setText(aux[1]);
        this.jtxYear.setText(aux[2]);
        for(Participante aux_autores:n.getAutores())
        {
            this.lAutor.addElement(aux_autores);
        }
        for(Participante aux_clientes:n.getClientes())
        {
            this.lCliente.addElement(aux_clientes);
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnCancelar = new javax.swing.JButton();
        jbtnAceptar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlstPunto = new javax.swing.JList();
        jtxfPunto = new javax.swing.JTextField();
        jbtnEliminarP = new javax.swing.JButton();
        jbtnAgregarP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxDay = new javax.swing.JTextField();
        jtxMonth = new javax.swing.JTextField();
        jtxYear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxNombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jcmbAutores = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlsAutores = new javax.swing.JList();
        jbtnEliminarA = new javax.swing.JButton();
        jbtnAgregarA = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jcmbClientes = new javax.swing.JComboBox();
        jbtnEliminaC = new javax.swing.JButton();
        jbtnAgregarC = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlsClientes = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva reunión");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.setEnabled(false);
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        jlstPunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlstPuntoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jlstPunto);

        jtxfPunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxfPuntoKeyReleased(evt);
            }
        });

        jbtnEliminarP.setText("Eliminar");
        jbtnEliminarP.setEnabled(false);
        jbtnEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarPActionPerformed(evt);
            }
        });

        jbtnAgregarP.setText("Añadir");
        jbtnAgregarP.setEnabled(false);
        jbtnAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarPActionPerformed(evt);
            }
        });

        jLabel1.setText("Día:");

        jLabel2.setText("Mes:");

        jLabel3.setText("Año:");

        jtxDay.setText("21");

        jtxMonth.setText("12");

        jtxYear.setText("2012");

        jLabel4.setText("Nombre de la reunión: ");

        jtxNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxNombreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtxYear, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxMonth)
                                    .addComponent(jtxDay, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(325, 325, 325))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jtxfPunto, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnAgregarP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnEliminarP)
                        .addGap(18, 18, 18))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAgregarP)
                    .addComponent(jbtnEliminarP))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Puntos de interés", jPanel4);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Autores"));

        jlsAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlsAutoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlsAutores);

        jbtnEliminarA.setText("Eliminar");
        jbtnEliminarA.setEnabled(false);
        jbtnEliminarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarAActionPerformed(evt);
            }
        });

        jbtnAgregarA.setText("Añadir");
        jbtnAgregarA.setEnabled(false);
        jbtnAgregarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jcmbAutores, 0, 311, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnAgregarA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnEliminarA)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmbAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEliminarA)
                    .addComponent(jbtnAgregarA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));

        jbtnEliminaC.setText("Eliminar");
        jbtnEliminaC.setEnabled(false);
        jbtnEliminaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminaCActionPerformed(evt);
            }
        });

        jbtnAgregarC.setText("Añadir");
        jbtnAgregarC.setEnabled(false);
        jbtnAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarCActionPerformed(evt);
            }
        });

        jlsClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlsClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jlsClientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcmbClientes, 0, 311, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnAgregarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnEliminaC)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEliminaC)
                    .addComponent(jbtnAgregarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Principal", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnCancelar))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCancelar)
                    .addComponent(jbtnAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if(padre != null)
            padre.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        // TODO add your handling code here:
        if(padre != null)
            padre.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jtxNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxNombreKeyReleased
        // TODO add your handling code here:
        if(jtxNombre.getText().equals(""))
        {
            jbtnAceptar.setEnabled(false);
        }
        else
        {
            jbtnAceptar.setEnabled(true);
        }
    }//GEN-LAST:event_jtxNombreKeyReleased

    private void jtxfPuntoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxfPuntoKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(!jtxfPunto.getText().equals(""))
            {
                lPuntos.addElement(jtxfPunto.getText());
                jlstPunto.setSelectedIndex(-1);
                jtxfPunto.setText("");
            }
        }
        else
        {
            if(jtxfPunto.getText().equals(""))
            {
                jbtnAgregarP.setEnabled(false);
            }
            else
            {
                jbtnAgregarP.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jtxfPuntoKeyReleased

    private void jbtnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarPActionPerformed
        // TODO add your handling code here:
        if(jlstPunto.getSelectedIndex() != -1)
        {
            lPuntos.remove(jlstPunto.getSelectedIndex());
            jlstPunto.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jbtnEliminarPActionPerformed

    private void jlstPuntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlstPuntoMouseClicked
        // TODO add your handling code here:
        if(jlstPunto.getSelectedIndex()!=-1)
            jbtnEliminarP.setEnabled(true);
    }//GEN-LAST:event_jlstPuntoMouseClicked

    private void jbtnAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarPActionPerformed
        // TODO add your handling code here:
        if(!jtxfPunto.getText().equals(""))
        {
            lPuntos.addElement(jtxfPunto.getText());
            jlstPunto.setSelectedIndex(-1);
            jtxfPunto.setText("");
        }
    }//GEN-LAST:event_jbtnAgregarPActionPerformed

    private void jbtnAgregarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarAActionPerformed
        // TODO add your handling code here:
        if(jcmbAutores.getSelectedIndex() != -1)
        {
            lAutor.addElement(jcmbAutores.getSelectedItem());
        }
    }//GEN-LAST:event_jbtnAgregarAActionPerformed

    private void jbtnAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarCActionPerformed
        // TODO add your handling code here:
        if(jcmbClientes.getSelectedIndex() != -1)
        {
            lCliente.addElement(jcmbClientes.getSelectedItem());
        }
    }//GEN-LAST:event_jbtnAgregarCActionPerformed

    private void jbtnEliminarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarAActionPerformed
        // TODO add your handling code here:
        if(jlsAutores.getSelectedIndex() != -1)
        {
            lAutor.remove(jlsAutores.getSelectedIndex());
            jlsAutores.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jbtnEliminarAActionPerformed

    private void jbtnEliminaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminaCActionPerformed
        // TODO add your handling code here:
        if(jlsClientes.getSelectedIndex() != -1)
        {
            lCliente.remove(jlsClientes.getSelectedIndex());
            jlsClientes.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jbtnEliminaCActionPerformed

    private void jlsAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlsAutoresMouseClicked
        // TODO add your handling code here:
        if(jlsAutores.getSelectedIndex()!=-1)
            jbtnEliminarA.setEnabled(true);
    }//GEN-LAST:event_jlsAutoresMouseClicked

    private void jlsClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlsClientesMouseClicked
        // TODO add your handling code here:
        if(jlsClientes.getSelectedIndex()!=-1)
            jbtnEliminaC.setEnabled(true);
    }//GEN-LAST:event_jlsClientesMouseClicked

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        // TODO add your handling code here:
        if(!this.editar)
        {
            Reunion re = new Reunion();

            re.setNombre(this.jtxNombre.getText());
            re.setFecha(this.jtxDay.getText()+"/"+
                    this.jtxMonth.getText()+"/"+
                    this.jtxYear.getText());
            int i = 0;
            ArrayList<Participante> cli = new ArrayList<Participante>();
            for(i = 0; i < lCliente.capacity(); i++)
            {
                try
                {
                    cli.add((Participante)lCliente.get(i));
                    System.out.println(lCliente.get(i));
                }
                catch(ArrayIndexOutOfBoundsException ex)
                {
                }
            }
            re.setClientes(cli);

            ArrayList<Participante> aut = new ArrayList<Participante>();
            for(i = 0; i < lAutor.capacity(); i++)
            {
                try
                {
                    aut.add((Participante)lAutor.get(i));
                    System.out.println(lAutor.get(i));
                }
                catch(ArrayIndexOutOfBoundsException ex)
                {
                }
            }
            re.setAutores(aut);

            ArrayList<String> str = new ArrayList<String>();
            for(i = 0; i < lPuntos.capacity(); i++)
            {
                try
                {
                    str.add((String)lPuntos.get(i));
                    System.out.println(lPuntos.get(i));
                }
                catch(ArrayIndexOutOfBoundsException ex)
                {
                }
            }
            re.setPuntos(str);
            re.addObserver(this.padre);
            this.padre.getDoc().Crear_Reunion(re);
            DefaultMutableTreeNode nodo=new DefaultMutableTreeNode(re);
            this.nodo_insercion.add(nodo);
            this.padre.añadir_cosa(nodo);
            re.notificar_observer();
        }
        else
        {
            Reunion re = (Reunion) this.nodo_insercion.getUserObject();

            re.setNombre(this.jtxNombre.getText());
            re.setFecha(this.jtxDay.getText()+"/"+
                    this.jtxMonth.getText()+"/"+
                    this.jtxYear.getText());
            int i = 0;
            ArrayList<Participante> cli = new ArrayList<Participante>();
            for(i = 0; i < lCliente.capacity(); i++)
            {
                try
                {
                    cli.add((Participante)lCliente.get(i));
                    System.out.println(lCliente.get(i));
                }
                catch(ArrayIndexOutOfBoundsException ex)
                {
                }
            }
            re.setClientes(cli);

            ArrayList<Participante> aut = new ArrayList<Participante>();
            for(i = 0; i < lAutor.capacity(); i++)
            {
                try
                {
                    aut.add((Participante)lAutor.get(i));
                    System.out.println(lAutor.get(i));
                }
                catch(ArrayIndexOutOfBoundsException ex)
                {
                }
            }
            re.setAutores(aut);

            ArrayList<String> str = new ArrayList<String>();
            for(i = 0; i < lPuntos.capacity(); i++)
            {
                try
                {
                    str.add((String)lPuntos.get(i));
                    System.out.println(lPuntos.get(i));
                }
                catch(ArrayIndexOutOfBoundsException ex)
                {
                }
            }
            re.setPuntos(str);
            re.notificar_observer();
        }
        this.padre.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new jfrReunion(null, null, null,false).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnAgregarA;
    private javax.swing.JButton jbtnAgregarC;
    private javax.swing.JButton jbtnAgregarP;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEliminaC;
    private javax.swing.JButton jbtnEliminarA;
    private javax.swing.JButton jbtnEliminarP;
    private javax.swing.JComboBox jcmbAutores;
    private javax.swing.JComboBox jcmbClientes;
    private javax.swing.JList jlsAutores;
    private javax.swing.JList jlsClientes;
    private javax.swing.JList jlstPunto;
    private javax.swing.JTextField jtxDay;
    private javax.swing.JTextField jtxMonth;
    private javax.swing.JTextField jtxNombre;
    private javax.swing.JTextField jtxYear;
    private javax.swing.JTextField jtxfPunto;
    // End of variables declaration//GEN-END:variables
}