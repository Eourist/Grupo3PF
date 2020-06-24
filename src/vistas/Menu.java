/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;
import entidades.Orden;
import grupo3pf.Conexion;
import java.awt.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import modelos.OrdenData;

/**
 *
 * @author Eourist
 */
public class Menu extends javax.swing.JFrame {
    AfiliadosView vAfiliados = new AfiliadosView();
    EspecialidadesView vEspecialidades = new EspecialidadesView();
    HorariosView vHorarios = new HorariosView();
    OrdenesView vOrdenes;
    PrestadoresView vPrestadores = new PrestadoresView();
    ListadoAfiliadosView vListadoAfiliados = new ListadoAfiliadosView();
    ListadoOrdenesView vListadoOrdenes = new ListadoOrdenesView();
    ListadoPrestadoresView vListadoPrestadores = new ListadoPrestadoresView();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        for(Orden orden :  OrdenData.obtenerOrdenes(true) ){
            System.out.println("asda");
            if(orden.getFechaAtencion().isBefore(LocalDate.now())){
                orden.setActiva(false);
                OrdenData.actualizarOrden(orden);
            }
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOrdenes = new javax.swing.JMenu();
        jMenuItemNuevaOrden = new javax.swing.JMenuItem();
        jMenuItemBuscarOrden = new javax.swing.JMenuItem();
        jMenuPrestadores = new javax.swing.JMenu();
        jMenuItemABMPrestadores = new javax.swing.JMenuItem();
        jMenuItemBuscarPrestadores = new javax.swing.JMenuItem();
        jMenuItemABMEspecialidades = new javax.swing.JMenuItem();
        jMenuItemABMHorarios = new javax.swing.JMenuItem();
        jMenuAfiliados = new javax.swing.JMenu();
        jMenuItemABMAfiliados = new javax.swing.JMenuItem();
        jMenuItemBuscarAfiliados = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jDesktopPane.setPreferredSize(new java.awt.Dimension(1280, 720));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenuOrdenes.setText("Ordenes");

        jMenuItemNuevaOrden.setText("Nueva");
        jMenuItemNuevaOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevaOrdenActionPerformed(evt);
            }
        });
        jMenuOrdenes.add(jMenuItemNuevaOrden);

        jMenuItemBuscarOrden.setText("Buscar");
        jMenuItemBuscarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarOrdenActionPerformed(evt);
            }
        });
        jMenuOrdenes.add(jMenuItemBuscarOrden);

        jMenuBar1.add(jMenuOrdenes);

        jMenuPrestadores.setText("Prestadores");

        jMenuItemABMPrestadores.setText("Administrar");
        jMenuItemABMPrestadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemABMPrestadoresActionPerformed(evt);
            }
        });
        jMenuPrestadores.add(jMenuItemABMPrestadores);

        jMenuItemBuscarPrestadores.setText("Buscar");
        jMenuItemBuscarPrestadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarPrestadoresActionPerformed(evt);
            }
        });
        jMenuPrestadores.add(jMenuItemBuscarPrestadores);

        jMenuItemABMEspecialidades.setText("Especialidades");
        jMenuItemABMEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemABMEspecialidadesActionPerformed(evt);
            }
        });
        jMenuPrestadores.add(jMenuItemABMEspecialidades);

        jMenuItemABMHorarios.setText("Horarios");
        jMenuItemABMHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemABMHorariosActionPerformed(evt);
            }
        });
        jMenuPrestadores.add(jMenuItemABMHorarios);

        jMenuBar1.add(jMenuPrestadores);

        jMenuAfiliados.setText("Afiliados");

        jMenuItemABMAfiliados.setText("Administrar");
        jMenuItemABMAfiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemABMAfiliadosActionPerformed(evt);
            }
        });
        jMenuAfiliados.add(jMenuItemABMAfiliados);

        jMenuItemBuscarAfiliados.setText("Buscar");
        jMenuItemBuscarAfiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarAfiliadosActionPerformed(evt);
            }
        });
        jMenuAfiliados.add(jMenuItemBuscarAfiliados);

        jMenuBar1.add(jMenuAfiliados);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarVentana(Component ventana){
        jDesktopPane.removeAll();
        jDesktopPane.repaint();
        jDesktopPane.add(ventana);
        ventana.setVisible(true);
    }
    
    private void jMenuItemNuevaOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevaOrdenActionPerformed
        vOrdenes = new OrdenesView();
        mostrarVentana(vOrdenes);
    }//GEN-LAST:event_jMenuItemNuevaOrdenActionPerformed

    private void jMenuItemBuscarPrestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarPrestadoresActionPerformed
        vListadoPrestadores = new ListadoPrestadoresView();
        mostrarVentana(vListadoPrestadores);
    }//GEN-LAST:event_jMenuItemBuscarPrestadoresActionPerformed

    private void jMenuItemBuscarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarOrdenActionPerformed
        vListadoOrdenes = new ListadoOrdenesView();
        mostrarVentana(vListadoOrdenes);
    }//GEN-LAST:event_jMenuItemBuscarOrdenActionPerformed

    private void jMenuItemABMPrestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemABMPrestadoresActionPerformed
        vPrestadores = new PrestadoresView();
        mostrarVentana(vPrestadores);
    }//GEN-LAST:event_jMenuItemABMPrestadoresActionPerformed

    private void jMenuItemABMEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemABMEspecialidadesActionPerformed
        vEspecialidades = new EspecialidadesView();
        mostrarVentana(vEspecialidades);
    }//GEN-LAST:event_jMenuItemABMEspecialidadesActionPerformed

    private void jMenuItemABMHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemABMHorariosActionPerformed
        vHorarios = new HorariosView();
        mostrarVentana(vHorarios);
    }//GEN-LAST:event_jMenuItemABMHorariosActionPerformed

    private void jMenuItemABMAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemABMAfiliadosActionPerformed
        vAfiliados = new AfiliadosView();
        mostrarVentana(vAfiliados);
    }//GEN-LAST:event_jMenuItemABMAfiliadosActionPerformed

    private void jMenuItemBuscarAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarAfiliadosActionPerformed
        vListadoAfiliados = new ListadoAfiliadosView();
        mostrarVentana(vListadoAfiliados);
    }//GEN-LAST:event_jMenuItemBuscarAfiliadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAfiliados;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemABMAfiliados;
    private javax.swing.JMenuItem jMenuItemABMEspecialidades;
    private javax.swing.JMenuItem jMenuItemABMHorarios;
    private javax.swing.JMenuItem jMenuItemABMPrestadores;
    private javax.swing.JMenuItem jMenuItemBuscarAfiliados;
    private javax.swing.JMenuItem jMenuItemBuscarOrden;
    private javax.swing.JMenuItem jMenuItemBuscarPrestadores;
    private javax.swing.JMenuItem jMenuItemNuevaOrden;
    private javax.swing.JMenu jMenuOrdenes;
    private javax.swing.JMenu jMenuPrestadores;
    // End of variables declaration//GEN-END:variables
}
