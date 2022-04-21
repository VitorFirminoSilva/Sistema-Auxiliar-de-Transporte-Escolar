/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.control.ControleMonitor;
import br.edu.ifsp.pep.control.ControleMotorista;
import br.edu.ifsp.pep.control.ControleVinculo;
import br.edu.ifsp.pep.model.Monitor;
import br.edu.ifsp.pep.model.Motorista;
import br.edu.ifsp.pep.model.Vinculo;
import br.edu.ifsp.pep.model.VinculoPK;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.Conversoes;

/**
 *
 * @author Aluno
 */
public class VincularFormm extends javax.swing.JDialog {

    /**
     * Creates new form VincularFormm
     */
    public VincularFormm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBackground = new javax.swing.JPanel();
        pMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMotorista = new javax.swing.JTable();
        bPesquisarMotorista = new javax.swing.JButton();
        txtMotorista = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tMonitor = new javax.swing.JTable();
        bPesquisarMonitor = new javax.swing.JButton();
        txtMonitor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRegistroMotorista = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRegistroMonitor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        formatHorarioEstimado = new javax.swing.JFormattedTextField();
        bVincular = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        pBackground.setBackground(new java.awt.Color(58, 110, 165));
        pBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pMenu.setBackground(new java.awt.Color(51, 51, 51));
        pMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        pBackground.add(pMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 720));

        tMotorista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Registro", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tMotorista.getTableHeader().setReorderingAllowed(false);
        tMotorista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMotoristaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tMotorista);

        pBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 390, 220));

        bPesquisarMotorista.setText("Pesquisar");
        bPesquisarMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarMotoristaActionPerformed(evt);
            }
        });
        pBackground.add(bPesquisarMotorista, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 130, -1));
        pBackground.add(txtMotorista, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 200, -1));

        tMonitor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Registro", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tMonitor.getTableHeader().setReorderingAllowed(false);
        tMonitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMonitorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tMonitor);

        pBackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 380, 220));

        bPesquisarMonitor.setText("Pesquisar");
        bPesquisarMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarMonitorActionPerformed(evt);
            }
        });
        pBackground.add(bPesquisarMonitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 120, -1));
        pBackground.add(txtMonitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 200, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Motorista");
        pBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Monitor");
        pBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, -1, -1));
        pBackground.add(txtRegistroMotorista, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 140, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("N° registro");
        pBackground.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, 20));
        pBackground.add(txtRegistroMonitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 140, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("N° registro");
        pBackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, -1, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Horário estimado");
        pBackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        try {
            formatHorarioEstimado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formatHorarioEstimado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatHorarioEstimadoActionPerformed(evt);
            }
        });
        pBackground.add(formatHorarioEstimado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 90, -1));

        bVincular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bVincular.setText("Vincular");
        bVincular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bVincularMouseClicked(evt);
            }
        });
        pBackground.add(bVincular, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 560, -1, -1));

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });
        pBackground.add(bCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tMotoristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMotoristaMouseClicked
        // TODO add your handling code here:
        int linha = tMotorista.getSelectedRow();
        int coluna = 0;
        int flag = 0;
        if(linha != -1){
            for(int i = 0; i<2; i++){
                if(tMotorista.getColumnName(i).equals("N° Registro")){
                    coluna = i;
                    flag = 1;
                }
            }
            if(flag == 1){
                txtRegistroMotorista.setText(tMotorista.getValueAt(linha, coluna).toString());
            }
        }
    }//GEN-LAST:event_tMotoristaMouseClicked

    private void tMonitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMonitorMouseClicked
        // TODO add your handling code here:
        int linha = tMonitor.getSelectedRow();
        int coluna = 0;
        int flag = 0;
        if(linha != -1){
            for(int i = 0; i<2; i++){
                if(tMonitor.getColumnName(i).equals("N° Registro")){
                    coluna = i;
                    flag = 1;
                }
            }
            if(flag == 1){
                txtRegistroMonitor.setText(tMonitor.getValueAt(linha, coluna).toString());
            }
        }
    }//GEN-LAST:event_tMonitorMouseClicked

    private void formatHorarioEstimadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatHorarioEstimadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatHorarioEstimadoActionPerformed

    private void bPesquisarMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarMotoristaActionPerformed
        // TODO add your handling code here:
        ControleMotorista controle = new ControleMotorista();
        List<Motorista> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) tMotorista.getModel();
        model.setNumRows(0);
        list = controle.findByNome(txtMotorista.getText());
        for(Motorista m: list){
            model.addRow(new Object[] {m.getNumeroRegistro(), m.getNomeFuncionario()});
        }       
    }//GEN-LAST:event_bPesquisarMotoristaActionPerformed

    private void bPesquisarMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarMonitorActionPerformed
        // TODO add your handling code here:
        ControleMonitor controle = new ControleMonitor();
        List<Monitor> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) tMonitor.getModel();
        model.setNumRows(0);
        list = controle.findByNome(txtMonitor.getText());
        for(Monitor m: list){
            model.addRow(new Object[] {m.getNumeroRegistro(), m.getNomeFuncionario()});
        }
    }//GEN-LAST:event_bPesquisarMonitorActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bVincularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVincularMouseClicked
        // TODO add your handling code here:
        ControleMotorista controleMotorista = new ControleMotorista();
        ControleMonitor controleMonitor = new ControleMonitor();
        ControleVinculo controleVinculo = new ControleVinculo();
        Vinculo vinculo = new Vinculo();
        Monitor monitor;
        Motorista motorista;

        if(txtRegistroMotorista.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Selecione um motorista!");
            txtRegistroMotorista.requestFocus();
            return;
        }
        if(txtRegistroMonitor.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Selecione um monitor!");
            txtRegistroMonitor.requestFocus();
            return;
        }
        if(formatHorarioEstimado.getText().equals("  :  ")){
            JOptionPane.showMessageDialog(this, "Defina o horário estimado!");
            formatHorarioEstimado.requestFocus();
            return;
        }

        try{
            motorista = controleMotorista.findByNumRegistro(txtRegistroMotorista.getText());
        }catch(NoResultException ex){
            JOptionPane.showMessageDialog(this, "Motorista com o número de registro informado não encontrado!");
            return;
        }

        try{
            monitor = controleMonitor.findByNumRegistro(txtRegistroMonitor.getText());
            vinculo.setVinculoPK(new VinculoPK(new Date()));
            vinculo.setHorarioInicio(new Date());
            vinculo.setMonitor(monitor);
            vinculo.setMotorista(motorista);
            vinculo.setHorarioPrevisto(Conversoes.getDateOfTime(formatHorarioEstimado.getText()));
            controleVinculo.inserir(vinculo);
            JOptionPane.showMessageDialog(this, "Vinculo realizado com sucesso!");
        }catch(NoResultException ex){
            JOptionPane.showMessageDialog(this, "Monitor com o número de registro informado não encontrado!");
            return;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Vinculo não pode ser realizado!");
        }
        this.dispose();
    }//GEN-LAST:event_bVincularMouseClicked

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
            java.util.logging.Logger.getLogger(VincularFormm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VincularFormm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VincularFormm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VincularFormm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VincularFormm dialog = new VincularFormm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bPesquisarMonitor;
    private javax.swing.JButton bPesquisarMotorista;
    private javax.swing.JButton bVincular;
    private javax.swing.JFormattedTextField formatHorarioEstimado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pBackground;
    private javax.swing.JPanel pMenu;
    private javax.swing.JTable tMonitor;
    private javax.swing.JTable tMotorista;
    private javax.swing.JTextField txtMonitor;
    private javax.swing.JTextField txtMotorista;
    private javax.swing.JTextField txtRegistroMonitor;
    private javax.swing.JTextField txtRegistroMotorista;
    // End of variables declaration//GEN-END:variables
}
