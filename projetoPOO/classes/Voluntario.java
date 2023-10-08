package classes;

public class Voluntario extends Pessoa{
    private String setor;
    private int id;


    public Voluntario(String nome, String dataDeNascimento, String sexo, String cpf, String rua, String bairro,
            int numeroDaCasa, String cep, String cidade, String complemento, String telefone, String email,
            String setor) {
        super(nome, dataDeNascimento, sexo, cpf, rua, bairro, numeroDaCasa, cep, cidade, complemento, telefone, email);
        this.setor = setor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    @Override
    public String toString() {
        return this.getNome()+ this.getBairro() + this.getSetor();
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

}
