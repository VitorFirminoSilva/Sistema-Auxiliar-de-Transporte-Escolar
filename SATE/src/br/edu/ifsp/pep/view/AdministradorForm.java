/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.control.ControleAdministrador;
import br.edu.ifsp.pep.control.ControleFuncionario;
import br.edu.ifsp.pep.model.Administrador;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import util.Conversoes;

/**
 *
 * @author Aluno
 */
public class AdministradorForm extends javax.swing.JDialog {

    private Administrador administrador = null;
    public AdministradorForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;    
        formatNumRegistro.setText(administrador.getNumeroRegistro());
        formatNumRegistro.setEnabled(false);
        formatDataNascimento.setText(Conversoes.getDateFormatedToString(administrador.getDataNascimento()));
        txtNome.setText(administrador.getNomeFuncionario());
        CSexo.setSelectedItem(administrador.getSexo());
        txtCpf.setText(administrador.getCpf());
        formatDataNascimento.setText(administrador.getDataNascimento().toString());
        txtNaturalidade.setText(administrador.getNaturalidade());
        txtNomePai.setText(administrador.getNomePai());
        txtNomeMae.setText(administrador.getNomeMae());
        
        CEscolaridade.setSelectedItem(administrador.getEscolaridade());

        CEstadoCivil.setSelectedItem(administrador.getEstadoCivil());
        
        
        txtEmail.setText(administrador.getEmail());
        txtEndereco.setText(administrador.getEndereco());
        txtSalarioBase.setText(String.valueOf(administrador.getSalarioBase()));
        if(administrador.isStatus() == true){
            CStatus.setSelectedIndex(0);
        }else{
            CStatus.setSelectedIndex(1);
        }
        txtNumeroConta.setText(administrador.getNumeroConta());
        txtUsuario.setText(administrador.getUsuario());
        txtSenha.setText(administrador.getSenha());        
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        CSexo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNaturalidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNomePai = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNomeMae = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        CEscolaridade = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        CEstadoCivil = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtSalarioBase = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        CStatus = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtNumeroConta = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        pCancelar = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        pSalvar = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        formatNumRegistro = new javax.swing.JFormattedTextField();
        formatDataNascimento = new javax.swing.JFormattedTextField();
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
        jLabel5.setText("Cadastro Administrador");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Sexo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("N° Registro:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 340, -1));

        CSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outros" }));
        jPanel2.add(CSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 120, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Nome:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("CPF:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Data Nascimento:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Naturalidade:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));
        jPanel2.add(txtNaturalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 200, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Nome do Pai:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel2.add(txtNomePai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 350, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Nome da Mãe:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));
        jPanel2.add(txtNomeMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 340, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Escolaridade:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        CEscolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Superior", "Medio Completo", "Fundamenta I Completo", "Fundamenta II Completo" }));
        jPanel2.add(CEscolaridade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 170, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("Estado civil:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        CEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo", " " }));
        jPanel2.add(CEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("Email:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 340, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("Endereço:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));
        jPanel2.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 350, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("Salário base:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        txtSalarioBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSalarioBaseKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalarioBaseKeyTyped(evt);
            }
        });
        jPanel2.add(txtSalarioBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 170, -1));

        jLabel19.setText("Status:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        CStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        CStatus.setEnabled(false);
        jPanel2.add(CStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 120, -1));

        jLabel20.setText("Número da conta:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));
        jPanel2.add(txtNumeroConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 200, -1));

        jLabel22.setText("Usuário:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 350, -1));

        jLabel23.setText("Senha:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));
        jPanel2.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 340, -1));

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

        jPanel2.add(pCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 140, 30));

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

        jPanel2.add(pSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, 150, 30));

        formatNumRegistro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jPanel2.add(formatNumRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, -1));

        try {
            formatDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(formatDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 120, -1));

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, -1));

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
        
        Administrador administrador = new Administrador();
        ControleAdministrador controle = new ControleAdministrador();
        ControleFuncionario controGeral = new ControleFuncionario();

        if (formatNumRegistro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo N° Registro!");
            formatNumRegistro.requestFocus();
            return;
        }else if(this.administrador==null){
            try {
                controGeral.findByGeral(formatNumRegistro.getText());
                JOptionPane.showMessageDialog(this, "Funcionário com o número de registro já existe!");
                return;
            } catch (NoResultException ex) {
             
            }
        }
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome!");
            txtNome.requestFocus();
            return;
        }
        if (txtCpf.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CPF!");
            txtCpf.requestFocus();
            return;
        }
        if (formatDataNascimento.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Data Nascimento!");
            formatDataNascimento.requestFocus();
            return;
        }
        if (txtNaturalidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Naturalidade!");
            txtNaturalidade.requestFocus();
            return;
        }
        if (txtNomePai.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome Pai!");
            txtNomePai.requestFocus();
            return;
        }
        if (txtNomeMae.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome Mãe!");
            txtNomeMae.requestFocus();
            return;
        }
        if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo E-mail!");
            txtEmail.requestFocus();
            return;
        }
        if (txtEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Endereço!");
            txtEndereco.requestFocus();
            return;
        }
        if (txtSalarioBase.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Salário Base!");
            txtSalarioBase.requestFocus();
            return;
        }
        if (txtNumeroConta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Número da Conta!");
            txtNumeroConta.requestFocus();
            return;
        }
        if (txtUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Usuário!");
            txtUsuario.requestFocus();
            return;
        }
        if (txtSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Senha!");
            txtSenha.requestFocus();
            return;
        }
        

        administrador.setNumeroRegistro(formatNumRegistro.getText());
        administrador.setNomeFuncionario(txtNome.getText());
        administrador.setCpf(txtCpf.getText());
        administrador.setDataNascimento(Conversoes.getDateOfString(formatDataNascimento.getText()));
        administrador.setNaturalidade(txtNaturalidade.getText());
        administrador.setNomePai(txtNomePai.getText());
        administrador.setNomeMae(txtNomeMae.getText());
        administrador.setEmail(txtEmail.getText());
        administrador.setEndereco(txtEndereco.getText());
        administrador.setSalarioBase(Double.parseDouble(txtSalarioBase.getText()));
        administrador.setNumeroConta(txtNumeroConta.getText());
        administrador.setUsuario(txtUsuario.getText());
        administrador.setSenha(txtSenha.getText());

        administrador.setStatus(true);
        administrador.setEscolaridade(CEscolaridade.getSelectedItem().toString());
        administrador.setEstadoCivil(CEstadoCivil.getSelectedItem().toString());
        administrador.setSexo(CSexo.getSelectedItem().toString());
        
        
        if(this.administrador==null){
            
            try {
                controle.findByUsuario(txtUsuario.getText(), txtSenha.getText());
                 JOptionPane.showMessageDialog(null, "Usuario e Senha já estão sendo utilizados!");
                 txtUsuario.setText("");
                 txtSenha.setText("");
                 return;
            } catch (NoResultException ex) {
            }
            
            try {
                controle.inserir(administrador);
                JOptionPane.showMessageDialog(null, "Administrador cadastrado com sucesso!");
            } catch (Exception ex1) {
                JOptionPane.showMessageDialog(this, "Erro inesperado ao inserir administrador!");
            }
        }else{
            administrador.setNumeroRegistro(this.administrador.getNumeroRegistro());
            try {
                controle.alterar(administrador);
                JOptionPane.showMessageDialog(null, "Administrador alterado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar administrador!");
            }
        }
        
        //RecursosHumanosAdministrador tela = new RecursosHumanosAdministrador(null, false);
        //tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pSalvarMouseClicked

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        // TODO add your handling code here:
        String texto = txtNome.getText();
        if (texto.length() > 60) {
            texto = texto.substring(0, texto.length() - 1);
            txtNome.setText(texto);
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtSalarioBaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioBaseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioBaseKeyPressed

    private void txtSalarioBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioBaseKeyTyped
        String caracteres = "0987654321.,";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSalarioBaseKeyTyped

    private void pCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCancelarMouseClicked
        // TODO add your handling code here:
        //RecursosHumanosAdministrador tela = new RecursosHumanosAdministrador(null, false);
        //tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pCancelarMouseClicked

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
            java.util.logging.Logger.getLogger(AdministradorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdministradorForm dialog = new AdministradorForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> CEscolaridade;
    private javax.swing.JComboBox<String> CEstadoCivil;
    private javax.swing.JComboBox<String> CSexo;
    private javax.swing.JComboBox<String> CStatus;
    private javax.swing.JPanel PAlterar;
    private javax.swing.JPanel PBackground;
    private javax.swing.JPanel PCadastrar;
    private javax.swing.JPanel PExcluir;
    private javax.swing.JPanel PMenu;
    private javax.swing.JFormattedTextField formatDataNascimento;
    private javax.swing.JFormattedTextField formatNumRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pCancelar;
    private javax.swing.JPanel pSalvar;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNaturalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeMae;
    private javax.swing.JTextField txtNomePai;
    private javax.swing.JTextField txtNumeroConta;
    private javax.swing.JTextField txtSalarioBase;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
