package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pessoa;
import model.Usuario;

public class UsuarioDAO {
    Connection conexao = null;

    public boolean loginAdministrativo(String login, String senha) {
       Usuario usuario = null;
        
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("select login, senha, privilegio from usuario where login = ? and senha = ? and privilegio.nomePrivilegio LIKE 'Administrativo'");
            
            ps.setString(1, login);
            ps.setString(2, senha);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                usuario = new Usuario(
                rs.getString("login"),
                rs.getString("senha")
                );
            }
            rs.close();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("ClienteDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return true;
    }
    
    public Usuario loginGerencial(String login, String senha) {
       Usuario usuario = null;
        
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("select login, senha from usuario where login = ? and senha = ?");
            
            ps.setString(1, login);
            ps.setString(2, senha);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                usuario = new Usuario(
                rs.getString("login"),
                rs.getString("senha")
                );
            }
            rs.close();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("ClienteDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return usuario;
    }
    
        public Usuario loginComum(String login, String senha) {
       Usuario usuario = null;
        
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("select login, senha, privilegio from usuario where login = ? and senha = ? and privilegio.nomePrivilegio LIKE 'Comum'");
            
            ps.setString(1, login);
            ps.setString(2, senha);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                usuario = new Usuario(
                rs.getString("login"),
                rs.getString("senha")
                );
            }
            rs.close();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("ClienteDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return usuario;
    }

    public void inserir(Usuario usuario, int idPessoa, int idPrivilegio) {
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("insert into usuario (login, senha, idPessoa) values(?,?,?)");

            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("UsuarioDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }
}
