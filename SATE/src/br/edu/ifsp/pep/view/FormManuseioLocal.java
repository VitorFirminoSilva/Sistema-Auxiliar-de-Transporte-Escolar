/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.control.ControleCrianca;
import br.edu.ifsp.pep.control.ControleLocal;
import br.edu.ifsp.pep.model.Crianca;
import br.edu.ifsp.pep.model.Local;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class FormManuseioLocal extends javax.swing.JDialog {

    /**
     * Creates new form RecursosHumanosCrianca
     */
    private Local localSelecionado = null;
    
    public FormManuseioLocal(java.awt.Frame parent, boolean modal) {
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
        PMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PCadastrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PAlterar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pVoltar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tLocal = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        botPesquisar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        pBackground.setBackground(new java.awt.Color(58, 110, 165));
        pBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        PMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        PCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PCadastrarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Cadastrar");

        javax.swing.GroupLayout PCadastrarLayout = new javax.swing.GroupLayout(PCadastrar);
        PCadastrar.setLayout(PCadastrarLayout);
        PCadastrarLayout.setHorizontalGroup(
            PCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCadastrarLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel2)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        PCadastrarLayout.setVerticalGroup(
            PCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PMenu.add(PCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 40));

        PAlterar.setBackground(new java.awt.Color(102, 102, 102));
        PAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PAlterarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Alterar");

        javax.swing.GroupLayout PAlterarLayout = new javax.swing.GroupLayout(PAlterar);
        PAlterar.setLayout(PAlterarLayout);
        PAlterarLayout.setHorizontalGroup(
            PAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAlterarLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel3)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        PAlterarLayout.setVerticalGroup(
            PAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAlterarLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        PMenu.add(PAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 250, 40));

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

        pBackground.add(PMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 720));

        tLocal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Rua", "Respons??vel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tLocal.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tLocal);

        pBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 580, -1));
        pBackground.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 230, -1));

        botPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        botPesquisar.setText("Pesquisar");
        botPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botPesquisarMouseClicked(evt);
            }
        });
        pBackground.add(botPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 90, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Nome:");
        pBackground.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PCadastrarMouseClicked
        // TODO add your handling code here:
        LocalForm tela = new LocalForm(null, true);
        tela.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_PCadastrarMouseClicked

    private void PAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PAlterarMouseClicked

        int linha = tLocal.getSelectedRow();
        Integer IdLocal = 0;
        if(linha != -1){        
            ControleLocal controle = new ControleLocal();
           for(int i=0; i<4; i++){
                if(tLocal.getColumnName(i).equals("Id")){
                    IdLocal = Integer.parseInt(tLocal.getValueAt(linha, i).toString());
                }               
            }  
            localSelecionado = controle.findByIdLocal(IdLocal);
            LocalForm tela = new LocalForm(null,true);
            tela.setLocal(localSelecionado);
            tela.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "selecione um local!");
        }
        botPesquisarMouseClicked(evt);
    }//GEN-LAST:event_PAlterarMouseClicked

    private void pVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVoltarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_pVoltarMouseClicked

    private void botPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botPesquisarMouseClicked
        // TODO add your handling code here:
        ControleLocal controle = new ControleLocal();
        List<Local> list;
        DefaultTableModel model = (DefaultTableModel) tLocal.getModel();
        model.setNumRows(0);
        list = controle.findByRua(txtPesquisar.getText());
        for(Local l: list){
            model.addRow(new Object[] {l.getIdLocal(), l.getTipo(), l.getRua(), l.getResponsavel()});
        }
    }//GEN-LAST:event_botPesquisarMouseClicked

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
            java.util.logging.Logger.getLogger(FormManuseioLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormManuseioLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormManuseioLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormManuseioLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormManuseioLocal dialog = new FormManuseioLocal(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PAlterar;
    private javax.swing.JPanel PCadastrar;
    private javax.swing.JPanel PMenu;
    private javax.swing.JButton botPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pBackground;
    private javax.swing.JPanel pVoltar;
    private javax.swing.JTable tLocal;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
