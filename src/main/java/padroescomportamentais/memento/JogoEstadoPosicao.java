package padroescomportamentais.memento;

public class JogoEstadoPosicao implements JogoEstado {

    private JogoEstadoPosicao() {};
    private static JogoEstadoPosicao instance = new JogoEstadoPosicao();
    public static JogoEstadoPosicao getInstance() {
        return instance;
    }
    
    public String getNomeEstado() {
        return "Posicao";
    }

}
