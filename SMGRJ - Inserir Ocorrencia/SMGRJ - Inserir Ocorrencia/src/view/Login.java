
package view;

import controller.Sistema;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Login extends javax.swing.JFrame {
    
    // Atributos da classe
    private String login;
    private String senha;
    private Sistema meuSistema;

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
        setTitle("Cadastrar Usuário");
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

        senhaTelaLogin.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        senhaTelaLogin.setText("Senha:");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 24));
        jLabel11.setText("para entrar no sistema.");

        nomeSistema.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        nomeSistema.setForeground(new java.awt.Color(102, 102, 102));
        nomeSistema.setText("SISTEMA DE MONITORAMENTO GERENCIAL - RJ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeSistema)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(senhaTelaLogin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(senhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(loginTelaLogin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(loginLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(sairLogin)
                                .addGap(18, 18, 18)
                                .addComponent(entrarLogin)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeSistema)
                .addGap(56, 56, 56)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginTelaLogin)
                    .addComponent(loginLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaTelaLogin)
                    .addComponent(senhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairLogin)
                    .addComponent(entrarLogin))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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


    public void executarLogin(Sistema meuSistema) {
        this.meuSistema = meuSistema;
        this.setVisible(true);
        this.pack();
    }
    
   public Login() {
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
