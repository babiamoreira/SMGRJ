package DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OcorrenciaDAO {
    Connection conexao = null;

    //insere dados na tabela ocorrencia normal
    public void inserir(String data, String hora, String descricao, int idEndereco, int idTipo) {
	try {
	conexao = ConexaoMySQL.abrirConexao();
   		PreparedStatement ps = conexao.prepareStatement("insert into ocorrencia(idOcorrencia, dataAbertura, horaAbertura, descricaoAbertura, idEndereco, status, idTipoOcorrencia) values (null,?,?,?,?,?,?)");
    		ps.setString(1, data);
         	ps.setString(2, hora);
           	ps.setString(3, descricao);
       		ps.setInt(4, idEndereco);
                ps.setString(5, "Aberto");
                ps.setInt(6, idTipo);

                ps.executeUpdate();
       		ps.close();
      		conexao.close();
	

        } catch (SQLException ex) {

            Logger.getLogger("OcorrenciaDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	
            }
    
        }

    

    public int buscarId(){
        
        int maiorId = 0;
        
        try {
            conexao = ConexaoMySQL.abrirConexao();
            Statement ps = conexao.createStatement();
            
            ResultSet rs = ps.executeQuery("select max(idOcorrencia) from ocorrencia");

            while (rs.next()) {
                maiorId = rs.getInt(1);
            }

            ps.close();
            rs.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("OcorrenciaDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
        
        return maiorId;
    }
   
    
        public void inserirBackup(String data, String hora, String descricao, int idEndereco, int idOcorrencia, int idTipo) {
	try {
	conexao = ConexaoMySQL.abrirConexao();
   		PreparedStatement ps = conexao.prepareStatement("insert into ocorrenciabackup(dataAbertura, horaAbertura, descricaoAbertura, idEndereco, status, idOcorrencia, idTipoOcorrencia) values (?,?,?,?,?,?,?)");

                ps.setString(1, data);
         	ps.setString(2, hora);
           	ps.setString(3, descricao);
       		ps.setInt(4, idEndereco);
                ps.setString(5, "Aberto");
                ps.setInt(6, idOcorrencia);
                ps.setInt(7, idTipo);

                ps.executeUpdate();
       		ps.close();
      		conexao.close();
	

        } catch (SQLException ex) {

            Logger.getLogger("OcorrenciaDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	
            }
    
        }
    
    public void gravarHistorico(String descricaoFechamento, String dataFechamento,
            String horaFechamento, int idOcorrencia) {
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("update ocorrenciabackup set descricaoFechamento = ?, "
                    + "dataFechamento= ?, horaFechamento= ?, status = 'Fechado' where ocorrenciabackup.idocorrenciabackup = ?");

            ps.setString(1, descricaoFechamento);
            ps.setString(2, dataFechamento);
            ps.setString(3, horaFechamento);
            ps.setInt(4, idOcorrencia);
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("OcorrenciaDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public void fecharOcorrencia(int idOcorrencia) {
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("delete from Ocorrencia where idOcorrencia = ?");

            ps.setInt(1, idOcorrencia);

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("OcorrenciaDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
    }
   
    
   
}
