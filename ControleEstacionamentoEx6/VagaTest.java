package ControleEstacionamentoEx6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaTest {
    @Test
    void deveAceitarNumeroVagaMaiorZero() {
        Vaga vaga = new VagaDiaria();
        vaga.setNumero(1);
        assertEquals(1, vaga.getNumero());
    }

    @Test
    void deveLancarExcecaoNumeroVagaZeradoNegativo() {
        Vaga vaga = new VagaDiaria();
        try {
            vaga.setNumero(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarPlacaNaoVazia() {
        Vaga vaga = new VagaDiaria();
        vaga.setPlacaVeiculo("DIVA123");
        assertEquals("DIVA123", vaga.getPlacaVeiculo());
    }

    @Test
    void deveLancarExcecaoPlacaVazia() {
        Vaga vaga = new VagaDiaria();
        try {
            vaga.setPlacaVeiculo("    ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Placa invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarTipoVagaDiaria() {
        Vaga vaga = new VagaDiaria();
        vaga.setTipoVaga("Diaria");
        assertEquals("Diaria", vaga.getTipoVaga());
    }

    @Test
    void deveVerificarTipoVagaSemanal() {
        Vaga vaga = new VagaDiaria();
        vaga.setTipoVaga("Semanal");
        assertEquals("Semanal", vaga.getTipoVaga());
    }

    @Test
    void deveVerificarTipoVagaMensal() {
        Vaga vaga = new VagaDiaria();
        vaga.setTipoVaga("Mensal");
        assertEquals("Mensal", vaga.getTipoVaga());
    }

    @Test
    void deveLancarExcecaoTipoEquipamentoInvalido() {
        Vaga vaga = new VagaDiaria();
        try {
            vaga.setTipoVaga("Anual");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de vaga invalida", e.getMessage());
        }
    }

}