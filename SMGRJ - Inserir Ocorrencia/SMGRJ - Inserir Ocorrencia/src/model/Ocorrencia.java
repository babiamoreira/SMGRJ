
package model;

public class Ocorrencia {
    private int codigoOcorrencia;
    private String descricaoAbertura;
    private String dataAbertura;
    private String dataFechamento;
    private String horaAbertura;
    private String horaFechamento;
    private String status;
    private String descricaoFechamento;
    private TipoOcorrencia tipoOcorrencia;
    private RespFechamento nomeRespFechamento;
    private int idEndereco;

    public Ocorrencia(String descricaoAbertura, String dataAbertura, String horaAbertura, int idEndereco) {
        this.descricaoAbertura = descricaoAbertura;
        this.dataAbertura = dataAbertura;
        this.horaAbertura = horaAbertura;
        this.idEndereco = idEndereco;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Ocorrencia() {
    }

    public Ocorrencia(int codigoOcorrencia, String descricaoAbertura, String dataAbertura, 
            String dataFechamento, String horaAbertura, String horaFechamento, 
            String status, String descricaoFechamento, 
            TipoOcorrencia tipoOcorrencia, RespFechamento nomeRespFechamento) {
        this.codigoOcorrencia = codigoOcorrencia;
        this.descricaoAbertura = descricaoAbertura;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.status = status;
        this.descricaoFechamento = descricaoFechamento;
        this.tipoOcorrencia = tipoOcorrencia;
        this.nomeRespFechamento = nomeRespFechamento;
    }

    public Ocorrencia(String descricaoAbertura, String dataAbertura, 
            String horaAbertura, String status, TipoOcorrencia tipoOcorrencia) {
        this.descricaoAbertura = descricaoAbertura;
        this.dataAbertura = dataAbertura;
        this.horaAbertura = horaAbertura;
        this.status = status;
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public Ocorrencia(int codigoOcorrencia, String descricaoAbertura, 
            String dataAbertura, String horaAbertura, String status, 
            TipoOcorrencia tipoOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
        this.descricaoAbertura = descricaoAbertura;
        this.dataAbertura = dataAbertura;
        this.horaAbertura = horaAbertura;
        this.status = status;
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public Ocorrencia(int codigoOcorrencia, String descricaoAbertura, String dataAbertura, String horaAbertura) {
        this.codigoOcorrencia = codigoOcorrencia;
        this.descricaoAbertura = descricaoAbertura;
        this.dataAbertura = dataAbertura;
        this.horaAbertura = horaAbertura;
    }

    public Ocorrencia(String dataAbertura, String horaAbertura, String descricaoAbertura) {
        this.descricaoAbertura = descricaoAbertura;
        this.dataAbertura = dataAbertura;
        this.horaAbertura = horaAbertura;
    }

    public int getCodigoOcorrencia() {
        return codigoOcorrencia;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public String getDescricaoAbertura() {
        return descricaoAbertura;
    }

    public String getDescricaoFechamento() {
        return descricaoFechamento;
    }

    public String getHoraAbertura() {
        return horaAbertura;
    }

    public String getHoraFechamento() {
        return horaFechamento;
    }

    public RespFechamento getNomeRespFechamento() {
        return nomeRespFechamento;
    }

    public String getStatus() {
        return status;
    }

    public TipoOcorrencia getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    public void setCodigoOcorrencia(int codigoOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public void setDescricaoAbertura(String descricaoAbertura) {
        this.descricaoAbertura = descricaoAbertura;
    }

    public void setDescricaoFechamento(String descricaoFechamento) {
        this.descricaoFechamento = descricaoFechamento;
    }

    public void setHoraAbertura(String horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public void setHoraFechamento(String horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public void setNomeRespFechamento(RespFechamento nomeRespFechamento) {
        this.nomeRespFechamento = nomeRespFechamento;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTipoOcorrencia(TipoOcorrencia tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }



}
