package classes;

public class Evento {
    private String data;
    private String categoria;
    private String descricao;
    private String horario;
    private Voluntario voluntario;
    private String endereco;
    private int id;
    private int auxTipo;

    public Evento(String data, String categoria, String descricao, String horario, Voluntario voluntario,
            String endereco) {
        this.data = data;
        this.categoria = categoria;
        this.descricao = descricao;
        this.horario = horario;
        this.voluntario = voluntario;
        this.endereco = endereco;
    }
    
    public  void editarEvento(String data, String categoria, String descricao, String horario, Voluntario voluntario,
            String endereco) {
        this.data = data;
        this.categoria = categoria;
        this.descricao = descricao;
        this.horario = horario;
        this.voluntario = voluntario;
        this.endereco = endereco;
    }
    
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Voluntario getVoluntario() {
        return voluntario;
    }
    public void setVoluntario(Voluntario voluntario) {
        this.voluntario = voluntario;
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
    
    public int getAuxTipo() {
        return auxTipo;
    }
    
    public void setAuxTipo(int auxTipo) {
        this.auxTipo = auxTipo;
    }
}
