package sistema.de.controle.universidade;
public class Professor extends javax.swing.JFrame {
    public Professor() {
        initComponents();
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextSistemaDeControleDisDos = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        buscarAluno = new javax.swing.JButton();
        botaoVerificarMsg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextSistemaDeControleDisDos.setAlignment(java.awt.Label.CENTER);
        TextSistemaDeControleDisDos.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        TextSistemaDeControleDisDos.setText("PROFESSOR");

        buscarAluno.setText("BUSCAR ALUNO");
        buscarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAlunoActionPerformed(evt);
            }
        });

        botaoVerificarMsg.setText("VERIFICAR MENSAGEM");
        botaoVerificarMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerificarMsgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextSistemaDeControleDisDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoVerificarMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 246, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextSistemaDeControleDisDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoVerificarMsg)
                .addGap(0, 206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAlunoActionPerformed
        // TODO add your handling code here:
        new BuscarAluno();
    }//GEN-LAST:event_buscarAlunoActionPerformed

    private void botaoVerificarMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerificarMsgActionPerformed
        // TODO add your handling code here:
        new ProfVerificaMsg();
    }//GEN-LAST:event_botaoVerificarMsgActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label TextSistemaDeControleDisDos;
    private javax.swing.JButton botaoVerificarMsg;
    private javax.swing.JButton buscarAluno;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
