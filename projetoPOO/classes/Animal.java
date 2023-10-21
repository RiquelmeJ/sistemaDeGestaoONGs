package classes;

import java.util.ArrayList;

public class Animal {
    private String nome;
    private String dataAdocao;
    private String sexo;
    private String especie;
    private String raca;
    private String anotacoes;
    private boolean adotado = false;
    private int id;
    private int idSexo;
    private int idEspecie;
    private ArrayList<FichaMedica> historicoMedico = new ArrayList<>();
    

    @Override
    public String toString() {
        return "Nome: " + nome +", " + sexo + " da espécie " + especie + ";" +
         "\n Resgatado em " + dataAdocao +".";
    }
    public Animal(String nome, String dataAdocao, String sexo, String especie, String raca, String anotacoes) {
        this.nome = nome;
        this.dataAdocao = dataAdocao;
        this.sexo = sexo;
        this.especie = especie;
        this.raca = raca;
        this.anotacoes = anotacoes;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataAdocao() {
        return dataAdocao;
    }
    public void setDataAdocao(String dataAdocao) {
        this.dataAdocao = dataAdocao;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getAnotacoes() {
        return anotacoes;
    }
    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public boolean isAdotado() {
        return adotado;
    }
    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdSexo() {
        return idSexo;
    }
    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }
    
    public int getIdEspecie() {
        return idEspecie;
    }
    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }
    
    public ArrayList<FichaMedica> getHistoricoMedico() {
        return historicoMedico;
    }
    public void setHistoricoMedico(ArrayList<FichaMedica> historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public void adicionarRegistroMedico(double peso, int idadeEstimada, String observacao, String data) {
        FichaMedica fm = new FichaMedica(peso, idadeEstimada, observacao, data);
        this.historicoMedico.add(fm);
    }

    public Object[] retornaDados() {
        return new Object[] {nome, especie, sexo, adotado};
    }
    
    public void editarAnimal(String nome, String dataAdocao, String sexo, String especie, String raca, String anotacoes, int idEspecie, int idSexo) {
        this.setNome(nome);
        this.setDataAdocao(dataAdocao);
        this.setSexo(sexo);
        this.setEspecie(especie);
        this.setRaca(raca);
        this.setAnotacoes(anotacoes);
        this.setIdEspecie(idEspecie);
        this.setIdSexo(idSexo);
    }
}