package classes;

public class Adocao {
    private Animal animal;
    private Associado associado;
    private String data;
    private String observacoes;
    private int id;
    private int IdAssociado;
    private int idAdotado;

    public int getIdAssociado() {
        return IdAssociado;
    }

    public void setIdAssociado(int idAssociado) {
        IdAssociado = idAssociado;
    }

    public int getIdAdotado() {
        return idAdotado;
    }

    public void setIdAdotado(int idAdotado) {
        this.idAdotado = idAdotado;
    }

    public Adocao(Animal animal, Associado associado, String data, String observacoes, int id) {
        this.animal = animal;
        this.associado = associado;
        this.data = data;
        this.observacoes = observacoes;
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void editarAdocao(Animal animal, Associado associado, String data, String observacoes, int id) {
        this.animal = animal;
        this.associado = associado;
        this.data = data;
        this.observacoes = observacoes;
        this.id = id;
    }
}
