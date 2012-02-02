
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.OrgaoPublico_UnidadeOperacional;


public class OrgaoPublico_UnidadeOperacionalDAO {
    
    Connection conexao = null;
    
    public void inserir(OrgaoPublico_UnidadeOperacional orgaounidade) {
        
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("insert into OrgaoPublico_UnidadeOperacional (idOrgaoUnidade, idOrgao, idUnidade) values (null,?,?)");

            ps.setInt(1, orgaounidade.getCodigoOrgao());
            ps.setInt(2, orgaounidade.getCodigoUnidade());
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("OrgaoPublicoDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }
    
    
    
}
