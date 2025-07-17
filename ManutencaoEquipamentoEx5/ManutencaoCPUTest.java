package ManutencaoEquipamentoEx5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoCPUTest {
    @Test
    void deveAceitarValorMaiorQueZeroPecasTrocadas() {
        ManutencaoCPU manutencao = new ManutencaoCPU();
        manutencao.setValorPecasTrocadas(0.01f);
        assertEquals(0.01f, manutencao.getValorPecasTrocadas());
    }

    @Test
    void develancarExcecaoValorMaiorZeradoNegativoPecasTrocadas() {
        ManutencaoCPU manutencao = new ManutencaoCPU();
        try {
            manutencao.setValorPecasTrocadas(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

}