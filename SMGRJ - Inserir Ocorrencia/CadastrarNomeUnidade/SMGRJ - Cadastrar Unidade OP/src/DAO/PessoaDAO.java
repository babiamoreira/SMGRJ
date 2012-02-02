package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pessoa;

public class PessoaDAO {
    Connection conexao = null;
    
   
    public Pessoa buscar(Pessoa pessoa) {
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("select nome, cpf, rg from pessoa where cpf = ?");
            ps.setString(1, pessoa.getNome());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                pessoa.setNome(rs.getString("nome"));
                pessoa.setRg(rs.getString("telefone"));
                pessoa.setCpf(rs.getString("email"));
            }
            rs.close();
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger("ClienteDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
        }
        
        return pessoa;
    }

    public void inserir(Pessoa pessoa) {
        try {
            conexao = ConexaoMySQL.abrirConexao();
            PreparedStatement ps = conexao.prepareStatement("insert into pessoa (nome, cpf, rg) values(?,?,?)");

            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
            ps.setString(3, pessoa.getRg());
            
            ps.executeUpdate();
            ps.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("PessoaDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
    }
    
    public int buscarId(){
        
        int maiorId = 0;
        
        try {
            conexao = ConexaoMySQL.abrirConexao();
            Statement ps = conexao.createStatement();
            
            ResultSet rs = ps.executeQuery("select max(idPessoa) from pessoa");

            while (rs.next()) {
                maiorId = rs.getInt("idPessoa");
            }

            ps.close();
            rs.close();
            conexao.close();
	} catch (SQLException ex) {
            Logger.getLogger("UsuarioDAO").log(Level.SEVERE, "SQLException: {0}", ex.getMessage());
	}
        
        return maiorId;
    }
}
