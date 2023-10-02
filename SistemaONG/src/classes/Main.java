package classes;

import java.util.ArrayList;
import frames.FrameTelaInicial;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> animais = new ArrayList<>();
        
        new FrameTelaInicial(animais).setVisible(true);
        
    }
}
