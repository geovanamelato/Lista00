package ControleTransportadoraEx4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteTest {
    @Test
    void deveAceitarCodigoMaiorQueZero() {
        Frete frete = new FreteNormal();
        frete.setNumero(1);
        assertEquals(1, frete.getNumero());
    }

    @Test
    void deveLancarExcecaoCodigoZeradoNegativo() {
        Frete frete = new FreteNormal();
        try {
            frete.setNumero(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarValorFreteNaoNegativo() {
        Frete frete = new FreteNormal();
        frete.setValorFrete(0);
        assertEquals(0, frete.getValorFrete());
    }

    @Test
    void deveLancarExcecaoValorFreteNegativo() {
        Frete frete = new FreteNormal();
        try {
            frete.setValorFrete(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete invalido", e.getMessage());
        }
    }

}