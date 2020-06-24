/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import modelos.AfiliadoData;
import entidades.Afiliado;
import java.util.ArrayList;

/**
 *
 * @author Eourist
 */
public class AfiliadosView extends javax.swing.JInternalFrame implements View{
    private boolean AfiliadoSeleccionado = false;
    /**
     * Creates new form AfiliadoView
     */
    public AfiliadosView() {
        initComponents();
        llenarDesplegableAfiliados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldDNIBusqueda = new javax.swing.JTextField();
        jComboBoxAfiliados = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDNIFormulario = new javax.swing.JTextField();
        jButtonDeshabilitar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jLabelMensaje1 = new javax.swing.JLabel();
        jLabelMensaje = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Administracion de afiliados");

        jLabel1.setText("Buscar por DNI:");

        jTextFieldDNIBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDNIBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDNIBusquedaKeyTyped(evt);
            }
        });

        jComboBoxAfiliados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAfiliadosItemStateChanged(evt);
            }
        });
        jComboBoxAfiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAfiliadosActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccionar prestador a modificar");

        jLabelTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTipo.setText("Creación/Edición");

        jLabel3.setText("Nombre:");

        jLabel4.setText("DNI:");

        jTextFieldDNIFormulario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDNIFormularioKeyTyped(evt);
            }
        });

        jButtonDeshabilitar.setText("Deshabilitar");
        jButtonDeshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeshabilitarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabelMensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDNIBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDNIFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonDeshabilitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(jButtonEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGuardar)
                        .addGap(71, 71, 71))
                    .addComponent(jLabelMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelMensaje1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldDNIBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabelTipo)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDNIFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeshabilitar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonGuardar))
                .addGap(26, 26, 26)
                .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelMensaje1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDNIBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNIBusquedaKeyReleased
        if (evt.getKeyCode() == 8 && jComboBoxAfiliados.getSelectedIndex() != 0){
            String texto = jTextFieldDNIBusqueda.getText();
            jComboBoxAfiliados.setSelectedIndex(0);
            jTextFieldDNIBusqueda.setText(texto);
        }
    }//GEN-LAST:event_jTextFieldDNIBusquedaKeyReleased

    private void jTextFieldDNIBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNIBusquedaKeyTyped
        String dni = jTextFieldDNIBusqueda.getText() + evt.getKeyChar();
        boolean dniInvalido = false;

        if (!Character.isDigit(evt.getKeyChar()) || dni.length() > 8){
            evt.consume();
        }
        else if (dni.length() == 8){
            AfiliadoData pd = new AfiliadoData();
            Afiliado p = pd.obtenerAfiliadoDNI(Integer.parseInt(dni));
            if (p != null){
                llenarDatosAfiliado(p);
                evt.consume();
            } else {
                dniInvalido = true;
            }
        } else {
            dniInvalido = true;
        }

        if (dniInvalido && jComboBoxAfiliados.getSelectedIndex() != 0){
            String texto = jTextFieldDNIBusqueda.getText();
            jComboBoxAfiliados.setSelectedIndex(0);
            jTextFieldDNIBusqueda.setText(texto);
        }
    }//GEN-LAST:event_jTextFieldDNIBusquedaKeyTyped

    private void jComboBoxAfiliadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAfiliadosItemStateChanged
        if ((Afiliado)jComboBoxAfiliados.getSelectedItem() == null)
        return;

        Afiliado p = ((Afiliado)jComboBoxAfiliados.getSelectedItem());
        if (p.getId() != -1){
            AfiliadoSeleccionado = true;
            llenarDatosAfiliado(p);
            jLabelTipo.setText("Edición del prestador: " + p.getNombre());
        } else {
            AfiliadoSeleccionado = false;
            vaciarDatosAfiliado();
            jLabelTipo.setText("Creación de prestador");
        }
    }//GEN-LAST:event_jComboBoxAfiliadosItemStateChanged

    private void jComboBoxAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAfiliadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAfiliadosActionPerformed

    private void jTextFieldDNIFormularioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNIFormularioKeyTyped
        String dni = jTextFieldDNIFormulario.getText() + evt.getKeyChar();

        if (!Character.isDigit(evt.getKeyChar()) || dni.length() > 8)
        evt.consume();
    }//GEN-LAST:event_jTextFieldDNIFormularioKeyTyped

    private void jButtonDeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeshabilitarActionPerformed
        if (AfiliadoSeleccionado){
            AfiliadoData pd = new AfiliadoData();
            Afiliado p = (Afiliado)jComboBoxAfiliados.getSelectedItem();
            p.setActivo(!p.isActivo());
            pd.actualizarAfiliado(p.getId(), p);

            if (p.isActivo()){
                jLabelMensaje.setText("Prestador habilitado correctamente");
                jButtonDeshabilitar.setText("Deshabilitar");
            }
            else{
                jLabelMensaje.setText("Prestador deshabilitado correctamente");
                jButtonDeshabilitar.setText("Habilitar");
            }
        } else {
            jLabelMensaje.setText("Error al deshabilitar: no se encontro un prestador");
        }
    }//GEN-LAST:event_jButtonDeshabilitarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if (AfiliadoSeleccionado){
            AfiliadoData ad = new AfiliadoData();
            Afiliado a = (Afiliado)jComboBoxAfiliados.getSelectedItem();
            ad.bajaAfiliado(a.getId());
            jComboBoxAfiliados.removeItem(a);
            jLabelMensaje.setText("Prestador eliminado correctamente");
            vaciarDatosAfiliado();
        } else {
            jLabelMensaje.setText("Error al eliminar: no se encontro un prestador");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        AfiliadoData pd = new AfiliadoData();
        Afiliado p;
        if (AfiliadoSeleccionado){
            if (jTextFieldDNIFormulario.getText().length() == 8 && !jTextFieldNombre.getText().equals("")){
                p = (Afiliado)jComboBoxAfiliados.getSelectedItem();
                p.setDni(Integer.valueOf(jTextFieldDNIFormulario.getText()));
                p.setNombre(jTextFieldNombre.getText());

                pd.actualizarAfiliado(p.getId(), p);
                jLabelMensaje.setText("Afiliado editado correctamente");
                jLabelTipo.setText("Edición del prestador: " + p.getNombre());
            } else {
                jLabelMensaje.setText("Error al editar: datos del formulario incompletos");
            }
        } else {
            if (jTextFieldDNIFormulario.getText().length() == 8 && !jTextFieldNombre.getText().equals("")){
                p = new Afiliado(
                    Integer.valueOf(jTextFieldDNIFormulario.getText()),
                    jTextFieldNombre.getText(), true);

                pd.altaAfiliado(p);
                jLabelMensaje.setText("Prestador creado correctamente");
                jComboBoxAfiliados.addItem(p);
                llenarDatosAfiliado(p);
            } else {
                jLabelMensaje.setText("Error al guardar: datos del formulario incompletos");
            }
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed
    
    
    private void llenarDatosAfiliado(Afiliado a){
        jTextFieldDNIBusqueda.setText(String.valueOf(a.getDni()));
        jTextFieldDNIFormulario.setText(String.valueOf(a.getDni()));
        jTextFieldNombre.setText(a.getNombre());
        if (a.isActivo())
            jButtonDeshabilitar.setText("Deshabilitar");
        else
            jButtonDeshabilitar.setText("Habilitar");
        
        if (((Afiliado)jComboBoxAfiliados.getSelectedItem()).getId() != a.getId()){
            for (int i = 0; i < jComboBoxAfiliados.getItemCount(); i++){
                if (jComboBoxAfiliados.getItemAt(i).getId() == a.getId()){
                    jComboBoxAfiliados.setSelectedIndex(i);
                    break;
                }
            }
        }
        
    }
    
    private void vaciarDatosAfiliado(){
        jTextFieldDNIBusqueda.setText("");
        jTextFieldDNIFormulario.setText("");
        jTextFieldNombre.setText("");
        jButtonDeshabilitar.setText("Deshabilitar");
        
        if (((Afiliado)jComboBoxAfiliados.getSelectedItem()).getId() != -1){
            for (int i = 0; i < jComboBoxAfiliados.getItemCount(); i++){
                if (jComboBoxAfiliados.getItemAt(i).getId() == -1){
                    jComboBoxAfiliados.setSelectedIndex(i);
                    break;
                }
            }
        }
    }
    
    private void llenarDesplegableAfiliados(){
        ArrayList<Afiliado> Afiliados = new ArrayList<>();
        AfiliadoData ad = new AfiliadoData();
        Afiliados = ad.obtenerAfiliados(true);
        
        jComboBoxAfiliados.removeAllItems();
        Afiliado placeholder = new Afiliado(0000000, "Ninguno seleccionado", true);
        jComboBoxAfiliados.addItem(placeholder);
        jComboBoxAfiliados.setSelectedItem(placeholder);
        for (Afiliado a : Afiliados){
            jComboBoxAfiliados.addItem(a);
        }
    }
    
    @Override
    public void actualizarValores(){
        System.out.println("Se actualizo la vista de Afiliados");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeshabilitar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<Afiliado> jComboBoxAfiliados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelMensaje1;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JTextField jTextFieldDNIBusqueda;
    private javax.swing.JTextField jTextFieldDNIFormulario;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
