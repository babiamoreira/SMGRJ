package model;

public class OcorrenciaEndereco {
    
    private int idOcorrencia;
    private String dataAbertura;
    private String horaAbertura;
    private String descricaoAbertura;
    private String status;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String pontoReferencia;
    private String nomeTipo;
    private String nome;
    private String cargoResp;
    private String dataFechamento;
    private String horaFechamento;
    private String descricaoFechamento;

    public OcorrenciaEndereco(int idOcorrencia, String dataAbertura, String horaAbertura, String descricaoAbertura, String status, String logradouro, String numero, String complemento, String bairro, String pontoReferencia, String nomeTipo, String nome, String cargoResp, String dataFechamento, String horaFechamento, String descricaoFechamento) {
        this.idOcorrencia = idOcorrencia;
        this.dataAbertura = dataAbertura;
        this.horaAbertura = horaAbertura;
        this.descricaoAbertura = descricaoAbertura;
        this.status = status;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.pontoReferencia = pontoReferencia;
        this.nomeTipo = nomeTipo;
        this.nome = nome;
        this.cargoResp = cargoResp;
        this.dataFechamento = dataFechamento;
        this.horaFechamento = horaFechamento;
        this.descricaoFechamento = descricaoFechamento;
    }

    public OcorrenciaEndereco() {
    }

    //logradouro, numero, complemento, bairro
    public OcorrenciaEndereco(int idOcorrencia, String dataAbertura,
            String horaAbertura, String descricaoAbertura, String status, 
            String pontoReferencia, String nomeTipo) {
        this.idOcorrencia = idOcorrencia;
        this.dataAbertura = dataAbertura;
        this.horaAbertura = horaAbertura;
        this.descricaoAbertura = descricaoAbertura;
        this.status = status;
        this.pontoReferencia = pontoReferencia;
        this.nomeTipo = nomeTipo;
    }

    
    public OcorrenciaEndereco(int idOcorrencia, String dataAbertura,
            String horaAbertura, String descricaoAbertura, String status, 
            String logradouro, String numero, String complemento, String bairro, 
            String pontoReferencia, String nomeTipo) {
        this.idOcorrencia = idOcorrencia;
        this.dataAbertura = dataAbertura;
        this.horaAbertura = horaAbertura;
        this.descricaoAbertura = descricaoAbertura;
        this.status = status;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.pontoReferencia = pontoReferencia;
        this.nomeTipo = nomeTipo;
    }

    //sem pontoReferencia
    public OcorrenciaEndereco(int idOcorrencia, String dataAbertura,
            String horaAbertura, String descricaoAbertura, String status, 
            String logradouro, String numero, String complemento, 
            String bairro, String nomeTipo) {
        this.idOcorrencia = idOcorrencia;
        this.dataAbertura = dataAbertura;
        this.horaAbertura = horaAbertura;
        this.descricaoAbertura = descricaoAbertura;
        this.status = status;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.nomeTipo = nomeTipo;
    }

    //sem pontoReferencia e complemento
    public OcorrenciaEndereco(int idOcorrencia, String dataAbertura,
            String horaAbertura, String descricaoAbertura, String status, 
            String logradouro, String numero, String bairro, String nomeTipo) {
        this.idOcorrencia = idOcorrencia;
        this.dataAbertura = dataAbertura;
        this.horaAbertura = horaAbertura;
        this.descricaoAbertura = descricaoAbertura;
        this.status = status;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.nomeTipo = nomeTipo;
    }

    public OcorrenciaEndereco( String pontoReferencia, String dataAbertura, 
            String horaAbertura, String descricaoAbertura, String status, 
            String logradouro, String numero, String bairro, int idOcorrencia,
            String nomeTipo) {
        this.idOcorrencia = idOcorrencia;
        this.dataAbertura = dataAbertura;
        this.horaAbertura = horaAbertura;
        this.descricaoAbertura = descricaoAbertura;
        this.status = status;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.pontoReferencia = pontoReferencia;
        this.nomeTipo = nomeTipo;
       
}

    public OcorrenciaEndereco(int idOcorrencia, String dataAbertura, String horaAbertura, String status, String nomeTipo) {
        this.idOcorrencia = idOcorrencia;
        this.dataAbertura = dataAbertura;
        this.horaAbertura = horaAbertura;
        this.status = status;
        this.nomeTipo = nomeTipo;
    }

}
