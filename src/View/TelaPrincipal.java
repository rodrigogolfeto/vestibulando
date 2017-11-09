/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.TelaPrincipalController;
import Controller.UsuarioController;

/**
 *
 * @author Rodrigo Golfeto
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    private TelaPrincipalController telaPrincipalC;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        txtUsuario.setText(UsuarioController.getUsuarioLogado().getNome());
        telaPrincipalC = new TelaPrincipalController();
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
        txtUsuario = new javax.swing.JLabel();
        btnConfiguracao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCNT = new javax.swing.JButton();
        btnCHT = new javax.swing.JButton();
        btnLCT = new javax.swing.JButton();
        btnMT = new javax.swing.JButton();
        btnGSTA = new javax.swing.JButton();
        btnFecharSessao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 600));

        lblData.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(78, 78, 78));
        lblData.setText("11 Out 2017");

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
        jLabel3.setText("Escolha a modalidade de sua preferência para gerar o simulado");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 109, 109));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html><center>Software Desenvolvido na Disciplina de APSOO T02 - 2017/2<br>Aluno: Rodrigo Golfeto de Queiroz</center></html>");

        btnCNT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/btn-cnt.png"))); // NOI18N
        btnCNT.setBorder(null);
        btnCNT.setBorderPainted(false);
        btnCNT.setContentAreaFilled(false);
        btnCNT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCNT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCNTMouseClicked(evt);
            }
        });

        btnCHT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/btn-cht.png"))); // NOI18N
        btnCHT.setBorder(null);
        btnCHT.setBorderPainted(false);
        btnCHT.setContentAreaFilled(false);
        btnCHT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCHT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCHTMouseClicked(evt);
            }
        });

        btnLCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/btn-lct.png"))); // NOI18N
        btnLCT.setBorder(null);
        btnLCT.setBorderPainted(false);
        btnLCT.setContentAreaFilled(false);
        btnLCT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLCTMouseClicked(evt);
            }
        });

        btnMT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/btn-mst.png"))); // NOI18N
        btnMT.setBorder(null);
        btnMT.setBorderPainted(false);
        btnMT.setContentAreaFilled(false);
        btnMT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMTMouseClicked(evt);
            }
        });

        btnGSTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/btn-gta.png"))); // NOI18N
        btnGSTA.setBorder(null);
        btnGSTA.setBorderPainted(false);
        btnGSTA.setContentAreaFilled(false);
        btnGSTA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGSTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGSTAMouseClicked(evt);
            }
        });

        btnFecharSessao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resources/icone-fechar-sessao.png"))); // NOI18N
        btnFecharSessao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFecharSessao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharSessaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblData)
                .addGap(213, 213, 213)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addGap(375, 375, 375))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCHT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCNT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGSTA))
                        .addGap(309, 309, 309))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfiguracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFecharSessao)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblData))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(btnConfiguracao)
                                .addComponent(txtUsuario)
                                .addComponent(btnFecharSessao))
                            .addComponent(jLabel2))))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(btnCNT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCHT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLCT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGSTA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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
        TelaConfiguracao.main(null);
    }//GEN-LAST:event_btnConfiguracaoActionPerformed

    private void btnFecharSessaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharSessaoMouseClicked
        // TODO add your handling code here:
        super.dispose();
        TelaLogin.main(null);
    }//GEN-LAST:event_btnFecharSessaoMouseClicked

    private void btnCNTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCNTMouseClicked
        // TODO add your handling code here: 
        telaPrincipalC.acessarQuestao("CNT",this);
    }//GEN-LAST:event_btnCNTMouseClicked

    private void btnCHTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCHTMouseClicked
        // TODO add your handling code here:
        telaPrincipalC.acessarQuestao("CHT",this);
    }//GEN-LAST:event_btnCHTMouseClicked

    private void btnLCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLCTMouseClicked
        // TODO add your handling code here:
        telaPrincipalC.acessarQuestao("LCT",this);
    }//GEN-LAST:event_btnLCTMouseClicked

    private void btnMTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMTMouseClicked
        // TODO add your handling code here:
        telaPrincipalC.acessarQuestao("MT",this);
    }//GEN-LAST:event_btnMTMouseClicked

    private void btnGSTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGSTAMouseClicked
        // TODO add your handling code here:
        telaPrincipalC.acessarQuestao("GSTA",this);
    }//GEN-LAST:event_btnGSTAMouseClicked
    
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCHT;
    private javax.swing.JButton btnCNT;
    private javax.swing.JButton btnConfiguracao;
    private javax.swing.JLabel btnFecharSessao;
    private javax.swing.JButton btnGSTA;
    private javax.swing.JButton btnLCT;
    private javax.swing.JButton btnMT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
