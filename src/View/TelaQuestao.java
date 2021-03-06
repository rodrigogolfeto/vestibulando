/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.TelaQuestaoController;
import Controller.UsuarioController;
import Model.Alternativa;
import java.awt.Color;

/**
 *
 * @author Rodrigo Golfeto
 */
public class TelaQuestao extends javax.swing.JFrame {
    
    private TelaQuestaoController telaQuestaoC;
    private int questaoAtual = 0;

    /**
     * Creates new form TelaQuestao
     */
    public TelaQuestao() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        telaQuestaoC = new TelaQuestaoController();
        this.txtDescricao.setText("<html>"+(this.questaoAtual+1)+") "+TelaQuestaoController.getQuestao()[this.questaoAtual].getDescricao()+"<br><br></html>");
        this.txtAltA.setText("<html>A) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[0].getDescricao()+"</html>");
        this.txtAltB.setText("<html>B) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[1].getDescricao()+"</html>");
        this.txtAltC.setText("<html>C) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[2].getDescricao()+"</html>");
        this.txtAltD.setText("<html>D) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[3].getDescricao()+"</html>");
        this.txtAltE.setText("<html>E) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[4].getDescricao()+"</html>");
        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/btn-anterior-vazio.png")));
        lblData.setText(UsuarioController.getDataAtual());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        txtDesistir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDesistir = new javax.swing.JLabel();
        containerQuestao = new javax.swing.JScrollPane();
        painelQuestao = new javax.swing.JPanel();
        txtDescricao = new javax.swing.JLabel();
        txtAltA = new javax.swing.JLabel();
        txtAltB = new javax.swing.JLabel();
        txtAltC = new javax.swing.JLabel();
        txtAltD = new javax.swing.JLabel();
        txtAltE = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JLabel();
        btnProximo = new javax.swing.JLabel();
        txtNavegacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 600));

        lblData.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(78, 78, 78));
        lblData.setText("11 Out 2017");

        txtDesistir.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtDesistir.setForeground(new java.awt.Color(248, 8, 79));
        txtDesistir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtDesistir.setText("desistir");
        txtDesistir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtDesistir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDesistirMouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/logo-login.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 109, 109));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html><center>Software Desenvolvido na Disciplina de APSOO T02 - 2017/2<br>Aluno: Rodrigo Golfeto de Queiroz</center></html>");

        btnDesistir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/icone-fechar-sessao.png"))); // NOI18N
        btnDesistir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesistir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesistirMouseClicked(evt);
            }
        });

        containerQuestao.setBackground(new java.awt.Color(255, 255, 255));
        containerQuestao.setBorder(null);
        containerQuestao.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        containerQuestao.setMaximumSize(null);
        containerQuestao.setMinimumSize(null);

        painelQuestao.setBackground(new java.awt.Color(255, 255, 255));
        painelQuestao.setMaximumSize(null);

        txtDescricao.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtDescricao.setText("<html>1) descricao</jhtml>");
        txtDescricao.setToolTipText("");

        txtAltA.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtAltA.setText("<html>a) alternativa</html>");
        txtAltA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAltA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAltAMouseClicked(evt);
            }
        });

        txtAltB.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtAltB.setText("<html>b) alternativa</html>");
        txtAltB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAltB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAltBMouseClicked(evt);
            }
        });

        txtAltC.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtAltC.setText("<html>c) alternativa</html>");
        txtAltC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAltC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAltCMouseClicked(evt);
            }
        });

        txtAltD.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtAltD.setText("<html>d) alternativa</html>");
        txtAltD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAltD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAltDMouseClicked(evt);
            }
        });

        txtAltE.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtAltE.setText("<html>e) alternativa</html>");
        txtAltE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAltE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAltEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelQuestaoLayout = new javax.swing.GroupLayout(painelQuestao);
        painelQuestao.setLayout(painelQuestaoLayout);
        painelQuestaoLayout.setHorizontalGroup(
            painelQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuestaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAltD, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAltE, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAltC)
                    .addComponent(txtAltB)
                    .addGroup(painelQuestaoLayout.createSequentialGroup()
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(txtAltA))
                .addContainerGap())
        );
        painelQuestaoLayout.setVerticalGroup(
            painelQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuestaoLayout.createSequentialGroup()
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAltA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAltB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAltC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAltD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAltE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        containerQuestao.setViewportView(painelQuestao);

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/btn-anterior.png"))); // NOI18N
        btnAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnteriorMouseClicked(evt);
            }
        });

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/btn-proximo.png"))); // NOI18N
        btnProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProximoMouseClicked(evt);
            }
        });

        txtNavegacao.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtNavegacao.setForeground(new java.awt.Color(109, 109, 109));
        txtNavegacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNavegacao.setText("1/10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(containerQuestao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblData)
                        .addGap(213, 213, 213)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(266, 266, 266)
                        .addComponent(txtDesistir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDesistir)))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(btnAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNavegacao, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProximo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtDesistir)
                            .addComponent(lblData)
                            .addComponent(btnDesistir)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)))
                .addGap(19, 19, 19)
                .addComponent(containerQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(txtNavegacao))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        containerQuestao.getVerticalScrollBar().setUI(new ScrollbarPersonalizado());
        containerQuestao.getHorizontalScrollBar().setVisible(false);

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

    private void txtDesistirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDesistirMouseClicked
        //vai pra tela principal
        telaQuestaoC.desistir(this);
    }//GEN-LAST:event_txtDesistirMouseClicked

    private void btnDesistirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesistirMouseClicked
        //vai pra tela principal
        telaQuestaoC.desistir(this);
    }//GEN-LAST:event_btnDesistirMouseClicked

    private void txtAltAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAltAMouseClicked
        txtAltA.setForeground(new Color(0, 0, 0));
        txtAltB.setForeground(new Color(150, 150, 150));
        txtAltC.setForeground(new Color(150, 150, 150));
        txtAltD.setForeground(new Color(150, 150, 150));
        txtAltE.setForeground(new Color(150, 150, 150));
        atualizarQuestaoSelecionada("A");
    }//GEN-LAST:event_txtAltAMouseClicked

    private void txtAltBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAltBMouseClicked
        txtAltA.setForeground(new Color(150, 150, 150));
        txtAltB.setForeground(new Color(0, 0, 0));
        txtAltC.setForeground(new Color(150, 150, 150));
        txtAltD.setForeground(new Color(150, 150, 150));
        txtAltE.setForeground(new Color(150, 150, 150));
        atualizarQuestaoSelecionada("B");
    }//GEN-LAST:event_txtAltBMouseClicked

    private void txtAltCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAltCMouseClicked
        txtAltA.setForeground(new Color(150, 150, 150));
        txtAltB.setForeground(new Color(150, 150, 150));
        txtAltC.setForeground(new Color(0, 0, 0));
        txtAltD.setForeground(new Color(150, 150, 150));
        txtAltE.setForeground(new Color(150, 150, 150));
        atualizarQuestaoSelecionada("C");
    }//GEN-LAST:event_txtAltCMouseClicked

    private void txtAltDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAltDMouseClicked
        txtAltA.setForeground(new Color(150, 150, 150));
        txtAltB.setForeground(new Color(150, 150, 150));
        txtAltC.setForeground(new Color(150, 150, 150));
        txtAltD.setForeground(new Color(0, 0, 0));
        txtAltE.setForeground(new Color(150, 150, 150));
        atualizarQuestaoSelecionada("D");
    }//GEN-LAST:event_txtAltDMouseClicked

    private void txtAltEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAltEMouseClicked
        txtAltA.setForeground(new Color(150, 150, 150));
        txtAltB.setForeground(new Color(150, 150, 150));
        txtAltC.setForeground(new Color(150, 150, 150));
        txtAltD.setForeground(new Color(150, 150, 150));
        txtAltE.setForeground(new Color(0, 0, 0));
        atualizarQuestaoSelecionada("E");
    }//GEN-LAST:event_txtAltEMouseClicked

    private void btnProximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximoMouseClicked
        if(this.questaoAtual<9){
            this.questaoAtual++;
            this.txtDescricao.setText("<html>"+(this.questaoAtual+1)+") "+TelaQuestaoController.getQuestao()[this.questaoAtual].getDescricao()+"<br><br></html>");
            this.txtAltA.setText("<html>A) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[0].getDescricao()+"</html>");
            this.txtAltB.setText("<html>B) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[1].getDescricao()+"</html>");
            this.txtAltC.setText("<html>C) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[2].getDescricao()+"</html>");
            this.txtAltD.setText("<html>D) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[3].getDescricao()+"</html>");
            this.txtAltE.setText("<html>E) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[4].getDescricao()+"</html>");
            this.atualizarNavegacao();
            this.marcarQuestao(TelaQuestaoController.getQuestao()[this.questaoAtual].getAlternativaEscolhida());
        }else{
            if(TelaQuestaoController.validarSimulado()==-1){
                TelaQuestaoController.finalizarSimulado(this);
            }else{
                this.questaoAtual = TelaQuestaoController.validarSimulado();
                this.txtDescricao.setText("<html>"+(this.questaoAtual+1)+") "+TelaQuestaoController.getQuestao()[this.questaoAtual].getDescricao()+"<br><br></html>");
                this.txtAltA.setText("<html>A) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[0].getDescricao()+"</html>");
                this.txtAltB.setText("<html>B) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[1].getDescricao()+"</html>");
                this.txtAltC.setText("<html>C) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[2].getDescricao()+"</html>");
                this.txtAltD.setText("<html>D) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[3].getDescricao()+"</html>");
                this.txtAltE.setText("<html>E) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[4].getDescricao()+"</html>");
                this.atualizarNavegacao();
                this.marcarQuestao(TelaQuestaoController.getQuestao()[this.questaoAtual].getAlternativaEscolhida());
            }
        }
    }//GEN-LAST:event_btnProximoMouseClicked

    private void btnAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseClicked
        if(this.questaoAtual>0){
            this.questaoAtual--;
            this.txtDescricao.setText("<html>"+(this.questaoAtual+1)+") "+TelaQuestaoController.getQuestao()[this.questaoAtual].getDescricao()+"<br><br></html>");
            this.txtAltA.setText("<html>A) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[0].getDescricao()+"</html>");
            this.txtAltB.setText("<html>B) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[1].getDescricao()+"</html>");
            this.txtAltC.setText("<html>C) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[2].getDescricao()+"</html>");
            this.txtAltD.setText("<html>D) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[3].getDescricao()+"</html>");
            this.txtAltE.setText("<html>E) "+TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[4].getDescricao()+"</html>");
            this.atualizarNavegacao();
            this.marcarQuestao(TelaQuestaoController.getQuestao()[this.questaoAtual].getAlternativaEscolhida());
        }
    }//GEN-LAST:event_btnAnteriorMouseClicked

    private void atualizarNavegacao(){
        if(this.questaoAtual==0){
            btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/btn-anterior-vazio.png")));
        }else{
            btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/btn-anterior.png")));
        }
        
        if(this.questaoAtual==9){
            btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/btn-resultado.png")));
        }else{
            btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/btn-proximo.png")));
        }
        
        this.txtNavegacao.setText((this.questaoAtual+1)+"/10");
    }
    
    private void atualizarQuestaoSelecionada(String alternativa){
        switch(alternativa){
            case "A":
                TelaQuestaoController.getQuestao()[this.questaoAtual].setAlternativaEscolhida(TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[0]);
                break;
            case "B":
                TelaQuestaoController.getQuestao()[this.questaoAtual].setAlternativaEscolhida(TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[1]);
                break;
            case "C":
                TelaQuestaoController.getQuestao()[this.questaoAtual].setAlternativaEscolhida(TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[2]);
                break;
            case "D":
                TelaQuestaoController.getQuestao()[this.questaoAtual].setAlternativaEscolhida(TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[3]);
                break;
            case "E":
                TelaQuestaoController.getQuestao()[this.questaoAtual].setAlternativaEscolhida(TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[4]);
                break;
        }
    }
    
    private void marcarQuestao(Alternativa alternativa){
        if(alternativa==null){
            txtAltA.setForeground(new Color(0, 0, 0));
            txtAltB.setForeground(new Color(0, 0, 0));
            txtAltC.setForeground(new Color(0, 0, 0));
            txtAltD.setForeground(new Color(0, 0, 0));
            txtAltE.setForeground(new Color(0, 0, 0));
        }else{
            if(alternativa.equals(TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[0])){
                txtAltA.setForeground(new Color(0, 0, 0));
                txtAltB.setForeground(new Color(150, 150, 150));
                txtAltC.setForeground(new Color(150, 150, 150));
                txtAltD.setForeground(new Color(150, 150, 150));
                txtAltE.setForeground(new Color(150, 150, 150));
            }else if(alternativa.equals(TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[1])){
                txtAltA.setForeground(new Color(150, 150, 150));
                txtAltB.setForeground(new Color(0, 0, 0));
                txtAltC.setForeground(new Color(150, 150, 150));
                txtAltD.setForeground(new Color(150, 150, 150));
                txtAltE.setForeground(new Color(150, 150, 150));
            }else if(alternativa.equals(TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[2])){
                txtAltA.setForeground(new Color(150, 150, 150));
                txtAltB.setForeground(new Color(150, 150, 150));
                txtAltC.setForeground(new Color(0, 0, 0));
                txtAltD.setForeground(new Color(150, 150, 150));
                txtAltE.setForeground(new Color(150, 150, 150));
            }else if(alternativa.equals(TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[3])){
                txtAltA.setForeground(new Color(150, 150, 150));
                txtAltB.setForeground(new Color(150, 150, 150));
                txtAltC.setForeground(new Color(150, 150, 150));
                txtAltD.setForeground(new Color(0, 0, 0));
                txtAltE.setForeground(new Color(150, 150, 150));
            }else if(alternativa.equals(TelaQuestaoController.getQuestao()[this.questaoAtual].getAlts()[4])){
                txtAltA.setForeground(new Color(150, 150, 150));
                txtAltB.setForeground(new Color(150, 150, 150));
                txtAltC.setForeground(new Color(150, 150, 150));
                txtAltD.setForeground(new Color(150, 150, 150));
                txtAltE.setForeground(new Color(0, 0, 0));
            }
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAnterior;
    private javax.swing.JLabel btnDesistir;
    private javax.swing.JLabel btnProximo;
    private javax.swing.JScrollPane containerQuestao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JPanel painelQuestao;
    private javax.swing.JLabel txtAltA;
    private javax.swing.JLabel txtAltB;
    private javax.swing.JLabel txtAltC;
    private javax.swing.JLabel txtAltD;
    private javax.swing.JLabel txtAltE;
    private javax.swing.JLabel txtDescricao;
    private javax.swing.JLabel txtDesistir;
    private javax.swing.JLabel txtNavegacao;
    // End of variables declaration//GEN-END:variables
}
