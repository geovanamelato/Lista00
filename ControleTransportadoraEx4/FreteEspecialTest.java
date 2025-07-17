package ControleTransportadoraEx4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteEspecialTest {
    @Test
    void deveAceitarTaxaEntregaNaoNegativo() {
        FreteEspecial frete = new FreteEspecial();
        frete.setTaxaEntrega(0);
        assertEquals(0, frete.getTaxaEntrega());
    }

    @Test
    void deveLancarExcecaoTaxaEntregaNegativa() {
        try {
            FreteEspecial frete = new FreteEspecial();
            frete.setTaxaEntrega(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Taxa invalida", e.getMessage());
        }
    }

}