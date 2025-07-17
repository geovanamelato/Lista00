package ControleTransportadoraEx4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteUrgenteTest {
    @Test
    void deveAceitarTaxaEntregaNaoNegativo() {
        FreteUrgente frete = new FreteUrgente();
        frete.setTaxaEntrega(0);
        assertEquals(0, frete.getTaxaEntrega());
    }

    @Test
    void deveLancarExcecaoTaxaEntregaNegativa() {
        try {
            FreteUrgente frete = new FreteUrgente();
            frete.setTaxaEntrega(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Taxa invalida", e.getMessage());
        }
    }

    @Test
    void deveAceitarNumeroItensPositiva() {
        FreteUrgente frete = new FreteUrgente();
        frete.setQuantidadeItens(1);
        assertEquals(1, frete.getQuantidadeItens());
    }

    @Test
    void deveLancarExcecaoNumeroItensZeradaNegativa() {
        try {
            FreteUrgente frete = new FreteUrgente();
            frete.setQuantidadeItens(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero invalido de itens", e.getMessage());
        }
    }

}