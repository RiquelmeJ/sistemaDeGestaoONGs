package classes;

import java.util.ArrayList;

import frames.FrameTelaInicial;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> animais = new ArrayList<>();
        ArrayList<Voluntario> voluntarios = new ArrayList<>();
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<Associado> associados = new ArrayList<>();
        ArrayList<Adocao> adocoes = new ArrayList<>();
        Financeiro caixa = new Financeiro();
        
        new FrameTelaInicial(animais, voluntarios, caixa, eventos, adocoes, associados).setVisible(true);
        
        
    }
}
