package DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UnidadeDAO {
    Connection conexao = null;

    public void inserir(int codUnidade, String nomeUnidade) {
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("insert into UnidadeOperacional "
                    + "(codUnidade, nomeUnidade) values(null, ?)");

           
            ps.setString(1, nomeUnidade);
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("UnidadeDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }
    
    
    
    public void deletar(int codUnidade) {
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("delete from UnidadeOperacional where codUnidade = ?");

            ps.setInt(1, codUnidade);

            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("UnidadeDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
    }
    
    public int buscarId(){
        
        int maiorId = 0;
        
        try {
            conexao = ConexaoMySQL.abrirConexao();
            Statement ps = conexao.createStatement();
            
            ResultSet rs = ps.executeQuery("select max(codUnidade) from unidadeOperacional");

            while (rs.next()) {
                maiorId = rs.getInt(1);
  
            }

            ps.close();
            rs.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("UnidadeDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
        
        return maiorId;
    }
}