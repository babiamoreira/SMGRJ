
package model;

public class TipoOcorrencia {
    
    private int IdTipoOcorrencia;

    public TipoOcorrencia(int IdTipoOcorrencia) {
        this.IdTipoOcorrencia = IdTipoOcorrencia;
    }

    public int getIdTipoOcorrencia() {
        return IdTipoOcorrencia;
    }

    public void setIdTipoOcorrencia(int IdTipoOcorrencia) {
        this.IdTipoOcorrencia = IdTipoOcorrencia;
    }
    private String nomeTipoOc;

    public TipoOcorrencia() {
    }

    public TipoOcorrencia(String nomeTipoOc) {
        this.nomeTipoOc = nomeTipoOc;
    }

    public String getNomeTipoOc() {
        return nomeTipoOc;
    }

    public void setNomeTipoOc(String nomeTipoOc) {
        this.nomeTipoOc = nomeTipoOc;
    }

    @Override
    public String toString() {
        return "TipoOcorrencia{" + "nomeTipoOc=" + nomeTipoOc + '}';
    }
    
    

}
