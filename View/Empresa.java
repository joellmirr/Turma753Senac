/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Turma753Senac.View;

import com.mycompany.Turma753Senac.Model.PessoaJuridica;
import java.util.ArrayList;

/**
 *
 * @author joelmir
 */
public class Empresa extends javax.swing.JFrame {

    /**
     * Creates new form Empresa
     */
    public Empresa() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel_Nome = new javax.swing.JLabel();
        jLabel_CNPJ = new javax.swing.JLabel();
        jLabel_RazaoSocial = new javax.swing.JLabel();
        jLabel_InscricaoEstadual = new javax.swing.JLabel();
        jLabel_InscricaoMunicipal = new javax.swing.JLabel();
        jLabel_Telefone = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Endereco = new javax.swing.JLabel();
        jTextField_Nome = new javax.swing.JTextField();
        jTextField1_CNPJ = new javax.swing.JTextField();
        jTextFielD_RazaoSocial = new javax.swing.JTextField();
        jTextField_InsEstadual = new javax.swing.JTextField();
        jTextField_InsMunicipal = new javax.swing.JTextField();
        jTextField_Telefone = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_Endereco = new javax.swing.JTextField();
        jLabel_Segmento = new javax.swing.JLabel();
        jTextField_Segmento = new javax.swing.JTextField();
        jLabel_Titulo = new javax.swing.JLabel();
        jButton_Cadastrar = new javax.swing.JButton();
        jButton_sair = new javax.swing.JButton();
        jButton_limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Nome.setText("Nome");
        jLabel_Nome.setToolTipText("");

        jLabel_CNPJ.setText("CNPJ");

        jLabel_RazaoSocial.setText("Razao Social");

        jLabel_InscricaoEstadual.setText("Ins. Estadual");

        jLabel_InscricaoMunicipal.setText("Ins. Municipal");

        jLabel_Telefone.setText("Telefone");

        jLabel_Email.setText("e-mail");

        jLabel_Endereco.setText("Endereco");

        jLabel_Segmento.setText("Segmento");

        jLabel_Titulo.setText("Cadastro de Empresas:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Nome)
                                    .addComponent(jLabel_CNPJ)
                                    .addComponent(jLabel_RazaoSocial)
                                    .addComponent(jLabel_InscricaoEstadual)
                                    .addComponent(jLabel_InscricaoMunicipal)
                                    .addComponent(jLabel_Telefone)
                                    .addComponent(jLabel_Email)
                                    .addComponent(jLabel_Endereco)))
                            .addComponent(jLabel_Segmento))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                            .addComponent(jTextField_Email)
                            .addComponent(jTextField_Telefone)
                            .addComponent(jTextField_InsMunicipal)
                            .addComponent(jTextField_InsEstadual)
                            .addComponent(jTextField_Segmento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1_CNPJ)
                            .addComponent(jTextFielD_RazaoSocial)
                            .addComponent(jTextField_Nome)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(178, 178, 178))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_CNPJ)
                    .addComponent(jTextField1_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_RazaoSocial)
                    .addComponent(jTextFielD_RazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_InscricaoEstadual)
                    .addComponent(jTextField_InsEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_InscricaoMunicipal)
                    .addComponent(jTextField_InsMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel_Telefone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Email)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel_Endereco))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel_Segmento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Segmento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        jButton_Cadastrar.setText("Cadastra");
        jButton_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CadastrarActionPerformed(evt);
            }
        });

        jButton_sair.setText("Sair");
        jButton_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sairActionPerformed(evt);
            }
        });

        jButton_limpar.setText("Limpar");
        jButton_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton_limpar)
                .addGap(58, 58, 58)
                .addComponent(jButton_sair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_limpar))
                    .addComponent(jButton_sair, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limparActionPerformed
        // TODO add your handling code here:
        jTextField_Nome.setText("");
        jTextField1_CNPJ.setText("");
        jTextFielD_RazaoSocial.setText("");
        jTextField_InsEstadual.setText("");
        jTextField_InsMunicipal.setText("");
        jTextField_Telefone.setText("");
        jTextField_Email.setText("");
        jTextField_Endereco.setText("");
        jTextField_Segmento.setText("");
    }//GEN-LAST:event_jButton_limparActionPerformed

    private void jButton_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sairActionPerformed
        // TODO add your handling code here:
        boolean isClosed = false;
        setVisible(isClosed);
    }//GEN-LAST:event_jButton_sairActionPerformed

    private void jButton_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CadastrarActionPerformed
        // TODO add your handling code here:
        com.mycompany.Turma753Senac.Model.PessoaJuridica e = new com.mycompany.Turma753Senac.Model.PessoaJuridica();
        ArrayList<PessoaJuridica> ListaE = new ArrayList<>();
        
        e.setNome(jTextField_Nome.getText());
        e.setCnpj(jTextField1_CNPJ.getText());
        e.setRazaoSocial(jTextFielD_RazaoSocial.getText());
        e.setInscricaoEstadual(jTextField_InsEstadual.getText());
        e.setInscricaoMunicipal(jTextField_InsMunicipal.getText());
        e.setTelefone(jTextField_Telefone.getText());
        e.setEmail(jTextField_Email.getText());
        e.setEndereco(jTextField_Endereco.getText());
        e.setSegmento(jTextField_Segmento.getText());
        
        ListaE.add(e);
    }//GEN-LAST:event_jButton_CadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cadastrar;
    private javax.swing.JButton jButton_limpar;
    private javax.swing.JButton jButton_sair;
    private javax.swing.JLabel jLabel_CNPJ;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Endereco;
    private javax.swing.JLabel jLabel_InscricaoEstadual;
    private javax.swing.JLabel jLabel_InscricaoMunicipal;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JLabel jLabel_RazaoSocial;
    private javax.swing.JLabel jLabel_Segmento;
    private javax.swing.JLabel jLabel_Telefone;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFielD_RazaoSocial;
    private javax.swing.JTextField jTextField1_CNPJ;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Endereco;
    private javax.swing.JTextField jTextField_InsEstadual;
    private javax.swing.JTextField jTextField_InsMunicipal;
    private javax.swing.JTextField jTextField_Nome;
    private javax.swing.JTextField jTextField_Segmento;
    private javax.swing.JTextField jTextField_Telefone;
    // End of variables declaration//GEN-END:variables
}
