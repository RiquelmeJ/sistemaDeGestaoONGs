package classes;

import java.util.ArrayList;

public class Associado extends Pessoa{
    private ArrayList<Animal> adotados = new ArrayList<>();
    private int id;

    public Associado(String nome, String dataDeNascimento, String sexo, String cpf, String rua, String bairro,
            int numeroDaCasa, String cep, String cidade, String complemento, String telefone, String email) {
        super(nome, dataDeNascimento, sexo, cpf, rua, bairro, numeroDaCasa, cep, cidade, complemento, telefone, email);
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public ArrayList<Animal> getAdotados() {
        return adotados;
    }

    public void editarAssociado(String nome, String dataDeNascimento, String sexo, String cpf, String rua, String bairro,
        int numeroDaCasa, String cep, String cidade, String complemento, String telefone, String email) {
            this.setNome(nome);
            this.setDataDeNascimento(dataDeNascimento);
            this.setSexo(sexo);
            this.setCpf(cpf);
            this.setRua(rua);
            this.setBairro(bairro);
            this.setNumeroDaCasa(numeroDaCasa);
            this.setCep(cep);
            this.setCidade(cidade);
            this.setComplemento(complemento);
            this.setTelefone(telefone);
            this.setEmail(email);
    }

}