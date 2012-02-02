
package model;


public class OrgaoPublico_UnidadeOperacional {
    
    
    private int codigoOrgao;
    private int codigoUnidade;

    public OrgaoPublico_UnidadeOperacional() {
    }

    public OrgaoPublico_UnidadeOperacional(int codigoOrgao, int codigoUnidade) {
        this.codigoOrgao = codigoOrgao;
        this.codigoUnidade = codigoUnidade;
    }

    public int getCodigoOrgao() {
        return codigoOrgao;
    }

    public void setCodigoOrgao(int codigoOrgao) {
        this.codigoOrgao = codigoOrgao;
    }

    public int getCodigoUnidade() {
        return codigoUnidade;
    }

    public void setCodigoUnidade(int codigoUnidade) {
        this.codigoUnidade = codigoUnidade;
    }
    
    
    
}
