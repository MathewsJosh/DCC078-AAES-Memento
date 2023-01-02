package padroescomportamentais.memento;

public class JogoEstadoPontuacao implements JogoEstado {

    private JogoEstadoPontuacao() {};
    private static JogoEstadoPontuacao instance = new JogoEstadoPontuacao();
    public static JogoEstadoPontuacao getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Pontuacao";
    }
    
}

