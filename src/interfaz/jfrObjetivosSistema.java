/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jfrObjetivosSistema.java
 *
 * Created on 08-nov-2011, 9:38:15
 */

package interfaz;

import clases.Objetivo;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Cervantes
 */
public class jfrObjetivosSistema extends javax.swing.JFrame {

    Interfaz padre;
    private DefaultMutableTreeNode nodo_in;
    private boolean editar;
    /** Creates new form jfrObjetivosSistema */
    public jfrObjetivosSistema(Interfaz padre,DefaultMutableTreeNode nodo_seleccionado,boolean n_editar) 
    {
        initComponents();
        this.padre = padre;
        this.nodo_in=nodo_seleccionado;
        this.editar=n_editar;
        this.editar=n_editar;
        if(n_editar)this.inicializar_edicion();
    }

    private void inicializar_edicion()
    {
        Objetivo o=(Objetivo) this.nodo_in.getUserObject();
        this.jtxtNombre.setText(o.getNombre());
        this.jCImp.setSelectedItem(o.getImportancia());
        this.jCUrg.setSelectedItem(o.getUrgencia());
        this.jCEst.setSelectedItem(o.getEstado());
        this.jCEstabilidad.setSelectedItem(o.getEstabilidad());
        this.jtxtDescripcion.setText(o.getDescripcion());
        this.jTxtComentario.setText(o.getComentarios());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCImp = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jCUrg = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jCEst = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jCEstabilidad = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtDescripcion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtComentario = new javax.swing.JTextArea();
        jBCerrar = new javax.swing.JButton();
        jbAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir nuevo objetivo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        jPanel1.setName("jPanel1"); // NOI18N

        jLabel2.setText("Nombre:");
        jLabel2.setName("jLabel2"); // NOI18N

        jtxtNombre.setName("jtxtNombre"); // NOI18N
        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Importancia: ");
        jLabel3.setName("jLabel3"); // NOI18N

        jCImp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vital", "Importante", "Quedaría bien", "PD" }));
        jCImp.setName("jCImp"); // NOI18N
        jCImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCImpActionPerformed(evt);
            }
        });

        jLabel4.setText("Urgencia: ");
        jLabel4.setName("jLabel4"); // NOI18N

        jCUrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inmediatamente", "Hay presión", "Puede esperar", "PD" }));
        jCUrg.setName("jCUrg"); // NOI18N

        jLabel5.setText("Estado: ");
        jLabel5.setName("jLabel5"); // NOI18N

        jCEst.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enconstrucción", "Pendiente de negociación", "Pendiente de verificación", "Pendiente de validación ", "Validado" }));
        jCEst.setName("jCEst"); // NOI18N

        jLabel6.setText("Estabilidad: ");
        jLabel6.setName("jLabel6"); // NOI18N

        jCEstabilidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alta", "Media", "Baja" }));
        jCEstabilidad.setName("jCEstabilidad"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jCEstabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCUrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCUrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCEstabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("General", jPanel1);

        jPanel2.setName("jPanel2"); // NOI18N

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setName("jPanel8"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jtxtDescripcion.setColumns(20);
        jtxtDescripcion.setLineWrap(true);
        jtxtDescripcion.setRows(5);
        jtxtDescripcion.setName("jtxtDescripcion"); // NOI18N
        jScrollPane2.setViewportView(jtxtDescripcion);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setText("El sistema deberá...");
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Descripción", jPanel2);

        jPanel4.setName("jPanel4"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Rastreabilidad", jPanel4);

        jPanel5.setName("jPanel5"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Historia", jPanel5);

        jPanel6.setName("jPanel6"); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setName("jPanel7"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTxtComentario.setColumns(20);
        jTxtComentario.setLineWrap(true);
        jTxtComentario.setRows(5);
        jTxtComentario.setName("jTxtComentario"); // NOI18N
        jScrollPane1.setViewportView(jTxtComentario);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comentarios", jPanel6);

        jBCerrar.setText("Cancelar");
        jBCerrar.setName("jBCerrar"); // NOI18N
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });

        jbAceptar.setText("Aceptar");
        jbAceptar.setName("jbAceptar"); // NOI18N
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(jBCerrar))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAceptar)
                    .addComponent(jBCerrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jtxtNombreActionPerformed

private void jCImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCImpActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jCImpActionPerformed

private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed
// TODO add your handling code here:
    if(padre != null)
        {
            padre.setEnabled(true);
        }
    this.dispose();
}//GEN-LAST:event_jBCerrarActionPerformed

private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
// TODO add your handling code here:
    if(!this.editar)
    {
        Objetivo nuevo_obj = new Objetivo();
        nuevo_obj.setNombre(this.jtxtNombre.getText());
        nuevo_obj.setEstado((String)this.jCEst.getSelectedItem());
        nuevo_obj.setImportancia((String) this.jCImp.getSelectedItem());
        nuevo_obj.setEstabilidad((String)this.jCEstabilidad.getSelectedItem());
        nuevo_obj.setUrgencia((String) this.jCUrg.getSelectedItem());
        nuevo_obj.setComentarios(this.jTxtComentario.getText());
        nuevo_obj.setDescripcion(this.jtxtDescripcion.getText());
        nuevo_obj.addObserver(this.padre);
        this.padre.getDoc().Crear_Objetivo(nuevo_obj);
        DefaultMutableTreeNode nodo_nuevo=new DefaultMutableTreeNode(nuevo_obj);
        this.nodo_in.add(nodo_nuevo);
        this.padre.añadir_cosa(nodo_nuevo);
        nuevo_obj.notificar_observer();
    }
    else
    {
        Objetivo obj=(Objetivo) this.nodo_in.getUserObject();
        obj.setNombre(this.jtxtNombre.getText());
        obj.setEstado((String)this.jCEst.getSelectedItem());
        obj.setImportancia((String) this.jCImp.getSelectedItem());
        obj.setEstabilidad((String)this.jCEstabilidad.getSelectedItem());
        obj.setUrgencia((String) this.jCUrg.getSelectedItem());
        obj.setComentarios(this.jTxtComentario.getText());
        obj.setDescripcion(this.jtxtDescripcion.getText());
        obj.notificar_observer();
    }
    
    this.padre.setEnabled(true);
    this.dispose();
}//GEN-LAST:event_jbAceptarActionPerformed

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
// TODO add your handling code here:
     if(padre != null)
        {
            padre.setEnabled(true);
        }
        this.dispose();
}//GEN-LAST:event_formWindowClosing

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        jfrObjetivosSistema o = new jfrObjetivosSistema(null,null,false);
        o.setEnabled(true);
        o.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCerrar;
    private javax.swing.JComboBox jCEst;
    private javax.swing.JComboBox jCEstabilidad;
    private javax.swing.JComboBox jCImp;
    private javax.swing.JComboBox jCUrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTxtComentario;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JTextArea jtxtDescripcion;
    private javax.swing.JTextField jtxtNombre;
    // End of variables declaration//GEN-END:variables

}
