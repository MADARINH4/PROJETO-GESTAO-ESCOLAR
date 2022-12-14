package views.Cordenador;
import controllers.Views.GerenteJanelas;
import controllers.Views.JTextFieldOnlyNumbers;

public class TelaCadastroAluno extends javax.swing.JInternalFrame {
    //private static TelaCadastroAluno telaCadastroAluno;
    GerenteJanelas gerenteJanelas;
    
    /*public static TelaCadastroAluno getInstancia(){
        if(telaCadastroAluno == null){
            telaCadastroAluno = new TelaCadastroAluno();
        }
        return telaCadastroAluno;
    }*/
    public TelaCadastroAluno() {
        initComponents();
        this.gerenteJanelas = new GerenteJanelas(TelaPrincipal.jPanelOverview);
        jTextFieldCEP.setDocument(new JTextFieldOnlyNumbers());
        jTextFieldNumero.setDocument(new JTextFieldOnlyNumbers());
        jTextFieldTelefone.setDocument(new JTextFieldOnlyNumbers());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackgroud1 = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        jPanelBackgroudAnoLetivo = new javax.swing.JPanel();
        jLabelAnoLetivo = new javax.swing.JLabel();
        jPanelLists = new javax.swing.JPanel();
        AnoLetivo = new javax.swing.JScrollPane();
        jListAnoLetivo = new javax.swing.JList<>();
        jButtonFinalizarCadastro = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelCidade = new javax.swing.JLabel();
        jLabelUF = new javax.swing.JLabel();
        jLabelLogradouro = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelComplemento = new javax.swing.JLabel();
        jLabelNomeCompleto = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelResponsaveis = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldUF = new javax.swing.JTextField();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jTextFieldNomeCompleto = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldResponsaveis = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldCEP = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        backgroudCadastro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createCompoundBorder());
        setClosable(true);
        setForeground(new java.awt.Color(0, 0, 255));
        setMaximizable(true);
        setResizable(true);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1050, 790));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBackgroud1.setBackground(new java.awt.Color(231, 239, 248));
        jPanelBackgroud1.setForeground(new java.awt.Color(231, 239, 248));
        jPanelBackgroud1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTop.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTop.setForeground(new java.awt.Color(255, 255, 255));

        jPanelBackgroudAnoLetivo.setBackground(new java.awt.Color(246, 245, 245));

        jLabelAnoLetivo.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabelAnoLetivo.setForeground(new java.awt.Color(24, 33, 53));
        jLabelAnoLetivo.setText("Anos Letivos");

        javax.swing.GroupLayout jPanelBackgroudAnoLetivoLayout = new javax.swing.GroupLayout(jPanelBackgroudAnoLetivo);
        jPanelBackgroudAnoLetivo.setLayout(jPanelBackgroudAnoLetivoLayout);
        jPanelBackgroudAnoLetivoLayout.setHorizontalGroup(
            jPanelBackgroudAnoLetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroudAnoLetivoLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabelAnoLetivo)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanelBackgroudAnoLetivoLayout.setVerticalGroup(
            jPanelBackgroudAnoLetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAnoLetivo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackgroudAnoLetivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBackgroudAnoLetivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBackgroud1.add(jPanelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 310, 50));

        jPanelLists.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLists.setForeground(new java.awt.Color(255, 255, 255));

        AnoLetivo.setBorder(null);
        AnoLetivo.setColumnHeaderView(null);
        AnoLetivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jListAnoLetivo.setBackground(new java.awt.Color(246, 245, 245));
        jListAnoLetivo.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jListAnoLetivo.setForeground(new java.awt.Color(24, 33, 53));
        jListAnoLetivo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1º Ano Fundamental", "2º Ano Fundamental", "3º Ano Fundamental", "4º Ano Fundamental", "5º Ano Fundamental", "6º Ano Fundamental", "8º Ano Fundamental", "9º Ano Fundamental", "1º Ano Ensino Médio", "2º Ano Ensino Médio", "3º Ano Ensino Médio" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListAnoLetivo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListAnoLetivo.setSelectionBackground(new java.awt.Color(83, 116, 239));
        AnoLetivo.setViewportView(jListAnoLetivo);

        javax.swing.GroupLayout jPanelListsLayout = new javax.swing.GroupLayout(jPanelLists);
        jPanelLists.setLayout(jPanelListsLayout);
        jPanelListsLayout.setHorizontalGroup(
            jPanelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AnoLetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelListsLayout.setVerticalGroup(
            jPanelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AnoLetivo, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelBackgroud1.add(jPanelLists, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 310, 410));

        jButtonFinalizarCadastro.setBorder(null);
        jButtonFinalizarCadastro.setContentAreaFilled(false);
        jButtonFinalizarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFinalizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCadastroActionPerformed(evt);
            }
        });
        jPanelBackgroud1.add(jButtonFinalizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, 480, 70));

        jButtonCancelar.setBorder(null);
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelBackgroud1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, 330, 70));

        jLabelCidade.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(24, 33, 53));
        jLabelCidade.setText("Cidade *");
        jPanelBackgroud1.add(jLabelCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 175, 60, 20));

        jLabelUF.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelUF.setForeground(new java.awt.Color(24, 33, 53));
        jLabelUF.setText("UF *");
        jPanelBackgroud1.add(jLabelUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 175, 50, 20));

        jLabelLogradouro.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelLogradouro.setForeground(new java.awt.Color(24, 33, 53));
        jLabelLogradouro.setText("Logradouro *");
        jPanelBackgroud1.add(jLabelLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 70, -1));

        jLabelNumero.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(24, 33, 53));
        jLabelNumero.setText("Número *");
        jPanelBackgroud1.add(jLabelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 60, -1));

        jLabelBairro.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(24, 33, 53));
        jLabelBairro.setText("Bairro *");
        jPanelBackgroud1.add(jLabelBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 285, 50, 20));

        jLabelComplemento.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelComplemento.setForeground(new java.awt.Color(24, 33, 53));
        jLabelComplemento.setText("Complemento");
        jPanelBackgroud1.add(jLabelComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 285, 80, 20));

        jLabelNomeCompleto.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelNomeCompleto.setForeground(new java.awt.Color(24, 33, 53));
        jLabelNomeCompleto.setText("Nome completo *");
        jPanelBackgroud1.add(jLabelNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 100, 20));

        jLabelEmail.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(24, 33, 53));
        jLabelEmail.setText("Email *");
        jPanelBackgroud1.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 40, 30));

        jLabelResponsaveis.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelResponsaveis.setForeground(new java.awt.Color(24, 33, 53));
        jLabelResponsaveis.setText("Responsáveis *");
        jPanelBackgroud1.add(jLabelResponsaveis, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 80, -1));

        jLabelSenha.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(24, 33, 53));
        jLabelSenha.setText("Senha *");
        jPanelBackgroud1.add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 555, 50, 20));

        jLabelTelefone.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(24, 33, 53));
        jLabelTelefone.setText("Telefone *");
        jPanelBackgroud1.add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 555, 60, 20));

        jLabelCEP.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabelCEP.setForeground(new java.awt.Color(24, 33, 53));
        jLabelCEP.setText("CEP *");
        jPanelBackgroud1.add(jLabelCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 40, -1));

        jTextFieldCidade.setBackground(new java.awt.Color(246, 245, 245));
        jTextFieldCidade.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextFieldCidade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCidade.setToolTipText("");
        jTextFieldCidade.setBorder(null);
        jPanelBackgroud1.add(jTextFieldCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 330, 20));

        jTextFieldUF.setBackground(new java.awt.Color(246, 245, 245));
        jTextFieldUF.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextFieldUF.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldUF.setToolTipText("");
        jTextFieldUF.setBorder(null);
        jPanelBackgroud1.add(jTextFieldUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 100, 20));

        jTextFieldLogradouro.setBackground(new java.awt.Color(246, 245, 245));
        jTextFieldLogradouro.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextFieldLogradouro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldLogradouro.setToolTipText("");
        jTextFieldLogradouro.setBorder(null);
        jPanelBackgroud1.add(jTextFieldLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 320, 30));

        jTextFieldNumero.setBackground(new java.awt.Color(246, 245, 245));
        jTextFieldNumero.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextFieldNumero.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNumero.setToolTipText("");
        jTextFieldNumero.setBorder(null);
        jPanelBackgroud1.add(jTextFieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 100, 30));

        jTextFieldBairro.setBackground(new java.awt.Color(246, 245, 245));
        jTextFieldBairro.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextFieldBairro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldBairro.setToolTipText("");
        jTextFieldBairro.setBorder(null);
        jPanelBackgroud1.add(jTextFieldBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 210, 20));

        jTextFieldComplemento.setBackground(new java.awt.Color(246, 245, 245));
        jTextFieldComplemento.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextFieldComplemento.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldComplemento.setToolTipText("");
        jTextFieldComplemento.setBorder(null);
        jPanelBackgroud1.add(jTextFieldComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 210, 20));

        jTextFieldNomeCompleto.setBackground(new java.awt.Color(246, 245, 245));
        jTextFieldNomeCompleto.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextFieldNomeCompleto.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCompleto.setToolTipText("");
        jTextFieldNomeCompleto.setBorder(null);
        jPanelBackgroud1.add(jTextFieldNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 450, 30));

        jTextFieldEmail.setBackground(new java.awt.Color(246, 245, 245));
        jTextFieldEmail.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEmail.setToolTipText("");
        jTextFieldEmail.setBorder(null);
        jPanelBackgroud1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 450, 20));

        jTextFieldResponsaveis.setBackground(new java.awt.Color(246, 245, 245));
        jTextFieldResponsaveis.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextFieldResponsaveis.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldResponsaveis.setToolTipText("");
        jTextFieldResponsaveis.setBorder(null);
        jPanelBackgroud1.add(jTextFieldResponsaveis, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 450, 30));

        jTextFieldTelefone.setBackground(new java.awt.Color(246, 245, 245));
        jTextFieldTelefone.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextFieldTelefone.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTelefone.setToolTipText("");
        jTextFieldTelefone.setBorder(null);
        jPanelBackgroud1.add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 210, 20));

        jTextFieldCEP.setBackground(new java.awt.Color(246, 245, 245));
        jTextFieldCEP.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jTextFieldCEP.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCEP.setToolTipText("");
        jTextFieldCEP.setBorder(null);
        jPanelBackgroud1.add(jTextFieldCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 450, 30));

        jPasswordField1.setBackground(new java.awt.Color(246, 245, 245));
        jPasswordField1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setBorder(null);
        jPanelBackgroud1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 210, 20));

        backgroudCadastro.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        backgroudCadastro.setForeground(new java.awt.Color(0, 0, 0));
        backgroudCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/Cordenador/Resources/CadastroProfessor.png"))); // NOI18N
        jPanelBackgroud1.add(backgroudCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1050, 758));

        getContentPane().add(jPanelBackgroud1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFinalizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCadastroActionPerformed

    }//GEN-LAST:event_jButtonFinalizarCadastroActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        gerenteJanelas.abrirJanelas(TelaInicial.getInstancia());
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AnoLetivo;
    private javax.swing.JLabel backgroudCadastro;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonFinalizarCadastro;
    private javax.swing.JLabel jLabelAnoLetivo;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelNomeCompleto;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelResponsaveis;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JList<String> jListAnoLetivo;
    private javax.swing.JPanel jPanelBackgroud1;
    private javax.swing.JPanel jPanelBackgroudAnoLetivo;
    private javax.swing.JPanel jPanelLists;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCEP;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldNomeCompleto;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldResponsaveis;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldUF;
    // End of variables declaration//GEN-END:variables
}
