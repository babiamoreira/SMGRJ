
package model;

public class Endereco {
    
    private String codigoEndereco;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String pontoReferencia;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String complemento, 
            String bairro, String pontoReferencia) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.pontoReferencia = pontoReferencia;
    }

    public Endereco(String codigoEndereco, String logradouro, String numero,
            String complemento, String bairro, String pontoReferencia) {
        this.codigoEndereco = codigoEndereco;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.pontoReferencia = pontoReferencia;
    }

    
    
    public String getCodigoEndereco() {
        return codigoEndereco;
    }
    

    public String getBairro() {
        return bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setCodigoEndereco(String codigoEndereco) {
        this.codigoEndereco = codigoEndereco;
    }
    

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    

}
