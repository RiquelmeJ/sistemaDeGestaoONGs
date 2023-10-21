package classes;

/**
 *
 * @author Softex
 */
public abstract class Pessoa{
    //dados pessoais
    private String nome; 
    private String dataDeNascimento;
    private String sexo;
    private String cpf;
    //endereço
    private String rua;
    private String bairro;
    private int numeroDaCasa;
    private String cep;
    private String cidade;
    private String complemento;
    //contato
    private String telefone;
    private String email;

    public Pessoa(String nome, String dataDeNascimento, String sexo, String cpf, String rua, String bairro,
            int numeroDaCasa, String cep, String cidade, String complemento, String telefone, String email) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rua = rua;
        this.bairro = bairro;
        this.numeroDaCasa = numeroDaCasa;
        this.cep = cep;
        this.cidade = cidade;
        this.complemento = complemento;
        this.telefone = telefone;
        this.email = email;
    }



    public String getCep() {
        return cep;
    }



    public void setCep(String cep) {
        this.cep = cep;
    }



    public String getCidade() {
        return cidade;
    }



    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }



    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }



    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", sexo=" + sexo + ", cpf=" + cpf
                + ", rua=" + rua + ", bairro=" + bairro + ", numeroDaCasa=" + numeroDaCasa + ", telefone=" + telefone
                + ", email=" + email + "]";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getNumeroDaCasa() {
        return numeroDaCasa;
    }
    public void setNumeroDaCasa(int numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
