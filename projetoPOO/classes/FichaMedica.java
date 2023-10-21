package classes;

public class FichaMedica {
    private double peso;
    private int idadeEstimada;
    private String observacao;
    private String data;
    private int id;

    public FichaMedica(double peso, int idadeEstimada, String observacao, String data) {
        this.peso = peso;
        this.idadeEstimada = idadeEstimada;
        this.observacao = observacao;
        this.data = data;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getIdadeEstimada() {
        return idadeEstimada;
    }
    public void setIdadeEstimada(int idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
