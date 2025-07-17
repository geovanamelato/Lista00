package ControleEstacionamentoEx6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaDiariaTest {
    @Test
    void deveAceitarNumeroDiasMaiorQueZero() {
        VagaDiaria vaga = new VagaDiaria();
        vaga.setQuantidadeDias(1);
        assertEquals(1, vaga.getQuantidadeDias());
    }

    @Test
    void deveLancarExcecaoNumeroDiasZeradoNegativo() {
        VagaDiaria vaga = new VagaDiaria();
        try {
            vaga.setQuantidadeDias(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero de dias invalido", e.getMessage());
        }
    }

}