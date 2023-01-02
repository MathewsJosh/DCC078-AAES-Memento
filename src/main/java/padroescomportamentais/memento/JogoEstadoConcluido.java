package padroescomportamentais.memento;

public class JogoEstadoConcluido implements JogoEstado {

    private JogoEstadoConcluido() {};
    private static JogoEstadoConcluido instance = new JogoEstadoConcluido();
    public static JogoEstadoConcluido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Concluido";
    }

}
