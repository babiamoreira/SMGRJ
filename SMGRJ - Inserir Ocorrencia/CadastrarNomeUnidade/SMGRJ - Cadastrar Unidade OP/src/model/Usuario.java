
package model;

public class Usuario extends Pessoa{
    private String login;
    private String senha;
    private Privilegio privilegio;

    public Usuario() {
        super();
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    
    
    
    public Usuario(String nome, String cpf, String rg, String login, 
            String senha, Privilegio privilegio) {
        super(nome, cpf, rg);
        this.login = login;
        this.senha = senha;
        this.privilegio = privilegio;
    }

    public String getLogin() {
        return login;
    }

    public Privilegio getPrivilegio() {
        return privilegio;
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPrivilegio(Privilegio privilegio) {
        this.privilegio = privilegio;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + ", senha=" + senha + ", privilegio=" + privilegio + '}';
    }
    
    
    
}
   