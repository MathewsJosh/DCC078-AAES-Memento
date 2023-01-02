package padroescomportamentais.memento;

public class JogoEstadoVeiculo implements JogoEstado {

    private JogoEstadoVeiculo() {};
    private static JogoEstadoVeiculo instance = new JogoEstadoVeiculo();
    public static JogoEstadoVeiculo getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Veiculo";
    }

}
