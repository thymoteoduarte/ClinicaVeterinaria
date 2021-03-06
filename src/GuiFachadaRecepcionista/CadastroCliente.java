/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiFachadaRecepcionista;

/**
 *
 * @author alvanirjunior
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
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

        labelCadastroClient = new javax.swing.JLabel();
        labelNomeCliente = new javax.swing.JLabel();
        TextClienteCadastro = new javax.swing.JTextField();
        butaoCadastrarCliente = new javax.swing.JButton();
        checkboxMCastroCliente = new javax.swing.JCheckBox();
        checkboxFCadastroCliente = new javax.swing.JCheckBox();
        labelSexoCadastroCliente = new javax.swing.JLabel();
        labelFoneCadastroCliente = new javax.swing.JLabel();
        textFoneCadastroCliente = new javax.swing.JTextField();
        labelDataCadastroCliente = new javax.swing.JLabel();
        textDataCadastroCliente = new javax.swing.JTextField();
        labelEnderecoCadastroCliente = new javax.swing.JLabel();
        textEnderecoCadastroCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelCadastroClient.setFont(new java.awt.Font("Noto Sans", 2, 18)); // NOI18N
        labelCadastroClient.setText("Cadastro Cliente");

        labelNomeCliente.setText("Nome:");

        TextClienteCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextClienteCadastroActionPerformed(evt);
            }
        });

        butaoCadastrarCliente.setText("Cadastrar");
        butaoCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoCadastrarClienteActionPerformed(evt);
            }
        });

        checkboxMCastroCliente.setText("Masculino");
        checkboxMCastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxMCastroClienteActionPerformed(evt);
            }
        });

        checkboxFCadastroCliente.setText("Feminino");

        labelSexoCadastroCliente.setText("Sexo:");

        labelFoneCadastroCliente.setText("Fone:");

        textFoneCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFoneCadastroClienteActionPerformed(evt);
            }
        });

        labelDataCadastroCliente.setText("Data de Nascimento:");

        labelEnderecoCadastroCliente.setText("Endereco:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addComponent(butaoCadastrarCliente)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDataCadastroCliente)
                                .addGap(18, 18, 18)
                                .addComponent(textDataCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEnderecoCadastroCliente)
                                .addGap(27, 27, 27)
                                .addComponent(textEnderecoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCadastroClient)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelSexoCadastroCliente)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelFoneCadastroCliente)
                                            .addComponent(labelNomeCliente))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextClienteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkboxMCastroCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(checkboxFCadastroCliente))
                                    .addComponent(textFoneCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCadastroClient)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeCliente)
                    .addComponent(TextClienteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkboxMCastroCliente)
                    .addComponent(checkboxFCadastroCliente)
                    .addComponent(labelSexoCadastroCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFoneCadastroCliente)
                    .addComponent(textFoneCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataCadastroCliente)
                    .addComponent(textDataCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnderecoCadastroCliente)
                    .addComponent(textEnderecoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butaoCadastrarCliente)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextClienteCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextClienteCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextClienteCadastroActionPerformed

    private void butaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoCadastrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butaoCadastrarClienteActionPerformed

    private void checkboxMCastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxMCastroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxMCastroClienteActionPerformed

    private void textFoneCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFoneCadastroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFoneCadastroClienteActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextClienteCadastro;
    private javax.swing.JButton butaoCadastrarCliente;
    private javax.swing.JCheckBox checkboxFCadastroCliente;
    private javax.swing.JCheckBox checkboxMCastroCliente;
    private javax.swing.JLabel labelCadastroClient;
    private javax.swing.JLabel labelDataCadastroCliente;
    private javax.swing.JLabel labelEnderecoCadastroCliente;
    private javax.swing.JLabel labelFoneCadastroCliente;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelSexoCadastroCliente;
    private javax.swing.JTextField textDataCadastroCliente;
    private javax.swing.JTextField textEnderecoCadastroCliente;
    private javax.swing.JTextField textFoneCadastroCliente;
    // End of variables declaration//GEN-END:variables
}
