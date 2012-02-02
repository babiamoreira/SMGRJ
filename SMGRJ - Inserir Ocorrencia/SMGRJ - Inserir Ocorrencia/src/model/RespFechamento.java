
package model;

public class RespFechamento extends Pessoa {
    
    private String cargoResp;

    public RespFechamento() {
        super();
    }

    public RespFechamento(String nome, String cpf, String rg, String cargoResp) {
        super(nome, cpf, rg);
        this.cargoResp = cargoResp;
    }

    public RespFechamento(String cargoResp) {
        this.cargoResp = cargoResp;
    }

    public String getCargoResp() {
        return cargoResp;
    }

    public void setCargoResp(String cargoResp) {
        this.cargoResp = cargoResp;
    }

    

}
