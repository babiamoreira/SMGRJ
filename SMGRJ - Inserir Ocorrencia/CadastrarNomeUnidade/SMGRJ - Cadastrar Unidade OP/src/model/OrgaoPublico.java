
package model;

public class OrgaoPublico {
    private String nomeOrgao;
    private int codigoOrgao;

    public OrgaoPublico() {
    }

    public OrgaoPublico(String nomeOrgao, int codigoOrgao) {
        this.nomeOrgao = nomeOrgao;
        this.codigoOrgao = codigoOrgao;
    }

    public OrgaoPublico(String nomeOrgao) {
        this.nomeOrgao = nomeOrgao;
    }
   
    public int getCodigoOrgao() {
        return codigoOrgao;
    }

    public String getNomeOrgao() {
        return nomeOrgao;
    }

    public void setCodigoOrgao(int codigoOrgao) {
        this.codigoOrgao = codigoOrgao;
    }

    public void setNomeOrgao(String nomeOrgao) {
        this.nomeOrgao = nomeOrgao;
    }

    @Override
    public String toString() {
        return "OrgaoPublico{" + "nomeOrgao=" + nomeOrgao + ", codigoOrgao=" + codigoOrgao + '}';
    }

    

}
