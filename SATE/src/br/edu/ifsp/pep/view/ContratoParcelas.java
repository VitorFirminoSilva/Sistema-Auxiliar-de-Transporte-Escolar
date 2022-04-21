/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.control.ControleContrato;
import br.edu.ifsp.pep.control.ControleCrianca;
import br.edu.ifsp.pep.control.ControleLocal;
import br.edu.ifsp.pep.control.ControleParcela;
import br.edu.ifsp.pep.model.Contrato;
import br.edu.ifsp.pep.model.Crianca;
import br.edu.ifsp.pep.model.Local;
import br.edu.ifsp.pep.model.Parcela;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.Conversoes;

/**
 *
 * @author Aluno
 */
public class ContratoParcelas extends javax.swing.JDialog {

    /**
     * Creates new form RecursosHumanosCrianca
     */
    private Contrato contratoSelecionado = null;
    
    public void setContrato(Contrato contrato){
        this.contratoSelecionado = contrato;
        this.pesquisarParcelas();
    }
    public ContratoParcelas(java.awt.Frame parent, boolean modal) {
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
        pPagarParcela = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pVoltar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tParcelas = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

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

        pPagarParcela.setBackground(new java.awt.Color(255, 255, 255));
        pPagarParcela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pPagarParcelaMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Pagar Parcela");

        javax.swing.GroupLayout pPagarParcelaLayout = new javax.swing.GroupLayout(pPagarParcela);
        pPagarParcela.setLayout(pPagarParcelaLayout);
        pPagarParcelaLayout.setHorizontalGroup(
            pPagarParcelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPagarParcelaLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        pPagarParcelaLayout.setVerticalGroup(
            pPagarParcelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPagarParcelaLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        PMenu.add(pPagarParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 40));

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

        tParcelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Parcela", "Vencimento ", "Valor", "Contrato", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tParcelas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tParcelas);

        pBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 770, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setText("Parcelas");
        pBackground.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

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

    private void pPagarParcelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPagarParcelaMouseClicked
        Parcela parcela;
        ControleParcela controle = new ControleParcela();
        int num;
        int linha = tParcelas.getSelectedRow();
        if(linha != -1){
            for(int i=0; i<5; i++){
                if(tParcelas.getColumnName(i).equals("Num. Parcela")){
                    try{
                        num = Integer.parseInt(tParcelas.getValueAt(linha, i).toString());
                        parcela = controle.findByCodigoPendente(num, this.contratoSelecionado.getNumContrato());
                        parcela.setStatus("PG");
                        controle.alterar(parcela);
                        JOptionPane.showMessageDialog(this, "Parcela paga com sucesso!");
                    }catch(NoResultException ex){
                        JOptionPane.showMessageDialog(this, "Parcela não encontrada ou ja foi paga!");
                    }
                }
            }
        }
        pesquisarParcelas();
    }//GEN-LAST:event_pPagarParcelaMouseClicked

    private void pVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVoltarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_pVoltarMouseClicked

    private void pesquisarParcelas(){
        ControleParcela controle = new ControleParcela();

        DefaultTableModel model = (DefaultTableModel) tParcelas.getModel();
        Integer codigo = 0;
        codigo = contratoSelecionado.getNumContrato();
        model.setNumRows(0);
        
        List<Parcela> lista = controle.findByCodigoGR(codigo);
        
        for(Parcela p: lista){
            model.addRow(new Object[] {p.getNumParcela(), Conversoes.getDateFormatedToString(p.getDataVencimeto()), p.getValor(), p.getContrato().getNumContrato(), p.getStatus()});
        }
    }
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
            java.util.logging.Logger.getLogger(ContratoParcelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContratoParcelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContratoParcelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContratoParcelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ContratoParcelas dialog = new ContratoParcelas(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pBackground;
    private javax.swing.JPanel pPagarParcela;
    private javax.swing.JPanel pVoltar;
    private javax.swing.JTable tParcelas;
    // End of variables declaration//GEN-END:variables
}