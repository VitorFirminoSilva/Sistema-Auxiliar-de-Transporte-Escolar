/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.control.ControleCliente;
import br.edu.ifsp.pep.control.ControleCrianca;
import br.edu.ifsp.pep.model.Cliente;
import br.edu.ifsp.pep.model.Crianca;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import util.Conversoes;

/**
 *
 * @author Aluno
 */
public class CriancaForm extends javax.swing.JDialog {

    /**
     * Creates new form CriancaForm
     */
    private Crianca crianca = null;
    
    public void setCrianca(Crianca crianca){
        this.crianca = crianca;
        txtCodigo.setText(String.valueOf(crianca.getCodCrianca()));
        txtCodigo.setEditable(false);
        txtNome.setText(crianca.getNome());
        formatDataNascimento.setText(Conversoes.getDateFormatedToString(crianca.getDataNascimento()));
        txtCpf.setText(this.crianca.getCliente().getCpfResponsavel());
        txtCpf.setEditable(false);
    }
    public CriancaForm(java.awt.Frame parent, boolean modal) {
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
        PExcluir = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PCadastrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PAlterar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        pCancelar = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        pSalvar = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        formatDataNascimento = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();

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
        PMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Excluir");

        javax.swing.GroupLayout PExcluirLayout = new javax.swing.GroupLayout(PExcluir);
        PExcluir.setLayout(PExcluirLayout);
        PExcluirLayout.setHorizontalGroup(
            PExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PExcluirLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel4)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        PExcluirLayout.setVerticalGroup(
            PExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PExcluirLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        PMenu.add(PExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 250, 40));

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

        PBackground.add(PMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 720));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Cadastro Criança");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Código:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("CPF responsável:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 350, -1));

        pCancelar.setBackground(new java.awt.Color(102, 102, 102));
        pCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCancelarMouseClicked(evt);
            }
        });
        pCancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setText("Cancelar");
        pCancelar.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 4, -1, 20));

        jPanel2.add(pCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 140, 30));

        pSalvar.setBackground(new java.awt.Color(102, 102, 102));
        pSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pSalvarMouseClicked(evt);
            }
        });
        pSalvar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setText("Cadastrar");
        pSalvar.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 4, -1, 20));

        jPanel2.add(pSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 150, 30));
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Data nascimento:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        try {
            formatDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(formatDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Nome:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 170, -1));

        PBackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 810, 700));

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

    private void pSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSalvarMouseClicked
        // TODO add your handling code here:
        ControleCliente controleCliente = new ControleCliente();
        Crianca crianca = new Crianca();
        ControleCrianca controle = new ControleCrianca();
        Cliente cliente = null;

        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Código!");
            txtCodigo.requestFocus();
            return;
        }else if(this.crianca == null){
            try {
                controle.findByCodigoG(Integer.parseInt(txtCodigo.getText()));
                JOptionPane.showMessageDialog(this, "Criança com o Código já existe!");
                return;
            }catch (NumberFormatException e)  {
                JOptionPane.showMessageDialog(this, "Código deve ser um inteiro");
            }catch (NoResultException ex){
                
            }
        }
        
        if (txtCpf.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo CPF!");
            txtCpf.requestFocus();
            return;
        }
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome!");
            txtNome.requestFocus();
            return;
        }
        if (formatDataNascimento.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Data Nascimento!");
            formatDataNascimento.requestFocus();
            return;
        }
        
        try{
            cliente = controleCliente.findByCpf(txtCpf.getText());
        }catch(NoResultException ex){
            JOptionPane.showMessageDialog(this, "CPF do responsável informado não encontrado!");
            return;
        }
        crianca.setNome(txtNome.getText());
        crianca.setCodCrianca(Integer.parseInt(txtCodigo.getText()));
        crianca.setDataNascimento(Conversoes.getDateOfString(formatDataNascimento.getText()));
        crianca.setCliente(cliente);
        crianca.setStatus(true);
        
        if(this.crianca==null){
            try {
                controle.inserir(crianca);
                JOptionPane.showMessageDialog(this, "Crianca cadastrado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar crianca!");
            }
        }else{
            crianca.setCodCrianca(this.crianca.getCodCrianca());
            try {
                controle.alterar(crianca);
                JOptionPane.showMessageDialog(this, "Crianca alterado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao alterar crianca!");
            }
        }

        //RecursosHumanosAdministrador tela = new RecursosHumanosAdministrador(null, false);
        //tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pSalvarMouseClicked

    private void pCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCancelarMouseClicked
        // TODO add your handling code here:
        //RecursosHumanosAdministrador tela = new RecursosHumanosAdministrador(null, false);
        //tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pCancelarMouseClicked

    private void PAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PAlterarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PAlterarMouseClicked

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
            java.util.logging.Logger.getLogger(CriancaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriancaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriancaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriancaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CriancaForm dialog = new CriancaForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PBackground;
    private javax.swing.JPanel PCadastrar;
    private javax.swing.JPanel PExcluir;
    private javax.swing.JPanel PMenu;
    private javax.swing.JFormattedTextField formatDataNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pCancelar;
    private javax.swing.JPanel pSalvar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}