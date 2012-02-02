
package model;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private String cpf;
    private String rg;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    
    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

}
