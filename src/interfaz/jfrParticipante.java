/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jfrParticipante.java
 *
 * Created on Dec 6, 2011, 12:35:55 AM
 */

package interfaz;

import clases.Participante;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author jackpanzer
 */
public class jfrParticipante extends javax.swing.JFrame {

    Interfaz padre;
    private DefaultMutableTreeNode nodo_in;
    private boolean editar;
    
    /** Creates new form jfrParticipante */
    public jfrParticipante(Interfaz padre,DefaultMutableTreeNode nodo_seleccionado,boolean n_editar)
    {
        initComponents();
        this.padre = padre;
        this.nodo_in=nodo_seleccionado;
        this.editar=n_editar;
        if(n_editar)this.inicializar_edicion();
    }
    
    private void inicializar_edicion()
    {
        Participante pa=(Participante) this.nodo_in.getUserObject();
        this.jtxNombre.setText(pa.getNombre());
        switch(pa.getTipo())
        {
            case Participante.CLIENTE:
                this.jchkCliente.setSelected(true);
                this.jcbRoles.setSelectedItem(pa.getRol());
            break;
            case Participante.EMPLEADO:
                this.jchkEmpleado.setSelected(true);
                this.jcbRoles.setSelectedItem(pa.getRol());
            break;
            case Participante.ORGANIZACION:
                this.jchkOrganizacion.setSelected(true);
                this.jcbRoles.setSelectedItem(pa.getRol());
            break;
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jchkOrganizacion = new javax.swing.JCheckBox();
        jchkCliente = new javax.swing.JCheckBox();
        jchkEmpleado = new javax.swing.JCheckBox();
        jbtnAceptar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jtxNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaComentarios = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jcbRoles = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir nuevo participante");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Nombre:");
        jLabel1.setName("jLabel1"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de participante"));
        jPanel1.setName("jPanel1"); // NOI18N

        jchkOrganizacion.setText("Organización");
        jchkOrganizacion.setName("jchkOrganizacion"); // NOI18N
        jchkOrganizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkOrganizacionActionPerformed(evt);
            }
        });

        jchkCliente.setText("Cliente");
        jchkCliente.setName("jchkCliente"); // NOI18N
        jchkCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkClienteActionPerformed(evt);
            }
        });

        jchkEmpleado.setText("Empleado");
        jchkEmpleado.setName("jchkEmpleado"); // NOI18N
        jchkEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jchkEmpleado)
                    .addComponent(jchkCliente)
                    .addComponent(jchkOrganizacion))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jchkEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jchkCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jchkOrganizacion)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.setEnabled(false);
        jbtnAceptar.setName("jbtnAceptar"); // NOI18N
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setName("jbtnCancelar"); // NOI18N
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jtxNombre.setName("jtxNombre"); // NOI18N
        jtxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxNombreActionPerformed(evt);
            }
        });
        jtxNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxNombreKeyReleased(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Comentarios"));
        jPanel2.setName("jPanel2"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jtxaComentarios.setColumns(20);
        jtxaComentarios.setLineWrap(true);
        jtxaComentarios.setRows(5);
        jtxaComentarios.setName("jtxaComentarios"); // NOI18N
        jScrollPane1.setViewportView(jtxaComentarios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Rol del participante"));
        jPanel3.setName("jPanel3"); // NOI18N

        jcbRoles.setEnabled(false);
        jcbRoles.setName("jcbRoles"); // NOI18N
        jcbRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbRolesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbRoles, 0, 243, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxNombre)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtnAceptar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnCancelar))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCancelar)
                    .addComponent(jbtnAceptar))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jchkEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkEmpleadoActionPerformed
        // TODO add your handling code here:
        jchkCliente.setSelected(false);
        jchkOrganizacion.setSelected(false);
        jchkEmpleado.setSelected(true);
        if(!jtxNombre.getText().equals("") && (
                (jchkCliente.isSelected() || jchkOrganizacion.isSelected() ||
                jchkEmpleado.isSelected())
                ))
        {
            jbtnAceptar.setEnabled(true);
        }
        else
        {
            jbtnAceptar.setEnabled(false);
        }

        if(jcbRoles.getItemCount() != 0)
        {
            jcbRoles.removeAllItems();
        }

        jcbRoles.addItem("Analista de sistemas");
        jcbRoles.addItem("Jefe de proyecto");
        jcbRoles.addItem("Diseñador");
        jcbRoles.addItem("Beta tester");
        jcbRoles.addItem("Programador");
        jcbRoles.addItem("Otro...");
        jcbRoles.setEnabled(true);
    }//GEN-LAST:event_jchkEmpleadoActionPerformed

    private void jchkClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkClienteActionPerformed
        // TODO add your handling code here:
        jchkCliente.setSelected(true);
        jchkOrganizacion.setSelected(false);
        jchkEmpleado.setSelected(false);
        if(!jtxNombre.getText().equals("") && (
                (jchkCliente.isSelected() || jchkOrganizacion.isSelected() ||
                jchkEmpleado.isSelected())
                ))
        {
            jbtnAceptar.setEnabled(true);
        }
        else
        {
            jbtnAceptar.setEnabled(false);
        }

        if(jcbRoles.getItemCount() != 0)
        {
            jcbRoles.removeAllItems();
        }

        jcbRoles.addItem("Jefe de la empresa");
        jcbRoles.addItem("Contacto");
        jcbRoles.addItem("Coordinador");
        jcbRoles.addItem("Recursos humanos");
        jcbRoles.addItem("Departamento de I+D");
        jcbRoles.addItem("Otro...");
        jcbRoles.setEnabled(true);
    }//GEN-LAST:event_jchkClienteActionPerformed

    private void jchkOrganizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkOrganizacionActionPerformed
        // TODO add your handling code here:
        jchkCliente.setSelected(false);
        jchkOrganizacion.setSelected(true);
        jchkEmpleado.setSelected(false);
        if(!jtxNombre.getText().equals("") && (
                (jchkCliente.isSelected() || jchkOrganizacion.isSelected() ||
                jchkEmpleado.isSelected())
                ))
        {
            jbtnAceptar.setEnabled(true);
        }
        else
        {
            jbtnAceptar.setEnabled(false);
        }

        if(jcbRoles.getItemCount() != 0)
        {
            jcbRoles.removeAllItems();
        }

        jcbRoles.addItem("Autónomo");
        jcbRoles.addItem("Empresa pública");
        jcbRoles.addItem("Otro...");
        jcbRoles.setEnabled(true);
    }//GEN-LAST:event_jchkOrganizacionActionPerformed

    private void jtxNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxNombreKeyReleased
        // TODO add your handling code here:
        if(!jtxNombre.getText().equals("") && (
                (jchkCliente.isSelected() || jchkOrganizacion.isSelected() ||
                jchkEmpleado.isSelected())
                ))
        {
            jbtnAceptar.setEnabled(true);
        }
        else
        {
            jbtnAceptar.setEnabled(false);
        }
    }//GEN-LAST:event_jtxNombreKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if(padre != null)
        {
            padre.setEnabled(true);
        }
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        // TODO add your handling code here:
        if(padre != null)
        {
            padre.setEnabled(true);
        }
        this.dispose();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        // TODO add your handling code here:
        if(!this.editar)
        {
            Participante nuevo=new Participante();
            nuevo.setNombre(this.jtxNombre.getText());
            if(this.jchkCliente.isSelected())
            {
                nuevo.setTipo(Participante.CLIENTE);
                nuevo.setRol((String) this.jcbRoles.getSelectedItem());
            }
            else if(this.jchkEmpleado.isSelected())
            {
                nuevo.setTipo(Participante.EMPLEADO);
                nuevo.setRol((String)this.jcbRoles.getSelectedItem());
            }
            else if(this.jchkOrganizacion.isSelected())
            {
                nuevo.setTipo(Participante.ORGANIZACION);
                nuevo.setRol((String)this.jcbRoles.getSelectedItem());
            }
            nuevo.setComentario(this.jtxaComentarios.getText());
            nuevo.addObserver(this.padre);
            this.padre.getDoc().Crear_Participante(nuevo);
            DefaultMutableTreeNode nodo_nuevo=new DefaultMutableTreeNode(nuevo);
            this.nodo_in.add(nodo_nuevo);
            this.padre.añadir_cosa(nodo_nuevo);
            nuevo.notificar_observer();
        }
        else
        {
            Participante nuevo=(Participante) this.nodo_in.getUserObject();
            nuevo.setNombre(this.jtxNombre.getText());
            if(this.jchkCliente.isSelected())
            {
                nuevo.setTipo(Participante.CLIENTE);
                nuevo.setRol((String) this.jcbRoles.getSelectedItem());
            }
            else if(this.jchkEmpleado.isSelected())
            {
                nuevo.setTipo(Participante.EMPLEADO);
                nuevo.setRol((String)this.jcbRoles.getSelectedItem());
            }
            else if(this.jchkOrganizacion.isSelected())
            {
                nuevo.setTipo(Participante.ORGANIZACION);
                nuevo.setRol((String)this.jcbRoles.getSelectedItem());
            }
            nuevo.setComentario(this.jtxaComentarios.getText());
            nuevo.notificar_observer();
        }
        this.padre.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAceptarActionPerformed

private void jtxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxNombreActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jtxNombreActionPerformed

private void jcbRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbRolesActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jcbRolesActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String[] args)
    {
        jfrParticipante p = new jfrParticipante(null,null,false);
        p.setEnabled(true);
        p.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JComboBox jcbRoles;
    private javax.swing.JCheckBox jchkCliente;
    private javax.swing.JCheckBox jchkEmpleado;
    private javax.swing.JCheckBox jchkOrganizacion;
    private javax.swing.JTextField jtxNombre;
    private javax.swing.JTextArea jtxaComentarios;
    // End of variables declaration//GEN-END:variables

}
