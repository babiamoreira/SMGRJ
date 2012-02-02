
package view;

import controller.SistemaCadUniOrg;

public class LoginSist2 extends javax.swing.JFrame {
    
    // Atributos da classe
    private String login;
    private String senha;
    private SistemaCadUniOrg meuSistema;

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        entrarLogin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        senhaLogin = new javax.swing.JPasswordField();
        sairLogin = new javax.swing.JButton();
        loginLogin = new java.awt.TextField();
        loginTelaLogin = new javax.swing.JLabel();
        senhaTelaLogin = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nomeSistema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(new java.awt.Color(204, 204, 204));

        entrarLogin.setText("Entrar");
        entrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarLoginActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24));
        jLabel8.setText("Digite suas informações de login,");

        senhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaLoginActionPerformed(evt);
            }
        });

        sairLogin.setText("Sair");
        sairLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairLoginActionPerformed(evt);
            }
        });

        loginLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginLoginActionPerformed(evt);
            }
        });

        loginTelaLogin.setFont(new java.awt.Font("Calibri", 1, 16));
        loginTelaLogin.setText("Login:");

        senhaTelaLogin.setFont(new java.awt.Font("Calibri", 1, 16));
        senhaTelaLogin.setText("Senha:");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 24));
        jLabel11.setText("para entrar no sistema.");

        nomeSistema.setFont(new java.awt.Font("Calibri", 1, 24));
        nomeSistema.setForeground(new java.awt.Color(102, 102, 102));
        nomeSistema.setText("SISTEMA DE MONITORAMENTO GERENCIAL - RJ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeSistema)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel11))
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(sairLogin)
                                .addGap(18, 18, 18)
                                .addComponent(entrarLogin))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(senhaTelaLogin)
                                    .addComponent(loginTelaLogin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(loginLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(senhaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(nomeSistema)
                .addGap(56, 56, 56)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginTelaLogin)
                    .addComponent(loginLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaTelaLogin)
                    .addComponent(senhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairLogin)
                    .addComponent(entrarLogin))
                .addContainerGap(114, Short.MAX_VALUE))
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

    //Botao Entrar
private void entrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarLoginActionPerformed


  logar();
  
}//GEN-LAST:event_entrarLoginActionPerformed



    // Botão Sair       
private void sairLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairLoginActionPerformed
    if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja SAIR?","ATENÇÂO",javax.swing.JOptionPane.YES_NO_OPTION)==0){
    System.exit(0);
    }
}//GEN-LAST:event_sairLoginActionPerformed
    //Caixa de Login
    private void loginLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginLoginActionPerformed
     
        
    }//GEN-LAST:event_loginLoginActionPerformed
    
    //Caixa de Senha
    private void senhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaLoginActionPerformed

    }//GEN-LAST:event_senhaLoginActionPerformed


    public void executarLogin(SistemaCadUniOrg meuSistema) {
        this.meuSistema = meuSistema;
        this.setVisible(true);
        this.pack();
    }
    
   public LoginSist2() {
        initComponents();
        
    }
    
    
    public static void main(String args[]) {
       
        
    }
   
    
    public void logar(){

    login = loginLogin.getText();
    senha = String.valueOf(senhaLogin.getPassword());

    this.meuSistema.login(login, senha);

    }
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrarLogin;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextField loginLogin;
    private javax.swing.JLabel loginTelaLogin;
    private javax.swing.JLabel nomeSistema;
    private javax.swing.JButton sairLogin;
    private javax.swing.JPasswordField senhaLogin;
    private javax.swing.JLabel senhaTelaLogin;
    // End of variables declaration//GEN-END:variables
}
