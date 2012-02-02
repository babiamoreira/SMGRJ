package controller;

import DAO.MarkersDAOUnOp;
import DAO.UnidadeDAO;
import DAO.UnidadeOperacionalDAO;
import DAO.UsuarioDAO;
import javax.swing.JOptionPane;
import model.UnidadeOperacional;
import model.Usuario;
import view.CadastrarUnidadeOrg;
import view.LoginSist2;



public class SistemaCadUniOrg {
    private LoginSist2 login;
    private CadastrarUnidadeOrg tela;

    public static void main(String[] args) {

        SistemaCadUniOrg sistema = new SistemaCadUniOrg();
        
       sistema.iniciarSistema();

        }

    public void login(String login, String senha){
        UsuarioDAO usuariodao = new UsuarioDAO();
        Usuario usuario = null;
        usuario = usuariodao.loginGerencial(login, senha);
        
        if ( usuario != null){
            this.login.dispose();
            tela = new CadastrarUnidadeOrg();
        
            tela.iniciarTelaCadUnidOrg(tela);
        } else {
            
            JOptionPane.showMessageDialog(null, "Usuario ou senha invalido");
        }

    }
    
    public void iniciarPrograma(){
        
        this.login = new LoginSist2();
        
        this.login.executarLogin(this);
                
    }
    
    public void inserirUnidade(int codUnidade, String nomeUnidade){
        
        
        //Inserindo na tabela Endereco
        UnidadeDAO unidDAO = new UnidadeDAO();
        
        UnidadeOperacional unid = null;
        
        unidDAO.inserir(codUnidade, nomeUnidade);
        
        int id2 = unidDAO.buscarId();

        System.out.println(id2);

        
 
      //  System.out.println(id);

       /* MarkersDAOUnOp markers = new MarkersDAOUnOp();

        markers.inserirMarkers(nomeUnidade);*/
    }
    
    public int maiorCODUnidadeOperacional(){
        
        UnidadeOperacionalDAO uniDAO = new UnidadeOperacionalDAO();
        
        int id = uniDAO.buscarId();
        
        return id;
    }

    

    public void iniciarSistema(){

        iniciarPrograma();
    }

public String trata (String palavra){
    char[] array = palavra.toCharArray();
    for (int i = 0; i< array.length; i++) {
        switch (array[i]) {
            case 'Â' :
            case 'À' :
            case 'Á' :
            case 'Ã' :
               array[i] = 'A';
               continue;
            case 'â' :
            case 'ã' :
            case 'à' :
            case 'á' :
                array[i] = 'a';
                continue;
            case 'Ê' :
            case 'È' :
            case 'É' :
                array[i] = 'E';
                continue;
            case 'ê' :
            case 'è' :
            case 'é' :
                array[i] = 'e';
                continue;
            case 'Î' :
            case 'Í' :
            case 'Ì' :
                array[i] = 'I';
                continue;
            case 'î' :
            case 'ì' :
            case 'í' :
                array[i] = 'i';
                continue;
            case 'Ô' :
            case 'Õ' :
            case 'Ò' :
            case 'Ó' :
                array[i] = 'O';
                continue;
            case 'ô' :
            case 'õ' :
            case 'ò' :
            case 'ó' :
                array[i] = 'o';
                continue;
            case 'Û' :
            case 'Ù' :
            case 'Ú' :
                array[i] = 'U';
                continue;
            case 'û' :
            case 'ù' :
            case 'ú' :
                array[i] = 'u';
                continue;
            case 'Ç' :
                 array[i] = 'C';
            case 'ç' :
                 array[i] = 'c';

        }
    }
    return new String(array);
  }
}
