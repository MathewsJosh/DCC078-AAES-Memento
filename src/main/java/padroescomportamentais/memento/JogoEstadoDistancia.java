package padroescomportamentais.memento;

public class JogoEstadoDistancia implements JogoEstado {

    private JogoEstadoDistancia() {};
    private static JogoEstadoDistancia instance = new JogoEstadoDistancia();
    public static JogoEstadoDistancia getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Distancia";
    }

}
