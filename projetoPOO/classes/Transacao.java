package classes;

public class Transacao {
    private String data;
    private double valor;
    private boolean entrada;
    private String detalhe;
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public boolean isEntrada() {
        return entrada;
    }
    public void setEntrada(boolean entrada) {
        this.entrada = entrada;
    }
    public String getDetalhe() {
        return detalhe;
    }
    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public Transacao(String data, double valor, boolean entrada, String detalhe) {
        this.data = data;
        this.valor = valor;
        this.entrada = entrada;
        this.detalhe = detalhe;
    }

    public void editarTransacao(String data, double valor, boolean entrada, String detalhe) {
        this.data = data;
        this.valor = valor;
        this.entrada = entrada;
        this.detalhe = detalhe;
    }
}
