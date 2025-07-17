package ControleEstacionamentoEx6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaMensalTest {
    @Test
    void deveAceitarNumeroDiasMaiorQueZero() {
        VagaMensal vaga = new VagaMensal();
        vaga.setQuantidadeMeses(1);
        assertEquals(1, vaga.getQuantidadeMeses());
    }

    @Test
    void deveLancarExcecaoNumeroDiasZeradoNegativo() {
        VagaMensal vaga = new VagaMensal();
        try {
            vaga.setQuantidadeMeses(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero de meses invalido", e.getMessage());
        }
    }

}