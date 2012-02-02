package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.UnidadeOperacional;


public class UnidadeOperacionalDAO {
    Connection conexao = null;
    
public List<UnidadeOperacional> buscar() {
        List<UnidadeOperacional> lista = new ArrayList<UnidadeOperacional>();
        try {
            conexao = ConexaoMySQL.abrirConexao();

            Statement cs = conexao.createStatement();
            ResultSet rs = cs.executeQuery("select nomeUnidade from UnidadeOperacional");

            while (rs.next()) {

            UnidadeOperacional tipo = new UnidadeOperacional(); 

            tipo.setNomeUnidade(rs.getString("nomeUnidade"));
            
            lista.add(tipo);
            }
            
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("UnidadeOperacionalDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
	return lista;
    }

   
    public void inserir(UnidadeOperacional unidOper) {
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("insert into UnidadeOperacional(codUnidadeOperacional, nomeUnidade) values(null,?)");

            ps.setString(1, unidOper.getNomeUnidade());
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("UnidadeOperacionalDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }
    
     public int buscarId(){
        
        int maiorId = 0;
        
        try {
            conexao = ConexaoMySQL.abrirConexao();
            Statement ps = conexao.createStatement();
            
            ResultSet rs = ps.executeQuery("select max(idUnidade) from UnidadeOperacional");

            while (rs.next()) {
                maiorId = rs.getInt("idUnidade");
            }

            ps.close();
            rs.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("UnidadeOperacionalDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
        
        return maiorId;
    }
}
