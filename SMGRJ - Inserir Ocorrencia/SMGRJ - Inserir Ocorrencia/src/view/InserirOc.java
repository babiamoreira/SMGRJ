/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InserirOc.java
 *
 * Created on 19/01/2012, 17:02:44
 */
package view;

import DAO.TipoOcorrenciaDAO;
import controller.Sistema;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import model.TipoOcorrencia;


/**
 *
 * @author Tiago
 */
public class InserirOc extends javax.swing.JFrame {

    /** Creates new form InserirOc */
    public InserirOc() {
        initComponents();
        
        try {
            Image icon = Toolkit.getDefaultToolkit().getImage("src/Imagem/logo.png");
            setIconImage(icon);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e, "Erro!", 0);
            
        }
        
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                DateFormat dataFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
                campoDataInserirOc.setText(dataFormat.format(date));
                Calendar hora01 = Calendar.getInstance();
                int hora = hora01.get(Calendar.HOUR_OF_DAY);
                int minuto = hora01.get(Calendar.MINUTE);
                int segundo = hora01.get(Calendar.SECOND);

            if(minuto <= 9){
            campoHora.setText("" + hora + ":0" + minuto + ":" + segundo);
             }
            else{
            campoHora.setText("" + hora + ":" + minuto + ":" + segundo);
            }
                
            if(segundo <= 9){
            campoHora.setText("" + hora + ":" + minuto + ":0" + segundo);
             }
            else{
            campoHora.setText("" + hora + ":" + minuto + ":" + segundo);
            }


    }    
};
        Timer t = new Timer(1000, action); // inicializa um timer a cada 1 segundo
        t.start();
        
        listar();
    }

    /** Este método é chamado de dentro do construtor para
      * Inicializar o formulário.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbDataAbertura = new javax.swing.JLabel();
        campoDataInserirOc = new java.awt.TextField();
        bHoraAbertura = new javax.swing.JLabel();
        descricaoInserirOc = new javax.swing.JLabel();
        campoTextoInserirOc = new javax.swing.JScrollPane();
        areaDeDescricao = new javax.swing.JTextArea();
        ComboTipoOcorrencia = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        campoHora = new javax.swing.JTextField();
        proximoInserirOc = new javax.swing.JButton();
        nomeSistema = new javax.swing.JLabel();
        identificadorTela = new javax.swing.JLabel();
        Logoff = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        numInserirOc = new javax.swing.JLabel();
        pontoRefInserirOc = new javax.swing.JLabel();
        campoNumInsOc = new java.awt.TextField();
        campoPontoRefInsOc = new javax.swing.JScrollPane();
        areaDePontoReferencia = new javax.swing.JTextArea();
        complementoInserirOc = new javax.swing.JLabel();
        logradouroInserirOc = new javax.swing.JLabel();
        campoLogradouroInsOc = new java.awt.TextField();
        campoComplemInsOc = new java.awt.TextField();
        campoBairroInsOc = new java.awt.TextField();
        bairroInserirOc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inserir Ocorrência");
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbDataAbertura.setFont(new java.awt.Font("Calibri", 1, 14));
        lbDataAbertura.setText("Data Abertura:");

        campoDataInserirOc.setEditable(false);
        campoDataInserirOc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataInserirOcActionPerformed(evt);
            }
        });

        bHoraAbertura.setFont(new java.awt.Font("Calibri", 1, 14));
        bHoraAbertura.setText("Tipo Ocorrencia:");

        descricaoInserirOc.setFont(new java.awt.Font("Calibri", 1, 14));
        descricaoInserirOc.setText("Descrição:");

        areaDeDescricao.setColumns(20);
        areaDeDescricao.setLineWrap(true);
        areaDeDescricao.setRows(5);
        campoTextoInserirOc.setViewportView(areaDeDescricao);

        ComboTipoOcorrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoOcorrenciaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14));
        jLabel1.setText("Hora:");

        campoHora.setEditable(false);
        campoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(descricaoInserirOc)
                        .addGap(18, 18, 18)
                        .addComponent(campoTextoInserirOc, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bHoraAbertura)
                            .addComponent(lbDataAbertura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoDataInserirOc, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(ComboTipoOcorrencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDataAbertura)
                            .addComponent(campoDataInserirOc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bHoraAbertura)
                            .addComponent(ComboTipoOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(campoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricaoInserirOc)
                    .addComponent(campoTextoInserirOc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        proximoInserirOc.setText("Salvar");
        proximoInserirOc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoInserirOcProximoInserirOcorrencia(evt);
            }
        });

        nomeSistema.setFont(new java.awt.Font("Calibri", 1, 24));
        nomeSistema.setForeground(new java.awt.Color(102, 102, 102));
        nomeSistema.setText("SISTEMA DE MONITORAMENTO GERENCIAL - RJ");

        identificadorTela.setFont(new java.awt.Font("Calibri", 1, 18));
        identificadorTela.setText("Inserir Ocorrência #");

        Logoff.setText("Logoff");
        Logoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoffActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numInserirOc.setFont(new java.awt.Font("Calibri", 1, 14));
        numInserirOc.setText("Nº:");

        pontoRefInserirOc.setFont(new java.awt.Font("Calibri", 1, 14));
        pontoRefInserirOc.setText("Ponto de Referência: ");

        campoNumInsOc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumInsOcActionPerformed(evt);
            }
        });

        areaDePontoReferencia.setColumns(20);
        areaDePontoReferencia.setLineWrap(true);
        areaDePontoReferencia.setRows(5);
        campoPontoRefInsOc.setViewportView(areaDePontoReferencia);

        complementoInserirOc.setFont(new java.awt.Font("Calibri", 1, 14));
        complementoInserirOc.setText("Complemento:");

        logradouroInserirOc.setFont(new java.awt.Font("Calibri", 1, 14));
        logradouroInserirOc.setText("Logradouro:");

        campoLogradouroInsOc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLogradouroInsOcActionPerformed(evt);
            }
        });

        campoBairroInsOc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBairroInsOcActionPerformed(evt);
            }
        });

        bairroInserirOc.setFont(new java.awt.Font("Calibri", 1, 14));
        bairroInserirOc.setText("Bairro:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(numInserirOc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNumInsOc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(complementoInserirOc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoComplemInsOc, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(logradouroInserirOc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoLogradouroInsOc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bairroInserirOc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoBairroInsOc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pontoRefInserirOc)
                    .addComponent(campoPontoRefInsOc))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(campoLogradouroInsOc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logradouroInserirOc, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numInserirOc)
                    .addComponent(campoNumInsOc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(campoComplemInsOc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(complementoInserirOc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bairroInserirOc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoBairroInsOc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pontoRefInserirOc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPontoRefInsOc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(nomeSistema))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(494, Short.MAX_VALUE)
                        .addComponent(identificadorTela)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addComponent(Logoff)
                .addGap(48, 48, 48)
                .addComponent(proximoInserirOc)
                .addGap(220, 220, 220))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(identificadorTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proximoInserirOc)
                    .addComponent(Logoff, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proximoInserirOcProximoInserirOcorrencia(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoInserirOcProximoInserirOcorrencia

        Sistema sistema = new Sistema();


        String data, hora, descricao, logradouro, numero, complemento, bairro, pontoReferencia, tipo;
        
        data = campoDataInserirOc.getText();
        hora = campoHora.getText();
        descricao = areaDeDescricao.getText();
        logradouro = campoLogradouroInsOc.getText();
        numero = campoNumInsOc.getText();
        complemento = campoComplemInsOc.getText();
        bairro = campoBairroInsOc.getText();
        pontoReferencia = areaDePontoReferencia.getText();
        tipo = String.valueOf(ComboTipoOcorrencia.getSelectedItem());

        String descricao_change = sistema.trata(descricao);
        String logradouro_change = sistema.trata(logradouro);
        String numero_change = sistema.trata(numero);
        String complemento_change = sistema.trata(complemento);
        String bairro_change = sistema.trata(bairro);
        String pontoReferencia_change = sistema.trata(pontoReferencia);

       //System.out.println(descricao_change + "" + logradouro_change + pontoReferencia_change + bairro_change + complemento_change + numero_change);


        String endereco = ("Rua: " + logradouro_change + " Numero: " + numero_change + " Bairro: " + bairro_change + ", RJ");

       if(descricao.isEmpty() || bairro.isEmpty() || pontoReferencia.isEmpty()){

           String msg = "Campos obrigatórios precisam ser preenchidos!";
           JOptionPane.showMessageDialog(null, msg);
       }else{

        sistema.inserirOcorrencia(data, hora, descricao_change, logradouro_change, numero_change, complemento_change, bairro_change, pontoReferencia_change, endereco, tipo);

        int idOcorrencia = sistema.maiorIDOcorrencia();
        
        String beleza = "Ocorrência inserida com sucesso \n Código da Ocorrência: " + idOcorrencia;

        JOptionPane.showMessageDialog(null, beleza);

        this.limparTela();

        }

        

   }//GEN-LAST:event_proximoInserirOcProximoInserirOcorrencia

    private void cancelarInserirOc1CancelarInserirOcorrencia(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarInserirOc1CancelarInserirOcorrencia

    }//GEN-LAST:event_cancelarInserirOc1CancelarInserirOcorrencia

    public void limparTela(){
        areaDeDescricao.setText("");
        campoLogradouroInsOc.setText("");
        campoNumInsOc.setText("");
        campoComplemInsOc.setText("");
        campoBairroInsOc.setText("");
        areaDePontoReferencia.setText("");
        ComboTipoOcorrencia.setSelectedIndex(0);
    }

    private void campoBairroInsOcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBairroInsOcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBairroInsOcActionPerformed

    private void campoLogradouroInsOcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLogradouroInsOcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLogradouroInsOcActionPerformed

    private void campoDataInserirOcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataInserirOcActionPerformed
        
    }//GEN-LAST:event_campoDataInserirOcActionPerformed

    private void campoNumInsOcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumInsOcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumInsOcActionPerformed

    private void campoHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHoraActionPerformed

    private void ComboTipoOcorrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoOcorrenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTipoOcorrenciaActionPerformed

    private void LogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoffActionPerformed

            if (javax.swing.JOptionPane.showConfirmDialog(null, "Deseja fazer LOGOFF?", "ATENÇÂO", javax.swing.JOptionPane.YES_NO_OPTION) == 0) {
            this.dispose();
            Sistema sistema = new Sistema();
            sistema.iniciarPrograma();
        }
    }//GEN-LAST:event_LogoffActionPerformed

    public static void main(String args[]) {
        
    }
    
    public void iniciarTelaOcorrencia(InserirOc tela){
        
        tela.setLayout(new FlowLayout());
        tela.setVisible(true);
        //tela.pack();
 
    }

    public void listar(){

        TipoOcorrenciaDAO tipo = new TipoOcorrenciaDAO();

        List<TipoOcorrencia> lista = tipo.listarTiposOcorrencias();


        ComboTipoOcorrencia.removeAllItems();

       for (int i = 0; i < lista.size(); i++){

           ComboTipoOcorrencia.addItem(lista.get(i).getNomeTipoOc());

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboTipoOcorrencia;
    private javax.swing.JButton Logoff;
    private javax.swing.JTextArea areaDeDescricao;
    private javax.swing.JTextArea areaDePontoReferencia;
    private javax.swing.JLabel bHoraAbertura;
    private javax.swing.JLabel bairroInserirOc;
    private java.awt.TextField campoBairroInsOc;
    private java.awt.TextField campoComplemInsOc;
    private java.awt.TextField campoDataInserirOc;
    private javax.swing.JTextField campoHora;
    private java.awt.TextField campoLogradouroInsOc;
    private java.awt.TextField campoNumInsOc;
    private javax.swing.JScrollPane campoPontoRefInsOc;
    private javax.swing.JScrollPane campoTextoInserirOc;
    private javax.swing.JLabel complementoInserirOc;
    private javax.swing.JLabel descricaoInserirOc;
    private javax.swing.JLabel identificadorTela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbDataAbertura;
    private javax.swing.JLabel logradouroInserirOc;
    private javax.swing.JLabel nomeSistema;
    private javax.swing.JLabel numInserirOc;
    private javax.swing.JLabel pontoRefInserirOc;
    private javax.swing.JButton proximoInserirOc;
    // End of variables declaration//GEN-END:variables
}
