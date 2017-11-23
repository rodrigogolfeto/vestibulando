/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.TelaFormularioQuestaoController;
import Controller.UsuarioController;
import Model.Questao;
import java.util.Vector;

/**
 *
 * @author Rodrigo Golfeto
 */
public class TelaFormularioQuestao extends javax.swing.JFrame {
    
    TelaFormularioQuestaoController telaFormularioQuestaoController;
    private String alternativa;
    private int cid;
    
    public TelaFormularioQuestao() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        Vector<String> itens = new Vector<String>();
        telaFormularioQuestaoController = new TelaFormularioQuestaoController();
        
        itens.add("Selecione uma opção");
        telaFormularioQuestaoController.buscarCategorias().forEach((item) -> {
            itens.add(item.getNome());
        });
        
        listaCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(itens));
        
        this.cid = 0;
        
        if (TelaFormularioQuestaoController.getOperacao().equals("editar")) {
            this.cid = TelaFormularioQuestaoController.getCidAlterar();
            Questao questao = TelaFormularioQuestaoController.buscarQuestao(this.getCid());
            
            txtDescricao.setText(questao.getDescricao());
            txtA.setText(questao.getAlts()[0].getDescricao());
            txtB.setText(questao.getAlts()[1].getDescricao());
            txtC.setText(questao.getAlts()[2].getDescricao());
            txtD.setText(questao.getAlts()[3].getDescricao());
            txtE.setText(questao.getAlts()[4].getDescricao());
            
            if (questao.getAlts()[0].isResultado()) {
                radioA.doClick();
            } else if (questao.getAlts()[1].isResultado()) {
                radioB.doClick();
            } else if (questao.getAlts()[2].isResultado()) {
                radioC.doClick();
            } else if (questao.getAlts()[3].isResultado()) {
                radioD.doClick();
            } else if (questao.getAlts()[4].isResultado()) {
                radioE.doClick();
            }
            
            listaCategoria.setSelectedItem(questao.getCategoria().getNome());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JLabel();
        btnConfiguracao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFecharSessao = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtB = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtC = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtD = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtE = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        radioA = new javax.swing.JRadioButton();
        radioB = new javax.swing.JRadioButton();
        radioC = new javax.swing.JRadioButton();
        radioD = new javax.swing.JRadioButton();
        radioE = new javax.swing.JRadioButton();
        listaCategoria = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtValidacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 600));

        txtUsuario.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(78, 78, 78));
        txtUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnConfiguracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/icone-configuracoes.png"))); // NOI18N
        btnConfiguracao.setBorder(null);
        btnConfiguracao.setBorderPainted(false);
        btnConfiguracao.setContentAreaFilled(false);
        btnConfiguracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracaoActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/logo-login.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(78, 78, 78));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gerenciamento de Questões");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 109, 109));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html><center>Software Desenvolvido na Disciplina de APSOO T02 - 2017/2<br>Aluno: Rodrigo Golfeto de Queiroz</center></html>");

        btnFecharSessao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/icone-fechar-sessao.png"))); // NOI18N
        btnFecharSessao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFecharSessao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharSessaoMouseClicked(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/btn-voltar.png"))); // NOI18N
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });

        jLabel1.setText("Descriçao");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        txtA.setColumns(20);
        txtA.setRows(5);
        jScrollPane2.setViewportView(txtA);

        txtB.setColumns(20);
        txtB.setRows(5);
        jScrollPane3.setViewportView(txtB);

        txtC.setColumns(20);
        txtC.setRows(5);
        jScrollPane4.setViewportView(txtC);

        txtD.setColumns(20);
        txtD.setRows(5);
        jScrollPane5.setViewportView(txtD);

        txtE.setColumns(20);
        txtE.setRows(5);
        jScrollPane6.setViewportView(txtE);

        jLabel5.setText("A");

        jLabel6.setText("B");

        jLabel7.setText("C");

        jLabel8.setText("D");

        jLabel9.setText("E");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioA);
        radioA.setText("verdadeira?");
        radioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioB);
        radioB.setText("verdadeira?");
        radioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioC);
        radioC.setText("verdadeira?");
        radioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioD);
        radioD.setText("verdadeira?");
        radioD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioE);
        radioE.setText("verdadeira?");
        radioE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEActionPerformed(evt);
            }
        });

        listaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCategoriaActionPerformed(evt);
            }
        });

        jLabel10.setText("Categoria");

        txtValidacao.setForeground(new java.awt.Color(255, 0, 51));
        txtValidacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnVoltar)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                .addGap(375, 375, 375))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConfiguracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFecharSessao)
                                .addGap(23, 23, 23))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtValidacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(listaCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioA)
                            .addComponent(radioB)
                            .addComponent(radioC)
                            .addComponent(radioD)
                            .addComponent(radioE))))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(403, 403, 403))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(btnConfiguracao)
                        .addComponent(txtUsuario)
                        .addComponent(btnFecharSessao))
                    .addComponent(jLabel2)
                    .addComponent(btnVoltar))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioA)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnLimpar)
                    .addComponent(btnSalvar))
                .addGap(18, 18, 18)
                .addComponent(txtValidacao)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracaoActionPerformed
        super.dispose();
        
        if (UsuarioController.getUsuarioLogado().getAdministrador().equals("S")) {
            TelaListarQuestao.main(null);
        } else {
            TelaConfiguracao.main(null);
        }
    }//GEN-LAST:event_btnConfiguracaoActionPerformed

    private void btnFecharSessaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharSessaoMouseClicked
        // TODO add your handling code here:
        super.dispose();
        TelaLogin.main(null);
    }//GEN-LAST:event_btnFecharSessaoMouseClicked

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        super.dispose();
        TelaListarQuestao.main(null);
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (telaFormularioQuestaoController.validacaoFormulario((String) listaCategoria.getSelectedItem(), txtDescricao.getText(), txtA.getText(), txtB.getText(), txtC.getText(), txtD.getText(), txtE.getText(), this.getAlternativa()).equals("")) {
            txtValidacao.setText("");
            telaFormularioQuestaoController.salvarFormulario(this.getCid(), (String) listaCategoria.getSelectedItem(), txtDescricao.getText(), txtA.getText(), txtB.getText(), txtC.getText(), txtD.getText(), txtE.getText(), this.getAlternativa());
            super.dispose();
            TelaListarQuestao.main(null);
        } else {
            txtValidacao.setText(telaFormularioQuestaoController.validacaoFormulario((String) listaCategoria.getSelectedItem(), txtDescricao.getText(), txtA.getText(), txtB.getText(), txtC.getText(), txtD.getText(), txtE.getText(), this.getAlternativa()));
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        super.dispose();
        TelaListarQuestao.main(null);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void radioCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCActionPerformed
        // TODO add your handling code here:
        marcarVerdadeira("C");
    }//GEN-LAST:event_radioCActionPerformed

    private void radioEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEActionPerformed
        // TODO add your handling code here:
        marcarVerdadeira("E");
    }//GEN-LAST:event_radioEActionPerformed

    private void listaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaCategoriaActionPerformed

    private void radioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAActionPerformed
        // TODO add your handling code here:
        marcarVerdadeira("A");
    }//GEN-LAST:event_radioAActionPerformed

    private void radioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBActionPerformed
        // TODO add your handling code here:
        marcarVerdadeira("B");
    }//GEN-LAST:event_radioBActionPerformed

    private void radioDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDActionPerformed
        // TODO add your handling code here:
        marcarVerdadeira("D");
    }//GEN-LAST:event_radioDActionPerformed
    
    private void marcarVerdadeira(String alt) {
        this.alternativa = alt;
    }
    
    public int getCid() {
        return cid;
    }
    
    public void setCid(int cid) {
        this.cid = cid;
    }
    
    public String getAlternativa() {
        return alternativa;
    }
    
    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
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
            java.util.logging.Logger.getLogger(TelaFormularioQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFormularioQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFormularioQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFormularioQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFormularioQuestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfiguracao;
    private javax.swing.JLabel btnFecharSessao;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> listaCategoria;
    private javax.swing.JRadioButton radioA;
    private javax.swing.JRadioButton radioB;
    private javax.swing.JRadioButton radioC;
    private javax.swing.JRadioButton radioD;
    private javax.swing.JRadioButton radioE;
    private javax.swing.JTextArea txtA;
    private javax.swing.JTextArea txtB;
    private javax.swing.JTextArea txtC;
    private javax.swing.JTextArea txtD;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextArea txtE;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel txtValidacao;
    // End of variables declaration//GEN-END:variables
}
