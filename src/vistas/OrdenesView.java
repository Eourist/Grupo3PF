/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Afiliado;
import java.awt.List;
import java.util.ArrayList;
import modelos.AfiliadoData;

/**
 *
 * @author Eourist
 */
public class OrdenesView extends javax.swing.JInternalFrame implements View{

    /**
     * Creates new form OrdenesView
     */
    public OrdenesView() {
        initComponents();
        ArrayList<Afiliado> listaAfiliados;
        AfiliadoData afiliadoData = new AfiliadoData();
        listaAfiliados = afiliadoData.obtenerAfiliados();
        for(Afiliado afiliado:listaAfiliados){
            if(afiliado.isActivo())
                this.listaAfil.add(String.valueOf(afiliado.getDni()));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaAfil = new java.awt.List();
        label1 = new java.awt.Label();

        setClosable(true);
        setTitle("Administracion de ordenes");

        listaAfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAfilActionPerformed(evt);
            }
        });

        label1.setText("lista de afiliado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaAfil, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(829, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(listaAfil, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        listaAfil.getAccessibleContext().setAccessibleName("listaAfil");
        listaAfil.getAccessibleContext().setAccessibleDescription("");
        label1.getAccessibleContext().setAccessibleName("lbLista");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaAfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAfilActionPerformed

    @Override
    public void actualizarValores(){
        System.out.println("Se actualizo la vista de Ordenes");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label label1;
    private java.awt.List listaAfil;
    // End of variables declaration//GEN-END:variables
}
