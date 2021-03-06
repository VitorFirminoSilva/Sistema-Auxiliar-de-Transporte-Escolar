/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.control.ControleHistoricoUtilizacao;
import br.edu.ifsp.pep.control.ControleMotorista;
import br.edu.ifsp.pep.control.ControleVeiculo;
import br.edu.ifsp.pep.model.HistoricoUtilizacao;
import br.edu.ifsp.pep.model.Motorista;
import br.edu.ifsp.pep.model.Veiculo;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class FormHistoricoUtilizacao extends javax.swing.JDialog {

    /**
     * Creates new form FormUtilizacaoVeiculo
     */
    public FormHistoricoUtilizacao(java.awt.Frame parent, boolean modal) {
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

        PBackground = new javax.swing.JPanel();
        PMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pUtilizar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pVoltar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tVinculo = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        botPesquisar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bEncerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        PBackground.setBackground(new java.awt.Color(58, 110, 165));
        PBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PMenu.setBackground(new java.awt.Color(51, 51, 51));
        PMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        PMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Administrador");
        PMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        pUtilizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pUtilizarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nova Utiliza????o");

        javax.swing.GroupLayout pUtilizarLayout = new javax.swing.GroupLayout(pUtilizar);
        pUtilizar.setLayout(pUtilizarLayout);
        pUtilizarLayout.setHorizontalGroup(
            pUtilizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUtilizarLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(77, 77, 77))
        );
        pUtilizarLayout.setVerticalGroup(
            pUtilizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUtilizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PMenu.add(pUtilizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 250, 40));

        pVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pVoltarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Voltar");

        javax.swing.GroupLayout pVoltarLayout = new javax.swing.GroupLayout(pVoltar);
        pVoltar.setLayout(pVoltarLayout);
        pVoltarLayout.setHorizontalGroup(
            pVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVoltarLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(51, 51, 51))
        );
        pVoltarLayout.setVerticalGroup(
            pVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        PMenu.add(pVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, -1, 30));

        PBackground.add(PMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 720));

        tVinculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Motorista", "Chassi", "Modelo", "Hora Inicio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tVinculo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tVinculo);

        PBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 580, -1));
        PBackground.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 230, -1));

        botPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        botPesquisar.setText("Pesquisar");
        botPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botPesquisarMouseClicked(evt);
            }
        });
        PBackground.add(botPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 120, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Nome:");
        PBackground.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, 20));

        bEncerrar.setText("Encerrar utiliza????o");
        bEncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bEncerrarMouseClicked(evt);
            }
        });
        PBackground.add(bEncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 590, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pUtilizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUtilizarMouseClicked
        // TODO add your handling code here:
        HistoricoForm tela = new HistoricoForm(null, true);
        tela.setVisible(true);
        botPesquisarMouseClicked(evt);
        //this.dispose();
    }//GEN-LAST:event_pUtilizarMouseClicked

    private void pVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVoltarMouseClicked
        // TODO add your handling code here:
        //RecursosHumanos tela = new RecursosHumanos(null, false);
        //tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pVoltarMouseClicked

    private void botPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botPesquisarMouseClicked
        // TODO add your handling code here:
        ControleHistoricoUtilizacao controle = new ControleHistoricoUtilizacao();
        List<HistoricoUtilizacao> list;
        DefaultTableModel model = (DefaultTableModel) tVinculo.getModel();
        model.setNumRows(0);
        list = controle.findByAtual();
        for(HistoricoUtilizacao h: list){
            model.addRow(new Object[] {h.getMotorista().getNumeroRegistro(), h.getVeiculo().getChassis(), h.getVeiculo().getModelo(), h.getHorarioInicio()});
        }
    }//GEN-LAST:event_botPesquisarMouseClicked

    private void bEncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEncerrarMouseClicked
        // TODO add your handling code here:
        ControleHistoricoUtilizacao controle = new ControleHistoricoUtilizacao();
        ControleMotorista controleMotorista = new ControleMotorista();
        ControleVeiculo controleVeiculo = new ControleVeiculo();
        int linha = tVinculo.getSelectedRow();
        if(linha != -1){
            Motorista motorista = controleMotorista.findByNumRegistro(tVinculo.getValueAt(linha, 0).toString());
            Veiculo veiculo = controleVeiculo.findByChassis(tVinculo.getValueAt(linha, 1).toString());
            HistoricoUtilizacao historico;
            historico = controle.findByRegistroChassi(motorista, veiculo);
            historico.setHorarioFim(new Date());
            controle.alterar(historico);
        }
        else{
            JOptionPane.showMessageDialog(this, "Selecione um Hist??rico");
        }
        botPesquisarMouseClicked(evt);
    }//GEN-LAST:event_bEncerrarMouseClicked

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
            java.util.logging.Logger.getLogger(FormHistoricoUtilizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHistoricoUtilizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHistoricoUtilizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHistoricoUtilizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormHistoricoUtilizacao dialog = new FormHistoricoUtilizacao(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PBackground;
    private javax.swing.JPanel PMenu;
    private javax.swing.JButton bEncerrar;
    private javax.swing.JButton botPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pUtilizar;
    private javax.swing.JPanel pVoltar;
    private javax.swing.JTable tVinculo;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
