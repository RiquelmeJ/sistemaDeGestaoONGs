package classes;

import java.util.ArrayList;

public class Financeiro {
    private double entradas = 0;
    private double saidas = 0;
    private double saldo = 0;
    private ArrayList<Transacao> fluxo = new ArrayList<Transacao>();
    

    public Financeiro() {
    }
    
    public double getEntradas() {
        return entradas;
    }

    public void setEntradas(double entradas) {
        this.entradas = entradas;
    }

    public double getSaidas() {
        return saidas;
    }

    public void setSaidas(double saidas) {
        this.saidas = saidas;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Transacao> getFluxo() {
        return fluxo;
    }
    public void setFluxo(ArrayList<Transacao> fluxo) {
        this.fluxo = fluxo;
    }
}
