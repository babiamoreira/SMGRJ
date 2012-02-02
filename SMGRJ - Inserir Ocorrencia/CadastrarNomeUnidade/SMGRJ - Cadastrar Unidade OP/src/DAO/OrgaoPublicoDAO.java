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
import model.OrgaoPublico;




public class OrgaoPublicoDAO {
    Connection conexao = null;

    
    public List<OrgaoPublico> buscar() {
        List<OrgaoPublico> lista = new ArrayList<OrgaoPublico>();
        try {
            conexao = ConexaoMySQL.abrirConexao();

            Statement cs = conexao.createStatement();
            ResultSet rs = cs.executeQuery("select nomeOrgao from orgaoPublico");

            while (rs.next()) {
                OrgaoPublico orgao = new OrgaoPublico();
                orgao.setNomeOrgao(rs.getString("nomeOrgao"));
             
                lista.add(orgao);
            }
            rs.close();
            cs.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("OrgaoPublicoDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }
    
    
    public void inserir(OrgaoPublico orgao) {
        
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("insert into OrgaoPublico (idOrgao, nomeOrgao) values (null, ?)");

            ps.setInt(1, orgao.getCodigoOrgao());
            ps.setString(2, orgao.getNomeOrgao());
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("OrgaoPublicoDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }
    
    public int buscarId(){
        
        int maiorId = 0;
        
        try {
            conexao = ConexaoMySQL.abrirConexao();
            Statement ps = conexao.createStatement();
            
            ResultSet rs = ps.executeQuery("select max(idOrgao) from OrgaoPublico");

            while (rs.next()) {
                maiorId = rs.getInt("idOrgao");
            }

            ps.close();
            rs.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("OrgaoPublicoDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
        
        return maiorId;
    }
}
