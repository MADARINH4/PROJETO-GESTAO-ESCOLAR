package views.Cordenador;
import controllers.Views.GerenteJanelas;

public class TelaPrincipal extends javax.swing.JFrame {
    GerenteJanelas gerenteDeJanelas; 
            
    public TelaPrincipal() {
        initComponents();
        this.gerenteDeJanelas = new GerenteJanelas(jPanelOverview);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelOverview = new javax.swing.JPanel();
        jPanelSala = new javax.swing.JPanel();
        jLabelIconSala = new javax.swing.JLabel();
        jLabelSalas = new javax.swing.JLabel();
        jPanelCadastroProfessor = new javax.swing.JPanel();
        jLabelIconTeacher = new javax.swing.JLabel();
        jLabelTeacher = new javax.swing.JLabel();
        jPanelCadastroAluno = new javax.swing.JPanel();
        jLabelIconAluno = new javax.swing.JLabel();
        jLabelAluno = new javax.swing.JLabel();
        jLabelBackgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelOverview.setBackground(new java.awt.Color(231, 239, 248));
        jPanelOverview.setForeground(new java.awt.Color(231, 239, 248));
        getContentPane().add(jPanelOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -40, 1050, 760));

        jPanelSala.setBackground(new java.awt.Color(91, 124, 254));
        jPanelSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSalaMouseClicked(evt);
            }
        });

        jLabelIconSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/iconSala.png"))); // NOI18N

        jLabelSalas.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabelSalas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalas.setText("SALAS");

        javax.swing.GroupLayout jPanelSalaLayout = new javax.swing.GroupLayout(jPanelSala);
        jPanelSala.setLayout(jPanelSalaLayout);
        jPanelSalaLayout.setHorizontalGroup(
            jPanelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconSala, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanelSalaLayout.setVerticalGroup(
            jPanelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalaLayout.createSequentialGroup()
                .addComponent(jLabelIconSala, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 50));

        jPanelCadastroProfessor.setBackground(new java.awt.Color(91, 124, 254));
        jPanelCadastroProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCadastroProfessorMouseClicked(evt);
            }
        });

        jLabelIconTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/iconTeacher.png"))); // NOI18N

        jLabelTeacher.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabelTeacher.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTeacher.setText("CADASTRO PROFESSOR");

        javax.swing.GroupLayout jPanelCadastroProfessorLayout = new javax.swing.GroupLayout(jPanelCadastroProfessor);
        jPanelCadastroProfessor.setLayout(jPanelCadastroProfessorLayout);
        jPanelCadastroProfessorLayout.setHorizontalGroup(
            jPanelCadastroProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCadastroProfessorLayout.setVerticalGroup(
            jPanelCadastroProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroProfessorLayout.createSequentialGroup()
                .addComponent(jLabelIconTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelCadastroProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 220, 50));

        jPanelCadastroAluno.setBackground(new java.awt.Color(91, 124, 254));
        jPanelCadastroAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCadastroAlunoMouseClicked(evt);
            }
        });

        jLabelIconAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/iconStudent.png"))); // NOI18N

        jLabelAluno.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabelAluno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAluno.setText("CADASTRO ALUNO");

        javax.swing.GroupLayout jPanelCadastroAlunoLayout = new javax.swing.GroupLayout(jPanelCadastroAluno);
        jPanelCadastroAluno.setLayout(jPanelCadastroAlunoLayout);
        jPanelCadastroAlunoLayout.setHorizontalGroup(
            jPanelCadastroAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCadastroAlunoLayout.setVerticalGroup(
            jPanelCadastroAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelCadastroAlunoLayout.createSequentialGroup()
                .addComponent(jLabelIconAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCadastroAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 220, 50));

        jLabelBackgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/telaPrincipal.png"))); // NOI18N
        getContentPane().add(jLabelBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalaMouseClicked
         gerenteDeJanelas.abrirJanelas(TelaSalas.getInstancia());
    }//GEN-LAST:event_jPanelSalaMouseClicked

    private void jPanelCadastroProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastroProfessorMouseClicked
        gerenteDeJanelas.abrirJanelas(TelaCadastroProfessor.getInstancia());
    }//GEN-LAST:event_jPanelCadastroProfessorMouseClicked

    private void jPanelCadastroAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastroAlunoMouseClicked
        gerenteDeJanelas.abrirJanelas(TelaCadastroAluno.getInstancia());
    }//GEN-LAST:event_jPanelCadastroAlunoMouseClicked

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
    private javax.swing.JLabel jLabelAluno;
    private javax.swing.JLabel jLabelBackgroud;
    private javax.swing.JLabel jLabelIconAluno;
    private javax.swing.JLabel jLabelIconSala;
    private javax.swing.JLabel jLabelIconTeacher;
    private javax.swing.JLabel jLabelSalas;
    private javax.swing.JLabel jLabelTeacher;
    private javax.swing.JPanel jPanelCadastroAluno;
    private javax.swing.JPanel jPanelCadastroProfessor;
    private javax.swing.JPanel jPanelOverview;
    private javax.swing.JPanel jPanelSala;
    // End of variables declaration//GEN-END:variables
}