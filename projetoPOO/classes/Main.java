package classes;

import java.util.ArrayList;

import frames.FrameTelaInicial;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> animais = new ArrayList<>();
        ArrayList<Voluntario> voluntarios = new ArrayList<>();
        Financeiro caixa = new Financeiro();
        
        new FrameTelaInicial(animais, voluntarios, caixa).setVisible(true);
        
        
    }
}
