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
import model.TipoOcorrencia;

public class TipoOcorrenciaDAO {
    Connection conexao = null;
    
   
 public static List<TipoOcorrencia> listarTiposOcorrencias() {

     List<TipoOcorrencia> lista = new ArrayList<TipoOcorrencia>();

        try {

            Connection conexao = ConexaoMySQL.abrirConexao();

            Statement cs = conexao.createStatement();
            ResultSet rs = cs.executeQuery("select nomeTipo from TipoOcorrencia order by nomeTipo");

            while (rs.next()) {

                TipoOcorrencia tipo = new TipoOcorrencia();

                tipo.setNomeTipoOc(rs.getString("nomeTipo"));
            
                lista.add(tipo);
            }
            
            rs.close();
            cs.close();
            conexao.close();
            
        } catch (SQLException ex) {
            Logger.getLogger("TipoOcorrenciaDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

	return lista;
    }

   

    public void inserir(TipoOcorrencia tipoOcor) {
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("insert into TipoOcorrencia (idTipoOcorrencia, nomeTipo) values(null, ?)");

            
            ps.setString(1, tipoOcor.getNomeTipoOc());
            
            ps.executeUpdate();
            ps.close();
            
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("TipoOcorrenciaDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }

    public int retornarID(String tipo){

        TipoOcorrencia tipoocorrencia = null;

        int id = 0;

        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("select idTipoOcorrencia from tipoocorrencia where nomeTipo = ?");

            ps.setString(1, tipo);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt(1);
            }

            rs.close();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("ClienteDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }

        return id;
    }
}
