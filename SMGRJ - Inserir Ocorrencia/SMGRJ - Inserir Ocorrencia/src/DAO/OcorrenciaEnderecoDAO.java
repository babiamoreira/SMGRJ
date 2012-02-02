package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.OcorrenciaEndereco;

public class OcorrenciaEnderecoDAO {
    
    Connection conexao = null;
    
    public OcorrenciaEndereco buscarOcorrenciaDetalhes(int idOcorrencia) {
       
        OcorrenciaEndereco endoc = null;

       try {
           
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("select e.logradouro, e.numero, e.complemento, e.pontoReferencia, e.bairro, "
                    + "to.nomeTipo, o.idOcorrencia, o.dataAbertura, o.horaAbertura, o.descricaoAbertura, o.status "
                    + "from ocorrencia o, endereco e, tipoOcorrencia to"
                    + "where idOcorrencia = ? and o.idendereco = e.idendereco and o.idTipoOcorrencia = to.idTipoOcorrencia");

            ps.setInt(1,idOcorrencia);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                endoc = new OcorrenciaEndereco(
                rs.getInt("o.idOcorrencia"),
                rs.getString("o.dataAbertura"),
                rs.getString("o.horaAbertura"),
                rs.getString("o.descricaoAbertura"),
                rs.getString("o.status"),
                rs.getString("e.logradouro"),
                rs.getString("e.numero"),
                rs.getString("e.complemento"),
                rs.getString("e.pontoReferencia"),
                rs.getString("e.bairro"),
                rs.getString("to.nomeTipo"));
            }
            rs.close();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("OcorrenciaEnderecoDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
            return endoc;
                    }

    public OcorrenciaEndereco buscarOcorrencia(int idOcorrencia) {
        OcorrenciaEndereco endoc = null;
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("select o.idOcorrencia, o.horaAbertura, o.dataAbertura, "
                    + "to.nomeTipo, o.status from ocorrencia o, tipoOcorrencia to "
                    + "where to.idTipoOcorrencia = o.idTipoOcorrencia and o.idOcorrencia = ?");
            
            ps.setInt(1, idOcorrencia);

            ResultSet rs = ps.executeQuery();

           while (rs.next()) {
                endoc = new OcorrenciaEndereco(
                rs.getInt("o.idOcorrencia"),
                rs.getString("o.dataAbertura"),
                rs.getString("o.horaAbertura"),
                rs.getString("o.status"),
                rs.getString("to.nomeTipo"));
            }
            rs.close();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("ClienteDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return endoc;
    }
    
    public OcorrenciaEndereco buscarBackup(int idOcorrencia) {
        OcorrenciaEndereco endoc = null;
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("select o.idOcorrencia, o.horaAbertura, o.dataAbertura, "
                    + "to.nomeTipo, o.status, p.nome, rf.cargoResp, ob.dataFechamento, ob.horaFechamento, ob.descricaoFechamento from ocorrencia o, tipoOcorrencia to, ocorrenciabackup ob, pessoa p, respFechamento rf "
                    + "where to.idTipoOcorrencia = o.idTipoOcorrencia and o.idOcorrencia = ? and p.idPessoa = rf.idPessoa and o.idOcorrencia = ob.idOcorrencia");
            
            ps.setInt(1, idOcorrencia);

            ResultSet rs = ps.executeQuery();

           while (rs.next()) {
                endoc = new OcorrenciaEndereco(
                rs.getInt("o.idOcorrencia"),
                rs.getString("o.dataAbertura"),
                rs.getString("o.horaAbertura"),
                rs.getString("o.status"),
                rs.getString("to.nomeTipo"),
                rs.getString("p.nome"),
                rs.getString("rf.cargoResp"),
                rs.getString("ob.dataFechamento"),
                rs.getString("ob.horaFechamento"),
                rs.getString("ob.descricaoFechamento")        
                );
            }
            rs.close();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("ClienteDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return endoc;
    }
    
    
    
}
