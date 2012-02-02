package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrivilegioDAO {
    Connection conexao = null;

     public int buscarId(){
        
        int maiorId = 0;
        
        try {
            conexao = ConexaoMySQL.abrirConexao();
            Statement ps = conexao.createStatement();
            
            ResultSet rs = ps.executeQuery("select max(idPrivilegio) from privilegio");

            while (rs.next()) {
                maiorId = rs.getInt("idPrivilegio");
            }

            ps.close();
            rs.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("PrivilegioDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
        
        return maiorId;
    }
    
}
