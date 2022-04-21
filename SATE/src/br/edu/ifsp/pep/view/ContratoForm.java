/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.control.ControleCliente;
import br.edu.ifsp.pep.control.ControleContrato;
import br.edu.ifsp.pep.control.ControleCrianca;
import br.edu.ifsp.pep.control.ControleLocal;
import br.edu.ifsp.pep.control.ControleParcela;
import br.edu.ifsp.pep.model.Cliente;
import br.edu.ifsp.pep.model.Contrato;
import br.edu.ifsp.pep.model.Crianca;
import br.edu.ifsp.pep.model.Local;
import br.edu.ifsp.pep.model.Parcela;
import java.util.List;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.Conversoes;

/**
 *
 * @author Aluno
 */
public class ContratoForm extends javax.swing.JDialog {

    /**
     * Creates new form ViewClienteForm
     */
    private Contrato contrato = null;
    
    public void setContrato(Contrato contrato){
        this.contrato = contrato;
        txtCodCrianca.setText(String.valueOf(contrato.getCrianca().getCodCrianca()));
        txtCodCrianca.setEditable(false);
        botPesquisar.setVisible(false);
        botNovaCrianca.setVisible(false);
        
        jLabel6.setVisible(false);
        txtPesquisar.setVisible(false);
                
        txtDataInicio.setText(Conversoes.getDateFormatedToString(contrato.getDataInicio()));
        txtDataInicio.setEditable(false);
        
        txtDataFim.setText(Conversoes.getDateFormatedToString(contrato.getDataFim()));
        
        txtValor.setText(String.valueOf(contrato.getValorContrato()));
        
        txtidDestino.setText(String.valueOf(contrato.getLocalDestino().getIdLocal()));
        
        txtIdOrigem.setText(String.valueOf(contrato.getLocalOrigem().getIdLocal()));
    }
    public ContratoForm(java.awt.Frame parent, boolean modal) {
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
        pCancelar = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        pSalvar = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDataFim = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCrianca = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botPesquisar = new javax.swing.JButton();
        txtCodCrianca = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tOrigem = new javax.swing.JTable();
        txtOrigem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botPesquisaOrigem = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tDestino = new javax.swing.JTable();
        botPesquisaDestino = new javax.swing.JButton();
        txtDestino = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtIdOrigem = new javax.swing.JTextField();
        txtidDestino = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        botNovoLocal = new javax.swing.JButton();
        botNovaCrianca = new javax.swing.JButton();

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
        jLabel5.setText("Gerando Contrato");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

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

        jPanel2.add(pCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 140, 30));

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

        jPanel2.add(pSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, 150, 30));

        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 20));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Data de inicio:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        try {
            txtDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtDataFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Valor do contrato:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Data de fim:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));
        jPanel2.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, -1));

        tCrianca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF Responsável"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tCrianca.getTableHeader().setReorderingAllowed(false);
        tCrianca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCriancaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCrianca);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 460, 180));
        jPanel2.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 250, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Nome criança:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        botPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        botPesquisar.setText("Pesquisar");
        botPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botPesquisarMouseClicked(evt);
            }
        });
        jPanel2.add(botPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 90, -1));
        jPanel2.add(txtCodCrianca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Código criança");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        tOrigem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Rua", "Responsável"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tOrigem.getTableHeader().setReorderingAllowed(false);
        tOrigem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tOrigemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tOrigem);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 350, 180));
        jPanel2.add(txtOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 150, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Id origem:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, 20));

        botPesquisaOrigem.setBackground(new java.awt.Color(204, 204, 204));
        botPesquisaOrigem.setText("Pesquisar");
        botPesquisaOrigem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botPesquisaOrigemMouseClicked(evt);
            }
        });
        jPanel2.add(botPesquisaOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 90, -1));

        tDestino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Rua", "Responsável"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tDestino.getTableHeader().setReorderingAllowed(false);
        tDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDestinoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tDestino);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 350, 180));

        botPesquisaDestino.setBackground(new java.awt.Color(204, 204, 204));
        botPesquisaDestino.setText("Pesquisar");
        botPesquisaDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botPesquisaDestinoMouseClicked(evt);
            }
        });
        botPesquisaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPesquisaDestinoActionPerformed(evt);
            }
        });
        jPanel2.add(botPesquisaDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 90, -1));
        jPanel2.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 150, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Local destino:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Local origem:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));
        jPanel2.add(txtIdOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 70, -1));
        jPanel2.add(txtidDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 70, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Id destino:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, -1, 20));

        botNovoLocal.setText("Novo Local");
        botNovoLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botNovoLocalMouseClicked(evt);
            }
        });
        jPanel2.add(botNovoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, -1, -1));

        botNovaCrianca.setBackground(new java.awt.Color(204, 204, 204));
        botNovaCrianca.setText("Nova Criança");
        botNovaCrianca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botNovaCriancaMouseClicked(evt);
            }
        });
        jPanel2.add(botNovaCrianca, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 100, -1));

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

    private void pCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCancelarMouseClicked
        // TODO add your handling code here:
        //RecursosHumanosAdministrador tela = new RecursosHumanosAdministrador(null, false);
        //tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pCancelarMouseClicked

    private void pSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSalvarMouseClicked
        // TODO add your handling code here:

        Contrato contrato = new Contrato();
        ControleContrato controle = new ControleContrato();
        ControleCrianca controleCrianca = new ControleCrianca();
        ControleLocal controleLocal = new ControleLocal();

        if (txtDataInicio.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Data Inicio!");
            txtDataInicio.requestFocus();
            return;
        }
        if (txtDataFim.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Data Fim!");
            txtDataFim.requestFocus();
            return;
        }
        if (txtValor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Valor contrato!");
            txtValor.requestFocus();
            return;
        }
        if (txtCodCrianca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Código criança!");
            txtCodCrianca.requestFocus();
            return;
        }
        if (txtIdOrigem.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Id origem!");
            txtIdOrigem.requestFocus();
            return;
        }
        if (txtidDestino.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Id destino!");
            txtidDestino.requestFocus();
            return;
        }

        contrato.setDataInicio(Conversoes.getDateOfString(txtDataInicio.getText()));
        contrato.setDataFim(Conversoes.getDateOfString(txtDataFim.getText()));
        contrato.setValorContrato(Double.parseDouble(txtValor.getText()));
        try{
            contrato.setCrianca(controleCrianca.findByCodigo(Integer.parseInt(txtCodCrianca.getText())));
        }catch(NoResultException ex){
            JOptionPane.showMessageDialog(this, "Criança não encontrada!");
            return;
        }
        
        try{
            contrato.setLocalOrigem(controleLocal.findByIdLocal(Integer.parseInt(txtIdOrigem.getText())));
        }catch(NoResultException ex){
            JOptionPane.showMessageDialog(this, "Local de origem não encontrado!");
            return;
        }
        
        try{
            contrato.setLocalDestino(controleLocal.findByIdLocal(Integer.parseInt(txtidDestino.getText())));
        }catch(NoResultException ex){
            JOptionPane.showMessageDialog(this, "Local de destino não encontrado!");
            return;
        }
        
        if(this.contrato == null){
            try {
                controle.inserir(contrato);
                JOptionPane.showMessageDialog(null, "Contrato gerado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar contrato!");
            }
        }else{
            ControleParcela contParcela = new ControleParcela();
            try {
                contrato.setNumContrato(this.contrato.getNumContrato());
                List<Parcela> list = contParcela.findByContratoPG(this.contrato.getNumContrato());
                if(list.size() == 0){
                   controle.alterar(contrato);
                   JOptionPane.showMessageDialog(null, "Contrato alterado com sucesso!"); 
                }else{
                   JOptionPane.showMessageDialog(null, "Contrato não pode ser alterado se ja foi pago uma vez!"); 
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar Contrato!");
            }
        }

        //RecursosHumanosAdministrador tela = new RecursosHumanosAdministrador(null, false);
        //tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pSalvarMouseClicked

    private void tCriancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCriancaMouseClicked
        // TODO add your handling code here:
        int codigo;
        int linha = tCrianca.getSelectedRow();
        int coluna = 0;
        int flag = 0;
        if(linha != -1){
            for(int i = 0; i<3; i++){
                if(tCrianca.getColumnName(i).equals("Código")){
                    coluna = i;
                    flag = 1;
                }
            }
            if(flag == 1){
                txtCodCrianca.setText(tCrianca.getValueAt(linha, coluna).toString());
            }
        }
    }//GEN-LAST:event_tCriancaMouseClicked

    private void botPesquisaDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPesquisaDestinoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botPesquisaDestinoActionPerformed

    private void tOrigemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tOrigemMouseClicked
        // TODO add your handling code here:
        int codigo;
        int linha = tOrigem.getSelectedRow();
        int coluna = 0;
        int flag = 0;
        if(linha != -1){
            for(int i = 0; i<3; i++){
                if(tOrigem.getColumnName(i).equals("Código")){
                    coluna = i;
                    flag = 1;
                }
            }
            if(flag == 1){
                txtIdOrigem.setText(tOrigem.getValueAt(linha, coluna).toString());
            }
        }
    }//GEN-LAST:event_tOrigemMouseClicked

    private void tDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDestinoMouseClicked
        // TODO add your handling code here:
        int codigo;
        int linha = tDestino.getSelectedRow();
        int coluna = 0;
        int flag = 0;
        if(linha != -1){
            for(int i = 0; i<3; i++){
                if(tDestino.getColumnName(i).equals("Código")){
                    coluna = i;
                    flag = 1;
                }
            }
            if(flag == 1){
                txtidDestino.setText(tDestino.getValueAt(linha, coluna).toString());
            }
        }
    }//GEN-LAST:event_tDestinoMouseClicked

    private void botNovoLocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botNovoLocalMouseClicked
        // TODO add your handling code here:
        LocalForm tela = new LocalForm(null, true);
        tela.setVisible(true);
    }//GEN-LAST:event_botNovoLocalMouseClicked

    private void botPesquisaOrigemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botPesquisaOrigemMouseClicked
        // TODO add your handling code here:
        ControleLocal controle = new ControleLocal();
        List<Local> list;
        DefaultTableModel model = (DefaultTableModel) tOrigem.getModel();
        model.setNumRows(0);
        list = controle.findByRua(txtPesquisar.getText());
        for(Local l: list){
            model.addRow(new Object[] {l.getIdLocal(), l.getRua(), l.getResponsavel()});
        }
    }//GEN-LAST:event_botPesquisaOrigemMouseClicked

    private void botPesquisaDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botPesquisaDestinoMouseClicked
        // TODO add your handling code here:
        ControleLocal controle = new ControleLocal();
        List<Local> list;
        DefaultTableModel model = (DefaultTableModel) tDestino.getModel();
        model.setNumRows(0);
        list = controle.findByRua(txtPesquisar.getText());
        for(Local l: list){
            model.addRow(new Object[] {l.getIdLocal(), l.getRua(), l.getResponsavel()});
        }
    }//GEN-LAST:event_botPesquisaDestinoMouseClicked

    private void botPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botPesquisarMouseClicked
        // TODO add your handling code here:
        ControleCrianca controle = new ControleCrianca();
        List<Crianca> list;
        DefaultTableModel model = (DefaultTableModel) tCrianca.getModel();
        model.setNumRows(0);
        list = controle.findByNome(txtPesquisar.getText());
        for(Crianca c: list){
            model.addRow(new Object[] {c.getCodCrianca() ,c.getNome(), c.getCliente().getCpfResponsavel()});
        }
    }//GEN-LAST:event_botPesquisarMouseClicked

    private void botNovaCriancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botNovaCriancaMouseClicked
        // TODO add your handling code here:
        CriancaForm tela = new CriancaForm(null, true);
        tela.setVisible(true);
    }//GEN-LAST:event_botNovaCriancaMouseClicked

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
            java.util.logging.Logger.getLogger(ContratoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContratoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContratoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContratoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ContratoForm dialog = new ContratoForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botNovaCrianca;
    private javax.swing.JButton botNovoLocal;
    private javax.swing.JButton botPesquisaDestino;
    private javax.swing.JButton botPesquisaOrigem;
    private javax.swing.JButton botPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pCancelar;
    private javax.swing.JPanel pSalvar;
    private javax.swing.JTable tCrianca;
    private javax.swing.JTable tDestino;
    private javax.swing.JTable tOrigem;
    private javax.swing.JTextField txtCodCrianca;
    private javax.swing.JFormattedTextField txtDataFim;
    private javax.swing.JFormattedTextField txtDataInicio;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtIdOrigem;
    private javax.swing.JTextField txtOrigem;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtidDestino;
    // End of variables declaration//GEN-END:variables
}
