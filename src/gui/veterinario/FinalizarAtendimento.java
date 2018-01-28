/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.veterinario;

/**
 *
 * @author alvanirjunior
 */
public class FinalizarAtendimento extends javax.swing.JFrame {

    /**
     * Creates new form FinalizarAtendimento
     */
    public FinalizarAtendimento() {
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
        labelNomeVetFinalizarAtedimento = new javax.swing.JLabel();
        textNomeVetFinalizarAtedimento = new javax.swing.JTextField();
        labelObsFinalizarAtedimento = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1OBSFinalizarAtedimento = new javax.swing.JTextArea();
        labelNomeCliente = new javax.swing.JLabel();
        textNomeClienteFinalizarAtedimento = new javax.swing.JTextField();
        labelDataNcFinalizarAtedimento = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        labelNomeAnimalFinalizarAtedimento = new javax.swing.JLabel();
        textNomeAnimalFinalizarAtedimento = new javax.swing.JTextField();
        BotaoFinalizarAtedimento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelCadastroClient.setFont(new java.awt.Font("Noto Sans", 2, 18)); // NOI18N
        labelCadastroClient.setText("Finalizar Atendimento");

        labelNomeVetFinalizarAtedimento.setText("Nome do Veterinario:");

        labelObsFinalizarAtedimento.setText("Observação:");

        jTextArea1OBSFinalizarAtedimento.setColumns(20);
        jTextArea1OBSFinalizarAtedimento.setRows(5);
        jScrollPane1.setViewportView(jTextArea1OBSFinalizarAtedimento);

        labelNomeCliente.setText("Nome do Cliente:");

        labelDataNcFinalizarAtedimento.setText("Data:");

        labelNomeAnimalFinalizarAtedimento.setText("Nome do Animal:");

        BotaoFinalizarAtedimento.setText("Finalizar Atendimento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(labelCadastroClient))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeAnimalFinalizarAtedimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textNomeAnimalFinalizarAtedimento))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDataNcFinalizarAtedimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelObsFinalizarAtedimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeVetFinalizarAtedimento)
                                .addGap(18, 18, 18)
                                .addComponent(textNomeVetFinalizarAtedimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textNomeClienteFinalizarAtedimento)))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoFinalizarAtedimento)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCadastroClient)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeVetFinalizarAtedimento)
                    .addComponent(textNomeVetFinalizarAtedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelObsFinalizarAtedimento)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeCliente)
                    .addComponent(textNomeClienteFinalizarAtedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataNcFinalizarAtedimento)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeAnimalFinalizarAtedimento)
                    .addComponent(textNomeAnimalFinalizarAtedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(BotaoFinalizarAtedimento)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FinalizarAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalizarAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalizarAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalizarAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalizarAtendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoFinalizarAtedimento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1OBSFinalizarAtedimento;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelCadastroClient;
    private javax.swing.JLabel labelDataNcFinalizarAtedimento;
    private javax.swing.JLabel labelNomeAnimalFinalizarAtedimento;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelNomeVetFinalizarAtedimento;
    private javax.swing.JLabel labelObsFinalizarAtedimento;
    private javax.swing.JTextField textNomeAnimalFinalizarAtedimento;
    private javax.swing.JTextField textNomeClienteFinalizarAtedimento;
    private javax.swing.JTextField textNomeVetFinalizarAtedimento;
    // End of variables declaration//GEN-END:variables
}
