package model;

public class UnidadeOperacional {
    
    private String nomeUnidade;
    private int codigoUnidade;

    public UnidadeOperacional() {
    }

    public UnidadeOperacional(String nomeUnidade, int codigoUnidade) {
        this.nomeUnidade = nomeUnidade;
        this.codigoUnidade = codigoUnidade;
    }

    public UnidadeOperacional(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }
    
    
    public int getCodigounidade() {
        return codigoUnidade;
    }

    public String getNomeUnidade() {
        return nomeUnidade;
    }

    public void setCodigounidade(int codigounidade) {
        this.codigoUnidade = codigounidade;
    }

    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }

    @Override
    public String toString() {
        return "UnidadeOperacional{" + "nomeUnidade=" + nomeUnidade + ", codigoUnidade=" + codigoUnidade + '}';
    }
    
    
    
}
