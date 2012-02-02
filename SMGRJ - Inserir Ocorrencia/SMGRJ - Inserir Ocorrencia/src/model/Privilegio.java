package model;

public class Privilegio {

    private int codigoPrivilegio;
    private String nomePrivilegio;

    public Privilegio() {
    }

    public Privilegio(int codigoPrivilegio, String nomePrivilegio) {
        this.codigoPrivilegio = codigoPrivilegio;
        this.nomePrivilegio = nomePrivilegio;
    }

    public int getCodigoPrivilegio() {
        return codigoPrivilegio;
    }

    public String getNomePrivilegio() {
        return nomePrivilegio;
    }

    public void setCodigoPrivilegio(int codigoPrivilegio) {
        this.codigoPrivilegio = codigoPrivilegio;
    }

    public void setNomePrivilegio(String nomePrivilegio) {
        this.nomePrivilegio = nomePrivilegio;
    }

    @Override
    public String toString() {
        return "Privilegio{" + "codigoPrivilegio=" + codigoPrivilegio + ", nomePrivilegio=" + nomePrivilegio + '}';
    }

    
    
    
}
