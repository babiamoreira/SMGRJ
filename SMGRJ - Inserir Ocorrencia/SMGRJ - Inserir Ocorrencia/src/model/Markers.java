

package model;


public class Markers {

    private int id;
    private String name;
    private String endereco;
    private float lat;
    private float lng;
    private String type;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Markers() {
    }

    public Markers(int id, String name, String endereco, float lat, float lng, String type, String descricao) {
        this.id = id;
        this.name = name;
        this.endereco = endereco;
        this.lat = lat;
        this.lng = lng;
        this.type = type;
        this.descricao = descricao;
    }

    

}
