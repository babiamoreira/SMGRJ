package controller;

import DAO.EnderecoDAO;
import DAO.MarkersDAO;
import DAO.OcorrenciaDAO;
import DAO.TipoOcorrenciaDAO;
import DAO.UsuarioDAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.Endereco;
import model.Ocorrencia;
import model.TipoOcorrencia;
import model.Usuario;
import view.Login;
import view.InserirOc;



public class Sistema {
    private Login login;
    private InserirOc tela;

    public static void main(String[] args) {

        Sistema sistema = new Sistema();
        
       sistema.iniciarSistema();

        }

    public void login(String login, String senha){
        UsuarioDAO usuariodao = new UsuarioDAO();
        Usuario usuario = null;
        usuario = usuariodao.loginGerencial(login, senha);
        
        if ( usuario != null){
            this.login.dispose();
            tela = new InserirOc();
        
            tela.iniciarTelaOcorrencia(tela);
        } else {
            
            JOptionPane.showMessageDialog(null, "Usuario ou senha invalido");
        }

    }
    
    public void iniciarPrograma(){
        
        this.login = new Login();
        
        this.login.executarLogin(this);
                
    }
    
    public void inserirOcorrencia(String data, String hora, String descricao, String logradouro, String numero, String complemento, String bairro, String pontoReferencia, String endereco, String tipo){
        
        
        //Inserindo na tabela Endereco
        EnderecoDAO endDAO = new EnderecoDAO();
        
        Endereco end = null;
        
        endDAO.inserir(logradouro, numero, bairro, complemento, pontoReferencia);
        
        int id2 = endDAO.buscarId();

        System.out.println(id2);

        endDAO.inserirEnderecoBackup(id2, logradouro, numero, bairro, complemento, pontoReferencia);
 
        //Inserindo na tabela Ocorrencia e OcorrenciaBackup
        OcorrenciaDAO ocoDAO = new OcorrenciaDAO();
        
        TipoOcorrenciaDAO tipoDAO = new TipoOcorrenciaDAO();

        
        Ocorrencia oc = null;

        int idTipo = tipoDAO.retornarID(tipo);
        
        ocoDAO.inserir(data, hora, descricao, id2, idTipo);

        int id = ocoDAO.buscarId();
      //  System.out.println(id);

        ocoDAO.inserirBackup(data, hora, descricao, id2, id, idTipo);

        MarkersDAO markers = new MarkersDAO();

        markers.inserirMarkers(endereco, tipo, descricao);
    }
    
    public int maiorIDOcorrencia(){
        
        OcorrenciaDAO ocoDAO = new OcorrenciaDAO();
        
        int id = ocoDAO.buscarId();
        
        return id;
    }

    public static List<TipoOcorrencia> listarTipoOcorrencias(){

        List<TipoOcorrencia> lista;

        lista = TipoOcorrenciaDAO.listarTiposOcorrencias();

        return lista;

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
