package padroescomportamentais.memento;

public class JogoEstadoIniciado implements JogoEstado {

    private JogoEstadoIniciado() {};
    private static JogoEstadoIniciado instance = new JogoEstadoIniciado();
    public static JogoEstadoIniciado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Iniciado";
    }

}
