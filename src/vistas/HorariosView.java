/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.*;
import modelos.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.PrestadorData;
import java.time.*;
import javax.swing.JTable;
/**
 *
 * @author Eourist
 */
public class HorariosView extends javax.swing.JInternalFrame implements View{
    DefaultTableModel tableModel;
    ArrayList<Horario> tablaMostrada;
    /**
     * Creates new form HorariosView
     */
    public HorariosView() {
        initComponents();
        tableModel = new DefaultTableModel();
        armarEncabezados();
        llenarDesplegablePrestadores();
        llenarDesplegableDias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHorarios = new javax.swing.JTable();
        jComboBoxPrestadores = new javax.swing.JComboBox<>();
        jComboBoxDias = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jLabelMensaje = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelEdicion = new javax.swing.JLabel();
        jTextFieldHoraDesde = new javax.swing.JTextField();
        jTextFieldHoraHasta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonGuardarTabla = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMinutosDesde = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMinutosHasta = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Administracion de horarios");

        jTableHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableHorarios);

        jComboBoxPrestadores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxPrestadoresItemStateChanged(evt);
            }
        });

        jComboBoxDias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDiasItemStateChanged(evt);
            }
        });

        jLabel1.setText("Día:");

        jLabel2.setText("DNI Prestador:");

        jTextFieldDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDNIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDNIKeyTyped(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelEdicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEdicion.setText("Cargar nuevo horario");

        jLabel4.setText("Hora inicio:");

        jLabel5.setText("Hora final:");

        jButtonGuardarTabla.setText("Guardar cambios tabla");
        jButtonGuardarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarTablaActionPerformed(evt);
            }
        });

        jLabel3.setText(":");

        jLabel6.setText(":");

        jButtonEliminar.setText("Eliminar horarios seleccionados");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelEdicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxPrestadores, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldHoraDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMinutosDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldHoraHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMinutosHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonGuardarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxPrestadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEdicion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHoraDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldMinutosDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldHoraHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldMinutosHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonGuardarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxPrestadoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxPrestadoresItemStateChanged
        Prestador prestadorSeleccionado = (Prestador)jComboBoxPrestadores.getSelectedItem();
        int diaSeleccionado = jComboBoxDias.getSelectedIndex();
        
        if (jComboBoxPrestadores.getSelectedIndex() != 0)
            jTextFieldDNI.setText(String.valueOf(prestadorSeleccionado.getDni()));
        else
            jTextFieldDNI.setText("");
        
        llenarTabla(prestadorSeleccionado, diaSeleccionado);
    }//GEN-LAST:event_jComboBoxPrestadoresItemStateChanged

    private void jComboBoxDiasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxDiasItemStateChanged
        Prestador prestadorSeleccionado = (Prestador)jComboBoxPrestadores.getSelectedItem();
        int diaSeleccionado = jComboBoxDias.getSelectedIndex();
        
        llenarTabla(prestadorSeleccionado, diaSeleccionado);
    }//GEN-LAST:event_jComboBoxDiasItemStateChanged

    private void jTextFieldDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNIKeyTyped
        String dni = jTextFieldDNI.getText() + evt.getKeyChar();
        boolean dniInvalido = false;
        
        if (!Character.isDigit(evt.getKeyChar()) || dni.length() > 8){
            evt.consume();
        }
        else if (dni.length() == 8){
            PrestadorData pd = new PrestadorData();
            Prestador p = pd.obtenerPrestadorDNI(Integer.parseInt(dni));
            if (p != null){
                for (int i = 0; i < jComboBoxPrestadores.getItemCount(); i++){
                    if (((Prestador)jComboBoxPrestadores.getItemAt(i)).getId() == p.getId())
                        jComboBoxPrestadores.setSelectedIndex(i);
                }
                evt.consume();
            } else {
                dniInvalido = true;
            }
        } else {
            dniInvalido = true;
        }
        
        if (dniInvalido && jComboBoxPrestadores.getSelectedIndex() != 0){
            String texto = jTextFieldDNI.getText();
            jComboBoxPrestadores.setSelectedIndex(0);
            jTextFieldDNI.setText(texto);
        }
    }//GEN-LAST:event_jTextFieldDNIKeyTyped

    private void jTextFieldDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNIKeyReleased
        if (evt.getKeyCode() == 8 && jComboBoxPrestadores.getSelectedIndex() != 0){
            String texto = jTextFieldDNI.getText();
            jComboBoxPrestadores.setSelectedIndex(0);
            jTextFieldDNI.setText(texto);
        }
    }//GEN-LAST:event_jTextFieldDNIKeyReleased

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            PrestadorData pd = new PrestadorData();
            HorarioData hd = new HorarioData();
            Prestador p = (Prestador)jComboBoxPrestadores.getSelectedItem();
            int dia = jComboBoxDias.getSelectedIndex();
            
            int horaDesde = Integer.valueOf(jTextFieldHoraDesde.getText());
            int minutosDesde = Integer.valueOf(jTextFieldMinutosDesde.getText());
            int horaHasta = Integer.valueOf(jTextFieldHoraHasta.getText());
            int minutosHasta = Integer.valueOf(jTextFieldMinutosHasta.getText());
            
            LocalTime desde = LocalTime.of(horaDesde, minutosDesde);
            LocalTime hasta = LocalTime.of(horaHasta, minutosHasta);
            
            ArrayList<Horario> existentes = hd.obtenerHorariosDiaPrestador(dia, p.getId());
            if (existentes.size() >= 2){
                jLabelMensaje.setText("Error al crear: el prestador ya tiene demasiados horarios el mismo dia");
            } else {
                Horario h = hd.altaHorario(new Horario(pd.obtenerPrestador(p.getId()), DayOfWeek.of(dia), desde, hasta));
                jLabelMensaje.setText("Horario creado correctamente");
                llenarTabla(p, dia);
            }
        } catch (NumberFormatException e){
            System.out.println("Error - Se ingreso un caracter inválido como hora/minuto");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if (jTableHorarios.getSelectedRows().length > 0){
            HorarioData hd = new HorarioData();
            if (jTableHorarios.getSelectedRows().length == 1){
                Horario seleccionado = tablaMostrada.get(jTableHorarios.getSelectedRow());
                hd.bajaHorario(seleccionado.getId());
                jLabelMensaje.setText("Horario eliminado correctamente");
            } else {
                for (int indice : jTableHorarios.getSelectedRows()){
                    hd.bajaHorario(tablaMostrada.get(indice).getId());
                }
                jLabelMensaje.setText("Horarios eliminados correctamente");
            }
            llenarTabla((Prestador)jComboBoxPrestadores.getSelectedItem(), jComboBoxDias.getSelectedIndex());
        } else {
            jLabelMensaje.setText("Error al eliminar: ningun horario seleccionado");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonGuardarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarTablaActionPerformed
        HorarioData hd = new HorarioData();
        int ediciones = 0;
        for (int i = 0; i < jTableHorarios.getRowCount(); i++){
            try{
                char inicio[] = tableModel.getValueAt(i, 1).toString().toCharArray();
                int horaInicio = Integer.valueOf(inicio[0] + "" + inicio[1]);
                int minutosInicio = Integer.valueOf(inicio[3] + "" + inicio[4]);
            
                char fin[] = tableModel.getValueAt(i, 2).toString().toCharArray();
                int horaFinal = Integer.valueOf(fin[0] + "" + fin[1]);
                int minutosFinal = Integer.valueOf(fin[3] + "" + fin[4]);
            
                Horario h = tablaMostrada.get(i);
                LocalTime timeInicio = LocalTime.of(horaInicio, minutosInicio);
                LocalTime timeFinal = LocalTime.of(horaFinal, minutosFinal);
            
                if (!h.getHoraInicio().equals(timeInicio) || !h.getHoraFin().equals(timeFinal)){
                    h.setHoraInicio(timeInicio);
                    h.setHoraFin(timeFinal);
                    hd.actualizarHorario(h.getId(), h);
                    ediciones++;
                }
            } catch (NumberFormatException e){
                jLabelMensaje.setText("Error al editar: valores en tabla incorrectos");
            }
        }
        switch (ediciones) {
            case 0:
                jLabelMensaje.setText("Error al editar: ningun dato modificado");
                break;
            case 1:
                jLabelMensaje.setText("Horario editado correctamente");
                break;
            default:
                jLabelMensaje.setText(ediciones + " horarios editados correctamente");
                break;
        }
    }//GEN-LAST:event_jButtonGuardarTablaActionPerformed
    
    private void llenarTabla(Prestador p, int dia){
        for (int i = tableModel.getRowCount(); i > 0; i--){
            tableModel.removeRow(i-1);
        }
        String textoEdicion = "Seleccione prestador y día para crear un nuevo horario";
        jButtonGuardar.setEnabled(false);
        
        //ArrayList<Horario> horarios = new ArrayList<>();
        HorarioData hd = new HorarioData();
        
        if (p.getId() == -1 && dia == 0){
            // Horarios de todos los prestadores, todos los días
            tablaMostrada = hd.obtenerHorarios();
        } else if (p.getId() != -1 && dia == 0){
            // Horarios de un prestador, todos los días
            tablaMostrada = hd.obtenerHorariosPrestador(p.getId());
        } else if (p.getId() != -1 && dia != 0){
            // Horarios de un prestador, un día en especial
            tablaMostrada = hd.obtenerHorariosDiaPrestador(dia, p.getId());
            textoEdicion = "Crear nuevo horario para el prestador " + p.getNombre() + " los días ";
            switch(dia){
                case 1: 
                    textoEdicion += "Lunes";
                    break;
                case 2:
                    textoEdicion += "Martes";
                    break;
                case 3:
                    textoEdicion += "Miércoles";
                    break;
                case 4:
                    textoEdicion += "Jueves";
                    break;
                case 5:
                    textoEdicion += "Viernes";
                    break;
                case 6:
                    textoEdicion += "Sábado";
                    break;
                case 7:
                    textoEdicion += "Domingo";
                    break;
            }  
            jButtonGuardar.setEnabled(true); 
        } else if (p.getId() == -1 && dia != 0){
            // Horarios de todos los prestadores, un día en especial
            tablaMostrada = hd.obtenerHorariosDia(dia);
        }
        
        jLabelEdicion.setText(textoEdicion);
        for (Horario h : tablaMostrada){
            tableModel.addRow(new Object[]{h.getDia().name(), h.getHoraInicio(), h.getHoraFin(), h.getPrestador().getNombre()});
        }
    }
    
    private void llenarDesplegablePrestadores(){
        ArrayList<Prestador> prestadores = new ArrayList<>();
        PrestadorData pd = new PrestadorData();
        prestadores = pd.obtenerPrestadores();
        
        Prestador placeholder = new Prestador(0000000, "Todos seleccionados", new Especialidad("NULL"), true);
        jComboBoxPrestadores.addItem(placeholder);
        jComboBoxPrestadores.setSelectedItem(placeholder);
        for (Prestador p : prestadores){
            jComboBoxPrestadores.addItem(p);
        }
    }
    
    private void llenarDesplegableDias(){
        jComboBoxDias.addItem("Todos los días");    // 0
        jComboBoxDias.addItem("Lunes");             // 1
        jComboBoxDias.addItem("Martes");            // ...
        jComboBoxDias.addItem("Miércoles");
        jComboBoxDias.addItem("Jueves");
        jComboBoxDias.addItem("Viernes");
        jComboBoxDias.addItem("Sábado");
        jComboBoxDias.addItem("Domingo");           // 7
    }
    
    private void armarEncabezados(){
        ArrayList<Object> ob = new ArrayList<Object>();
        ob.add("Dia");
        ob.add("Inicio");
        ob.add("Fin");
        ob.add("Prestador");
        
        for(Object o : ob){
            tableModel.addColumn(o);
        }
        jTableHorarios.setModel(tableModel);
    }
    
    @Override
    public void actualizarValores(){
        System.out.println("Se actualizo la vista de Horarios");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonGuardarTabla;
    private javax.swing.JComboBox<String> jComboBoxDias;
    private javax.swing.JComboBox<Prestador> jComboBoxPrestadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelEdicion;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableHorarios;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldHoraDesde;
    private javax.swing.JTextField jTextFieldHoraHasta;
    private javax.swing.JTextField jTextFieldMinutosDesde;
    private javax.swing.JTextField jTextFieldMinutosHasta;
    // End of variables declaration//GEN-END:variables
}
