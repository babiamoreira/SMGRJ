

package DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MarkersDAOUnOp {
    
    Connection conexao = null;

    public void inserirMarkers(String nomeUnidade){

        try {
	conexao = ConexaoMySQL.abrirConexao();
   		PreparedStatement ps = conexao.prepareStatement("insert into markers(id, nomeUnidade) values (null,?)");
    		ps.setString(1, nomeUnidade);

                ps.executeUpdate();
       		ps.close();
      		conexao.close();


        } catch (SQLException ex) {

            Logger.getLogger("MarkersDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());

          }
    }

}
