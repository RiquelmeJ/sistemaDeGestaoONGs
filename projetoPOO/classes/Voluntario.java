package classes;

public class Voluntario extends Pessoa{
    private String setor;
    private int id;
    private boolean[][] Horario = new boolean[3][7];
    
    public boolean[][] getHorario() {
        return Horario;
    }

    public void setHorario(boolean[][] horario) {
        Horario = horario;
    }

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
    
    public void editarVoluntario(String nome, String dataDeNascimento, String sexo, String cpf, String rua, String bairro,
            int numeroDaCasa, String cep, String cidade, String complemento, String telefone, String email,
            String setor) {
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
        this.setor = setor;
    }
}
