package DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EnderecoDAO {
    Connection conexao = null;

    public void inserir(String logradouro, String numero, String bairro, String complemento, String pontoReferencia) {
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("insert into Endereco "
                    + "(idEndereco, logradouro, complemento, numero, pontoReferencia, bairro) values(null, ?,?,?,?,?)");

            
            ps.setString(1, logradouro);
            ps.setString(2, complemento);
            ps.setString(3, numero);
            ps.setString(4, pontoReferencia);
            ps.setString(5, bairro);
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("EnderecoDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }
    
    public void inserirEnderecoBackup(int id, String logradouro, String numero, String bairro, String complemento, String pontoReferencia) {
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("insert into enderecobackup "
                    + "( idEnderecoBackUp, logradouro, numero, complemento, pontoReferencia, bairro) values (?,?,?,?,?,?)");

            ps.setInt(1, id);
            ps.setString(2, logradouro);
            ps.setString(3, numero);
            ps.setString(4, complemento);
            ps.setString(5, pontoReferencia);
            ps.setString(6, bairro);
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("EnderecoDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }
    
    public void deletar(int idEndereco) {
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("delete from Endereco where idEndereco = ?");

            ps.setInt(1, idEndereco);

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("EnderecoDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
    }
    
    public int buscarId(){
        
        int maiorId = 0;
        
        try {
            conexao = ConexaoMySQL.abrirConexao();
            Statement ps = conexao.createStatement();
            
            ResultSet rs = ps.executeQuery("select max(idEndereco) from endereco");

            while (rs.next()) {
                maiorId = rs.getInt(1);
  
            }

            ps.close();
            rs.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("EnderecoDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
        
        return maiorId;
    }
}
