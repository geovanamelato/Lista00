package ControleEstacionamentoEx6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaSemanalTest {
    @Test
    void deveAceitarNumeroDiasMaiorQueZero() {
        VagaSemanal vaga = new VagaSemanal();
        vaga.setQuantidadeSemanas(1);
        assertEquals(1, vaga.getQuantidadeSemanas());
    }

    @Test
    void deveLancarExcecaoNumeroDiasZeradoNegativo() {
        VagaSemanal vaga = new VagaSemanal();
        try {
            vaga.setQuantidadeSemanas(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero de semanas invalida", e.getMessage());
        }
    }

}