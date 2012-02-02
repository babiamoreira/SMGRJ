

package DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MarkersDAO {
    
    Connection conexao = null;

    public void inserirMarkers(String endereco, String tipo, String descricao){

        try {
	conexao = ConexaoMySQL.abrirConexao();
   		PreparedStatement ps = conexao.prepareStatement("insert into markers(id, name, endereco, lat, lng, type, descricao) values (null,null,?,null,null,?,?)");
    		ps.setString(1, endereco);
         	ps.setString(2, tipo);
           	ps.setString(3, descricao);

                ps.executeUpdate();
       		ps.close();
      		conexao.close();


        } catch (SQLException ex) {

            Logger.getLogger("MarkersDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());

          }
    }

}
