package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogoTest {

    @Test
    void deveArmazenarEstadosDoJogo() {
        Jogo jogo = new Jogo();
        jogo.setEstado(JogoEstadoIniciado.getInstance());
        jogo.setEstado(JogoEstadoConcluido.getInstance());
        assertEquals(2, jogo.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicialDoJogo() {
        Jogo jogo = new Jogo();
        jogo.setEstado(JogoEstadoIniciado.getInstance());
        jogo.setEstado(JogoEstadoConcluido.getInstance());
        jogo.restauraEstado(0);
        assertEquals(JogoEstadoIniciado.getInstance(), jogo.getEstado());
    }

    @Test
    void deveRetornarAoEstadoXAnteriorDoJogo() {
        Jogo jogo = new Jogo();
        jogo.setEstado(JogoEstadoIniciado.getInstance());
        jogo.setEstado(JogoEstadoVeiculo.getInstance());
        jogo.setEstado(JogoEstadoIniciado.getInstance());
        jogo.setEstado(JogoEstadoConcluido.getInstance());
        jogo.restauraEstado(2);
        assertEquals(JogoEstadoIniciado.getInstance(), jogo.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalidoDoJogo() {
        try {
            Jogo jogo = new Jogo();
            jogo.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}