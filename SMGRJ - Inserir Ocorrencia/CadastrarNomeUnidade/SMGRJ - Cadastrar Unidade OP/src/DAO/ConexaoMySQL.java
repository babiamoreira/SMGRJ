package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    
    public static Connection abrirConexao() {
        Connection conexao = null;
	try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/smg", "root", "cochise.");

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
	return conexao;
    }
}

/*
 *
 *  Servidor padrão "jdbc:mysql://localhost:3306/smg";
    Driver Padrão "com.mysql.jdbc.Driver";
    Login Padrão "root";
    Senha Padrão "root";
 */


/*
 * Servidot Web jdbc:mysql://mysql4.000webhost.com/a3948904_db
 * Driver Web   org.gjt.mm.mysql.Driver
 * Login Web a3948904_root
 * Senha Web  a1s2d3f4
 */