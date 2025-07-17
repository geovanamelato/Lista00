package ControleBancarioEx2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteEspecialTest {
    @Test
    void deveAceitarLimiteCreditoMaiorIgualZero() {
        ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial();
        contaCorrenteEspecial.setLimiteCredito(0);
        assertEquals(0, contaCorrenteEspecial.getLimiteCredito());
    }

    @Test
    void deveLancarExcecaoLimiteCreditoNegativo() {
        ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial();
        try {
            contaCorrenteEspecial.setLimiteCredito(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("limite invalido", e.getMessage());
        }

    }

}